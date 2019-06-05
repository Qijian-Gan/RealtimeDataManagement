package edu.berkeley.path.aggregation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.objects.IntersectionPhaseStatus;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionSignalCycleStatus;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalStatus;

import java.util.*;
import java.util.stream.Collectors;

import static edu.berkeley.path.database.MongoDB.select.documentsForGivenDeviceIdAndTimePeriodsFromSigStatus;
import static edu.berkeley.path.database.MongoDB.select.upToDateTPInventoryForGivenDeviceIdFromIntSigTP;
import static edu.berkeley.path.processor.SignalStatus.getPhaseStatusGroupFromSignalStatus;
import static edu.berkeley.path.processor.SignalStatus.getSignalStatusFromDocument;

public class IntersectionCycleBuilderByRing {

    //********************************************************
    // Definitions of variables
    //********************************************************
    private static int maxMessageGap=300;// Define the maximum gap between messages

    public int getMaxMessageGap() {
        return maxMessageGap;
    }

    public static void setMaxMessageGap(int _maxMessageGap) {
        maxMessageGap = _maxMessageGap;
    }

    //********************************************************
    // Temporary classes
    //********************************************************
    public static class MessagesByCycle{
        public int deviceId;
        public int timingPlanId;
        public Document signalTimingPlanInventory;
        public List<Document> signalStatusDocumentList;

        public MessagesByCycle(int _deviceId,int _timingPlanId,Document _signalTimingPlanInventory
                ,List<Document> _signalStatusDocumentList){
            deviceId=_deviceId;
            timingPlanId=_timingPlanId;
            signalTimingPlanInventory=_signalTimingPlanInventory;
            signalStatusDocumentList=_signalStatusDocumentList;
        }
    }

    //********************************************************
    // Functions
    //********************************************************
    // Note: After going deeper into the sequence of messages, I find that it is easier and more accurate to
    // process the data by rings since we have the sequence of phases in each ring. For phases in each ring,
    // they form a cycle. From one phase into the next, the switch follows: Green, Yellow, and All Red. It is earier
    // to tell whether this sequence is strictly followed or not. And then we can develop algorithms to catch all kinds of
    // errors or cases of missing messages.

    // Note: another concern of processing the data by cycle is it may cause mis-match in the barrier information since we do not
    // strictly implement the barrier in the calculation. This case might happen, but I would think it is very rare. If we handle
    // the calculation properly, it should be fine and the calculation should be correct.

    // Note: it is important to ensure the messages of Signal Status are sampled in high frequency, e.g., every
    // one second or even event based. If they are at longer time intervals, it is inaccurate or even impossible
    // to reconstruct cycle-based information.
    // Even when they are sampled at every one second, we still miss some messages because the yellow, all red
    // and green extension settings can be in the interval of 0.5 seconds. In our development, we consider these
    // impacts to ensure we have good reconstruction of cycle-based information.
    //********************************************************

    public static void buildAndSaveCycleInformation(Map<String,Long[]> buildingTimePeriod, String orgId
            , MongoCollection<Document> collectionSignalStatus, MongoCollection<Document> collectionSignalTPInventory
            , MongoCollection<Document> collectionCycleInformation) {
        // This function is used to build cycle information and save it to MongoDB

        ObjectMapper mapper = new ObjectMapper(); // Write to string

        // For each device Id (intersection)
        Iterator iterator = buildingTimePeriod.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            String deviceId = (String) pair.getKey();
            Long[] time = (Long[]) pair.getValue();

            // Build the cycle information for given device id and time period
            List<IntersectionSignalCycleStatus> tmpSignalCycleStatusList=buildCycleInformationForOneIntersection
                    (orgId, deviceId, time[0],time[1],collectionSignalStatus,collectionSignalTPInventory);

            // Create the document list
            List<Document> documentList=new ArrayList<>();
            for(int i=0;i<tmpSignalCycleStatusList.size();i++){
                try {
                    Document documentIndividual = Document.parse(mapper.writeValueAsString(tmpSignalCycleStatusList.get(i)));
                    documentList.add(documentIndividual);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }

            // Save them to the corresponding collection
            if(documentList.size()>0) {
                collectionCycleInformation.insertMany(documentList);
            }
            System.out.println("Finish saving the cycle information: device Id="+deviceId+" & number of cycles="+documentList.size());
        }
    }

