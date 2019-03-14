package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalInventory;
import org.tmdd._303.messages.IntersectionSignalInventoryPhase;
import org.tmdd._303.messages.IntersectionSignalOverlapPhase;
import org.tmdd._303.messages.IntersectionSignalRing;

import java.util.ArrayList;
import java.util.List;

public class IntersectionSignalInventoryTestResult {

    private boolean isDeviceInventoryHeaderExist;
    private boolean isDeviceInventoryHeaderValid;
    private DeviceInventoryHeaderTestResult deviceInventoryHeaderTestResult;

    private boolean isIntersectionNameValid;
    private boolean isControllerMasterIdValid; // Required by PATH

    // Phase List; Required by PATH
    private boolean isPhaseListExist;
    private boolean isPhaseListValid;
    private int maxPhaseList=40; // Defined by TMDD
    private boolean isPhaseListOutOfBound;
    private List<IntersectionSignalInventoryPhaseTestResult> intersectionSignalInventoryPhaseTestResultList;
    private List<Integer> errorMessagePhaseIndex;

    // Overlap Phase List; Required by PATH
    private boolean isOverlapPhaseListExist;
    private boolean isOverlapPhaseListValid;
    private int maxOverlapPhaseList=16; // Defined by TMDD
    private boolean isOverlapPhaseListOutOfBound;
    private List<IntersectionSignalOverlapPhaseTestResult> intersectionSignalOverlapPhaseTestResultList;
    private List<Integer> errorMessageOverlapPhaseIndex;

    // Ring List
    private boolean isRingListExist;
    private boolean isRingListValid;
    private int maxRingList=16; // Defined by TMDD
    private boolean isRingListOutOfBound;
    private List<IntersectionSignalRingTestResult> intersectionSignalRingTestResultList;
    private List<Integer> errorMessageRingIndex;

    // Extensions
    private boolean isSignalControllerTypeValid; // Required by PATH
    private boolean isSignalControllerFirmwareValid; // Required by PATH

    // Currently do not check Signal Inventory Ext
    // The corresponding functions are not enabled
    private boolean isSignalInventoryExtExist;
    private boolean isSignalInventoryExtValid;

    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isDeviceInventoryHeaderExist() {
        return isDeviceInventoryHeaderExist;
    }

    public boolean isDeviceInventoryHeaderValid() {
        return isDeviceInventoryHeaderValid;
    }

    public DeviceInventoryHeaderTestResult getDeviceInventoryHeaderTestResult() {
        return deviceInventoryHeaderTestResult;
    }

    public boolean isIntersectionNameValid() {
        return isIntersectionNameValid;
    }

    public boolean isControllerMasterIdValid() {
        return isControllerMasterIdValid;
    }

    // Phase List
    public boolean isPhaseListExist() {
        return isPhaseListExist;
    }

    public boolean isPhaseListValid() {
        return isPhaseListValid;
    }

    public int getMaxPhaseList() {
        return maxPhaseList;
    }

    public boolean isPhaseListOutOfBound() {
        return isPhaseListOutOfBound;
    }

    public List<IntersectionSignalInventoryPhaseTestResult> getIntersectionSignalInventoryPhaseTestResultList() {
        return intersectionSignalInventoryPhaseTestResultList;
    }

    public List<Integer> getErrorMessagePhaseIndex() {
        return errorMessagePhaseIndex;
    }

    // Overlap Phase
    public boolean isOverlapPhaseListExist() {
        return isOverlapPhaseListExist;
    }

    public boolean isOverlapPhaseListValid() {
        return isOverlapPhaseListValid;
    }

    public int getMaxOverlapPhaseList() {
        return maxOverlapPhaseList;
    }

    public boolean isOverlapPhaseListOutOfBound() {
        return isOverlapPhaseListOutOfBound;
    }

    public List<IntersectionSignalOverlapPhaseTestResult> getIntersectionSignalOverlapPhaseTestResultList() {
        return intersectionSignalOverlapPhaseTestResultList;
    }

    public List<Integer> getErrorMessageOverlapPhaseIndex() {
        return errorMessageOverlapPhaseIndex;
    }

    // Ring List
    public boolean isRingListExist() {
        return isRingListExist;
    }

    public boolean isRingListValid() {
        return isRingListValid;
    }

    public int getMaxRingList() {
        return maxRingList;
    }

    public boolean isRingListOutOfBound() {
        return isRingListOutOfBound;
    }

    public List<IntersectionSignalRingTestResult> getIntersectionSignalRingTestResultList() {
        return intersectionSignalRingTestResultList;
    }

