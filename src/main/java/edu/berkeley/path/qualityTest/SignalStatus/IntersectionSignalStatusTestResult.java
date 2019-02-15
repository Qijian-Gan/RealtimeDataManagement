package edu.berkeley.path.qualityTest.SignalStatus;

import org.tmdd._303.messages.IntersectionSignalPhaseSplit;
import org.tmdd._303.messages.IntersectionSignalPhaseStatusGroup;
import org.tmdd._303.messages.IntersectionSignalRingStatus;
import org.tmdd._303.messages.IntersectionSignalStatus;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSignalStatusTestResult {

    // Device Status Header
    private boolean isDeviceStatusHeaderExist;
    private boolean isDeviceStatusHeaderValid;
    private DeviceStatusHeaderTestResult deviceStatusHeaderTestResult;

    // Enumerated: unknown(1),other(2),central-time-base-coordination-intersection (3),
    //central-operator-commanded-intersection (4), central-time-base-coordination-section (5),
    //central-operator-commanded-section (6), local (7),
    //local-time-base-coordination (8), local-manual (9), local-backup-loss-of-central (10)
    private boolean isSignalControlSourceValid;

    // Enumerated: unknown (1), other (2), local (3), local-manual (4), local-time-of-day (5),local-traffic-responsive (6),
    // central-time-of-day (7), central-traffic-responsive (8), central-hold-force-omit (9), central-holiday-schedule (10),
    //central-standby (11), coordinated-critical-intersection-control (12),coordinated-adaptive (13),
    //coordinated-transit-priority (14), flash-programmed (15)
    private boolean isPlannedSignalTimingModeValid;

    // Enumerated: unknown (1), other (2), free (3), fixed-time (4), actuated (5),
    //semi-actuated (6), critical-intersection-control (7), traffic-responsive (8), adaptive (9),
    //flash-programmed (10), conflict-flash (11), free-due-to-fault (12), flash-automatic (13),
    //flash-preempt (14), flash-local-manual (15), flash-fault (16), flash-mmu-cmu (17), flash-reasons-unknown (18),
    //flash-startup (19), special-function (20), coordinated-alarm (21), transition (22),
    //preempt (23), signal-priority (24)
    private boolean isCurrentSignalTimingModeValid;

    ///////// The following are required by PATH
    private boolean isSectionIdValid;
    private boolean isPlannedSignalTimingModeDescriptionValid;
    private boolean isTimingPatternIdCurrentValid;
    private boolean isTimingPatternDescriptionValid;
    private boolean isActuationModeValid;
    private boolean isTimingPhasePlanModeValid;

    private boolean isCycleLengthPlannedValid;
    private boolean isCycleLengthCurrentValid;
    private boolean isCycleLengthPreviousValid;
    private boolean isCycleLengthMasterValid;

    private boolean isCycleCounterValid;
    private boolean isCycleCounterMasterValid;

    private boolean isOffsetReferenceValid;
    private boolean isOffsetTimePlannedValid;
    private boolean isOffsetTimeCurrentValid;
    private boolean isOffsetTimePreviousValid;

    private boolean isControllerTimestampValid;

    //IntersectionSignalPhaseSplit
    private boolean isPhaseSplitListExist;
    private int maxPhaseSplitNumber=40;
    private boolean isPhaseSplitListOutOfBound;
    private List<IntersectionSignalPhaseSplitTestResult> intersectionSignalPhaseSplitTestResultList;
    private List<Integer> errorMessagePhaseSplitIndex;
    private boolean isPhaseSplitListValid;

    //IntersectionSignalRingStatus
    private boolean isRingStatusListExist;
    private int maxRingStatusList=8;
    private boolean isRingStatusListOutOfBound;
    private List<IntersectionSignalRingStatusTestResult> intersectionSignalRingStatusTestResultList;
    private boolean isRingStatusListValid;
    private List<Integer> errorMessageRingStatusIndex;

    //IntersectionSignalPhaseStatusGroup
    private boolean isPhaseStatusExist;
    private int maxPhaseStatus=5;
    private boolean isPhaseStatusOutOfBound;
    private List<IntersectionSignalPhaseStatusGroupTestResult> intersectionSignalPhaseStatusGroupTestResultList;
    private boolean isPhaseStatusValid;
    private List<Integer> errorMessagePhaseStatusIndex;

    //// PATH extensions (currently do not check this part)
    private boolean isAB3418ControlExtValid;
    private boolean isOperationAgencyValid;
    private boolean isMaintenenceAgencyValid;
    private boolean isProhibitedRightOnRedValid;
    private boolean isIntSigStatusValid;

    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isDeviceStatusHeaderExist() {
        return isDeviceStatusHeaderExist;
    }

    public boolean isDeviceStatusHeaderValid() {
        return isDeviceStatusHeaderValid;
    }

    public DeviceStatusHeaderTestResult getDeviceStatusHeaderTestResult() {
        return deviceStatusHeaderTestResult;
    }

    public boolean isSignalControlSourceValid() {
        return isSignalControlSourceValid;
    }

    public boolean isPlannedSignalTimingModeValid() {
        return isPlannedSignalTimingModeValid;
    }

    public boolean isCurrentSignalTimingModeValid() {
        return isCurrentSignalTimingModeValid;
    }

    public boolean isSectionIdValid() {
        return isSectionIdValid;
    }

    public boolean isPlannedSignalTimingModeDescriptionValid() {
        return isPlannedSignalTimingModeDescriptionValid;
    }

    public boolean isTimingPatternIdCurrentValid() {
        return isTimingPatternIdCurrentValid;
    }

    public boolean isTimingPatternDescriptionValid() {
        return isTimingPatternDescriptionValid;
    }

    public boolean isActuationModeValid() {
        return isActuationModeValid;
    }

    public boolean isTimingPhasePlanModeValid() {
        return isTimingPhasePlanModeValid;
    }

    public boolean isCycleLengthPlannedValid() {
        return isCycleLengthPlannedValid;
    }

    public boolean isCycleLengthCurrentValid() {
        return isCycleLengthCurrentValid;
    }

    public boolean isCycleLengthPreviousValid() {
        return isCycleLengthPreviousValid;
    }

    public boolean isCycleLengthMasterValid() {
        return isCycleLengthMasterValid;
    }

    public boolean isCycleCounterValid() {
        return isCycleCounterValid;
    }

    public boolean isCycleCounterMasterValid() {
        return isCycleCounterMasterValid;
    }

    public boolean isOffsetReferenceValid() {
        return isOffsetReferenceValid;
    }

    public boolean isOffsetTimePlannedValid() {
        return isOffsetTimePlannedValid;
    }

    public boolean isOffsetTimeCurrentValid() {
        return isOffsetTimeCurrentValid;
    }

    public boolean isOffsetTimePreviousValid() {
        return isOffsetTimePreviousValid;
    }

    public boolean isControllerTimestampValid() {
        return isControllerTimestampValid;
    }

    // Phase Split
    public boolean isPhaseSplitListExist() {
        return isPhaseSplitListExist;
    }

    public boolean isPhaseSplitListOutOfBound() {
        return isPhaseSplitListOutOfBound;
    }

    public boolean isPhaseSplitListValid() {
        return isPhaseSplitListValid;
    }

    public List<IntersectionSignalPhaseSplitTestResult> getIntersectionSignalPhaseSplitTestResultList() {
        return intersectionSignalPhaseSplitTestResultList;
    }

    public int getMaxPhaseSplitNumber() {
        return maxPhaseSplitNumber;
    }

    public List<Integer> getErrorMessagePhaseSplitIndex() {
        return errorMessagePhaseSplitIndex;
    }

    // Ring Status
    public boolean isRingStatusListExist() {
        return isRingStatusListExist;
    }

    public boolean isRingStatusListOutOfBound() {
        return isRingStatusListOutOfBound;
    }

    public boolean isRingStatusListValid() {
        return isRingStatusListValid;
    }

    public List<IntersectionSignalRingStatusTestResult> getIntersectionSignalRingStatusTestResultList() {
        return intersectionSignalRingStatusTestResultList;
    }

    public int getMaxRingStatusList() {
        return maxRingStatusList;
    }

    public List<Integer> getErrorMessageRingStatusIndex() {
        return errorMessageRingStatusIndex;
    }

    // Phase Status
    public boolean isPhaseStatusExist() {
        return isPhaseStatusExist;
    }

    public boolean isPhaseStatusOutOfBound() {
        return isPhaseStatusOutOfBound;
    }

    public boolean isPhaseStatusValid() {
        return isPhaseStatusValid;
    }

    public List<IntersectionSignalPhaseStatusGroupTestResult> getIntersectionSignalPhaseStatusGroupTestResultList() {
        return intersectionSignalPhaseStatusGroupTestResultList;
    }

    public int getMaxPhaseStatus() {
        return maxPhaseStatus;
    }

    public List<Integer> getErrorMessagePhaseStatusIndex() {
        return errorMessagePhaseStatusIndex;
    }

    // Extensions
    public boolean isAB3418ControlExtValid() {
        return isAB3418ControlExtValid;
    }

    public boolean isOperationAgencyValid() {
        return isOperationAgencyValid;
    }

    public boolean isMaintenenceAgencyValid() {
        return isMaintenenceAgencyValid;
    }

    public boolean isProhibitedRightOnRedValid() {
        return isProhibitedRightOnRedValid;
    }

    public boolean isIntSigStatusValid() {
        return isIntSigStatusValid;
    }

    // Error messages
    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setDeviceStatusHeaderExist(boolean deviceStatusHeaderExist) {
        isDeviceStatusHeaderExist = deviceStatusHeaderExist;
    }

    public void setDeviceStatusHeaderValid(boolean deviceStatusHeaderValid) {
        isDeviceStatusHeaderValid = deviceStatusHeaderValid;
    }

    public void setDeviceStatusHeaderTestResult(DeviceStatusHeaderTestResult deviceStatusHeaderTestResult) {
        this.deviceStatusHeaderTestResult = deviceStatusHeaderTestResult;
    }


    public void setSignalControlSourceValid(boolean signalControlSourceValid) {
        isSignalControlSourceValid = signalControlSourceValid;
    }

    public void setPlannedSignalTimingModeValid(boolean plannedSignalTimingModeValid) {
        isPlannedSignalTimingModeValid = plannedSignalTimingModeValid;
    }

    public void setCurrentSignalTimingModeValid(boolean currentSignalTimingModeValid) {
        isCurrentSignalTimingModeValid = currentSignalTimingModeValid;
    }

    public void setSectionIdValid(boolean sectionIdValid) {
        isSectionIdValid = sectionIdValid;
    }

    public void setPlannedSignalTimingModeDescriptionValid(boolean plannedSignalTimingModeDescriptionValid) {
        isPlannedSignalTimingModeDescriptionValid = plannedSignalTimingModeDescriptionValid;
    }

    public void setTimingPatternIdCurrentValid(boolean timingPatternIdCurrentValid) {
        isTimingPatternIdCurrentValid = timingPatternIdCurrentValid;
    }

    public void setTimingPatternDescriptionValid(boolean timingPatternDescriptionValid) {
        isTimingPatternDescriptionValid = timingPatternDescriptionValid;
    }

    public void setActuationModeValid(boolean actuationModeValid) {
        isActuationModeValid = actuationModeValid;
    }

    public void setTimingPhasePlanModeValid(boolean timingPhasePlanModeValid) {
        isTimingPhasePlanModeValid = timingPhasePlanModeValid;
    }

    public void setCycleLengthPlannedValid(boolean cycleLengthPlannedValid) {
        isCycleLengthPlannedValid = cycleLengthPlannedValid;
    }

    public void setCycleLengthCurrentValid(boolean cycleLengthCurrentValid) {
        isCycleLengthCurrentValid = cycleLengthCurrentValid;
    }

    public void setCycleLengthPreviousValid(boolean cycleLengthPreviousValid) {
        isCycleLengthPreviousValid = cycleLengthPreviousValid;
    }

    public void setCycleLengthMasterValid(boolean cycleLengthMasterValid) {
        isCycleLengthMasterValid = cycleLengthMasterValid;
    }

    public void setCycleCounterValid(boolean cycleCounterValid) {
        isCycleCounterValid = cycleCounterValid;
    }

    public void setCycleCounterMasterValid(boolean cycleCounterMasterValid) {
        isCycleCounterMasterValid = cycleCounterMasterValid;
    }

    public void setOffsetReferenceValid(boolean offsetReferenceValid) {
        isOffsetReferenceValid = offsetReferenceValid;
    }

    public void setOffsetTimePlannedValid(boolean offsetTimePlannedValid) {
        isOffsetTimePlannedValid = offsetTimePlannedValid;
    }

    public void setOffsetTimeCurrentValid(boolean offsetTimeCurrentValid) {
        isOffsetTimeCurrentValid = offsetTimeCurrentValid;
    }

    public void setOffsetTimePreviousValid(boolean offsetTimePreviousValid) {
        isOffsetTimePreviousValid = offsetTimePreviousValid;
    }

    public void setControllerTimestampValid(boolean controllerTimestampValid) {
        isControllerTimestampValid = controllerTimestampValid;
    }

    // Phase Split
    public void setPhaseSplitListExist(boolean phaseSplitListExist) {
        isPhaseSplitListExist = phaseSplitListExist;
    }

    public void setPhaseSplitListOutOfBound(boolean phaseSplitListOutOfBound) {
        isPhaseSplitListOutOfBound = phaseSplitListOutOfBound;
    }

    public void setPhaseSplitListValid(boolean phaseSplitListValid) {
        isPhaseSplitListValid = phaseSplitListValid;
    }

    public void setIntersectionSignalPhaseSplitTestResultList(List<IntersectionSignalPhaseSplitTestResult> intersectionSignalPhaseSplitTestResultList) {
        this.intersectionSignalPhaseSplitTestResultList = intersectionSignalPhaseSplitTestResultList;
    }

    public void setMaxPhaseSplitNumber(int maxPhaseSplitNumber) {
        this.maxPhaseSplitNumber = maxPhaseSplitNumber;
    }

    public void setErrorMessagePhaseSplitIndex(List<Integer> errorMessagePhaseSplitIndex) {
        this.errorMessagePhaseSplitIndex = errorMessagePhaseSplitIndex;
    }

    // Ring Status
    public void setRingStatusListExist(boolean ringStatusListExist) {
        isRingStatusListExist = ringStatusListExist;
    }

    public void setRingStatusListOutOfBound(boolean ringStatusListOutOfBound) {
        isRingStatusListOutOfBound = ringStatusListOutOfBound;
    }

    public void setRingStatusListValid(boolean ringStatusListValid) {
        isRingStatusListValid = ringStatusListValid;
    }

    public void setIntersectionSignalRingStatusTestResultList(List<IntersectionSignalRingStatusTestResult> intersectionSignalRingStatusTestResultList) {
        this.intersectionSignalRingStatusTestResultList = intersectionSignalRingStatusTestResultList;
    }

    public void setMaxRingStatusList(int maxRingStatusList) {
        this.maxRingStatusList = maxRingStatusList;
    }

    public void setErrorMessageRingStatusIndex(List<Integer> errorMessageRingStatusIndex) {
        this.errorMessageRingStatusIndex = errorMessageRingStatusIndex;
    }

    // Phase Status
    public void setPhaseStatusExist(boolean phaseStatusExist) {
        isPhaseStatusExist = phaseStatusExist;
    }

    public void setPhaseStatusOutOfBound(boolean phaseStatusOutOfBound) {
        isPhaseStatusOutOfBound = phaseStatusOutOfBound;
    }

    public void setPhaseStatusValid(boolean phaseStatusValid) {
        isPhaseStatusValid = phaseStatusValid;
    }

    public void setIntersectionSignalPhaseStatusGroupTestResultList(List<IntersectionSignalPhaseStatusGroupTestResult> intersectionSignalPhaseStatusGroupTestResultList) {
        this.intersectionSignalPhaseStatusGroupTestResultList = intersectionSignalPhaseStatusGroupTestResultList;
    }

    public void setMaxPhaseStatus(int maxPhaseStatus) {
        this.maxPhaseStatus = maxPhaseStatus;
    }

    public void setErrorMessagePhaseStatusIndex(List<Integer> errorMessagePhaseStatusIndex) {
        this.errorMessagePhaseStatusIndex = errorMessagePhaseStatusIndex;
    }

    // Extensions
    public void setAB3418ControlExtValid(boolean AB3418ControlExtValid) {
        isAB3418ControlExtValid = AB3418ControlExtValid;
    }

    public void setOperationAgencyValid(boolean operationAgencyValid) {
        isOperationAgencyValid = operationAgencyValid;
    }

    public void setMaintenenceAgencyValid(boolean maintenenceAgencyValid) {
        isMaintenenceAgencyValid = maintenenceAgencyValid;
    }

    public void setProhibitedRightOnRedValid(boolean prohibitedRightOnRedValid) {
        isProhibitedRightOnRedValid = prohibitedRightOnRedValid;
    }

    public void setIntSigStatusValid(boolean intSigStatusValid) {
        isIntSigStatusValid = intSigStatusValid;
    }

    // Error messages
    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isDeviceStatusHeaderExist=true;
        isDeviceStatusHeaderValid=true;
        deviceStatusHeaderTestResult=null;

        isSignalControlSourceValid=true;
        isPlannedSignalTimingModeValid=true;
        isCurrentSignalTimingModeValid=true;
        isSectionIdValid=true;
        isPlannedSignalTimingModeDescriptionValid=true;
        isTimingPatternIdCurrentValid=true;
        isTimingPatternDescriptionValid=true;
        isActuationModeValid=true;
        isTimingPhasePlanModeValid=true;

        isCycleLengthPlannedValid=true;
        isCycleLengthCurrentValid=true;
        isCycleLengthPreviousValid=true;
        isCycleLengthMasterValid=true;

        isCycleCounterValid=true;
        isCycleCounterMasterValid=true;

        isOffsetReferenceValid=true;
        isOffsetTimePlannedValid=true;
        isOffsetTimeCurrentValid=true;
        isOffsetTimePreviousValid=true;
        isControllerTimestampValid=true;

        //IntersectionSignalPhaseSplit
        isPhaseSplitListExist=true;
        isPhaseSplitListOutOfBound=false;
        intersectionSignalPhaseSplitTestResultList=new ArrayList<IntersectionSignalPhaseSplitTestResult>();
        errorMessagePhaseSplitIndex=new ArrayList<Integer>();
        isPhaseSplitListValid=true;

        //IntersectionSignalRingStatus
        isRingStatusListExist=true;
        isRingStatusListOutOfBound=false;
        intersectionSignalRingStatusTestResultList=new ArrayList<IntersectionSignalRingStatusTestResult>();
        isRingStatusListValid=true;
        errorMessageRingStatusIndex=new ArrayList<Integer>();

        //IntersectionSignalPhaseStatusGroup
        isPhaseStatusExist=true;
        isPhaseStatusOutOfBound=false;
        intersectionSignalPhaseStatusGroupTestResultList=new ArrayList<IntersectionSignalPhaseStatusGroupTestResult>();
        isPhaseStatusValid=true;
        errorMessagePhaseStatusIndex=new ArrayList<Integer>();

        //// PATH extensions (currently do not check this part)
        isAB3418ControlExtValid=true;
        isOperationAgencyValid=true;
        isMaintenenceAgencyValid=true;
        isProhibitedRightOnRedValid=true;
        isIntSigStatusValid=true;

        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalStatus intersectionSignalStatus){

        // Device Status Header
        if(intersectionSignalStatus.getDeviceStatusHeader()==null){
            errorMessages+="Empty device status header;";
            isDeviceStatusHeaderExist=false;
        }else{
            deviceStatusHeaderTestResult.Initialization();
            deviceStatusHeaderTestResult.Check(intersectionSignalStatus.getDeviceStatusHeader());
            if(deviceStatusHeaderTestResult.getErrorMessages()!=""){
                errorMessages+="Device status header is invalid;";
                isDeviceStatusHeaderValid=false;
            }
        }

        // Signal Control Source
        if(intersectionSignalStatus.getSignalControlSource()==null){
            errorMessages+="Empty signal control source;";
            isSignalControlSourceValid=false;
        }

        // Planned Signal Timing Mode
        if(intersectionSignalStatus.getPlannedSignalTimingMode()==null){
            errorMessages+="Empty planned signal timing mode;";
            isPlannedSignalTimingModeValid=false;
        }

        // Current Signal Timing Mode
        if(intersectionSignalStatus.getCurrentSignalTimingMode()==null){
            errorMessages+="Empty current signal timing mode;";
            isCurrentSignalTimingModeValid=false;
        }

        // Section Id
        if(intersectionSignalStatus.getSectionId()==null){
            errorMessages+="Empty section id;";
            isSectionIdValid=false;
        }

        // Planned Signal Timing Mode Description
        if(intersectionSignalStatus.getPlannedSignalTimingModeDescription()==null){
            errorMessages+="Empty planned signal timing mode description;";
            isPlannedSignalTimingModeDescriptionValid=false;
        }

        // Timing pattern Id Current
        if(intersectionSignalStatus.getTimingPatternIdCurrent()==null){
            errorMessages+="Empty timing pattern id current;";
            isTimingPatternIdCurrentValid=false;
        }

        // Timing Pattern Description
        if(intersectionSignalStatus.getTimingPatternDescription()==null){
            errorMessages+="Empty timing pattern description;";
            isTimingPatternDescriptionValid=false;
        }

        // Actuation Mode
        if(intersectionSignalStatus.getActuationMode()==null){
            errorMessages+="Empty actuation mode;";
            isActuationModeValid=false;
        }

        // Timing Phase Plan Mode
        if(intersectionSignalStatus.getTimingPhasePlanMode()==null){
            errorMessages+="Empty timing phase plan mode;";
            isTimingPhasePlanModeValid=false;
        }

        // Cycle Length Planned
        if(intersectionSignalStatus.getCycleLengthPlanned()<0 || intersectionSignalStatus.getCycleLengthPlanned()>255){
            errorMessages+="Cycle length planned is out of bound;";
            isCycleLengthPlannedValid=false;
        }

        // Cycle Length Current
        if(intersectionSignalStatus.getCycleLengthCurrent()<0 || intersectionSignalStatus.getCycleLengthCurrent()>255){
            errorMessages+="Cycle length current is out of bound;";
            isCycleLengthCurrentValid=false;
        }

        // Cycle Length Previous
        if(intersectionSignalStatus.getCycleLengthPrevious()<0 || intersectionSignalStatus.getCycleLengthPrevious()>255){
            errorMessages+="Cycle length previous is out of bound;";
            isCycleLengthPreviousValid=false;
        }

        // Cycle Length Master
        if(intersectionSignalStatus.getCycleLengthMaster()<0 || intersectionSignalStatus.getCycleLengthMaster()>255){
            errorMessages+="Cycle length master is out of bound;";
            isCycleLengthMasterValid=false;
        }

        // Cycle Counter
        if(intersectionSignalStatus.getCycleCounter()<0 || intersectionSignalStatus.getCycleCounter()>510){
            errorMessages+="Cycle counter is out of bound;";
            isCycleCounterValid=false;
        }

        // Cycle Counter Master
        if(intersectionSignalStatus.getCycleCounterMaster()<0 || intersectionSignalStatus.getCycleCounterMaster()>510){
            errorMessages+="Cycle counter master is out of bound;";
            isCycleCounterMasterValid=false;
        }

        // Offset Reference
        if(intersectionSignalStatus.getOffsetReference()==null){
            errorMessages+="Empty offset reference;";
            isOffsetReferenceValid=false;
        }

        // Offset Time planned
        if(intersectionSignalStatus.getOffsetTimePlanned()<0 || intersectionSignalStatus.getOffsetTimePlanned()>255){
            errorMessages+="Empty offset time planned;";
            isOffsetTimePlannedValid=false;
        }

        // Offset Time Current
        if(intersectionSignalStatus.getOffsetTimeCurrent()<0 || intersectionSignalStatus.getOffsetTimeCurrent()>255){
            errorMessages+="Empty offset time current;";
            isOffsetTimeCurrentValid=false;
        }

        // Offset time Previous
        if(intersectionSignalStatus.getOffsetTimePrevious()<0 || intersectionSignalStatus.getOffsetTimePrevious()>255){
            errorMessages+="Empty offset time previous;";
            isOffsetTimePreviousValid=false;
        }

        // Controller Timestamp
        if(intersectionSignalStatus.getControllerTimestamp()==null){
            errorMessages+="Empty controller timestamp;";
            isControllerTimestampValid=false;
        }

        // Phase Split List: Sequence
        if(intersectionSignalStatus.getPhaseSplitList()==null){
            isPhaseSplitListExist=false;
            errorMessages+="Empty phase split list;";
        }else{
            List<IntersectionSignalPhaseSplit> intersectionSignalPhaseSplitList=
                    intersectionSignalStatus.getPhaseSplitList().getPhaseSplit();
            if(intersectionSignalPhaseSplitList==null){
                isPhaseSplitListExist=false;
                errorMessages+="Empty phase split list;";
            }else{
                // Check out of bound or not
                if(intersectionSignalPhaseSplitList.size()>maxPhaseSplitNumber){
                    errorMessages+="Phase split list is out of bound;";
                    isPhaseSplitListOutOfBound=true;
                }
                // Loop for each phase split
                for(int i=0;i<intersectionSignalPhaseSplitList.size();i++){
                    IntersectionSignalPhaseSplitTestResult intersectionSignalPhaseSplitTestResult=new IntersectionSignalPhaseSplitTestResult();
                    intersectionSignalPhaseSplitTestResult.Initialization();
                    intersectionSignalPhaseSplitTestResult.Check(intersectionSignalPhaseSplitList.get(i));
                    intersectionSignalPhaseSplitTestResultList.add(intersectionSignalPhaseSplitTestResult);
                    if(intersectionSignalPhaseSplitTestResult.getErrorMassages()!=""){
                        errorMessagePhaseSplitIndex.add(i);
                    }
                }

                if(errorMessagePhaseSplitIndex.size()>0){
                    errorMessages+="Phase split list contains invalid information;";
                    isPhaseSplitListValid=false;
                }
            }
        }

        // Ring Status List
        if(intersectionSignalStatus.getRingStatusList()==null){
            isRingStatusListExist=false;
            errorMessages+="Empty ring status list;";
        }else{
            List<IntersectionSignalRingStatus> intersectionSignalRingStatusList=intersectionSignalStatus.getRingStatusList().getRingStatus();
            if(intersectionSignalRingStatusList==null){
                isRingStatusListExist=false;
                errorMessages+="Empty ring status list;";
            }else{
                // Check whether it is out of bound or not
                if(intersectionSignalRingStatusList.size()>maxRingStatusList){
                    isRingStatusListOutOfBound=true;
                    errorMessages+="Ring status list is out of bound;";
                }
                // Loop for each element
                for(int i=0;i<intersectionSignalRingStatusList.size();i++){
                    IntersectionSignalRingStatusTestResult intersectionSignalRingStatusTestResult=new IntersectionSignalRingStatusTestResult();
                    intersectionSignalRingStatusTestResult.Initialization();
                    intersectionSignalRingStatusTestResult.Check(intersectionSignalRingStatusList.get(i));
                    intersectionSignalRingStatusTestResultList.add(intersectionSignalRingStatusTestResult);
                    if(intersectionSignalRingStatusTestResult.getErrorMessages()!=""){
                        errorMessageRingStatusIndex.add(i);
                    }
                }

                if(errorMessageRingStatusIndex.size()>0){
                    errorMessages+="Ring status list contains invalid information;";
                    isRingStatusListValid=false;
                }
            }
        }

        // Phase Status
        if(intersectionSignalStatus.getPhaseStatus()==null){
            errorMessages+="Empty phase status;";
            isPhaseStatusExist=false;
        }else{
            List<IntersectionSignalPhaseStatusGroup> intersectionSignalPhaseStatusGroupList=
                    intersectionSignalStatus.getPhaseStatus().getPhaseStatusGroup();
            if(intersectionSignalPhaseStatusGroupList==null){
                errorMessages+="Empty phase status;";
                isPhaseStatusExist=false;
            }else{
                // Check whether it is out of bound or not
                if(intersectionSignalPhaseStatusGroupList.size()>maxPhaseStatus){
                    errorMessages+="Phase status is out of bound;";
                    isPhaseStatusOutOfBound=true;
                }

                for(int i=0;i<intersectionSignalPhaseStatusGroupList.size();i++){
                    IntersectionSignalPhaseStatusGroupTestResult intersectionSignalPhaseStatusGroupTestResult=
                            new IntersectionSignalPhaseStatusGroupTestResult();
                    intersectionSignalPhaseStatusGroupTestResult.Initialization();
                    intersectionSignalPhaseStatusGroupTestResult.Check(intersectionSignalPhaseStatusGroupList.get(i));
                    if(intersectionSignalPhaseStatusGroupTestResult.getErrorMessages()!=""){
                        errorMessagePhaseStatusIndex.add(i);
                    }
                    intersectionSignalPhaseStatusGroupTestResultList.add(intersectionSignalPhaseStatusGroupTestResult);
                }

                if(errorMessagePhaseStatusIndex.size()>0){
                    isPhaseStatusValid=false;
                    errorMessages+="Phase status contains invalid information;";
                }
            }
        }

        if(errorMessages!=""){// When error message (related to required fields) is not empty!
            validOrNot=false;
        }
    }

}