    public static List<IntersectionSignalCycleStatus>  buildCycleInformationForOneIntersection(String organizationId
            , String deviceId, long startTime, long endTime,MongoCollection<Document> collectionSignalStatus
            ,MongoCollection<Document> collectionSignalTPInventory) {
        // This function is used to build cycles for a given intersections within a predefined time period

        // Initialization: Create a list of IntersectionSignalCycleStatus
        List<IntersectionSignalCycleStatus> intersectionSignalCycleStatusList=new ArrayList<>();

        // Search the database (collection) for timing plan inventories
        Map<Integer,Document> upToDateTPInventory=upToDateTPInventoryForGivenDeviceIdFromIntSigTP(collectionSignalTPInventory
                , organizationId, deviceId);

        // Get a list of event messages for the given intersection within the given time period, ordered by time
        List<Document> documentList=documentsForGivenDeviceIdAndTimePeriodsFromSigStatus(collectionSignalStatus,organizationId
                , deviceId, startTime, endTime);

        if(documentList.size()>0) {
            // Split the messages by cycles, when the corresponding timing plan inventory is available
            List<MessagesByCycle> messagesByCycleList = splitDocumentsByCycle(Integer.parseInt(deviceId), upToDateTPInventory, documentList);

            // For each messageByCycle, try to build the whole cycle
            for(int i=0;i<messagesByCycleList.size();i++) {
                IntersectionSignalCycleStatus intersectionSignalCycleStatus = buildCycleFromMessages(messagesByCycleList.get(i));
                if(intersectionSignalCycleStatus!=null){
                    intersectionSignalCycleStatusList.add(intersectionSignalCycleStatus);
                }
            }
        }

        // Return the list of cycle information
        return intersectionSignalCycleStatusList;
    }

    public static List<MessagesByCycle> splitDocumentsByCycle(int deviceId, Map<Integer,Document> upToDateTPInventory
            , List<Document> documentList){
        // This function is used to split messages/documents by cycle when the corresponding timing pattern inventory is available.

        //***************************************************
        // Note we require: (i) documentList is sorted by time, and (ii) cycle counter is correctly coded
        //***************************************************
        List<MessagesByCycle> messagesByCycleList=new ArrayList<>();

        List<Document> tmpDocumentList=null;
        Document documentTPInventory=null;
        int timingPlanId=0;
        int cycleCounter=0;
        long messageTime=0;
        boolean startCycle=true;

        for(int i=0;i<documentList.size();i++){
            if(startCycle){// Look for an available TP inventory
                tmpDocumentList=new ArrayList<>();
                timingPlanId = Integer.parseInt(documentList.get(i).get("timingPatternIdCurrent").toString());
                if (upToDateTPInventory.containsKey(timingPlanId)) {// Find it available?
                    startCycle = false;
                    // Get the first cycle counter
                    cycleCounter=Integer.parseInt(((Document)documentList.get(i).
                            get("intersectionSignalStatus")).get("cycleCounter").toString());
                    // Get the message time
                    messageTime=Long.parseLong(documentList.get(i).get("lastUpdateTime").toString());
                    // Get the TP Inventory
                    documentTPInventory=upToDateTPInventory.get(timingPlanId);
                    // Add the first document
                    tmpDocumentList.add(documentList.get(i));
                }
            }else{ // Not the starting point of a cycle?
                // Get the timing plan Id
                int tmpTimingPlanId=Integer.parseInt(documentList.get(i).get("timingPatternIdCurrent").toString());
                if(tmpTimingPlanId==timingPlanId){ // The same plan Id
                    // Get the cycle counter
                    int tmpCycleCounter=Integer.parseInt(((Document)documentList.get(i).
                            get("intersectionSignalStatus")).get("cycleCounter").toString());
                    // Get the message time
                    long tmpMessageTime=Long.parseLong(documentList.get(i).get("lastUpdateTime").toString());
                    if(tmpCycleCounter>cycleCounter &&(tmpMessageTime-messageTime)/1000.0<maxMessageGap){
                        // Increasing cycle counter, and reasonable message gap: Still the same cycle
                        // Add to the document list
                        tmpDocumentList.add(documentList.get(i));
                        // Update cycle counter and message time
                        cycleCounter=tmpCycleCounter;
                        messageTime=tmpMessageTime;
                    }else{// Either cycle counter is less than the previous one
                        // Or there is a big gap with significant loss of messages
                        // Indication of a new cycle
                        if(tmpDocumentList.size()>1){// More than one messages inside
                            MessagesByCycle messagesByCycle=new MessagesByCycle(deviceId,timingPlanId,
                                    documentTPInventory,tmpDocumentList);
                            messagesByCycleList.add(messagesByCycle);
                            // Reset the indicator
                            startCycle=true;
                            i=i-1;// After the operation i=i+1, it will be the current message as a new cycle
                        }
                    }
                }else{// If the timing plan Id is not the same?
                    if(tmpDocumentList.size()>1){// More than one messages inside
                        MessagesByCycle messagesByCycle=new MessagesByCycle(deviceId,timingPlanId,
                                documentTPInventory,tmpDocumentList);
                        messagesByCycleList.add(messagesByCycle);
                        // Reset the indicator
                        startCycle=true;
                        i=i-1;// After the operation i=i+1, it will be the current message as a new cycle
                    }
                }
            }
        }

        // Return the results
        return messagesByCycleList;
    }

