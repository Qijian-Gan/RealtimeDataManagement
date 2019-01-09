package edu.berkeley.path.qualityTest.DetectorData;

import org.tmdd._303.messages.DetectorDataDetail;

public class DetectorDataDetailTestResult {
    private boolean isStationIdValid; // Required by PATH
    private boolean isDetectorIdValid; // Required
    private boolean isDetectionTimeStampValid; //Required

    private boolean isVehicleCountValid; // Required by PATH; Integer: 0...10000
    private int maxVehicleCount=10000;
    private boolean isVehicleOccupancyValid; // Required by PATH; Integer: 0...100
    private double maxVehicleOccupancy=100;
    private boolean isFlowOccupancyRelationValid; // Required by PATH; Follow the fundamental diagram
    private boolean isStartTimeValid; // Required by PATH
    private boolean isEndTimeValid; // Required by PATH
    private boolean isStartAndEndTimeRelationValid; // Required by PATH; StartTime<EndTime

    // Required by PATH; Enumerated: actual(1), reconstructed(2),historical(3), predicted(4),smoothed(5),averaged(6),estimated(7)
    private boolean isDetectorDataTypeValid;
    private boolean isVehicleSpeedValid; // Required by PATH; Integer: 0...255
    private boolean isQueueLengthValid; // Required by PATH; Integer: 0...10000
    private boolean isVehicleStopsValid; // Required by PATH; Integer: 0...100000
    // Required by PATH; Enumerated: on(1), off(2),out-of-service(3), unavailable(4), unknown(5),marginal(6),failed(7),other(8)
    private boolean isDetectorStatusValid;

    // Extension required by PATH
    // Vehicle occupancy ext
    private boolean isVehicleOccupancyExtensionValid;

    private String errorMessages;


    // Get functions
    public boolean isStationIdValid() {
        return isStationIdValid;
    }

    public boolean isDetectorIdValid() {
        return isDetectorIdValid;
    }

    public boolean isDetectionTimeStampValid() {
        return isDetectionTimeStampValid;
    }

    public boolean isVehicleCountValid() {
        return isVehicleCountValid;
    }

    public boolean isVehicleOccupancyValid() {
        return isVehicleOccupancyValid;
    }

    public boolean isFlowOccupancyRelationValid() {
        return isFlowOccupancyRelationValid;
    }

    public boolean isStartTimeValid() {
        return isStartTimeValid;
    }

    public boolean isEndTimeValid() {
        return isEndTimeValid;
    }

    public boolean isStartAndEndTimeRelationValid() {
        return isStartAndEndTimeRelationValid;
    }

    public boolean isDetectorDataTypeValid() {
        return isDetectorDataTypeValid;
    }

    public boolean isVehicleSpeedValid() {
        return isVehicleSpeedValid;
    }

    public boolean isQueueLengthValid() {
        return isQueueLengthValid;
    }

    public boolean isVehicleStopsValid() {
        return isVehicleStopsValid;
    }

    public boolean isDetectorStatusValid() {
        return isDetectorStatusValid;
    }

