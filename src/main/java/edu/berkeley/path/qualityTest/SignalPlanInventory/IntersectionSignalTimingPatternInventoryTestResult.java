package edu.berkeley.path.qualityTest.SignalPlanInventory;

import org.tmdd._303.messages.IntersectionSignalSequenceData;
import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSignalTimingPatternInventoryTestResult {

    private boolean isOrganizationInformationExist;
    private boolean isOrganizationIdValid;

    private boolean isDeviceIdValid;
    private boolean isTimingPatternIdValid;
    private boolean isTimingPatternNameValid; // Required by PATH
    private boolean isCycleLengthValid;
    private boolean isOffsetTimeValid;

    // Phase TP List
    private boolean isPhaseTPListExist;
    private boolean isPhaseTPListValid;
    private int maxPhaseTPList=40;
    private boolean isPhaseTPListOutOfBound;
    private List<IntersectionSignalTPInventoryPhaseTestResult> intersectionSignalTPInventoryPhaseTestResultList;
    private List<Integer> errorMassagePhaseTPListIndex;

    // Sequence Information : Required by PATH
    private boolean isSequenceInformationExist;
    private boolean isSequenceInformationValid;
    private int maxSequenceInformation=8;
    private boolean isSequenceInformationOutOfBound;
    private List<IntersectionSignalSequenceDataTestResult> intersectionSignalSequenceDataTestResultList;
    private List<Integer> errorMessageSequenceDataList;

    private boolean isLastUpdateTimeValid; // Required by PATH

    // Extensions proposed by PATH, currently do not check this field
    // Intersection Signal TP Inventory Extension
    private boolean isIntSigTPInventoryExtValid;

    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isOrganizationInformationExist() {
        return isOrganizationInformationExist;
    }

    public boolean isOrganizationIdValid() {
        return isOrganizationIdValid;
    }

    public boolean isDeviceIdValid() {
        return isDeviceIdValid;
    }

    public boolean isTimingPatternIdValid() {
        return isTimingPatternIdValid;
    }

    public boolean isTimingPatternNameValid() {
        return isTimingPatternNameValid;
    }

    public boolean isCycleLengthValid() {
        return isCycleLengthValid;
    }

    public boolean isOffsetTimeValid() {
        return isOffsetTimeValid;
    }

    // Phase TP List
    public boolean isPhaseTPListExist() {
        return isPhaseTPListExist;
    }

    public boolean isPhaseTPListOutOfBound() {
        return isPhaseTPListOutOfBound;
    }

    public boolean isPhaseTPListValid() {
        return isPhaseTPListValid;
    }

    public int getMaxPhaseTPList() {
        return maxPhaseTPList;
    }

    public List<IntersectionSignalTPInventoryPhaseTestResult> getIntersectionSignalTPInventoryPhaseTestResultList() {
        return intersectionSignalTPInventoryPhaseTestResultList;
    }

    public List<Integer> getErrorMassagePhaseTPListIndex() {
        return errorMassagePhaseTPListIndex;
    }

    // Sequence Data
    public boolean isSequenceInformationExist() {
        return isSequenceInformationExist;
    }

    public boolean isSequenceInformationValid() {
        return isSequenceInformationValid;
    }

    public boolean isSequenceInformationOutOfBound() {
        return isSequenceInformationOutOfBound;
    }

    public int getMaxSequenceInformation() {
        return maxSequenceInformation;
    }

    public List<IntersectionSignalSequenceDataTestResult> getIntersectionSignalSequenceDataTestResultList() {
        return intersectionSignalSequenceDataTestResultList;
    }

    public List<Integer> getErrorMessageSequenceDataList() {
        return errorMessageSequenceDataList;
    }


    // Others
    public boolean isLastUpdateTimeValid() {
        return isLastUpdateTimeValid;
    }

    public boolean isIntSigTPInventoryExtValid() {
        return isIntSigTPInventoryExtValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }


    // Set functions
    public void setOrganizationInformationExist(boolean organizationInformationExist) {
        isOrganizationInformationExist = organizationInformationExist;
    }

    public void setOrganizationIdValid(boolean organizationIdValid) {
        isOrganizationIdValid = organizationIdValid;
    }

    public void setDeviceIdValid(boolean deviceIdValid) {
        isDeviceIdValid = deviceIdValid;
    }

    public void setTimingPatternIdValid(boolean timingPatternIdValid) {
        isTimingPatternIdValid = timingPatternIdValid;
    }

    public void setTimingPatternNameValid(boolean timingPatternNameValid) {
        isTimingPatternNameValid = timingPatternNameValid;
    }

    public void setCycleLengthValid(boolean cycleLengthValid) {
        isCycleLengthValid = cycleLengthValid;
    }

    public void setOffsetTimeValid(boolean offsetTimeValid) {
        isOffsetTimeValid = offsetTimeValid;
    }

    // Phase TP List
    public void setPhaseTPListExist(boolean phaseTPListExist) {
        isPhaseTPListExist = phaseTPListExist;
    }

    public void setPhaseTPListValid(boolean phaseTPListValid) {
        isPhaseTPListValid = phaseTPListValid;
    }

    public void setPhaseTPListOutOfBound(boolean phaseTPListOutOfBound) {
        isPhaseTPListOutOfBound = phaseTPListOutOfBound;
    }

    public void setMaxPhaseTPList(int maxPhaseTPList) {
        this.maxPhaseTPList = maxPhaseTPList;
    }

    public void setIntersectionSignalTPInventoryPhaseTestResultList(List<IntersectionSignalTPInventoryPhaseTestResult> intersectionSignalTPInventoryPhaseTestResultList) {
        this.intersectionSignalTPInventoryPhaseTestResultList = intersectionSignalTPInventoryPhaseTestResultList;
    }

    public void setErrorMassagePhaseTPListIndex(List<Integer> errorMassagePhaseTPListIndex) {
        this.errorMassagePhaseTPListIndex = errorMassagePhaseTPListIndex;
    }

    // Sequence Information
    public void setSequenceInformationExist(boolean sequenceInformationExist) {
        isSequenceInformationExist = sequenceInformationExist;
    }

    public void setSequenceInformationValid(boolean sequenceInformationValid) {
        isSequenceInformationValid = sequenceInformationValid;
    }

    public void setSequenceInformationOutOfBound(boolean sequenceInformationOutOfBound) {
        isSequenceInformationOutOfBound = sequenceInformationOutOfBound;
    }

    public void setMaxSequenceInformation(int maxSequenceInformation) {
        this.maxSequenceInformation = maxSequenceInformation;
    }

    public void setIntersectionSignalSequenceDataTestResultList(List<IntersectionSignalSequenceDataTestResult> intersectionSignalSequenceDataTestResultList) {
        this.intersectionSignalSequenceDataTestResultList = intersectionSignalSequenceDataTestResultList;
    }

    public void setErrorMessageSequenceDataList(List<Integer> errorMessageSequenceDataList) {
        this.errorMessageSequenceDataList = errorMessageSequenceDataList;
    }

    public void setLastUpdateTimeValid(boolean lastUpdateTimeValid) {
        isLastUpdateTimeValid = lastUpdateTimeValid;
    }

    public void setIntSigTPInventoryExtValid(boolean intSigTPInventoryExtValid) {
        isIntSigTPInventoryExtValid = intSigTPInventoryExtValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }


    // Initialization
    public void Initialization(){
        isOrganizationInformationExist=true;
        isOrganizationIdValid=true;

        isDeviceIdValid=true;
        isTimingPatternIdValid=true;
        isTimingPatternNameValid=true;
        isCycleLengthValid=true;
        isOffsetTimeValid=true;

        isPhaseTPListExist=true;
        isPhaseTPListValid=true;
        isPhaseTPListOutOfBound=false;
        intersectionSignalTPInventoryPhaseTestResultList=new ArrayList<IntersectionSignalTPInventoryPhaseTestResult>();
        errorMassagePhaseTPListIndex=new ArrayList<Integer>();

        isSequenceInformationExist=true;
        isSequenceInformationValid=true;
        isSequenceInformationOutOfBound=false;
        intersectionSignalSequenceDataTestResultList=new ArrayList<IntersectionSignalSequenceDataTestResult>();
        errorMessageSequenceDataList=new ArrayList<Integer>();

        isLastUpdateTimeValid=true;
        isIntSigTPInventoryExtValid=true;

        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalTimingPatternInventory intersectionSignalTimingPatternInventory){

        // Organization Information
        if(intersectionSignalTimingPatternInventory.getOrganizationInformation()==null){
            errorMessages+="Empty organization information;";
            isOrganizationInformationExist=false;
        }else{
            if(intersectionSignalTimingPatternInventory.getOrganizationInformation().getOrganizationId()==null){
                errorMessages+="Empty organization id;";
                isOrganizationIdValid=false;
            }
        }

        // Device ID
        if(intersectionSignalTimingPatternInventory.getDeviceId()==null){
            errorMessages+="Empty device id;";
            isDeviceIdValid=false;
        }

        // Timing Pattern ID
        if(intersectionSignalTimingPatternInventory.getTimingPatternId()==null){
            errorMessages+="Empty timing pattern id;";
            isTimingPatternIdValid=false;
        }

        // Timing Pattern Name
        if(intersectionSignalTimingPatternInventory.getTimingPatternName()==null){
            errorMessages+="Empty timing pattern name;";
            isTimingPatternNameValid=false;
        }

        // Cycle Length
        if(intersectionSignalTimingPatternInventory.getCycleLength()<0 || intersectionSignalTimingPatternInventory.getCycleLength()>255){
            errorMessages+="Cycle length is out of bound;";
            isCycleLengthValid=false;
        }

        // Offset Time
        if(intersectionSignalTimingPatternInventory.getOffsetTime()<0 || intersectionSignalTimingPatternInventory.getOffsetTime()>255){
            errorMessages+="Offset time is out of bound;";
            isOffsetTimeValid=false;
        }

        // Phase TP List
        if(intersectionSignalTimingPatternInventory.getPhaseTpList()==null){
            errorMessages+="Empty phase tp list;";
            isPhaseTPListExist=false;
        }else{
            List<IntersectionSignalTPInventoryPhase> intersectionSignalTPInventoryPhaseList=
                    intersectionSignalTimingPatternInventory.getPhaseTpList().getPhases();
            if(intersectionSignalTPInventoryPhaseList==null){
                errorMessages+="Empty phase tp list;";
                isPhaseTPListExist=false;
            }else{
                if(intersectionSignalTPInventoryPhaseList.size()>maxPhaseTPList){
                    isPhaseTPListOutOfBound=true;
                    errorMessages+="Phase TP List is out of bound;";
                }
                for(int i=0;i<intersectionSignalTPInventoryPhaseList.size();i++){
                    IntersectionSignalTPInventoryPhaseTestResult intersectionSignalTPInventoryPhaseTestResult=new IntersectionSignalTPInventoryPhaseTestResult();
                    intersectionSignalTPInventoryPhaseTestResult.Initialization();
                    intersectionSignalTPInventoryPhaseTestResult.Check(intersectionSignalTPInventoryPhaseList.get(i));
                    intersectionSignalTPInventoryPhaseTestResultList.add(intersectionSignalTPInventoryPhaseTestResult);
                    if(!intersectionSignalTPInventoryPhaseTestResult.isValidOrNot()){
                        errorMassagePhaseTPListIndex.add(i);
                    }
                }
                if(errorMassagePhaseTPListIndex.size()>0){
                    errorMessages+="Phase TP list contains invalid information;";
                    isPhaseTPListValid=false;
                }
            }
        }

        // Sequence Information
        if(intersectionSignalTimingPatternInventory.getSequenceInformation()==null){
            errorMessages+="Empty sequence information;";
            isSequenceInformationExist=false;
        }else{
            List<IntersectionSignalSequenceData> intersectionSignalSequenceDataList=
                    intersectionSignalTimingPatternInventory.getSequenceInformation().getSequenceInformation();
            if(intersectionSignalSequenceDataList==null){
                errorMessages+="Empty sequence information;";
                isSequenceInformationExist=false;
            }else{
                if(intersectionSignalSequenceDataList.size()>maxSequenceInformation){
                    isSequenceInformationOutOfBound=true;
                    errorMessages+="Sequence information is out of bound;";
                }
                for(int i=0;i<intersectionSignalSequenceDataList.size();i++){
                    IntersectionSignalSequenceDataTestResult intersectionSignalSequenceDataTestResult=new IntersectionSignalSequenceDataTestResult();
                    intersectionSignalSequenceDataTestResult.Initialization();
                    intersectionSignalSequenceDataTestResult.Check(intersectionSignalSequenceDataList.get(i));
                    intersectionSignalSequenceDataTestResultList.add(intersectionSignalSequenceDataTestResult);
                    if(!intersectionSignalSequenceDataTestResult.isValidOrNot()){
                        errorMessageSequenceDataList.add(i);
                    }
                }
                if(errorMessageSequenceDataList.size()>0){
                    isSequenceInformationValid=false;
                    errorMessages+="Sequence Information contains invalid information;";
                }
            }
        }

        // Last Update Time
        if(intersectionSignalTimingPatternInventory.getLastUpdateTime()==null){
            errorMessages+="Empty last update time;";
            isLastUpdateTimeValid=false;
        }else{
            if(intersectionSignalTimingPatternInventory.getLastUpdateTime().getDate()==null){
                errorMessages+="Invalid last update time: empty date;";
                isLastUpdateTimeValid=false;
            }
            if(intersectionSignalTimingPatternInventory.getLastUpdateTime().getTime()==null){
                errorMessages+="Invalid last update time: empty time;";
                isLastUpdateTimeValid=false;
            }
        }

        // Intersection Signal TP Inventory Extension
        // currently do not check this part

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // OrganizationInformation
        if(!isOrganizationInformationExist || !isOrganizationIdValid){
            validOrNot=false;
        }

        // Device Id
        if(!isDeviceIdValid){
            validOrNot=false;
        }

        // Timing Pattern Id
        if(!isTimingPatternIdValid){
            validOrNot=false;
        }

        // Timing Pattern Name
        if(!isTimingPatternNameValid){
            validOrNot=false;
        }

        // Cycle Length
        if(!isCycleLengthValid){
            validOrNot=false;
        }

        // Offset Time
        if(!isOffsetTimeValid){
            validOrNot=false;
        }

        // Phase TP List
        if(!isPhaseTPListExist || !isPhaseTPListValid || isPhaseTPListOutOfBound){
            validOrNot=false;
        }

        // Sequence Information
        if(!isSequenceInformationExist || !isSequenceInformationValid || isSequenceInformationOutOfBound){
            validOrNot=false;
        }

        // Last Update Time
        if(!isLastUpdateTimeValid){
            validOrNot=false;
        }

        // Do not check the extended field: Signal-Plan-Inventory-Ext

        return validOrNot;
    }

}