    public static IntersectionSignalCycleStatus buildCycleFromMessages(MessagesByCycle messagesByCycle){
        // This function is used to build a cycle from a list of messages which are supposed to be in the same cycle

        // Initialization
        IntersectionSignalCycleStatus intersectionSignalCycleStatus=null;

        // Check the first message to see whether it is a valid cycle or not
        // If not, return null
        boolean validOrNot=cycleValidOrNot(messagesByCycle.signalStatusDocumentList.get(0));
        if(validOrNot){// If it is a valid cycle, build it; or else, ignore it.
            // Initialization
            intersectionSignalCycleStatus = new IntersectionSignalCycleStatus();
            intersectionSignalCycleStatus.initialization();

            // Once find the starting index, update the inventory information
            intersectionSignalCycleStatus.updateInventoryInformation(messagesByCycle.signalTimingPlanInventory);

            // Also update the reference phase IDs: as a reference to check where the cycle begins
            // Sometimes, it starts from the end of phase for coordination.
            List<Integer> referencePhases = findReferencePhases(messagesByCycle.signalStatusDocumentList.get(0));
            intersectionSignalCycleStatus.setReferencePhaseIDs(referencePhases); // Update the reference phases

            // Update the phase duration as well as other information
            intersectionSignalCycleStatus = updateActualPhaseInformation(messagesByCycle, intersectionSignalCycleStatus);
        }

        // Return the results
        return intersectionSignalCycleStatus;
    }

    public static boolean cycleValidOrNot(Document signalStatusDoc){
        // This function is used to check whether a cycle is valid or not

        // Note: We look at the first message. If there exist phases in the status of Green or Yellow, we consider the cycle is valid.
        // This method will fail if we miss a full set of messages (Green, Yellow, and Red) for certain phases (e.g., phase 1 & 5),
        // and the first message only contains the information for the next phases (e.g., phase 2 & 6).
        // However, there is no perfect method on identifying whether a cycle is valid or not purely based on the available messages.

        boolean validOrNot=false;

        // Get Signal Status data structure
        IntersectionSignalStatus intersectionSignalStatus=getSignalStatusFromDocument(signalStatusDoc);
        // Get the phase status group
        IntersectionPhaseStatusGroup intersectionPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(intersectionSignalStatus);

        // Get the phase greens
        Map<Integer,Integer> phaseGreens=intersectionPhaseStatusGroup.getPhaseGreens();
        Iterator iterator = phaseGreens.entrySet().iterator(); // For each phase id
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int isGreenOrNot = (int) pair.getValue();
            if(isGreenOrNot==1){ // Has a green phase
                validOrNot=true;
                break;
            }
        }

        // Get the phase yellows
        if(!validOrNot) { // No green phases?
            Map<Integer, Integer> phaseYellows = intersectionPhaseStatusGroup.getPhaseYellows();
            iterator = phaseYellows.entrySet().iterator(); // For each phase id
            while (iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next();
                int isYellowOrNot = (int) pair.getValue();
                if (isYellowOrNot == 1) { // Has a yellow phase
                    validOrNot = true;
                    break;
                }
            }
        }

