package edu.berkeley.path.qualityTest.DetectorStatus;

import org.tmdd._303.messages.DetectorStatus;
import org.tmdd._303.messages.DetectorStatusDetails;
import org.tmdd._303.messages.DeviceStatusHeader;
import org.tmdd._303.messages.DateTimeZone;

import java.util.ArrayList;
import java.util.List;

public class DetectorStatusTestResult {

    // Check DetectorStationStatusHeader
    private boolean isDetectorStationStatusHeaderExist; // Optional field

    // Check DetectorStatusList
    private boolean isDetectorStatusListExist; // Required
    private boolean isDetectorStatusListValid;
    private int maxDetectorStatusDetails=65535;
    private boolean isDetectorStatusListOutOfBound;
    private List<DetectorStatusDetailsTestResult> detectorStatusDetailsTestResultList;
    private List<Integer> errorMessageIndex;

    // Error Messages
    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isDetectorStationStatusHeaderExist() {
        return isDetectorStationStatusHeaderExist;
    }

    public boolean isDetectorStatusListExist() {
        return isDetectorStatusListExist;
    }

    public boolean isDetectorStatusListValid() {
        return isDetectorStatusListValid;
    }

    public boolean isDetectorStatusListOutOfBound() {
        return isDetectorStatusListOutOfBound;
    }

    public List<DetectorStatusDetailsTestResult> getDetectorStatusDetailsTestResultList() {
        return detectorStatusDetailsTestResultList;
    }

    public List<Integer> getErrorMessageIndex() {
        return errorMessageIndex;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setDetectorStationStatusHeaderExist(boolean detectorStationStatusHeaderExist) {
        isDetectorStationStatusHeaderExist = detectorStationStatusHeaderExist;
    }

    public void setDetectorStatusListExist(boolean detectorStatusListExist) {
        isDetectorStatusListExist = detectorStatusListExist;
    }

    public void setDetectorStatusListValid(boolean detectorStatusListValid) {
        isDetectorStatusListValid = detectorStatusListValid;
    }

    public void setDetectorStatusListOutOfBound(boolean detectorStatusListOutOfBound) {
        isDetectorStatusListOutOfBound = detectorStatusListOutOfBound;
    }

    public void setDetectorStatusDetailsTestResultList(List<DetectorStatusDetailsTestResult> detectorStatusDetailsTestResultList) {
        this.detectorStatusDetailsTestResultList = detectorStatusDetailsTestResultList;
    }

    public void setErrorMessageIndex(List<Integer> errorMessageIndex) {
        this.errorMessageIndex = errorMessageIndex;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization of the runSpringCtx Results
    public void Initialization(){
        isDetectorStationStatusHeaderExist=true;
        isDetectorStatusListExist=true;
        isDetectorStatusListValid=true;
        isDetectorStatusListOutOfBound=false;
        detectorStatusDetailsTestResultList=new ArrayList<DetectorStatusDetailsTestResult>();
        errorMessageIndex=new ArrayList<Integer>();
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(DetectorStatus detectorStatus){

        // Detector station status header: This is an optional field
        if(detectorStatus.getDetectorStationStatusHeader()==null){
            isDetectorStationStatusHeaderExist=false;
            errorMessages+="Missing detector station status header;";
        }

        // Detector status list
        if(detectorStatus.getDetectorStatusList()==null){
            isDetectorStatusListExist=false;
            errorMessages+="Empty detector status list;";
        }else{
            List<DetectorStatusDetails> detectorStatusDetailsList=detectorStatus.getDetectorStatusList().getDetector();
            if(detectorStatusDetailsList.size()==0){
                isDetectorStatusListExist=false;
                errorMessages+="Empty detector status list;";
            }
            if(detectorStatusDetailsList.size()>maxDetectorStatusDetails){
                isDetectorStatusListOutOfBound=true;
                errorMessages+="Detector status details list out of bound;";
            }
            for(int i=0;i<detectorStatusDetailsList.size();i++){
                DetectorStatusDetailsTestResult detectorStatusDetailsTestResult=new DetectorStatusDetailsTestResult();
                detectorStatusDetailsTestResult.Initialization();
                detectorStatusDetailsTestResult.Check(detectorStatusDetailsList.get(i));
                detectorStatusDetailsTestResultList.add(detectorStatusDetailsTestResult);
                if(!detectorStatusDetailsTestResult.isValidOrNot()){
                    errorMessageIndex.add(i);
                }
            }
            if(errorMessageIndex.size()>0){
                isDetectorStatusListValid=false;
                errorMessages+="Detector status details list contains invalid information;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Detector Station Status Header is an optional field

        // Detector Status List
        if(!isDetectorStatusListExist || !isDetectorStatusListValid || isDetectorStatusListOutOfBound){
            validOrNot=false;
        }

        return validOrNot;
    }
}


