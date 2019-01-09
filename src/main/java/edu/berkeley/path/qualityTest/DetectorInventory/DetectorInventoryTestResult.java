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

    // Detector Inventory Extension
    private boolean isHubOrgIdValidValid; // Required by PATH; Big Int
    private boolean isHubDetectorIdValid; // Required by PATH; Big Int
    private boolean isDataValueCheckValid; // Required by PATH; Enumerated: pass(1),fail(2)

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

    public boolean isHubOrgIdValidValid() {
        return isHubOrgIdValidValid;
    }

    public boolean isHubDetectorIdValid() {
        return isHubDetectorIdValid;
    }

    public boolean isDataValueCheckValid() {
        return isDataValueCheckValid;
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

    public void setHubOrgIdValidValid(boolean hubOrgIdValidValid) {
        isHubOrgIdValidValid = hubOrgIdValidValid;
    }

    public void setHubDetectorIdValid(boolean hubDetectorIdValid) {
        isHubDetectorIdValid = hubDetectorIdValid;
    }

    public void setDataValueCheckValid(boolean dataValueCheckValid) {
        isDataValueCheckValid = dataValueCheckValid;
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
        detectorStationInventoryHeaderTestResult=new DetectorStationInventoryHeaderTestResult();
        isDetectorInventoryListExist=true;
        isDetectorInventoryListValid=true;
        isDetectorInventoryListOutOfBound=false;
        detectorInventoryDetailsTestResultList=new ArrayList<DetectorInventoryDetailsTestResult>();
        errorMessageIndex=new ArrayList<Integer>();
        isHubOrgIdValidValid=true;
        isHubDetectorIdValid=true;
        isDataValueCheckValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(DetectorInventory detectorInventory){

        // Detector Station Inventory Header
        if(detectorInventory.getDetectorStationInventoryHeader()==null){
            isDetectorStationInventoryHeaderExist=false;
            isDetectorStationInventoryHeaderValid=false;
            errorMessages+="Empty detector station inventory header;";
        }else{
            detectorStationInventoryHeaderTestResult.Initialization();
            detectorStationInventoryHeaderTestResult.Check(detectorInventory.getDetectorStationInventoryHeader());
            if(detectorStationInventoryHeaderTestResult.getErrorMessesages()!=""){//Not empty
                isDetectorStationInventoryHeaderValid=false;
                errorMessages+="Detector station inventory header invalid;";
            }
        }

        // Detector Inventory List
        if(detectorInventory.getDetectorInventoryList()==null){
            isDetectorInventoryListExist=false;
            isDetectorInventoryListValid=false;
            errorMessages+="Empty detector inventory list;";
        }else{
            List<DetectorInventoryDetails> detectorInventoryDetailsList=detectorInventory.getDetectorInventoryList().getDetector();
            if(detectorInventoryDetailsList.size()>maxDetectorInventoryList){
                isDetectorInventoryListOutOfBound=true;
                errorMessages+="Detector inventory list out of bound;";
            }
            if(detectorInventoryDetailsList.size()==0){
                isDetectorInventoryListExist=false;
                isDetectorInventoryListValid=false;
                errorMessages+="Empty detector inventory list";
            }
            for(int i=0;i<detectorInventoryDetailsList.size();i++){
                DetectorInventoryDetailsTestResult detectorInventoryDetailsTestResult=new DetectorInventoryDetailsTestResult();
                detectorInventoryDetailsTestResult.Initialization();
                detectorInventoryDetailsTestResult.Check(detectorInventoryDetailsList.get(i));
                detectorInventoryDetailsTestResultList.add(detectorInventoryDetailsTestResult);
                if(detectorInventoryDetailsTestResult.getErrorMessages()!=""){
                    errorMessageIndex.add(i); // Add the index that returns error messages
                }
            }
            if(errorMessageIndex.size()>0){
                isDetectorInventoryListValid=false;
                errorMessages+="Detector inventory list contains invalid information;";
            }
        }

        // Check detector inventory extension: data hub related
        // hub-org-id, hub-detector-id, data-value-check
        // Not implemented yet!!

        // Check Valid or not
        if(!isDetectorInventoryListValid || !isDetectorInventoryListExist ||
                !isDetectorStationInventoryHeaderExist ||!isDetectorStationInventoryHeaderValid){
            validOrNot=false;
        }

    }
}