        return validOrNot;
    }

    public static List<Integer> findReferencePhases(Document document){
        // Get the reference phases from the first document/message of the cycle

        List<Integer> referencePhases=new ArrayList<>();

        // Get Signal Status data structure
        IntersectionSignalStatus intersectionSignalStatus=getSignalStatusFromDocument(document);
        // Get the phase status group
        IntersectionPhaseStatusGroup intersectionPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(intersectionSignalStatus);

        // Get the phase greens
        Map<Integer,Integer> phaseGreens=intersectionPhaseStatusGroup.getPhaseGreens();
        Iterator iterator = phaseGreens.entrySet().iterator(); // For each phase id
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int phaseId=(int) pair.getKey();
            int isGreenOrNot = (int) pair.getValue();
            if(isGreenOrNot==1){ // Has a green phase
                referencePhases.add(phaseId);
            }
        }

        // Get the phase yellows
        Map<Integer, Integer> phaseYellows = intersectionPhaseStatusGroup.getPhaseYellows();
        iterator = phaseYellows.entrySet().iterator(); // For each phase id
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int phaseId=(int) pair.getKey();
            int isYellowOrNot = (int) pair.getValue();
            if (isYellowOrNot == 1) { // Has a yellow phase
                referencePhases.add(phaseId);
            }
        }

        // Return the reference phases
        return  referencePhases;
    }

    public static IntersectionSignalCycleStatus updateActualPhaseInformation(MessagesByCycle messagesByCycle,
                                                                             IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // This function is used to update actual phase information

        List<Document> documentStatus=messagesByCycle.signalStatusDocumentList;

        //***********************************
        // Update control status for the first time
        //***********************************
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(0));
        intersectionSignalCycleStatus=updateControlStatusForTheFirstTime(intersectionSignalCycleStatus,curSignalStatus);

        //***********************************
        // Update the cycle start time
        //***********************************
        // Get the current time of the first message
        long firstTime=(long)documentStatus.get(0).get("lastUpdateTime");
        IntersectionSignalStatus firstSignalStatus=getSignalStatusFromDocument(documentStatus.get(0));
        // Adjust the cycle start time by subtracting the counter time
        long cycleStartTime=firstTime- firstSignalStatus.getCycleCounter()*1000;
        intersectionSignalCycleStatus.setCycleStartTime(cycleStartTime);

        //***********************************
        // Construct actual phase duration
        //***********************************
        intersectionSignalCycleStatus=updatePhaseDuration(documentStatus,intersectionSignalCycleStatus);

        //********************************
        // Update the cycle end time
        //********************************
        if(intersectionSignalCycleStatus.getActualCycleLength()!=0){
            // Not in the free mode which doesn't have a specific cycle length
            intersectionSignalCycleStatus.setCycleEndTime(intersectionSignalCycleStatus.getCycleStartTime()+
                    (long) intersectionSignalCycleStatus.getActualCycleLength()*1000);
        }else{
            // Doesn't have a specific cycle length
            // Update the actual cycle length and cycle end time
            intersectionSignalCycleStatus=updateCycleLengthAndCycleEndTime(intersectionSignalCycleStatus, documentStatus.get(documentStatus.size()-1));
        }
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updateControlStatusForTheFirstTime(IntersectionSignalCycleStatus intersectionSignalCycleStatus
            ,IntersectionSignalStatus curSignalStatus){
        // This function is used to update some control status for the first time

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

    public static IntersectionSignalCycleStatus updateCycleLengthAndCycleEndTime(IntersectionSignalCycleStatus intersectionSignalCycleStatus,
                                                                                 Document document){
        // This function is used to update the cycle length and cycle end time for the given cycle

        // Status of current document
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(document);
        IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);

        int curCycleCounter=curSignalStatus.getCycleCounter();
        double additionalTime=0;
        for(int i=0;i<intersectionSignalCycleStatus.getPhaseTPList().size();i++) {// Loop for each phase
            int phaseId = intersectionSignalCycleStatus.getPhaseTPList().get(i).getPhaseIdentifier();
            IntersectionPhaseStatus intersectionPhaseStatusPlanned = intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);

            // If phase is Green, projected with Yellow + All Red
            if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                additionalTime=Math.max(additionalTime,intersectionPhaseStatusPlanned.getYellowDuration()
                        +intersectionPhaseStatusPlanned.getRedDuration());
            }

            // If phase is Yellow, project with All Red
            if(curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                additionalTime=Math.max(additionalTime,intersectionPhaseStatusPlanned.getRedDuration());
            }

            // If phase is Red
            if(curPhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                // Normal, do nothing
            }
        }

        // Update the cycle length and cycle end time
        intersectionSignalCycleStatus.setActualCycleLength(curCycleCounter+additionalTime);
        intersectionSignalCycleStatus.setCycleEndTime(intersectionSignalCycleStatus.getCycleStartTime()+
                (long)intersectionSignalCycleStatus.getActualCycleLength()*1000);

        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDuration(List<Document> documentStatus, IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // This function is used to update the actual phase duration

        //********************************
        // Get the actual phase sequence in each ring
        // It is important to do so since: (i) the actual sequence may be different, and (ii) some phases may be skipped.
        //********************************
        List<IntersectionSignalSequenceData> sequenceDataList=intersectionSignalCycleStatus.getSequenceDataList();
        List<List<Integer>> actualPhaseSequence=getActualPhaseSequenceByRing(documentStatus,sequenceDataList);

        //********************************
        // Construct the actual phase durations in each ring
        //********************************
        Map<Integer,IntersectionPhaseStatus> tmpActualPhaseList=new HashMap<>();
        // TODO: this part can be optimized in the future
        for(int i=0;i<actualPhaseSequence.size();i++) {
            Map<Integer, IntersectionPhaseStatus> actualPhaseListByRing = updatePhaseDurationByRing(actualPhaseSequence.get(i),intersectionSignalCycleStatus
                    ,documentStatus);
            // Add the actual phases by ring if they are not empty
            if(actualPhaseListByRing.size()>0){
                tmpActualPhaseList.putAll(actualPhaseListByRing);
            }
        }

        //********************************
        // Update the actual phase list
        //********************************
        Map<Integer,IntersectionPhaseStatus> actualPhaseList=intersectionSignalCycleStatus.getActualPhaseList();
        Iterator iterator = actualPhaseList.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int phaseId = (int) pair.getKey();
            if (tmpActualPhaseList.containsKey(phaseId)) {
                actualPhaseList.replace(phaseId, actualPhaseList.get(phaseId), tmpActualPhaseList.get(phaseId));
            }
        }
        intersectionSignalCycleStatus.setActualPhaseList(actualPhaseList);

        // Return the results
        return intersectionSignalCycleStatus;
    }

    public static List<List<Integer>> getActualPhaseSequenceByRing(List<Document> documentStatus,List<IntersectionSignalSequenceData> sequenceDataList){
        // This function is used to get the actual phase sequence by ring

        List<List<Integer>> actualPhaseSequence=new ArrayList<>();
        // TODO: it is currently stupid to loop all documents for each ring
        // TODO: this part can be optimized in the future
        for(int i=0;i<sequenceDataList.size();i++){// Loop for each ring
            // Get the planned sequence
            List<Integer> plannedPhaseSequenceByRing=sequenceDataList.get(i).getSequenceData().getPhaseIdentifier().
                    stream().map(s -> Short.toUnsignedInt(s)).collect(Collectors.toList());

            // Construct the actual phase sequence
            List<Integer> actualPhaseSequenceByRing=new ArrayList<>();
            for(int j=0;j<documentStatus.size();j++){ // Loop for each document
                IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(j));
                IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);
                // Get the green status
                Iterator iterator = curPhaseStatusGroup.getPhaseGreens().entrySet().iterator();
                while(iterator.hasNext()) {
                    Map.Entry pair = (Map.Entry) iterator.next();
                    int phaseId = (int) pair.getKey();
                    int value = (int) pair.getValue();
                    if(value==1) {       // If it is green
                        // If it belongs the the right ring and it is newly found
                        if (plannedPhaseSequenceByRing.stream().filter(s -> s == phaseId).findAny().isPresent() &&
                                !actualPhaseSequenceByRing.stream().filter(o ->o==phaseId).findAny().isPresent()) {
                            actualPhaseSequenceByRing.add(phaseId); // Add it
                        }
                    }
                }
            }
            actualPhaseSequence.add(actualPhaseSequenceByRing);
        }
        // Return the results
        return actualPhaseSequence;
    }


    public static Map<Integer, IntersectionPhaseStatus> updatePhaseDurationByRing(List<Integer> actualPhaseSequenceByRing,IntersectionSignalCycleStatus
            intersectionSignalCycleStatus, List<Document> documentStatus){
        // This function is used to update the phase duration by ring

        Map<Integer, IntersectionPhaseStatus> actualPhaseListByRing=new HashMap<>();

        //*************************************************************************************
        // Be careful!!
        // This is a global reference cycle counter!!!
        double refCycleCounter=0;
        //*************************************************************************************
        for(int i=0;i<actualPhaseSequenceByRing.size();i++){ // Loop for each active phase
            // Get the phase Id
            int phaseId=actualPhaseSequenceByRing.get(i);
            // Set the indicator to be false!
            boolean phaseFinished=false;

            //*************************************************************************************
            // Find the start index
            // This search should be able to correctly label the right starting point of the phase
            int startIdx=-1;
            for(int j=0;j<documentStatus.size();j++){
                IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(j));
                IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);
                if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1 || curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                    startIdx=j;
                    break;
                }
            }

            //*************************************************************************************
            // If the phase is activated
            if(startIdx>=0){
                // Get the planned phase values
                IntersectionPhaseStatus intersectionPhaseStatusPlanned=intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);
                // Get the current phase values
                IntersectionPhaseStatus intersectionPhaseStatus=intersectionSignalCycleStatus.getActualPhaseList().get(phaseId);

                for(int j=startIdx;j<documentStatus.size();j++){ // Loop for each document, starting from "startIdx"
                    // If it indicates the end of the phase, stop!

                    //*************************************************************************************
                    // Obtain message status
                    //*************************************************************************************
                    // Get the current message status
                    IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(j));
                    IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);
                    IntersectionSignalStatus preSignalStatus=null;
                    IntersectionPhaseStatusGroup prePhaseStatusGroup=null;
                    IntersectionSignalStatus nextSignalStatus=null;
                    IntersectionPhaseStatusGroup nextPhaseStatusGroup=null;
                    // Get the previous message status and set the reference cycle counter
                    if(j==0){ // The first document? set the reference counter to be zero
                        refCycleCounter=0;
                    }else{
                        preSignalStatus=getSignalStatusFromDocument(documentStatus.get(j-1));
                        prePhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(preSignalStatus);
                        // It is possible this refCycleCounter is adjusted in the previous phase
                        refCycleCounter=Math.max(refCycleCounter,preSignalStatus.getCycleCounter());
                    }
                    // Get the next message status
                    if(j<documentStatus.size()-1){
                        nextSignalStatus=getSignalStatusFromDocument(documentStatus.get(j+1));
                        nextPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(nextSignalStatus);
                    }

                    //*************************************************************************************
                    // Determination of green, yellow, all-red durations
                    //*************************************************************************************
                    // If the current step is Green?
                    if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                        if(j==0) { // First message, simply add the green time, the refCycleCounter should be zero in this case
                            double currentGreenTime = intersectionPhaseStatus.getGreenDuration();
                            double additionGreenTime = curSignalStatus.getCycleCounter() - refCycleCounter;
                            intersectionPhaseStatus.setGreenDuration(currentGreenTime + additionGreenTime);
                        }else{
                            // ****************************************************
                            // Check the previous message
                            // Previous message is green or red, simply add the green time
                            // Note: we need to be careful and accurate to calculate/update the global variable "refCycleCounter"
                            // Especially when we have missing messages in previous messages
                            if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1 ||
                                    prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                                double currentGreenTime = intersectionPhaseStatus.getGreenDuration();
                                double additionGreenTime = curSignalStatus.getCycleCounter() - refCycleCounter;
                                intersectionPhaseStatus.setGreenDuration(currentGreenTime + additionGreenTime);
                            }

                            // Previous message is yellow, Error
                            if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                                System.out.println("Error! it is impossible to have Green after Yellow @ device id:"
                                        +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                        + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                        + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                                // Set the whole cycle to be invalid
                                intersectionSignalCycleStatus.setValidOrNot(false);
                                intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                        +"Error! it is impossible to have Green after Yellow;");
                            }

                            // ****************************************************
                            // End of the document, no reference available.
                            if(j==documentStatus.size()-1){
                                // In this case, we assign the remaining time to this phase
                                System.out.println("Missing yellow and red messages in the next step @ device id:"
                                        +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                        + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                        + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                                // End of the document status list? use the default value
                                intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                                intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());

                                // Get the total split time of the previous phase Ids
                                double totalSplit=0;
                                if(i!=0){ // Not the first phase?
                                    for(int k=0;k<i;k++){
                                        totalSplit=totalSplit+actualPhaseListByRing.get(actualPhaseSequenceByRing.get(k)).getSplitDuration();
                                    }
                                }
                                // Check available green times
                                // When it is in free mode, cycle information may not be availalbe
                                double greenDuration=0;
                                if(curSignalStatus.getCycleLengthCurrent()>0){// Cycle length information is available?
                                    greenDuration=Math.max(0,curSignalStatus.getCycleLengthCurrent()-totalSplit-
                                            intersectionPhaseStatus.getYellowDuration()-intersectionPhaseStatus.getRedDuration());
                                }
                                greenDuration=Math.max(greenDuration,intersectionPhaseStatus.getGreenDuration());
                                intersectionPhaseStatus.setGreenDuration(greenDuration);

                                // Update the split duration
                                double splitDuration=intersectionPhaseStatus.getGreenDuration() +
                                        intersectionPhaseStatus.getYellowDuration() + intersectionPhaseStatus.getRedDuration();
                                intersectionPhaseStatus.setSplitDuration(splitDuration);
                                // Update the status and error message
                                intersectionPhaseStatus.setStatus("estimated");
                                intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                        +"Missing yellow and red messages in the next step;");

                                phaseFinished=true;
                            }
                        }
                    }

                    // If the current step is Yellow?
                    if(curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                        // ****************************************************
                        // Check the previous message
                        if(j==0){// If it is the first message
                            System.out.println("Missing green messages in the previous step @ device id:"
                                    +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                    + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                    + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));

                            double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                            double additionGreenTime=curSignalStatus.getCycleCounter()-refCycleCounter;
                            // Update green duration
                            intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);
                            // Update the status to be "estimated"
                            intersectionPhaseStatus.setStatus("estimated");
                            intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                    +"Missing green messages in the previous step;");
                        }else{
                            // If the previous status is Red
                            if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                                System.out.println("Missing green messages in the previous step @ device id:"
                                        +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                        + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                        + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                                double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                                double additionGreenTime=curSignalStatus.getCycleCounter()-refCycleCounter;
                                // Update green duration
                                intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);
                                // Update the status to be "estimated"
                                intersectionPhaseStatus.setStatus("estimated");
                                intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                        +"Missing green messages in the previous step;");
                            }

                            // If the previous status is Yellow, normal!! Just add the yellow time
                            if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                                double currentYellowTime=intersectionPhaseStatus.getYellowDuration();
                                double additionYellowTime=curSignalStatus.getCycleCounter()-refCycleCounter;
                                // Update yellow duration
                                intersectionPhaseStatus.setYellowDuration(currentYellowTime+additionYellowTime);
                            }

                            // If the previous status is Green, normal!! Just add the Green time
                            if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                                double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                                double additionGreenTime=curSignalStatus.getCycleCounter()-refCycleCounter;
                                // Update green duration
                                intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);
                                // Update the status to be "estimated"
                                intersectionPhaseStatus.setStatus("measured");
                            }
                        }

                        // ****************************************************
                        // Check the next message
                        if(j==documentStatus.size()-1){
                            System.out.println("Missing red messages in the next step @ device id:"
                                    +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                    + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                    + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                            // End of the document status list? use the default value
                            intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                            intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                            // Update the split duration
                            double splitDuration=intersectionPhaseStatus.getGreenDuration() +intersectionPhaseStatus.getYellowDuration()
                                    + intersectionPhaseStatus.getRedDuration();
                            intersectionPhaseStatus.setSplitDuration(splitDuration);
                            // Update the status and error message
                            intersectionPhaseStatus.setStatus("estimated");
                            intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                    +"Missing yellow and red messages in the next step;");

                            phaseFinished=true;
                        }else{
                            // If the next message is Yellow or Red
                            if(nextPhaseStatusGroup.getPhaseYellows().get(phaseId)==1 ||
                                    nextPhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                                // Normal, do nothing
                            }

                            // If the next message is Green
                            if(nextPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                                // Error!
                                System.out.println("Error! it is impossible to have Green after Yellow @ device id:"
                                        +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                        + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                        + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                                // Set the whole cycle to be invalid
                                intersectionSignalCycleStatus.setValidOrNot(false);
                                intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                        +"Error! it is impossible to have Green after Yellow;");
                            }
                        }
                    }

                    // If the current step is Red?
                    if(curPhaseStatusGroup.getPhaseReds().get(phaseId)==1) {
                        // If previous message is Green
                        if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                            System.out.println("Missing yellow messages in the previous step @ device id:"
                                    +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                    + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                    + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));

                            intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                    +"Missing yellow messages in the previous step;");

                            double timeDifference=curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter();
                            double redTime=intersectionPhaseStatusPlanned.getRedDuration();
                            double yellowTime=intersectionPhaseStatusPlanned.getYellowDuration();
                            //If it is the last phase id
                            if(i==actualPhaseSequenceByRing.size()-1){
                                intersectionPhaseStatus.setYellowDuration(yellowTime);
                                intersectionPhaseStatus.setRedDuration(redTime);
                                // Adjust the green time
                                double extraGreenTime=Math.max(0,timeDifference-yellowTime);
                                intersectionPhaseStatus.setGreenDuration(intersectionPhaseStatus.getGreenDuration()+extraGreenTime);
                                // Update the split duration
                                double splitDuration=intersectionPhaseStatus.getGreenDuration() +intersectionPhaseStatus.getYellowDuration()
                                        + intersectionPhaseStatus.getRedDuration();
                                intersectionPhaseStatus.setSplitDuration(splitDuration);
                                intersectionPhaseStatus.setStatus("estimated");

                                // Adjust the reference cycle counter, and indicate the end of a phase
                                refCycleCounter=curSignalStatus.getCycleCounter()+redTime;
                            }else{
                                // It is an all-red phase
                                if(curPhaseStatusGroup.getPhaseReds().get(actualPhaseSequenceByRing.get(i+1))==1){
                                    intersectionPhaseStatus.setYellowDuration(yellowTime);
                                    intersectionPhaseStatus.setRedDuration(redTime);
                                    // Adjust the green time
                                    double extraGreenTime=Math.max(0,timeDifference-yellowTime);
                                    intersectionPhaseStatus.setGreenDuration(intersectionPhaseStatus.getGreenDuration()+extraGreenTime);
                                    // Update the split duration
                                    double splitDuration=intersectionPhaseStatus.getGreenDuration() +intersectionPhaseStatus.getYellowDuration()
                                            + intersectionPhaseStatus.getRedDuration();
                                    intersectionPhaseStatus.setSplitDuration(splitDuration);
                                    intersectionPhaseStatus.setStatus("estimated");

                                    // Adjust the reference cycle counter, and indicate the end of a phase
                                    refCycleCounter=curSignalStatus.getCycleCounter()+redTime;
                                }else {
                                    // If it is not a all-red phase
                                    if(timeDifference<redTime+yellowTime){
                                        System.out.println("Error! It is impossible to have message gaps smaller than yellow and all " +
                                                "red time when yellow messages are missing @ device id:"
                                                +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                                + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                                + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                                        intersectionSignalCycleStatus.setValidOrNot(false);
                                        intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                                +"Error! It is impossible to have message gaps smaller than yellow and " +
                                                "all red time when yellow messages are missing;");
                                    }
                                    // Set yellow and red times
                                    intersectionPhaseStatus.setYellowDuration(yellowTime);
                                    intersectionPhaseStatus.setRedDuration(redTime);
                                    // Adjust the green time
                                    double extraGreenTime=Math.max(0,timeDifference-yellowTime-redTime);
                                    if(intersectionPhaseStatusPlanned.getGreenDuration()!=0){
                                        extraGreenTime=Math.min(extraGreenTime,Math.max(0,intersectionPhaseStatusPlanned.getGreenDuration()
                                                -intersectionPhaseStatus.getGreenDuration()));
                                    }
                                    intersectionPhaseStatus.setGreenDuration(intersectionPhaseStatus.getGreenDuration()+extraGreenTime);
                                    // Update the split duration
                                    double splitDuration=intersectionPhaseStatus.getGreenDuration() +intersectionPhaseStatus.getYellowDuration()
                                            + intersectionPhaseStatus.getRedDuration();
                                    intersectionPhaseStatus.setSplitDuration(splitDuration);
                                    intersectionPhaseStatus.setStatus("estimated");

                                    // Adjust the reference cycle counter, and indicate the end of a phase
                                    refCycleCounter=refCycleCounter+extraGreenTime+redTime+yellowTime;
                                }
                            }
                            phaseFinished=true;
                        }

                        // If the previous phase is Yellow
                        if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                            // Adjust the yellow time
                            double currentYellowTime=intersectionPhaseStatus.getYellowDuration();
                            double additionYellowTime=Math.min(curSignalStatus.getCycleCounter()-refCycleCounter
                                    ,intersectionPhaseStatusPlanned.getYellowDuration()-currentYellowTime);
                            intersectionPhaseStatus.setYellowDuration(currentYellowTime+additionYellowTime);
                            // Set the red time
                            intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                            // Update the split duration
                            double splitDuration=intersectionPhaseStatus.getGreenDuration() +intersectionPhaseStatus.getYellowDuration()
                                    + intersectionPhaseStatus.getRedDuration();
                            intersectionPhaseStatus.setSplitDuration(splitDuration);
                            intersectionPhaseStatus.setStatus("measured");

                            // Adjust the reference cycle counter, and indicate the end of a phase
                            refCycleCounter=refCycleCounter+additionYellowTime+intersectionPhaseStatus.getRedDuration();
                            phaseFinished=true;
                        }

                        // If the previous phase is Red
                        if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                            // Do nothing
                            phaseFinished=true;
                        }
                    }

                    if(phaseFinished){
                        actualPhaseListByRing.put(phaseId,intersectionPhaseStatus);
                        break;
                    }
                }
            }
        }

        return actualPhaseListByRing;
    }

}
