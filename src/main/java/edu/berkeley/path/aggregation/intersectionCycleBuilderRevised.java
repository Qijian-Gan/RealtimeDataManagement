package edu.berkeley.path.aggregation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoCollection;
import edu.berkeley.path.objects.IntersectionPhaseStatus;
import edu.berkeley.path.objects.IntersectionPhaseStatusGroup;
import edu.berkeley.path.objects.IntersectionSignalCycleStatus;
import org.bson.Document;
import org.tmdd._303.messages.IntersectionSignalStatus;

import java.util.*;

import static edu.berkeley.path.database.MongoDB.select.documentsForGivenDeviceIdAndTimePeriodsFromSigStatus;
import static edu.berkeley.path.database.MongoDB.select.upToDateTPInventoryForGivenDeviceIdFromIntSigTP;
import static edu.berkeley.path.processor.SignalStatus.getPhaseStatusGroupFromSignalStatus;
import static edu.berkeley.path.processor.SignalStatus.getSignalStatusFromDocument;

public class intersectionCycleBuilderRevised {

    //********************************************************
    // Definitions of variables
    //********************************************************
    private static int maxNumPhase=16; // Define the maximum number of phases
    private static int maxNumRing=4; // Define the maximum number of rings
    private static int maxMessageGap=300;// Define the maximum gap between messages

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
            , MongoCollection<Document> collectionSignalStatus, MongoCollection<Document> collectionSignalTPInventory
            , MongoCollection<Document> collectionCycleInformation) {

        // Note: it is important to ensure the messages of Signal Status are sampled in high frequency, e.g., every
        // one second or even event based. If they are at longer time intervals, it is inaccurate or even impossible
        // to reconstruct cycle-based information.

        // Even when they are sampled at every one second, we still miss some messages because the yellow, all red
        // and green extension settings can be in the interval of 0.5 seconds. In our development, we consider these
        // impacts to ensure we have good reconstruction of cycle-based information.

        ObjectMapper mapper = new ObjectMapper(); // Write to string

        // For each device Id (intersection)
        Iterator iterator = buildingTimePeriod.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            String deviceId = (String) pair.getKey();
            Long[] time = (Long[]) pair.getValue();

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
        }
    }

    public static List<IntersectionSignalCycleStatus>  buildCycleInformationForOneIntersection(String organizationId
            , String deviceId, long startTime, long endTime,MongoCollection<Document> collectionSignalStatus
            ,MongoCollection<Document> collectionSignalTPInventory) {
        // This function is used to build cycles for a given intersections within a predefined time period

        // Create a list of IntersectionSignalCycleStatus
        List<IntersectionSignalCycleStatus> intersectionSignalCycleStatusList=new ArrayList<>();

        // Search the database (collection) for timing plan inventories
        Map<Integer,Document> upToDateTPInventory=upToDateTPInventoryForGivenDeviceIdFromIntSigTP
                (collectionSignalTPInventory, organizationId, deviceId);

        // Get a list of event messages for the given intersection within the given time period, ordered by time
        List<Document> documentList=documentsForGivenDeviceIdAndTimePeriodsFromSigStatus(collectionSignalStatus,organizationId
                , deviceId, startTime, endTime);

        if(documentList.size()>0) {
            // Split the messages by cycles, when the corresponding timing plan inventory is available
            List<MessagesByCycle> messagesByCycleList = splitDocumentsByCycle(Integer.parseInt(deviceId), upToDateTPInventory
                    , documentList);

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

    public static IntersectionSignalCycleStatus buildCycleFromMessages(MessagesByCycle messagesByCycle){
        // This function is used to build a cycle from a list of messages which are supposed to be in the same cycle

        // Initialization
        IntersectionSignalCycleStatus intersectionSignalCycleStatus=null;

        // Check the first message to see whether it is a valid cycle or not
        // If not, return null
        boolean validOrNot=cycleValidOrNot(messagesByCycle.signalStatusDocumentList.get(0));
        if(validOrNot){// If it is a valid cycle
            // Initialization
            intersectionSignalCycleStatus = new IntersectionSignalCycleStatus();
            intersectionSignalCycleStatus.initialization();

            // Once find the starting index, update the inventory information
            intersectionSignalCycleStatus.updateInventoryInformation(messagesByCycle.signalTimingPlanInventory);

            // Also update the reference phase IDs: as a reference to check where the cycle begins
            List<Integer> referencePhases = findReferencePhases(messagesByCycle.signalStatusDocumentList.get(0));
            intersectionSignalCycleStatus.setReferencePhaseIDs(referencePhases); // Update the reference phases

            // Update the phase duration as well as other information
            intersectionSignalCycleStatus = updateActualPhaseInformation(messagesByCycle, intersectionSignalCycleStatus);
        }

        // Return the results
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updateActualPhaseInformation(MessagesByCycle messagesByCycle,
                                                                             IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // This function is used to update actual phase information

        List<Document> documentStatus=messagesByCycle.signalStatusDocumentList;

        // Update control status for the first time
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(0));
        intersectionSignalCycleStatus=updateControlStatusForTheFirstTime(intersectionSignalCycleStatus,curSignalStatus);

        // Construct actual phase duration
        intersectionSignalCycleStatus=updatePhaseDuration(documentStatus,intersectionSignalCycleStatus);

        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDuration(List<Document> documentStatus, IntersectionSignalCycleStatus intersectionSignalCycleStatus){
        // This function is used to update the actual phase duration

        //********************************
        // For the first message
        //********************************
        intersectionSignalCycleStatus=updatePhaseDurationForTheFirstTime(intersectionSignalCycleStatus, documentStatus.get(0));

        //********************************
        // For the rest of messages
        //********************************
        for(int i=1;i<documentStatus.size();i++){
            intersectionSignalCycleStatus=updatePhaseDurationForTheRestDocuments(intersectionSignalCycleStatus, documentStatus, i);
        }
        // Update the cycle end time
        if(intersectionSignalCycleStatus.getActualCycleLength()!=0){
            // Not in the free mode which doesn't have a specific cycle length
            intersectionSignalCycleStatus.setCycleEndTime(intersectionSignalCycleStatus.getCycleStartTime()+
                    (long) intersectionSignalCycleStatus.getActualCycleLength()*1000);
        }else{
            // Doesn't have a specific cycle length
            // Update the actual cycle length and cycle end time
            intersectionSignalCycleStatus=updateCycleLengthAndCycleEndTime(intersectionSignalCycleStatus, documentStatus.get(documentStatus.size()-1));
        }

        // Return the results
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

            // If phase is Green
            if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                additionalTime=Math.max(additionalTime,intersectionPhaseStatusPlanned.getYellowDuration()
                        +intersectionPhaseStatusPlanned.getRedDuration());
            }

            // If phase is Yellow
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
                (long)intersectionSignalCycleStatus.getActualCycleLength());

        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDurationForTheRestDocuments(IntersectionSignalCycleStatus intersectionSignalCycleStatus
            , List<Document> documentStatus, int index){
        // This function is used to compute phase duration for the rest of documents within a cycle

        // Status of previous document
        IntersectionSignalStatus preSignalStatus=getSignalStatusFromDocument(documentStatus.get(index-1));
        IntersectionPhaseStatusGroup prePhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(preSignalStatus);
        // Status of current document
        IntersectionSignalStatus curSignalStatus=getSignalStatusFromDocument(documentStatus.get(index));
        IntersectionPhaseStatusGroup curPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(curSignalStatus);

        //***************************************************************
        // Missing All-Red Periods!!! Important!!
        // Check whether the previous phase needs a all red phase
        // If yes, need to adjust the green time duration
        //***************************************************************
        double subtractTime=0;
        boolean missingAllRedMessage=expectAllRedMessage(prePhaseStatusGroup,curPhaseStatusGroup);
        if(missingAllRedMessage){
            subtractTime=getMaxSubtractTime( documentStatus, index-1,intersectionSignalCycleStatus.getPlannedPhaseList());
        }

        // Update the actual phases
        Map<Integer,IntersectionPhaseStatus> actualPhaseList=new HashMap<>();
        for(int i=0;i<intersectionSignalCycleStatus.getPhaseTPList().size();i++) {
            int phaseId = intersectionSignalCycleStatus.getPhaseTPList().get(i).getPhaseIdentifier();
            IntersectionPhaseStatus intersectionPhaseStatusPlanned=intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);
            IntersectionPhaseStatus intersectionPhaseStatus=intersectionSignalCycleStatus.getActualPhaseList().get(phaseId);

            // If phase is Green
            if(curPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1 ||prePhaseStatusGroup.getPhaseReds().get(phaseId)==1) {
                    // If the previous step is Green or Red
                    // Normal, just update the green time!
                    double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                    // Need to subtract the addition all red time if necessary
                    double additionGreenTime=Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter()-subtractTime);
                    intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);

                    if(index==documentStatus.size()-1){
                        // if it is the end of the cycle, but still the phase is Green
                        System.out.println("Missing yellow and red messages in the previous step @ device id:"
                                +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                                + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                                + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                        // Updated yellow and red durations. Use default settings due to missing actual messages
                        intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());
                        intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                        // Update the split duration
                        double splitDuration=Math.floor(intersectionPhaseStatus.getGreenDuration() +
                                intersectionPhaseStatus.getYellowDuration() + intersectionPhaseStatus.getRedDuration());
                        intersectionPhaseStatus.setSplitDuration(splitDuration);
                        // Update the status and error message
                        intersectionPhaseStatus.setStatus("estimated");
                        intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                                +"Missing yellow and red messages in the previous step;");
                    }
                }

                if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1) {
                    // If the previous step is Yellow, Error!!
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

            // If phase is Yellow
            if(curPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1) {
                    // If the previous step is Green, Normal!!
                    double currentGreenTime = intersectionPhaseStatus.getGreenDuration();
                    double additionGreenTime =Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter()-subtractTime);
                    // Update green duration
                    intersectionPhaseStatus.setGreenDuration(currentGreenTime + additionGreenTime);
                    // Set the status to be "measured"
                    intersectionPhaseStatus.setStatus("measured");
                }

                if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                    // If the previous step is Yellow
                    // Update the yellow duration
                    double currentYellowTime = intersectionPhaseStatus.getYellowDuration();
                    double additionYellowTime =Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter());
                    intersectionPhaseStatus.setYellowDuration(currentYellowTime + additionYellowTime);
                }

                if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                    // If the previous step is Red, Green messages are missing
                    System.out.println("Missing green messages in the previous step @ device id:"
                            +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                            + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                            + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));

                    double currentGreenTime = intersectionPhaseStatus.getGreenDuration();
                    double additionGreenTime =Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter()-subtractTime);
                    // Update green duration
                    intersectionPhaseStatus.setGreenDuration(currentGreenTime + additionGreenTime);
                    // Set the status to be "estimated"
                    intersectionPhaseStatus.setStatus("estimated");
                    intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                            +"Missing green messages in the previous step;");
                }
            }

            // If phase is Red
            if(curPhaseStatusGroup.getPhaseReds().get(phaseId)==1) {
                if(prePhaseStatusGroup.getPhaseGreens().get(phaseId)==1) {
                    // If the previous step is Green
                    System.out.println("Missing yellow messages in the previous step @ device id:"
                            +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                            + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                            + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));

                    // Updated yellow duration: no information regarding the yellow status, use the default value
                    intersectionPhaseStatus.setYellowDuration(intersectionPhaseStatusPlanned.getYellowDuration());

                    // Update green duration
                    double currentGreenTime = intersectionPhaseStatus.getGreenDuration();
                    double additionGreenTime = Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter()
                            -intersectionPhaseStatusPlanned.getYellowDuration());
                    intersectionPhaseStatus.setGreenDuration(currentGreenTime + additionGreenTime);

                    // Update red duration
                    if(index<documentStatus.size()-1){
                        // Not the end of the list? use the actual count
                        IntersectionSignalStatus nextSignalStatus=getSignalStatusFromDocument(documentStatus.get(index+1));
                        double currentRedTime = intersectionPhaseStatus.getRedDuration();
                        double additionalRedTime=Math.max(0,nextSignalStatus.getCycleCounter()-curSignalStatus.getCycleCounter());
                        intersectionPhaseStatus.setRedDuration(currentRedTime+additionalRedTime);
                    }else{
                        // The end of the list? use the default value
                        intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                    }

                    // Update the split duration
                    intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration() +
                            intersectionPhaseStatus.getYellowDuration() + intersectionPhaseStatus.getRedDuration());
                    intersectionPhaseStatus.setStatus("estimated");
                    intersectionPhaseStatus.setErrorMessage(intersectionPhaseStatus.getErrorMessage()
                            +"Missing yellow messages in the previous step;");
                }

                if(prePhaseStatusGroup.getPhaseYellows().get(phaseId)==1) {
                    // Normal, conclude the end of a phase

                    // Update the yellow time
                    double currentYellowTime = intersectionPhaseStatus.getYellowDuration();
                    double additionYellowTime = Math.max(0,curSignalStatus.getCycleCounter()-preSignalStatus.getCycleCounter());
                    intersectionPhaseStatus.setYellowDuration(currentYellowTime+additionYellowTime);

                    // Update the red time
                    // Update red duration
                    if(index<documentStatus.size()-1){
                        // Not the end of the list? use the actual count
                        IntersectionSignalStatus nextSignalStatus=getSignalStatusFromDocument(documentStatus.get(index+1));
                        double currentRedTime = intersectionPhaseStatus.getRedDuration();
                        double additionalRedTime=Math.max(0,nextSignalStatus.getCycleCounter()-curSignalStatus.getCycleCounter());
                        intersectionPhaseStatus.setRedDuration(currentRedTime+additionalRedTime);
                    }else{
                        // The end of the list? use the default value
                        intersectionPhaseStatus.setRedDuration(intersectionPhaseStatusPlanned.getRedDuration());
                    }

                    // Update the split duration
                    intersectionPhaseStatus.setSplitDuration(intersectionPhaseStatus.getGreenDuration() +
                            intersectionPhaseStatus.getYellowDuration() + intersectionPhaseStatus.getRedDuration());
                    intersectionPhaseStatus.setStatus("measured");
                }

                if(prePhaseStatusGroup.getPhaseReds().get(phaseId)==1) {
                    // Normal, thus do nothing!
                }
            }

            actualPhaseList.put(phaseId,intersectionPhaseStatus);
        }

        intersectionSignalCycleStatus.setActualPhaseList(actualPhaseList);
        return intersectionSignalCycleStatus;
    }

    public static IntersectionSignalCycleStatus updatePhaseDurationForTheFirstTime(IntersectionSignalCycleStatus intersectionSignalCycleStatus
            , Document firstDocument){
        // This function is specifically for the first document in a cycle

        //***********************************
        // Update the cycle start time
        //***********************************
        // Get the current time of the first message
        long firstTime=(long)firstDocument.get("lastUpdateTime");
        IntersectionSignalStatus firstSignalStatus=getSignalStatusFromDocument(firstDocument);
        // Adjust the cycle start time by subtracting the counter time
        long cycleStartTime=firstTime- firstSignalStatus.getCycleCounter()*1000;
        intersectionSignalCycleStatus.setCycleStartTime(cycleStartTime);

        // Update phase duration
        IntersectionPhaseStatusGroup firstPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(firstSignalStatus);
        Map<Integer,IntersectionPhaseStatus> actualPhaseList=new HashMap<>();
        for(int i=0;i<intersectionSignalCycleStatus.getPhaseTPList().size();i++){// Loop for each available phase Id
            int phaseId=intersectionSignalCycleStatus.getPhaseTPList().get(i).getPhaseIdentifier();
            // Get the planned information
            IntersectionPhaseStatus intersectionPhaseStatusPlanned=intersectionSignalCycleStatus.getPlannedPhaseList().get(phaseId);
            // Get the latest actual information
            IntersectionPhaseStatus intersectionPhaseStatus=intersectionSignalCycleStatus.getActualPhaseList().get(phaseId);

            // If phase is Green, Normal!! Just update the green time
            if(firstPhaseStatusGroup.getPhaseGreens().get(phaseId)==1){
                double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                double additionGreenTime=firstSignalStatus.getCycleCounter();
                intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);
            }

            // If phase is Yellow, Missing messages in previous steps
            if(firstPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){
                System.out.println("Missing green messages in the previous step @ device id:"
                        +intersectionSignalCycleStatus.getDeviceId()+" & timing plan: "
                        + intersectionSignalCycleStatus.getTimingPatternId()+" & phase id "+phaseId
                        + "& Date: "+ new Date (intersectionSignalCycleStatus.getCycleStartTime()));
                double currentGreenTime=intersectionPhaseStatus.getGreenDuration();
                double additionGreenTime=firstSignalStatus.getCycleCounter();
                // Update green duration
                intersectionPhaseStatus.setGreenDuration(currentGreenTime+additionGreenTime);
                // Update the status to be "estimated"
                intersectionPhaseStatus.setStatus("estimated");
            }

            // If phase is Red
            if(firstPhaseStatusGroup.getPhaseReds().get(phaseId)==1){
                // Normal, thus do nothing
            }

            actualPhaseList.put(phaseId,intersectionPhaseStatus);
        }
        intersectionSignalCycleStatus.setActualPhaseList(actualPhaseList);
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

    public static boolean expectAllRedMessage(IntersectionPhaseStatusGroup prePhaseStatusGroup,IntersectionPhaseStatusGroup curPhaseStatusGroup){
        // This function is used to decide whether a All-Red message is expected after the current message

        // *****************************
        // Need a all-red message?
        // *****************************
        boolean needAllRedMessage=false;
        // Check whether there exist yellow phases or not
        Iterator iterator = prePhaseStatusGroup.getPhaseYellows().entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int) pair.getValue() == 1) { // If yes,set it to be true
                needAllRedMessage = true;
            }
        }
        // Check whether at the same time, there exist green phases or not
        iterator = prePhaseStatusGroup.getPhaseGreens().entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int) pair.getValue() == 1) { // If yes, set it to be false
                needAllRedMessage = false;
            }
        }

        // *****************************
        // Check the current message is a all-red message or not
        // *****************************
        boolean missingAllRedMessage=false;
        if(needAllRedMessage){ // Need a all-red message?
            // Check whether there exist green phases or not
            iterator = curPhaseStatusGroup.getPhaseGreens().entrySet().iterator();
            while(iterator.hasNext()) {
                Map.Entry pair = (Map.Entry) iterator.next();
                if ((int) pair.getValue() == 1) { // If yes, set it to be true
                    missingAllRedMessage = true;
                    break;
                }
            }
            if(!missingAllRedMessage){ // If no Green phases, move to check the yellow phases
                iterator = curPhaseStatusGroup.getPhaseYellows().entrySet().iterator();
                while(iterator.hasNext()) {
                    Map.Entry pair = (Map.Entry) iterator.next();
                    if ((int) pair.getValue() == 1) { // If yes, set it to be true
                        missingAllRedMessage = true;
                        break;
                    }
                }
            }
        }
        // Return the boolean result: true/false
        return missingAllRedMessage;
    }

    public static double getMaxSubtractTime(List<Document> documentStatus, int index,Map<Integer,IntersectionPhaseStatus> plannedPhaseList){
        // This function is used to get the max subtraction time when a all-red message is missing

        // Status of current document
        IntersectionSignalStatus signalStatus=getSignalStatusFromDocument(documentStatus.get(index));
        IntersectionPhaseStatusGroup phaseStatusGroup=getPhaseStatusGroupFromSignalStatus(signalStatus);

        // Initialization
        double maxSubtractTime=0;
        // Check whether there exist yellow phases or not
        Iterator iterator = phaseStatusGroup.getPhaseYellows().entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            int phaseId=(int) pair.getKey();
            int status=(int) pair.getValue();
            if ( status== 1) { // If yes, update the all red time
                double tmpSubtractTime=plannedPhaseList.get(phaseId).getYellowDuration()+
                        plannedPhaseList.get(phaseId).getRedDuration();
                // Loop for previous documents
                int refCycleCounter=signalStatus.getCycleCounter();
                for(int i=index-1;i>0;i--){
                    IntersectionSignalStatus tmpSignalStatus=getSignalStatusFromDocument(documentStatus.get(i));
                    IntersectionPhaseStatusGroup tmpPhaseStatusGroup=getPhaseStatusGroupFromSignalStatus(tmpSignalStatus);
                    if(tmpPhaseStatusGroup.getPhaseYellows().get(phaseId)==1){// If it is Yellow in previous steps
                        // Subtract those yellow times
                        tmpSubtractTime=Math.max(0,tmpSubtractTime-(refCycleCounter-tmpSignalStatus.getCycleCounter()));
                        // Update the reference counter
                        refCycleCounter=tmpSignalStatus.getCycleCounter();
                    }else{// If it is Green or Red, stop searching
                        break;
                    }
                }
                // Update the maximum subtract time
                maxSubtractTime=Math.max(maxSubtractTime,tmpSubtractTime);
            }
        }
        // Return the maximum subtraction time
        return maxSubtractTime;
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

    public static boolean cycleValidOrNot(Document signalStatusDoc){
        // This function is used to check whether a cycle is valid or not

        // We look at the first message. If there exist phases in the status of Green or Yellow, we consider the cycle is valid.
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

    public static List<MessagesByCycle> splitDocumentsByCycle(int deviceId, Map<Integer,Document> upToDateTPInventory
            ,List<Document> documentList){
        // This function is used to split messages/documents by cycle when the corresponding timing pattern inventory
        // is available.

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
        return messagesByCycleList;
    }


}
