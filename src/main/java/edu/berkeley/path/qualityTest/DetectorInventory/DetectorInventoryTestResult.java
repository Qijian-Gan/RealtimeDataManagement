package edu.berkeley.path.qualityTest.DetectorInventory;

import org.tmdd._303.messages.DetectorInventory;
import org.tmdd._303.messages.DetectorInventoryDetails;

import java.util.ArrayList;
import java.util.List;


public class DetectorInventoryTestResult {

    // Detector stationary inventory header
    private boolean isDetectorStationInventoryHeaderValid;
    private boolean isDetectorStationInventoryHeaderExist;
    private DetectorStationInventoryHeaderTestResult detectorStationInventoryHeaderTestResult;

    // Detector inventory list
    private int maxDetectorInventoryList=65535;
    private boolean isDetectorInventoryListExist;
    private boolean isDetectorInventoryListValid;
    private boolean isDetectorInventoryListOutOfBound;
    private List<DetectorInventoryDetailsTestResult> detectorInventoryDetailsTestResultList;
    private List<Integer> errorMessageIndex;

    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isDetectorStationInventoryHeaderExist() {
        return isDetectorStationInventoryHeaderExist;
    }

    public boolean isDetectorStationInventoryHeaderValid() {
        return isDetectorStationInventoryHeaderValid;
    }

    public DetectorStationInventoryHeaderTestResult getDetectorStationInventoryHeaderTestResult() {
        return detectorStationInventoryHeaderTestResult;
    }

    public boolean isDetectorInventoryListExist() {
        return isDetectorInventoryListExist;
    }

    public boolean isDetectorInventoryListValid() {
        return isDetectorInventoryListValid;
    }

    public boolean isDetectorInventoryListOutOfBound() {
        return isDetectorInventoryListOutOfBound;
    }

    public List<DetectorInventoryDetailsTestResult> getDetectorInventoryDetailsTestResultList() {
        return detectorInventoryDetailsTestResultList;
    }

    public List<Integer> getErrorMessageIndex() {
        return errorMessageIndex;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setDetectorStationInventoryHeaderExist(boolean detectorStationInventoryHeaderExist) {
        isDetectorStationInventoryHeaderExist = detectorStationInventoryHeaderExist;
    }

    public void setDetectorStationInventoryHeaderValid(boolean detectorStationInventoryHeaderValid) {
        isDetectorStationInventoryHeaderValid = detectorStationInventoryHeaderValid;
    }

    public void setDetectorStationInventoryHeaderTestResult(DetectorStationInventoryHeaderTestResult detectorStationInventoryHeaderTestResult) {
        this.detectorStationInventoryHeaderTestResult = detectorStationInventoryHeaderTestResult;
    }

    public void setDetectorInventoryListExist(boolean detectorInventoryListExist) {
        isDetectorInventoryListExist = detectorInventoryListExist;
    }

    public void setDetectorInventoryListValid(boolean detectorInventoryListValid) {
        isDetectorInventoryListValid = detectorInventoryListValid;
    }

    public void setDetectorInventoryListOutOfBound(boolean detectorInventoryListOutOfBound) {
        isDetectorInventoryListOutOfBound = detectorInventoryListOutOfBound;
    }

    public void setDetectorInventoryDetailsTestResultList(List<DetectorInventoryDetailsTestResult> detectorInventoryDetailsTestResultList) {
        this.detectorInventoryDetailsTestResultList = detectorInventoryDetailsTestResultList;
    }

    public void setErrorMessageIndex(List<Integer> errorMessageIndex) {
        this.errorMessageIndex = errorMessageIndex;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isDetectorStationInventoryHeaderValid=true;
        isDetectorStationInventoryHeaderExist=true;
        detectorStationInventoryHeaderTestResult=null;
        isDetectorInventoryListExist=true;
        isDetectorInventoryListValid=true;
        isDetectorInventoryListOutOfBound=false;
        detectorInventoryDetailsTestResultList=new ArrayList<DetectorInventoryDetailsTestResult>();
        errorMessageIndex=new ArrayList<Integer>();
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(DetectorInventory detectorInventory){

        // Detector Station Inventory Header
        if(detectorInventory.getDetectorStationInventoryHeader()==null){
            isDetectorStationInventoryHeaderExist=false;
            errorMessages+="Empty detector station inventory header;";
        }else{
            detectorStationInventoryHeaderTestResult=new DetectorStationInventoryHeaderTestResult();
            detectorStationInventoryHeaderTestResult.Initialization();
            detectorStationInventoryHeaderTestResult.Check(detectorInventory.getDetectorStationInventoryHeader());
            if(!detectorStationInventoryHeaderTestResult.isValidOrNot()){//Invalid
                isDetectorStationInventoryHeaderValid=false;
                errorMessages+="Detector station inventory header invalid;";
            }
        }

        // Detector Inventory List
        if(detectorInventory.getDetectorInventoryList()==null){
            isDetectorInventoryListExist=false;
            errorMessages+="Empty detector inventory list;";
        }else{
            List<DetectorInventoryDetails> detectorInventoryDetailsList=detectorInventory.getDetectorInventoryList().getDetector();
            if(detectorInventoryDetailsList.size()>maxDetectorInventoryList){
                isDetectorInventoryListOutOfBound=true;
                errorMessages+="Detector inventory list out of bound;";
            }
            if(detectorInventoryDetailsList.size()==0){
                isDetectorInventoryListExist=false;
                errorMessages+="Empty detector inventory list";
            }
            for(int i=0;i<detectorInventoryDetailsList.size();i++){
                DetectorInventoryDetailsTestResult detectorInventoryDetailsTestResult=new DetectorInventoryDetailsTestResult();
                detectorInventoryDetailsTestResult.Initialization();
                detectorInventoryDetailsTestResult.Check(detectorInventoryDetailsList.get(i));
                detectorInventoryDetailsTestResultList.add(detectorInventoryDetailsTestResult);
                if(!detectorInventoryDetailsTestResult.isValidOrNot()){
                    errorMessageIndex.add(i); // Add the index that returns error messages
                }
            }
            if(errorMessageIndex.size()>0){
                isDetectorInventoryListValid=false;
                errorMessages+="Detector inventory list contains invalid information;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Detector Station Inventory Header
        if(!isDetectorStationInventoryHeaderExist || !isDetectorStationInventoryHeaderValid){
            validOrNot=false;
        }

        // Detector Inventory List
        if(!isDetectorInventoryListExist || !isDetectorInventoryListValid || isDetectorInventoryListOutOfBound){
            validOrNot=false;
        }

        return validOrNot;
    }
}
