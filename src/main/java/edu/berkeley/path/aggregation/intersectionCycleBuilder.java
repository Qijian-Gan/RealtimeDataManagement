package edu.berkeley.path.aggregation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.objects.IntersectionPhaseStatus;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionSignalCycleStatus;
import edu.berkeley.path.settings.Configuration;
import org.apache.tools.ant.taskdefs.condition.And;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalStatus;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;

import java.util.*;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
import static edu.berkeley.path.database.MongoDB.connect.getCollectionMongoDBStandalone;
import static edu.berkeley.path.database.MongoDB.save.insertMultipleToMongodbCollection;
import static edu.berkeley.path.database.MongoDB.select.*;
import static edu.berkeley.path.processor.SignalStatus.getPhaseStatusGroupFromSignalStatus;
import static edu.berkeley.path.processor.SignalStatus.getSignalStatusFromDocument;

public class intersectionCycleBuilder {
    // This function is used to build a whole cycle from the Signal Inventory and Status data

    //********************************************************
    // Definitions of variables
    //********************************************************
    private static int maxNumPhase=16; // Define the maximum number of phases
    private static int maxNumRing=4; // Define the maximum number of rings
    private static int maxMessageGap=120;// Define the maximum gap between messages

    public int getMaxNumPhase() {
        return maxNumPhase;
    }

    public int getMaxNumRing() {
        return maxNumRing;
    }

    public int getMaxMessageGap() {
        return maxMessageGap;
    }

    public static void setMaxMessageGap(int _maxMessageGap) {
        maxMessageGap = _maxMessageGap;
    }

    public static void setMaxNumPhase(int _maxNumPhase) {
        maxNumPhase = _maxNumPhase;
    }

    public static void setMaxNumRing(int _maxNumRing) {
        maxNumRing = _maxNumRing;
    }

    //********************************************************
    // Functions
    //********************************************************
    public static void buildAndSaveCycleInformation(Map<String,Long[]> buildingTimePeriod, String orgId
            ,MongoCollection<Document> collectionSignalStatus,MongoCollection<Document> collectionSignalTPInventory
            ,MongoCollection<Document> collectionCycleInformation) {

        // Note: it is important to ensure the messages of Signal Status are sampled in high frequency, e.g., every
        // one second or even event based. If they are at longer time intervals, it is inaccurate or even impossible
        // to reconstruct cycle-based information.

        // Even when they are sampled at every one second, we still miss some messages because the yellow, all red
        // and green extension settings can be in the interval of 0.5 seconds. In our development, we consider these
        // impacts to ensure we have good reconstruction of cycle-based information.

        ObjectMapper mapper = new ObjectMapper(); // Write to string

        // For each device Id (intersection)
        Iterator iterator = buildingTimePeriod.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry)iterator.next();
            String deviceId=(String) pair.getKey();
            Long[] time=(Long[])pair.getValue();

