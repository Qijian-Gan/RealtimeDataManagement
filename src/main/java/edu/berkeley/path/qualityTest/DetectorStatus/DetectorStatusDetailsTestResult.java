package edu.berkeley.path.qualityTest.DetectorStatus;

import org.tmdd._303.messages.DetectorStatusDetails;
import org.tmdd._303.messages.DeviceStatusHeader;
import java.util.ArrayList;
import java.util.List;
import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusHeaderTestResult;

public class DetectorStatusDetailsTestResult {

    private boolean isDetectorStatusHeaderValid; // Required; Class: DeviceStatusHeader
    private DetectorStatusHeaderTestResult detectorStatusHeaderTestResult; // Detector status header test results
    private boolean isDetectorLaneNumberValid; // Required by PATH; Integer: 1,...,255
    // Required by PATH; Enumerated: any-other(0),n(1),ne(2),e(3),se(4),s(5),sw(6),w(7),nw(8),not-directional(9),positive-direction(10)
    // negative-direction(11),both-directions(12),other(13)
    private boolean isLaneDirectionValid;
    private String errorMessages; // Store error messages

    // Get functions
    public boolean isDetectorStatusHeaderValid() {
        return isDetectorStatusHeaderValid;
    }

    public boolean isDetectorLaneNumberValid() {
        return isDetectorLaneNumberValid;
    }

    public boolean isLaneDirectionValid() {
        return isLaneDirectionValid;
    }

    public DetectorStatusHeaderTestResult getDetectorStatusHeaderTestResult() {
        return detectorStatusHeaderTestResult;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setDetectorStatusHeaderValid(boolean detectorStatusHeaderValid) {
        isDetectorStatusHeaderValid = detectorStatusHeaderValid;
    }

    public void setDetectorStatusHeaderTestResult(DetectorStatusHeaderTestResult detectorStatusHeaderTestResult) {
        this.detectorStatusHeaderTestResult = detectorStatusHeaderTestResult;
    }

    public void setDetectorLaneNumberValid(boolean detectorLaneNumberValid) {
        isDetectorLaneNumberValid = detectorLaneNumberValid;
    }

    public void setLaneDirectionValid(boolean laneDirectionValid) {
        isLaneDirectionValid = laneDirectionValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isDetectorStatusHeaderValid=true;
        detectorStatusHeaderTestResult=null;
        isDetectorLaneNumberValid=true;
        isLaneDirectionValid=true;
        errorMessages="";
    }

    // Check each element
    public void Check(DetectorStatusDetails detectorStatusDetails){
        // Detector status status header
        if(detectorStatusDetails.getDetectorStatusHeader()==null){
            isDetectorStatusHeaderValid=false;
            errorMessages+="Empty detector status header;";
        }else{
            // Check detector header status
            detectorStatusHeaderTestResult=new DetectorStatusHeaderTestResult();
            detectorStatusHeaderTestResult.Initialization();
            detectorStatusHeaderTestResult.Check(detectorStatusDetails.getDetectorStatusHeader());
            if(detectorStatusHeaderTestResult.getErrorMessages()!=""){// Not empty messages
                isDetectorStatusHeaderValid=false;
                errorMessages+="Detector status header invalid;";
            }
        }

        // Detector lane number
        if(detectorStatusDetails.getDetectorLaneNumber()==null){
            isDetectorLaneNumberValid=false;
            errorMessages+="Empty detector lane number;";
        }else{
            if(detectorStatusDetails.getDetectorLaneNumber().intValue()>255
                    ||detectorStatusDetails.getDetectorLaneNumber().intValue()<1){
                isDetectorLaneNumberValid=false;
                errorMessages+="Detector lane number invalid;";
            }
        }

        // Lane direction
        if(detectorStatusDetails.getLaneDirection()==null){
            isLaneDirectionValid=false;
            errorMessages+="Empty lane direction;";
        }
    }

}
