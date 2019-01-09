package edu.berkeley.path.qualityTest.DetectorInventory;

import org.tmdd._303.messages.DetectorInventoryDetails;

public class DetectorInventoryDetailsTestResult {

    private boolean isDetectorInventoryHeaderExist;
    private boolean isDetectorInventoryHeaderValid;

    // Required; Enumerate: inductive-loop(1), magnetic(2), magnetometers(3), pressure-cell(4), microwave-radar(5), ultrasonic(6), video-image(7), laser(8), infrared(9)
    // road-tube(10), other(11), unknown(12)
    private boolean isDetectorTypeValid;
    private boolean isDetectionLanesValid; // Required by PATH; Sequence (size of 64) of Link-lane-number
    private boolean isDetectorSpeedTrapFlagValid; // Required by PATH;

    // Extension, not implemented yet!!
    private boolean isReportingSystemValid; // Required by PATH;
    private boolean isAB3418PresenceIndexValid; // Required by PATH; Integer (1...128)

    private String errorMessages;

    // Get functions
    public boolean isDetectorInventoryHeaderExist() {
        return isDetectorInventoryHeaderExist;
    }

    public boolean isDetectorInventoryHeaderValid() {
        return isDetectorInventoryHeaderValid;
    }

    public boolean isDetectorTypeValid() {
        return isDetectorTypeValid;
    }

    public boolean isDetectionLanesValid() {
        return isDetectionLanesValid;
    }

    public boolean isDetectorSpeedTrapFlagValid() {
        return isDetectorSpeedTrapFlagValid;
    }

    public boolean isReportingSystemValid() {
        return isReportingSystemValid;
    }

    public boolean isAB3418PresenceIndexValid() {
        return isAB3418PresenceIndexValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setDetectorInventoryHeaderExist(boolean detectorInventoryHeaderExist) {
        isDetectorInventoryHeaderExist = detectorInventoryHeaderExist;
    }

    public void setDetectorInventoryHeaderValid(boolean detectorInventoryHeaderValid) {
        isDetectorInventoryHeaderValid = detectorInventoryHeaderValid;
    }

    public void setDetectorTypeValid(boolean detectorTypeValid) {
        isDetectorTypeValid = detectorTypeValid;
    }

    public void setDetectionLanesValid(boolean detectionLanesValid) {
        isDetectionLanesValid = detectionLanesValid;
    }

    public void setDetectorSpeedTrapFlagValid(boolean detectorSpeedTrapFlagValid) {
        isDetectorSpeedTrapFlagValid = detectorSpeedTrapFlagValid;
    }

    public void setReportingSystemValid(boolean reportingSystemValid) {
        isReportingSystemValid = reportingSystemValid;
    }

    public void setAB3418PresenceIndexValid(boolean AB3418PresenceIndexValid) {
        isAB3418PresenceIndexValid = AB3418PresenceIndexValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isDetectorInventoryHeaderExist=true;
        isDetectorInventoryHeaderValid=true;
        isDetectorTypeValid=true;
        isDetectionLanesValid=true;
        isDetectorSpeedTrapFlagValid=true;
        isReportingSystemValid=true;
        isAB3418PresenceIndexValid=true;
        errorMessages="";
    }

    // Check each element
    public void Check(DetectorInventoryDetails detectorInventoryDetails){

        // Detector inventory header
        if(detectorInventoryDetails.getDetectorInventoryHeader()==null){
            isDetectorInventoryHeaderExist=false;
            isDetectorInventoryHeaderValid=false;
            errorMessages+="Empty detector inventory header;";
        }else{
            DetectorInventoryHeaderTestResult detectorInventoryHeaderTestResult=new DetectorInventoryHeaderTestResult();
            detectorInventoryHeaderTestResult.Initialization();
            detectorInventoryHeaderTestResult.Check(detectorInventoryDetails.getDetectorInventoryHeader());
            if(detectorInventoryHeaderTestResult.getErrorMessages()!=""){
                // Error message is not empty
                isDetectorInventoryHeaderValid=false;
                errorMessages+="Detector inventory header invalid;";
            }
        }

        // Detector Type
        if(detectorInventoryDetails.getDetectorType()==null){
            isDetectorTypeValid=false;
            errorMessages+="Empty detector type;";
        }

        // Detection Lanes
        if(detectorInventoryDetails.getDetectionLanes()==null){
            isDetectionLanesValid=false;
            errorMessages+="Empty detection lanes;";
        }else{
            if(detectorInventoryDetails.getDetectionLanes().getLanes()==null){
                isDetectionLanesValid=false;
                errorMessages+="Empty detection lanes;";
            }else{
                if(detectorInventoryDetails.getDetectionLanes().getLanes().size()>64){
                    isDetectionLanesValid=false;
                    errorMessages+="Number of detection lanes out of bound;";
                }
            }
        }

        // Is detector speed trap flag
        if(detectorInventoryDetails.getIsDetectorSpeedTrapFlag()==null){
            isDetectorSpeedTrapFlagValid=false;
            errorMessages+="Empty detector speed trap flag;";
        }

        // Reporting system
        if(detectorInventoryDetails.getReportingSystem()==null){
            isReportingSystemValid=false;
            errorMessages+="Empty reporting system;";
        }

        // AB3418PresenceIndex
        // Not implemented yet!
    }
}