    public boolean isVehicleOccupancyExtensionValid() {
        return isVehicleOccupancyExtensionValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setStationIdValid(boolean stationIdValid) {
        isStationIdValid = stationIdValid;
    }

    public void setDetectorIdValid(boolean detectorIdValid) {
        isDetectorIdValid = detectorIdValid;
    }

    public void setDetectionTimeStampValid(boolean detectionTimeStampValid) {
        isDetectionTimeStampValid = detectionTimeStampValid;
    }

    public void setVehicleCountValid(boolean vehicleCountValid) {
        isVehicleCountValid = vehicleCountValid;
    }

    public void setVehicleOccupancyValid(boolean vehicleOccupancyValid) {
        isVehicleOccupancyValid = vehicleOccupancyValid;
    }

    public void setFlowOccupancyRelationValid(boolean flowOccupancyRelationValid) {
        isFlowOccupancyRelationValid = flowOccupancyRelationValid;
    }

    public void setStartTimeValid(boolean startTimeValid) {
        isStartTimeValid = startTimeValid;
    }

    public void setEndTimeValid(boolean endTimeValid) {
        isEndTimeValid = endTimeValid;
    }

    public void setStartAndEndTimeRelationValid(boolean startAndEndTimeRelationValid) {
        isStartAndEndTimeRelationValid = startAndEndTimeRelationValid;
    }

    public void setDetectorDataTypeValid(boolean detectorDataTypeValid) {
        isDetectorDataTypeValid = detectorDataTypeValid;
    }

    public void setVehicleSpeedValid(boolean vehicleSpeedValid) {
        isVehicleSpeedValid = vehicleSpeedValid;
    }

    public void setQueueLengthValid(boolean queueLengthValid) {
        isQueueLengthValid = queueLengthValid;
    }

    public void setVehicleStopsValid(boolean vehicleStopsValid) {
        isVehicleStopsValid = vehicleStopsValid;
    }

    public void setDetectorStatusValid(boolean detectorStatusValid) {
        isDetectorStatusValid = detectorStatusValid;
    }

    public void setVehicleOccupancyExtensionValid(boolean vehicleOccupancyExtensionValid) {
        isVehicleOccupancyExtensionValid = vehicleOccupancyExtensionValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isStationIdValid=true;
        isDetectorIdValid=true;
        isDetectionTimeStampValid=true;
        isVehicleCountValid=true;
        isVehicleOccupancyValid=true;
        isFlowOccupancyRelationValid=true;
        isStartTimeValid=true;
        isEndTimeValid=true;
        isStartAndEndTimeRelationValid=true;
        isDetectorDataTypeValid=true;
        isVehicleSpeedValid=true;
        isQueueLengthValid=true;
        isVehicleStopsValid=true;
        isDetectorStatusValid=true;
        isVehicleOccupancyExtensionValid=true;
        errorMessages="";
    }

    // Check each element
    public void Check(DetectorDataDetail detectorDataDetail){

        // Station Id
        if(detectorDataDetail.getStationId()==null){
            isStationIdValid=false;
            errorMessages+="Empty station ID;";
        }

        // Detector Id
        if(detectorDataDetail.getDetectorId()==null){
            isDetectorIdValid=false;
            errorMessages+="Empty detector ID;";
        }

        // Detection Time Stamp
        if(detectorDataDetail.getDetectionTimeStamp()==null){
            isDetectionTimeStampValid=false;
            errorMessages+="Empty detection time stamp;";
        }else{
            if(detectorDataDetail.getDetectionTimeStamp().getDate()==null){
                isDetectionTimeStampValid=false;
                errorMessages+="Detection time stamp invalid: empty date;";
            }
            if(detectorDataDetail.getDetectionTimeStamp().getTime()==null){
                isDetectionTimeStampValid=false;
                errorMessages+="Detection time stamp invalid: empty time;";
            }
        }

        // Vehicle Count
        int vehicleCount=-1;
        double vehicleOccupancy=-1;
        if(detectorDataDetail.getVehicleCount()==null){
            isVehicleCountValid=false;
            errorMessages+="Empty vehicle count;";
        }else{
            vehicleCount=detectorDataDetail.getVehicleCount().intValue();
            if(vehicleCount>maxVehicleCount ||vehicleCount<0){
                isVehicleCountValid=false;
                errorMessages+="Vehicle count out of bound;";
            }
        }

        // Vehicle Occupancy
        if(detectorDataDetail.getVehicleOccupancy()==null){
            isVehicleOccupancyValid=false;
            errorMessages+="Empty vehicle occupancy;";
        }else{
            vehicleOccupancy=detectorDataDetail.getVehicleOccupancy().intValue();
            if(vehicleOccupancy>maxVehicleOccupancy ||vehicleOccupancy<0){
                isVehicleOccupancyValid=false;
                errorMessages+="Vehicle occupancy out of bound;";
            }
        }

        // Flow-occupancy relation
        if(isVehicleOccupancyValid && isVehicleCountValid){
            if(vehicleCount>0 && vehicleOccupancy==0){// Flow is not zero, occupancy should not be zero
                isFlowOccupancyRelationValid=false;
                errorMessages+="Flow and occupancy relation is invalid;";
            }
        }else{// If one of them is invalid
            isFlowOccupancyRelationValid=false;
        }

        // Start Time
        if(detectorDataDetail.getStartTime()==null){
            isStartTimeValid=false;
            errorMessages+="Empty start time;";
        }else{
            if(detectorDataDetail.getStartTime().getDate()==null){
                isStartTimeValid=false;
                errorMessages+="Start time invalid: empty date;";
            }
            if(detectorDataDetail.getStartTime().getTime()==null){
                isStartTimeValid=false;
                errorMessages+="Start time invalid: empty time;";
            }
        }

        // End Time
        if(detectorDataDetail.getEndTime()==null){
            isEndTimeValid=false;
            errorMessages+="Empty end time;";
        }else{
            if(detectorDataDetail.getEndTime().getDate()==null){
                isEndTimeValid=false;
                errorMessages+="End time invalid: empty date;";
            }
            if(detectorDataDetail.getEndTime().getTime()==null){
                isEndTimeValid=false;
                errorMessages+="End time invalid: empty time;";
            }
        }

        // Start time and End time relation
        double startDateTime;
        double endDateTime;
        // Date: YYYYMMDD
        // Time:HHMMSSssss
        if(isStartTimeValid && isEndTimeValid){
            startDateTime=Double.parseDouble(detectorDataDetail.getStartTime().getDate())*1000000.0+
                    Double.parseDouble(detectorDataDetail.getStartTime().getTime())/10000.0;
            endDateTime=Double.parseDouble(detectorDataDetail.getEndTime().getDate())*1000000.0+
                    Double.parseDouble(detectorDataDetail.getEndTime().getTime())/10000.0;
            if(endDateTime<startDateTime){
                isStartAndEndTimeRelationValid=false;
                errorMessages+="Start time and end time relation invalid;";
            }
        }else{
            isStartAndEndTimeRelationValid=false;
        }

        // Detector Data Type
        if(detectorDataDetail.getDetectorDataType()==null){
            isDetectorDataTypeValid=false;
            errorMessages+="Empty detector data type;";
        }

        // Vehicle Speed
        if(detectorDataDetail.getVehicleSpeed()==null){
            isVehicleSpeedValid=false;
            errorMessages+="Empty vehicle speed;";
        }else{
            if(detectorDataDetail.getVehicleSpeed().intValue()>255 || detectorDataDetail.getVehicleSpeed().intValue()<0){
                isVehicleSpeedValid=false;
                errorMessages+="Vehicle speed out of bound;";
            }
        }

        // Queue Length
        if(detectorDataDetail.getQueueLength()==null){
            isQueueLengthValid=false;
            errorMessages+="Empty queue length;";
        }else{
            if(detectorDataDetail.getQueueLength().intValue()<0 || detectorDataDetail.getQueueLength().intValue()>10000){
                isQueueLengthValid=false;
                errorMessages+="Queue length out of bound;";
            }
        }

        // Vehicle Stops
        if(detectorDataDetail.getVehicleStops()==null){
            isVehicleStopsValid=false;
            errorMessages+="Empty vehicle stops;";
        }else{
            if(detectorDataDetail.getVehicleStops().intValue()<0 || detectorDataDetail.getVehicleStops().intValue()>100000){
                isVehicleStopsValid=false;
                errorMessages+="Vehicle stops out of bound;";
            }
        }

        // Detector status
        if(detectorDataDetail.getDetectorStatus()==null){
            isDetectorStatusValid=false;
            errorMessages+="Empty detector status;";
        }

        // Vehicle Occupancy Ext
        // Not implemented yet
        // the existing element (Vehicle-Occupancy) limits precision to 2 digits but can be used if precision reported is 4 digits
    }

}
