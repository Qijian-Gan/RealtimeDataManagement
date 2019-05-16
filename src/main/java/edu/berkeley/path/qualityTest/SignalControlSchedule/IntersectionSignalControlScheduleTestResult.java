package edu.berkeley.path.qualityTest.SignalControlSchedule;

import org.tmdd._303.messages.DeviceControlScheduleHeader;
import org.tmdd._303.messages.IntersectionSignalControlSchedule;

public class IntersectionSignalControlScheduleTestResult {

    private boolean isDeviceControlScheduleHeaderExist;
    private boolean isDeviceControlScheduleHeaderValid;
    private DeviceControlScheduleHeaderTestResult deviceControlScheduleHeaderTestResult;

    // Enumerated: unknown(1), other(2),free(3),fixed-time(4),actuated(5),semi-actuated(6)
    // critical-intersection-control(7), traffic-responsive(8), adaptive(9),flash-programmed(10)
    private boolean isRequestControlModeValid;
    private boolean isTimingPatternIdValid; // Organization resource identifier

   // Signal Schedule Ext
   // Currently do not include that since it is required by PATH only
    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isDeviceControlScheduleHeaderExist() {
        return isDeviceControlScheduleHeaderExist;
    }

    public boolean isDeviceControlScheduleHeaderValid() {
        return isDeviceControlScheduleHeaderValid;
    }

    public DeviceControlScheduleHeaderTestResult getDeviceControlScheduleHeaderTestResult() {
        return deviceControlScheduleHeaderTestResult;
    }

    public boolean isRequestControlModeValid() {
        return isRequestControlModeValid;
    }

    public boolean isTimingPatternIdValid() {
        return isTimingPatternIdValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setDeviceControlScheduleHeaderExist(boolean deviceControlScheduleHeaderExist) {
        isDeviceControlScheduleHeaderExist = deviceControlScheduleHeaderExist;
    }

    public void setDeviceControlScheduleHeaderValid(boolean deviceControlScheduleHeaderValid) {
        isDeviceControlScheduleHeaderValid = deviceControlScheduleHeaderValid;
    }

    public void setDeviceControlScheduleHeaderTestResult(DeviceControlScheduleHeaderTestResult deviceControlScheduleHeaderTestResult) {
        this.deviceControlScheduleHeaderTestResult = deviceControlScheduleHeaderTestResult;
    }

    public void setRequestControlModeValid(boolean requestControlModeValid) {
        isRequestControlModeValid = requestControlModeValid;
    }

    public void setTimingPatternIdValid(boolean timingPatternIdValid) {
        isTimingPatternIdValid = timingPatternIdValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isDeviceControlScheduleHeaderExist=true;
        isDeviceControlScheduleHeaderValid=true;
        deviceControlScheduleHeaderTestResult=new DeviceControlScheduleHeaderTestResult();
        isRequestControlModeValid=true;
        isTimingPatternIdValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalControlSchedule intersectionSignalControlSchedule){

        // Device Control Schedule Header
        if(intersectionSignalControlSchedule.getDeviceControlScheduleHeader()==null){
            isDeviceControlScheduleHeaderExist=false;
            errorMessages+="Empty device control schedule header;";
        }else{
            deviceControlScheduleHeaderTestResult.Initialization();
            deviceControlScheduleHeaderTestResult.Check(intersectionSignalControlSchedule.getDeviceControlScheduleHeader());
            if(!deviceControlScheduleHeaderTestResult.isValidOrNot()){// Invalid??
                isDeviceControlScheduleHeaderValid=false;
                errorMessages+="Device control schedule header contains invalid information;";
            }
        }

        // Request Control Mode
        if(intersectionSignalControlSchedule.getRequestControlMode()==null){
            isRequestControlModeValid=false;
            errorMessages+="Empty request control mode;";
        }

        // Timing Pattern ID
        if(intersectionSignalControlSchedule.getTimingPatternId()==null){
            isTimingPatternIdValid=false;
            errorMessages+="Empty timing pattern id;";
        }


        // Intersection signal control schedule extension
        // Not implement yet!

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        if(!isDeviceControlScheduleHeaderExist ||!isDeviceControlScheduleHeaderValid ||
                !isRequestControlModeValid || !isTimingPatternIdValid){
            validOrNot=false;
        }

        return validOrNot;
    }

}