    public List<Integer> getErrorMessageRingIndex() {
        return errorMessageRingIndex;
    }


    // Other fields
    public boolean isSignalControllerTypeValid() {
        return isSignalControllerTypeValid;
    }

    public boolean isSignalControllerFirmwareValid() {
        return isSignalControllerFirmwareValid;
    }

    public boolean isSignalInventoryExtExist() {
        return isSignalInventoryExtExist;
    }

    public boolean isSignalInventoryExtValid() {
        return isSignalInventoryExtValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setDeviceInventoryHeaderExist(boolean deviceInventoryHeaderExist) {
        isDeviceInventoryHeaderExist = deviceInventoryHeaderExist;
    }

    public void setDeviceInventoryHeaderValid(boolean deviceInventoryHeaderValid) {
        isDeviceInventoryHeaderValid = deviceInventoryHeaderValid;
    }

    public void setDeviceInventoryHeaderTestResult(DeviceInventoryHeaderTestResult deviceInventoryHeaderTestResult) {
        this.deviceInventoryHeaderTestResult = deviceInventoryHeaderTestResult;
    }

    public void setIntersectionNameValid(boolean intersectionNameValid) {
        isIntersectionNameValid = intersectionNameValid;
    }

    public void setControllerMasterIdValid(boolean controllerMasterIdValid) {
        isControllerMasterIdValid = controllerMasterIdValid;
    }

    // Phase List
    public void setPhaseListExist(boolean phaseListExist) {
        isPhaseListExist = phaseListExist;
    }

    public void setPhaseListValid(boolean phaseListValid) {
        isPhaseListValid = phaseListValid;
    }

    public void setMaxPhaseList(int maxPhaseList) {
        this.maxPhaseList = maxPhaseList;
    }

    public void setPhaseListOutOfBound(boolean phaseListOutOfBound) {
        isPhaseListOutOfBound = phaseListOutOfBound;
    }

    public void setIntersectionSignalInventoryPhaseTestResultList(List<IntersectionSignalInventoryPhaseTestResult> intersectionSignalInventoryPhaseTestResultList) {
        this.intersectionSignalInventoryPhaseTestResultList = intersectionSignalInventoryPhaseTestResultList;
    }

    public void setErrorMessagePhaseIndex(List<Integer> errorMessagePhaseIndex) {
        this.errorMessagePhaseIndex = errorMessagePhaseIndex;
    }

    // Overlap Phase
    public void setOverlapPhaseListExist(boolean overlapPhaseListExist) {
        isOverlapPhaseListExist = overlapPhaseListExist;
    }

    public void setOverlapPhaseListValid(boolean overlapPhaseListValid) {
        isOverlapPhaseListValid = overlapPhaseListValid;
    }

    public void setMaxOverlapPhaseList(int maxOverlapPhaseList) {
        this.maxOverlapPhaseList = maxOverlapPhaseList;
    }

    public void setOverlapPhaseListOutOfBound(boolean overlapPhaseListOutOfBound) {
        isOverlapPhaseListOutOfBound = overlapPhaseListOutOfBound;
    }

    public void setIntersectionSignalOverlapPhaseTestResultList(List<IntersectionSignalOverlapPhaseTestResult> intersectionSignalOverlapPhaseTestResultList) {
        this.intersectionSignalOverlapPhaseTestResultList = intersectionSignalOverlapPhaseTestResultList;
    }

    public void setErrorMessageOverlapPhaseIndex(List<Integer> errorMessageOverlapPhaseIndex) {
        this.errorMessageOverlapPhaseIndex = errorMessageOverlapPhaseIndex;
    }


    // Ring List
    public void setRingListExist(boolean ringListExist) {
        isRingListExist = ringListExist;
    }

    public void setRingListValid(boolean ringListValid) {
        isRingListValid = ringListValid;
    }

    public void setMaxRingList(int maxRingList) {
        this.maxRingList = maxRingList;
    }

    public void setRingListOutOfBound(boolean ringListOutOfBound) {
        isRingListOutOfBound = ringListOutOfBound;
    }

    public void setIntersectionSignalRingTestResultList(List<IntersectionSignalRingTestResult> intersectionSignalRingTestResultList) {
        this.intersectionSignalRingTestResultList = intersectionSignalRingTestResultList;
    }

    public void setErrorMessageRingIndex(List<Integer> errorMessageRingIndex) {
        this.errorMessageRingIndex = errorMessageRingIndex;
    }


    // Other fields
    public void setSignalControllerTypeValid(boolean signalControllerTypeValid) {
        isSignalControllerTypeValid = signalControllerTypeValid;
    }

    public void setSignalControllerFirmwareValid(boolean signalControllerFirmwareValid) {
        isSignalControllerFirmwareValid = signalControllerFirmwareValid;
    }

    public void setSignalInventoryExtExist(boolean signalInventoryExtExist) {
        isSignalInventoryExtExist = signalInventoryExtExist;
    }

    public void setSignalInventoryExtValid(boolean signalInventoryExtValid) {
        isSignalInventoryExtValid = signalInventoryExtValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isDeviceInventoryHeaderExist=true;
        isDeviceInventoryHeaderValid=true;
        deviceInventoryHeaderTestResult=new DeviceInventoryHeaderTestResult();

        isIntersectionNameValid=true;
        isControllerMasterIdValid=true;

        isPhaseListExist=true;
        isPhaseListValid=true;
        intersectionSignalInventoryPhaseTestResultList=new ArrayList<IntersectionSignalInventoryPhaseTestResult>();
        errorMessagePhaseIndex=new ArrayList<Integer>();

        isOverlapPhaseListExist=true;
        isOverlapPhaseListValid=true;
        intersectionSignalOverlapPhaseTestResultList=new ArrayList<IntersectionSignalOverlapPhaseTestResult>();
        errorMessageOverlapPhaseIndex=new ArrayList<Integer>();

        isRingListExist=true;
        isRingListValid=true;
        intersectionSignalRingTestResultList=new ArrayList<IntersectionSignalRingTestResult>();
        errorMessageRingIndex=new ArrayList<Integer>();

        isSignalControllerTypeValid=true;
        isSignalControllerFirmwareValid=true;

        isSignalInventoryExtExist=true;
        isSignalInventoryExtValid=true;

        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalInventory intersectionSignalInventory){

        // Device Inventory Header
        if(intersectionSignalInventory.getDeviceInventoryHeader()==null){
            isDeviceInventoryHeaderExist=false;
            errorMessages+="Empty device inventory header;";
        }else{
            deviceInventoryHeaderTestResult.Initialization();
            deviceInventoryHeaderTestResult.Check(intersectionSignalInventory.getDeviceInventoryHeader());
            if(!deviceInventoryHeaderTestResult.isValidOrNot()){// Contain invalid information
                isDeviceInventoryHeaderValid=false;
                errorMessages+="Device inventory header contains invalid information;";
            }
        }

        // Intersection Name
        if(intersectionSignalInventory.getIntersectionName()==null){
            isIntersectionNameValid=false;
            errorMessages+="Empty intersection name;";
        }

        // Controller Master Id
        if(intersectionSignalInventory.getControllerMasterId()==null){
            isControllerMasterIdValid=false;
            errorMessages+="Empty controller master id;";
        }

        // Phase List
        if(intersectionSignalInventory.getPhaseList()==null){
            isPhaseListExist=false;
            errorMessages+="Empty phase list;";
        }else{
            if(intersectionSignalInventory.getPhaseList().getPhases()==null){
                isPhaseListValid=false;
                errorMessages+="Empty phase list;";
            }else{
                List<IntersectionSignalInventoryPhase> intersectionSignalInventoryPhaseList=
                        intersectionSignalInventory.getPhaseList().getPhases();
                if(intersectionSignalInventoryPhaseList.size()>maxPhaseList){
                    isPhaseListOutOfBound=true;
                    errorMessages+="Phase list out of bound;";
                }
                for(int i=0;i<intersectionSignalInventoryPhaseList.size();i++){
                    IntersectionSignalInventoryPhaseTestResult intersectionSignalInventoryPhaseTestResult
                            =new IntersectionSignalInventoryPhaseTestResult();
                    intersectionSignalInventoryPhaseTestResult.Initialization();
                    intersectionSignalInventoryPhaseTestResult.Check(intersectionSignalInventoryPhaseList.get(i));
                    intersectionSignalInventoryPhaseTestResultList.add(intersectionSignalInventoryPhaseTestResult);
                    if(!intersectionSignalInventoryPhaseTestResult.isValidOrNot()){
                        errorMessagePhaseIndex.add(i);
                    }
                }
                if(errorMessagePhaseIndex.size()!=0){
                    isPhaseListValid=false;
                    errorMessages+="Phase list contains invalid information;";
                }
            }
        }

        // Overlap phase
        if(intersectionSignalInventory.getOverlapPhaseList()==null){
            isOverlapPhaseListExist=false;
            errorMessages+="Empty overlap phase list;";
        }else{
            if(intersectionSignalInventory.getOverlapPhaseList().getOverlapPhases()==null){
                isOverlapPhaseListValid=false;
                errorMessages+="Empty overlap phase list;";
            }else{
                List<IntersectionSignalOverlapPhase> intersectionSignalOverlapPhaseList=
                        intersectionSignalInventory.getOverlapPhaseList().getOverlapPhases();
                if(intersectionSignalOverlapPhaseList.size()>maxOverlapPhaseList){
                    isOverlapPhaseListOutOfBound=true;
                    errorMessages+="Overlap phase list out of bound;";
                }
                for(int i=0;i<intersectionSignalOverlapPhaseList.size();i++){
                    IntersectionSignalOverlapPhaseTestResult intersectionSignalOverlapPhaseTestResult=new IntersectionSignalOverlapPhaseTestResult();
                    intersectionSignalOverlapPhaseTestResult.Initialization();
                    intersectionSignalOverlapPhaseTestResult.Check(intersectionSignalOverlapPhaseList.get(i));
                    intersectionSignalOverlapPhaseTestResultList.add(intersectionSignalOverlapPhaseTestResult);
                    if(!intersectionSignalOverlapPhaseTestResult.isValidOrNot()){
                        errorMessageOverlapPhaseIndex.add(i);
                    }
                }
                if(errorMessageOverlapPhaseIndex.size()!=0){
                    isOverlapPhaseListValid=false;
                    errorMessages+="Overlap phase list contains invalid information;";
                }
            }
        }

        // Ring list
        if(intersectionSignalInventory.getRingList()==null){
            isRingListExist=false;
            errorMessages+="Empty ring list;";
        }else{
            if(intersectionSignalInventory.getRingList().getRings()==null){
                isRingListValid=false;
                errorMessages+="Empty ring list;";
            }else{
                List<IntersectionSignalRing> intersectionSignalRingList=intersectionSignalInventory.getRingList().getRings();
                if(intersectionSignalRingList.size()>maxRingList){
                    isRingListOutOfBound=true;
                    errorMessages+="Ring list out of bound;";
                }
                for(int i=0;i<intersectionSignalRingList.size();i++){
                    IntersectionSignalRingTestResult intersectionSignalRingTestResult=new IntersectionSignalRingTestResult();
                    intersectionSignalRingTestResult.Initialization();
                    intersectionSignalRingTestResult.Check(intersectionSignalRingList.get(i));
                    intersectionSignalRingTestResultList.add(intersectionSignalRingTestResult);
                    if(!intersectionSignalRingTestResult.isValidOrNot()){
                        errorMessageRingIndex.add(i);
                    }
                }
                if(errorMessageRingIndex.size()!=0){
                    isRingListValid=false;
                    errorMessages+="Ring list contains invalid information;";
                }
            }
        }

        // Signal Controller Type
        if(intersectionSignalInventory.getSignalControllerType()==null){
            isSignalControllerTypeValid=false;
            errorMessages+="Empty signal controller type;";
        }

        // Signal Controller Firmware
        if(intersectionSignalInventory.getSignalControllerFirmware()==null){
            isSignalControllerFirmwareValid=false;
            errorMessages+="Empty signal controller firmware;";
        }

        // Intersection Signal Inventory Extension
        // not implemented yet

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Device Inventory Header
        if(!isDeviceInventoryHeaderExist ||!isDeviceInventoryHeaderValid){
            validOrNot=false;
        }

        // Intersection Name
        if(!isIntersectionNameValid){
            validOrNot=false;
        }

        // Controller Master Id
        if(!isControllerMasterIdValid){
            validOrNot=false;
        }

        // Phase List
        if(!isPhaseListExist || !isPhaseListValid || isPhaseListOutOfBound){
            validOrNot=false;
        }

        // Overlap Phase List
        if(!isOverlapPhaseListExist || !isOverlapPhaseListValid || isOverlapPhaseListOutOfBound){
            validOrNot=false;
        }

        // Ring List
        if(!isRingListExist || !isRingListValid || isRingListOutOfBound){
            validOrNot=false;
        }

        // Signal Controller Type
        if(!isSignalControllerTypeValid){
            validOrNot=false;
        }

        // Signal Controller Firmware
        if(!isSignalControllerFirmwareValid){
            validOrNot=false;
        }

        // Currently do not check Signal Inventory Ext

        return validOrNot;
    }

}