            // Define runnable
            Runnable runnable = () -> {
                System.out.println("Start a new thread: device Id="+deviceId);
                List<Document> documentList=new ArrayList<>();
                List<IntersectionSignalCycleStatus> tmpSignalCycleStatusList=buildCycleInformationForOneIntersection
                        (orgId, deviceId, time[0],time[1],collectionSignalStatus,collectionSignalTPInventory);

                // Create the document list
                for(int i=0;i<tmpSignalCycleStatusList.size();i++){
                    Document documentIndividual= null;
                    try {
                        documentIndividual = Document.parse(mapper.writeValueAsString(tmpSignalCycleStatusList.get(i)));
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    documentList.add(documentIndividual);
                }

                // Save them to the corresponding collection
                collectionCycleInformation.insertMany(documentList);
                System.out.println("Finish saving the cycle information: device Id="+deviceId);
            };

            // Create a new thread
            Thread thread = new Thread(runnable);
            thread.start();
        }

    }

    public static List<IntersectionSignalCycleStatus>  buildCycleInformationForOneIntersection(String organizationId
            , String deviceId, long startTime, long endTime,MongoCollection<Document> collectionSignalStatus
            ,MongoCollection<Document> collectionSignalTPInventory){
        // This function is used to build cycles for a given intersections within a predefined time period

        // Create a list of IntersectionSignalCycleStatus
        List<IntersectionSignalCycleStatus> intersectionSignalCycleStatusList=new ArrayList<>();

        // Search the database (collection) for timing plan inventories
        Map<Integer,Document> upToDateTPInventory=upToDateTPInventoryForGivenDeviceIdFromIntSigTP
                (collectionSignalTPInventory, organizationId, deviceId);

        // Get a list of event messages for the given intersection within the given time period, ordered by time
        List<Document> documentList=documentsForGivenDeviceIdAndTimePeriodsFromSigStatus(collectionSignalStatus,organizationId
                , deviceId, startTime, endTime);

        // Try to construct a cycle if the document list is not empty
        if(documentList!=null && documentList.size()>1) {
            //*************************************************************
            // Get the starting index that contains a timing plan available
            //*************************************************************
            int startIdx = 0;
            int timingPlanId;
            for (int i = 0; i < documentList.size(); i++) {// Loop for each document
                timingPlanId = Integer.parseInt(documentList.get(i).get("timingPatternIdCurrent").toString());
                if (upToDateTPInventory.containsKey(timingPlanId)) {// Find it available?
                    startIdx = i;
                    break;
                }
            }

            //*************************************************************
            // Construction of a cycle
            // Data is missing for some light changes due to the pull frequency is not in 0.5 seconds
            //*************************************************************
            if (documentList.size() - startIdx > 1) {// Should have at least one more message remaining

                // At the first step
                IntersectionSignalCycleStatus intersectionSignalCycleStatus = new IntersectionSignalCycleStatus();
                intersectionSignalCycleStatus.initialization();

                // Once find the starting index, update the inventory information
                timingPlanId = Integer.parseInt(documentList.get(startIdx).get("timingPatternIdCurrent").toString());
                intersectionSignalCycleStatus.updateInventoryInformation(upToDateTPInventory.get(timingPlanId));
                List<Integer> referencePhases = findEndPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());
                intersectionSignalCycleStatus.setReferencePhaseIDs(referencePhases); // Update the reference phases
                List<Integer> beginPhases = findBeginPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());

                // Cycle start and end time
                // Update the start time
                long cycleStartTime=(long)documentList.get(startIdx).get("lastUpdateTime");
                intersectionSignalCycleStatus.setCycleStartTime(cycleStartTime);
                long cycleEndTime;

                // Loop for the rest of documents
                int beginCycleIndex=startIdx;
                boolean firstCycleByTimingPlan=true;
                for (int i = startIdx+1; i < documentList.size(); i++) {
                    // Check the gap between messages
                    double timeGap=((long)documentList.get(i).get("lastUpdateTime")-(long)documentList.get(i-1).
                            get("lastUpdateTime"))/1000.0;

                    //System.out.println("deviceId:"+ deviceId+ " & timingPlanId:"+timingPlanId+" at "
                    //        +new Date((long)documentList.get(i).get("lastUpdateTime"))+" with gap: "+ timeGap+ " seconds!");

                    if (Integer.parseInt(documentList.get(i).get("timingPatternIdCurrent").toString()) == timingPlanId
                            && i<documentList.size()-1 && timeGap<=maxMessageGap) {
                        // If it is still the same timing plan (No change in timing plan)
                        // And not reaching the end of the document list

                        // Update the phase durations
                        intersectionSignalCycleStatus = updateActualPhaseInformation(documentList, i, beginCycleIndex, intersectionSignalCycleStatus);

                        // Check whether it is the end of a cycle or not
                        // List<cycle end time, new index>
                        List<String> output=isEndOfOneCycle(documentList,i,referencePhases,beginPhases,
                                intersectionSignalCycleStatus.getPlannedPhaseList());
                        cycleEndTime=Long.parseLong(output.get(0));

                        if(cycleEndTime>0){// Non-negative cycle end time means this is the end of a cycle
                            // Update the "cycle end time"
                            intersectionSignalCycleStatus.setCycleEndTime(cycleEndTime);

                            // TODO: May Need to adjust the split durations in order to be consistent with the actual cycle length

                            // Add the cycle information to the list
                            if(firstCycleByTimingPlan){
                                // In this algorithm, the first cycle is normally incomplete
                                // Just throw it away
                                firstCycleByTimingPlan=false;
                            }else{
                                intersectionSignalCycleStatusList.add(intersectionSignalCycleStatus);
                            }

                            // Update the indexes
                            beginCycleIndex=Integer.parseInt(output.get(1)); // Update the begin index
                            i=beginCycleIndex;// Update the index i

                            // Create a new Cycle and update some inventory information
                            timingPlanId = Integer.parseInt(documentList.get(beginCycleIndex).get("timingPatternIdCurrent").toString());
                            intersectionSignalCycleStatus = new IntersectionSignalCycleStatus();
                            intersectionSignalCycleStatus.initialization();
                            intersectionSignalCycleStatus.updateInventoryInformation(upToDateTPInventory.get(timingPlanId));
                            referencePhases = findEndPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());
                            intersectionSignalCycleStatus.setReferencePhaseIDs(referencePhases); // Update the reference phases
                            beginPhases = findBeginPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());

                            // This is the tricky part, we can use "cycleStartTime=(long)documentList.get(beginIndex).get("lastUpdateTime")"
                            // or directly assign the previous cycle end time as the next cycle start time
                            // We decide to use the latter one
                            cycleStartTime=cycleEndTime;
                            intersectionSignalCycleStatus.setCycleStartTime(cycleStartTime);

                            // Update the phase durations
                            intersectionSignalCycleStatus = updateActualPhaseInformation(documentList, i, beginCycleIndex, intersectionSignalCycleStatus);

                        }
                    } else {
                        // Start a new timing plan? either transition or to another planned one
                        // If the gap is too big given the high pulling frequency
                        if(Integer.parseInt(documentList.get(i).get("timingPatternIdCurrent").toString()) != timingPlanId ||
                                timeGap>maxMessageGap){
                            // In this case, if the previous cycle is not saved, we throw it away (omit it) due to incomplete information

                            // Update the indexes
                            beginCycleIndex=i; // Update the begin index

                            if(timeGap>maxMessageGap) {
                                // In this case, update the indicator
                                firstCycleByTimingPlan = true;
                            }

                            // Create a new Cycle and update some inventory information
                            timingPlanId = Integer.parseInt(documentList.get(beginCycleIndex).get("timingPatternIdCurrent").toString());
                            intersectionSignalCycleStatus = new IntersectionSignalCycleStatus();
                            intersectionSignalCycleStatus.initialization();
                            intersectionSignalCycleStatus.updateInventoryInformation(upToDateTPInventory.get(timingPlanId));
                            referencePhases = findEndPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());
                            intersectionSignalCycleStatus.setReferencePhaseIDs(referencePhases); // Update the reference phases
                            beginPhases = findBeginPhaseForEachRing(intersectionSignalCycleStatus.getSequenceDataList());

                            // This is the tricky part, we can use "cycleStartTime=(long)documentList.get(beginIndex).get("lastUpdateTime")"
                            // or directly assign the previous cycle end time as the next cycle start time
                            // We decide to use the latter one
                            cycleStartTime=(long)documentList.get(beginCycleIndex).get("lastUpdateTime");
                            intersectionSignalCycleStatus.setCycleStartTime(cycleStartTime);
                        }else{
                            // Or reaching the end of the documents?
                            // If the current cycle is not saved
                            // It is mostly an incomplete cycle. Then throw it away (omit it)
                            // Do nothing
                        }
                    }
                }
            }
        }

        // Return the list of cycle information
        return intersectionSignalCycleStatusList;
    }

    public static List<String> isEndOfOneCycle(List<Document> documentList,int index, List<Integer> referencePhases
            ,List<Integer> beginPhases,Map<Integer,IntersectionPhaseStatus>  plannedPhaseList){
        // This function determines whether it is the end of a cycle.

        // It is purely based on the activation sequence of phases, regardless of the timing plan Ids.
        // It returns the cycle end time and the index of the new cycle
        // If the cycle end time is non-negative, it indicates it is the end of a cycle
        long endOfCycle=-1;
        long newIndex=index;

        // Get the phase status group at the previous message
        IntersectionSignalStatus preSignalStatus=getSignalStatusFromDocument(documentList.get(index-1));
        IntersectionPhaseStatusGroup prePhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(preSignalStatus);
        long preTime=(long)documentList.get(index-1).get("lastUpdateTime");

        // Get the phase status group at the current message
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentList.get(index));
        IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);
        long curTime=(long)documentList.get(index).get("lastUpdateTime");

        // Get the phase status group at the next message
        IntersectionSignalStatus nextSignalStatus=getSignalStatusFromDocument(documentList.get(index+1));
        IntersectionPhaseStatusGroup nextPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(nextSignalStatus);
        long nextTime=(long)documentList.get(index+1).get("lastUpdateTime");

        for(int i=0;i<referencePhases.size();i++){ // Loop for all reference phases
            if(endOfCycle<0) { // If still not find the end of cycle?
                int phaseId = referencePhases.get(i); // Get the phase Id

                // If the reference phase is Green
                if (curPhaseStatusGroup.getPhaseGreens().get(phaseId) == 1) {
                    // Then check the next message
                    for (int j = 0; j < beginPhases.size(); j++) {// Loop for the begin phases
                        if (nextPhaseStatusGroup.getPhaseGreens().get(beginPhases.get(j)) == 1) {
                            // Some messages are missing, and Green is allocated to the opposite direction at the next message
                            // Then this message is the end of the current cycle

                            // We roughly (not accurate!) estimate the additional time of the current cycle
                            double additionTime = plannedPhaseList.get(phaseId).getRedDuration() +
                                    plannedPhaseList.get(phaseId).getYellowDuration();
                            endOfCycle = curTime + (long) additionTime * 1000;
                            newIndex = index + 1; // The new index is the one next
                            break;
                        }
                    }
                }

                // If the reference phase is Yellow
                if (curPhaseStatusGroup.getPhaseYellows().get(phaseId) == 1) {
                    // It is the end of the phase
                    // Need to determine whether it is the end of the cycle
                    // Check other reference phases
                    double additionTime = plannedPhaseList.get(phaseId).getRedDuration() +
                            plannedPhaseList.get(phaseId).getYellowDuration();
                    endOfCycle = curTime + (long) additionTime * 1000;
                    for (int j = 0; j < referencePhases.size(); j++) {
                        if (j != i) { // Not the same reference
                            if (curPhaseStatusGroup.getPhaseGreens().get(referencePhases.get(j)) == 1) {
                                // Other reference is still Green
                                // It is not the end of cycle!
                                endOfCycle = -1;// Overwrite the status
                                break; // If nothing happens, then it indicates the end of cycle
                            }
                        }
                    }
                    if (endOfCycle > 0) { // It is the end of cycle
                        boolean findNewCycle = false;
                        // Try to find the starting index of a new cycle
                        for (int j = index + 1; j < documentList.size(); j++) {// Loop from the rest of messages
                            if (!findNewCycle) {// Try to find a new cycle
                                IntersectionSignalStatus tmpSignalStatus = getSignalStatusFromDocument(documentList.get(j));
                                IntersectionPhaseStatusGroup tmpPhaseStatusGroup = getPhaseStatusGroupFromSignalStatus(tmpSignalStatus);
                                for (int k = 0; k < beginPhases.size(); k++) { // Loop from the begin phases
                                    if (tmpPhaseStatusGroup.getPhaseGreens().get(beginPhases.get(k)) == 1) {
                                        // If it is Green! Find the index of the new cycle
                                        newIndex = j;
                                        findNewCycle = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                // If the reference phase is Red
                if (curPhaseStatusGroup.getPhaseReds().get(phaseId) == 1) {
                    if (prePhaseStatusGroup.getPhaseGreens().get(phaseId) == 1) {
                        // Missing the yellow message, but this is the end of phase
                        // Need to determine whether it is the end of the cycle
                        // Check other reference phases
                        double additionTime = plannedPhaseList.get(phaseId).getRedDuration();
                        endOfCycle = curTime + (long) additionTime * 1000;

                        for (int j = 0; j < referencePhases.size(); j++) {// Loop for other reference phases
                            if (j != i) {
                                if (curPhaseStatusGroup.getPhaseGreens().get(referencePhases.get(j)) == 1) {
                                    // Other reference is still Green
                                    endOfCycle = -1;// Overwrite the status
                                    break; // If nothing happens, then it indicates the end of cycle
                                }
                            }
                        }

                        if (endOfCycle > 0) { // If it is the end of the cycle
                            boolean findNewCycle = false;
                            for (int j = index + 1; j < documentList.size(); j++) {// Loop for the rest of messages
                                if (!findNewCycle) {// Try to find a new cycle
                                    IntersectionSignalStatus tmpSignalStatus = getSignalStatusFromDocument(documentList.get(j));
                                    IntersectionPhaseStatusGroup tmpPhaseStatusGroup = getPhaseStatusGroupFromSignalStatus(tmpSignalStatus);
                                    for (int k = 0; k < beginPhases.size(); k++) { // Loop for the begin phases
                                        if (tmpPhaseStatusGroup.getPhaseGreens().get(beginPhases.get(k)) == 1) {
                                            newIndex = j;
                                            findNewCycle = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return Arrays.asList(String.valueOf(endOfCycle),String.valueOf(newIndex));
    }

    public static IntersectionSignalCycleStatus updateActualPhaseInformation(List<Document> documentList,int index, int beginIndex
            , IntersectionSignalCycleStatus intersectionSignalCycleStatus ){
        // This function is used to update the actual phase durations based on the message information

        IntersectionSignalStatus preSignalStatus=getSignalStatusFromDocument(documentList.get(index-1));
        long preTime=(long)documentList.get(index-1).get("lastUpdateTime");
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentList.get(index));
        long curTime=(long)documentList.get(index).get("lastUpdateTime");

        // Update control status for the first time
        intersectionSignalCycleStatus=updateControlStatusForTheFirstTime(intersectionSignalCycleStatus,curSignalStatus);

        // Update the phase durations
        // We have different tricks on this
        if(index==beginIndex){ // For the first message in a new cycle
            intersectionSignalCycleStatus=updatePhaseDurationAtFirstTime(curSignalStatus,curTime,intersectionSignalCycleStatus);
        }else{ // For other following messages
            intersectionSignalCycleStatus=updatePhaseDurationAfterwards(preSignalStatus,preTime,curSignalStatus,curTime,intersectionSignalCycleStatus);
        }

        // Return the results
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDurationAtFirstTime(IntersectionSignalStatus curSignalStatus,long curTime
            ,IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // Update the phase duration at the very beginning of the cycle (the first message)

        // Get the startTime of the cycle
        // Here, we consider the start time of the cycle is measured correctly.
        long startTime=intersectionSignalCycleStatus.getCycleStartTime();

        // Get the current phase status
        IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);

        // Get current actual phase status
        Iterator iterator = intersectionSignalCycleStatus.getActualPhaseList().entrySet().iterator();

        // Update the actual phase status with the new message input
        Map<Integer, IntersectionPhaseStatus> actualPhaseListUpdated=new HashMap<>();
        while(iterator.hasNext()){
            // Get phase Id
            Map.Entry pair = (Map.Entry)iterator.next();
            int phaseId=(int)pair.getKey();

            // Get the status of the given phase Id
            IntersectionPhaseStatus intersectionPhaseStatus=(IntersectionPhaseStatus)pair.getValue();
            IntersectionPhaseStatus intersectionPhaseStatusPlanned=intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);

            // Current Status: Green
            if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                // If the phase is Green at the current message
                // Assuming it has been Green since the beginning of the cycle
                double tmpGreen=intersectionPhaseStatus.getGreenDuration();
                intersectionPhaseStatus.setGreenDuration(tmpGreen+Math.round((curTime-startTime)/1000.0));
            }

            // Current Status: Yellow
            if(curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                // This is an indication of missing messages in previous steps
                System.out.println("This is the beginning message of a new cycle. But messages are missing in previous steps!");

                // This is an indication of the end of the phase
                // Add up the green time
                double tmpGreen=intersectionPhaseStatus.getGreenDuration();
                intersectionPhaseStatus.setGreenDuration(tmpGreen+Math.round((curTime-startTime)/1000.0));
                // Meanwhile, update the yellow and red duration
                intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                // Update the split duration
                intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration()+
                        intersectionPhaseStatus.getYellowDuration()+intersectionPhaseStatus.getRedDuration());
                intersectionPhaseStatus.setStatus("estimated");
            }

            // Current Status: Red
            if(curPhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                // If the phase is Red at the current message
                // Assuming it is red since the beginning of the cycle
                // Thus do nothing!!
            }
            actualPhaseListUpdated.put(phaseId,intersectionPhaseStatus);
        }

        // Update the actual phase status and return
        intersectionSignalCycleStatus.setActualPhaseList(actualPhaseListUpdated);
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDurationAfterwards(IntersectionSignalStatus preSignalStatus, long preTime
            ,IntersectionSignalStatus curSignalStatus,long curTime,IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // Update the phase duration afterwards

        // Get current and previous phase status from the messages
        IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);
        IntersectionPhaseStatusGroup prePhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(preSignalStatus);

        // Get current actual phase status
        Iterator iterator = intersectionSignalCycleStatus.getActualPhaseList().entrySet().iterator();

        // Update the actual phase status
        Map<Integer, IntersectionPhaseStatus> actualPhaseListUpdated=new HashMap<>();
        while(iterator.hasNext()){
            // Get the phase Id
            Map.Entry pair = (Map.Entry)iterator.next();
            int phaseId=(int)pair.getKey();

            // Get the status of the phase
            IntersectionPhaseStatus intersectionPhaseStatus=(IntersectionPhaseStatus)pair.getValue();
            IntersectionPhaseStatus intersectionPhaseStatusPlanned=intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);

            // Current Status: Green
            if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                // If the phase is Green at the current message
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                    // If the phase is also Green at the previous message
                    // Add up the green time
                    double tmpGreen=intersectionPhaseStatus.getGreenDuration();
                    intersectionPhaseStatus.setGreenDuration(tmpGreen+Math.round((curTime-preTime)/1000.0));
                }else if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                    // If the phase is Yellow at the previous message
                    // It might be the first green, or it might miss several green messages ahead
                    System.out.println("It is impossible to have Green right after Yellow! Messages are missing in previous time periods!");
                }else if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1)
                { // If the phase is Red at the previous massage
                    // It is Normal to see!
                }else{
                    System.out.println("Errors exist in coding the phase status (Signal Status) in previous time periods!");
                }
            }

            // Current Status: Yellow
            if(curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                // If the phase is Yellow at the current message
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                    // If the phase is Green at the previous message
                    // This is an indication of the end of the phase
                    // Add up the green time
                    double tmpGreen=intersectionPhaseStatus.getGreenDuration();
                    intersectionPhaseStatus.setGreenDuration(tmpGreen+Math.round((curTime-preTime)/1000.0));
                    // Meanwhile, update the yellow and red duration
                    intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                    intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                    // Update the split duration
                    intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration()+
                            intersectionPhaseStatus.getYellowDuration()+intersectionPhaseStatus.getRedDuration());
                    intersectionPhaseStatus.setStatus("measured");
                }
                else if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                    // If the phase is Yellow at the previous message
                    // It is normal to see since the yellow time period can be several seconds
                    // Thus do nothing!
                }else if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                    // That means some Green messages are missing.
                    System.out.println("It is impossible to have Yellow right after Red! Messages are missing in previous time periods!");

                    // In this case, we use the planned green as an estimate
                    // Just in case the planned split is null, then use the min Green setting
                    intersectionPhaseStatus.setGreenDuration(Math.max
                            (intersectionPhaseStatusPlanned.getGreenDuration(),intersectionPhaseStatusPlanned.getMinGreen()));
                    intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                    intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                    // Update the split duration
                    intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration()+
                            intersectionPhaseStatus.getYellowDuration()+intersectionPhaseStatus.getRedDuration());
                    intersectionPhaseStatus.setStatus("planned");
                }else{
                    System.out.println("Errors exist in coding the phase status (Signal Status) in previous time periods!");
                }
            }

            // Current Status: Red
            if(curPhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                // If the phase is Red at the current message
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                    // If the phase is Green at the previous message
                    // That indicates Yellow messages are missing in previous steps
                    // Need to do something!!
                    double tmpGreen=intersectionPhaseStatus.getGreenDuration();
                    double additionGreen=Math.round((curTime-preTime)/1000.0-intersectionPhaseStatusPlanned.getYellowDuration());
                    if(additionGreen<0){
                        System.out.println("Error: curTime-preTime is smaller than the yellow duration!");
                    }
                    intersectionPhaseStatus.setGreenDuration(tmpGreen+Math.max(0,additionGreen));
                    intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                    intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                    // Update the split duration
                    intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration()+
                            intersectionPhaseStatus.getYellowDuration()+intersectionPhaseStatus.getRedDuration());
                    intersectionPhaseStatus.setStatus("estimated");
                }else if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                    // If the phase is Yellow at the previous message
                    // That is normal, OK!
                }else if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                    // If the phase is Red at the previous message
                    // That is normal too! Do nothing!
                }else{
                    System.out.println("Errors exist in coding the phase status (Signal Status) in previous time periods!");
                }
            }
            actualPhaseListUpdated.put(phaseId,intersectionPhaseStatus);
        }

        // Update the cycle information and return
        intersectionSignalCycleStatus.setActualPhaseList(actualPhaseListUpdated);
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updateControlStatusForTheFirstTime(IntersectionSignalCycleStatus intersectionSignalCycleStatus
            ,IntersectionSignalStatus curSignalStatus){
        // Update the following parameters; Only set it at one time, assuming the rest within a cycle would be the same

        // deviceStatus
        if(intersectionSignalCycleStatus.getDeviceStatus()==null && curSignalStatus.getDeviceStatusHeader()!=null){
            intersectionSignalCycleStatus.setDeviceStatus(curSignalStatus.getDeviceStatusHeader().getDeviceStatus());
        }
        // deviceCommStatus;
        if(intersectionSignalCycleStatus.getDeviceCommStatus()==null && curSignalStatus.getDeviceStatusHeader()!=null){
            intersectionSignalCycleStatus.setDeviceCommStatus(curSignalStatus.getDeviceStatusHeader().getDeviceCommStatus());
        }
        // signalControlSource;
        if(intersectionSignalCycleStatus.getSignalControlSource()==null && curSignalStatus.getSignalControlSource()!=null){
            intersectionSignalCycleStatus.setSignalControlSource(curSignalStatus.getSignalControlSource());
        }
        // plannedSignalTimingMode;
        if(intersectionSignalCycleStatus.getPlannedSignalTimingMode()==null && curSignalStatus.getPlannedSignalTimingMode()!=null){
            intersectionSignalCycleStatus.setPlannedSignalTimingMode(curSignalStatus.getPlannedSignalTimingMode());
        }
        // currentSignalTimingMode;
        if(intersectionSignalCycleStatus.getCurrentSignalTimingMode()==null && curSignalStatus.getCurrentSignalTimingMode()!=null){
            intersectionSignalCycleStatus.setCurrentSignalTimingMode(curSignalStatus.getCurrentSignalTimingMode());
        }
        // actualCycleLength;
        if(intersectionSignalCycleStatus.getActualCycleLength()<0 && curSignalStatus.getCycleLengthCurrent()>0){
            intersectionSignalCycleStatus.setActualCycleLength(curSignalStatus.getCycleLengthCurrent());
        }
        // actualOffset;
        if(intersectionSignalCycleStatus.getActualOffset()<0 && curSignalStatus.getOffsetTimeCurrent()>=0){
            intersectionSignalCycleStatus.setActualOffset(curSignalStatus.getOffsetTimeCurrent());
        }
        // offsetReference;
        if(intersectionSignalCycleStatus.getOffsetReference()==null && curSignalStatus.getOffsetReference()!=null){
            intersectionSignalCycleStatus.setOffsetReference(curSignalStatus.getOffsetReference());
        }
        return intersectionSignalCycleStatus;
    }

    public static List<Integer> findBeginPhaseForEachRing(List<IntersectionSignalSequenceData> sequenceDataList){
        // This function is used to find the begin phase Id for each ring

        // Considering some phases (e.g., left turn phase) may be skipped,
        // we use the first two phases in each ring if possible
        List<Integer> beginPhases=new ArrayList<>();
        for(int i=0;i<sequenceDataList.size();i++){// Check the sequence data list
            List<Short> phaseIds=sequenceDataList.get(i).getSequenceData().getPhaseIdentifier(); // Get phase Ids in each ring
            beginPhases.add((int) phaseIds.get(0));// Add the first phase Id
            if(phaseIds.size()>2) { // If we have more phases, add the second one.
                beginPhases.add((int) phaseIds.get(1));
            }
        }
        // Return the phases
        return beginPhases;
    }

    public static List<Integer> findEndPhaseForEachRing(List<IntersectionSignalSequenceData> sequenceDataList){
        // This function is used to find the end phase Id for each ring

        // We need to use a reference phase Id to indicate the starting time of a new cycle. We decide to use the end phases
        // , instead of the beginning phases, in each ring as the indicator. This is because depending on the Lead-Lag settings
        // of left turns, it is not reliable to use the beginning phase as an indicator as they may be skipped if they are not activated.
        // If we use the end phase of each ring, we should be able to catch at least one phase for major movements (e.g., through movements)
        List<Integer> referencePhases=new ArrayList<>();
        for(int i=0;i<sequenceDataList.size();i++){ // Check the sequence data list
            List<Short> phaseIds=sequenceDataList.get(i).getSequenceData().getPhaseIdentifier(); // Get the phase Ids
            referencePhases.add((int) phaseIds.get(phaseIds.size()-1)); // Add the last phase in each ring
        }
        // Return the phases
        return referencePhases;
    }

    public static Map<String,Long[]> getCycleBuildingPeriodForAllIntersections(MongoCollection<Document> collectionSignalStatus
            ,MongoCollection<Document> collectionSignalTPInventory,MongoCollection<Document> collectionCycleInformation
            ,String orgId){
        // This is the function used to get the cycle building period for all intersections

        // collectionSignalStatus && collectionSignalTPInventory decide what intersections should be updated.
        // Without the collectionSignalTPInventory, we do not know the phase sequence.
        // So we are not able to construct the cycle.
        //
        // collectionSignalStatus && collectionCycleInformation decide what the building period is.
        // For each intersection, suppose we can get [B_status, E_status] from collectionSignalStatus,
        // and [B_cycle, E_cycle] from collectionCycleInformation. Then we can use the following to determine the building period:
        // Beginning time: max[B_status,E_cycle]
        // Ending time: max[E_status,E_cycle]

        // First: Get the unique set of intersections (common intersections between collectionSignalStatus and collectionSignalTPInventory)
        List<String> devIDFromIntSigTP=getUniqueListOfDeviceIdsForGivenOrgFromIntSigTP(collectionSignalTPInventory,orgId);
        List<String> devIDFromIntSigStatus=getUniqueListOfDeviceIdsForGivenOrgFromIntSigStatus(collectionSignalStatus,orgId);
        devIDFromIntSigStatus.retainAll(devIDFromIntSigTP);// Now devIDFromIntSigStatus only contains common intersections in both lists

        // Build the hash map <deviceId,[start time, end time]>
        HashMap<String,Long[]> buildingTimePeriod=new HashMap<>();
        for(int i=0;i<devIDFromIntSigStatus.size();i++){
            // For each device Id
            String devID=devIDFromIntSigStatus.get(i);

            // Get the beginning and ending times from Signal Status
            FindIterable iterableSigStatus=collectionSignalStatus.find(and(eq("organizationId",orgId),
                    eq("deviceId",devID))).projection(fields(include("lastUpdateTime")));
            Iterator iterator=iterableSigStatus.iterator();
            List<Long> lastUpdateTime=new ArrayList<>();
            while(iterator.hasNext()){
                lastUpdateTime.add((Long)((Document)iterator.next()).get("lastUpdateTime"));
            }
            Collections.sort(lastUpdateTime);
            Long beginningTime=lastUpdateTime.get(0);
            Long endingTime=lastUpdateTime.get(lastUpdateTime.size()-1);

            // Get the beginning and ending time from collectionCycleInformation
            FindIterable iterableCycleInf=collectionCycleInformation.find(and(eq("organizationId",orgId),
                    eq("deviceId",devID))).projection(fields(include("cycleStartTime","cycleEndTime")));
            iterator=iterableCycleInf.iterator();
            while(iterator.hasNext()){
                Document tmpDoc=(Document)iterator.next();
                Long tmpTime=(Long)tmpDoc.get("cycleEndTime");
                // Update: Beginning time: max[B_status,E_cycle]
                if(beginningTime<tmpTime){
                    beginningTime=tmpTime;
                }
                // Update: Ending time: max[E_status,E_cycle]
                if(endingTime<tmpTime){
                    endingTime=tmpTime;
                }
            }

            // Add to the hash map
            buildingTimePeriod.put(devID,new Long[]{beginningTime,endingTime});
        }
        return buildingTimePeriod;
    }

}
