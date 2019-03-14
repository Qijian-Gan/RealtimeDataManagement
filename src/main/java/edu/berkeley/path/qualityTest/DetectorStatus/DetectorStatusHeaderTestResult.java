package edu.berkeley.path.qualityTest.DetectorStatus;

import org.tmdd._303.messages.DeviceStatusHeader;

import java.util.ArrayList;
import java.util.List;

public class DetectorStatusHeaderTestResult {

    // Check each DetectorStatusHeader
    private boolean isOrganizationInformationValid; // Required; Organization-Id, String
    private boolean isDeviceIdValid;  // Required; String
    private boolean isDeviceStatusValid; // Required; Enumerated: on(1),off(2),out-of_service(3),unavailable(4),unknown(5),marginal(6),failed(7)
    private boolean isCenterIdValid; // Required by PATH; String
    private boolean isDeviceCommStatusValid; // Required by PATH; Enumerated: operational(1),offline(2),failed(3),unknown(4)
    private boolean isOperatorIdValid; // Required by PATH; String
    private boolean isEventIdValid; // Required by PATH; String
    private boolean isResponseIdValid; // Required by PATH;
    private boolean isLastCommTimeValid; // Required by PATH; Structure: DateTimeZone
    private String errorMessages; // Store error messages
    private boolean validOrNot;

    // Get functions
    public boolean isOrganizationInformationValid() {
        return isOrganizationInformationValid;
    }

    public boolean isDeviceIdValid() {
        return isDeviceIdValid;
    }

    public boolean isDeviceStatusValid() {
        return isDeviceStatusValid;
    }

    public boolean isDeviceCommStatusValid() {
        return isDeviceCommStatusValid;
    }

    public boolean isOperatorIdValid() {
        return isOperatorIdValid;
    }

    public boolean isEventIdValid() {
        return isEventIdValid;
    }

    public boolean isResponseIdValid() {
        return isResponseIdValid;
    }

    public boolean isLastCommTimeValid() {
        return isLastCommTimeValid;
    }

    public boolean isCenterIdValid() {
        return isCenterIdValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setOrganizationInformationValid(boolean organizationInformationValid) {
        isOrganizationInformationValid = organizationInformationValid;
    }

    public void setDeviceIdValid(boolean deviceIdValid) {
        isDeviceIdValid = deviceIdValid;
    }

    public void setDeviceStatusValid(boolean deviceStatusValid) {
        isDeviceStatusValid = deviceStatusValid;
    }

    public void setCenterIdValid(boolean centerIdValid) {
        isCenterIdValid = centerIdValid;
    }

    public void setDeviceCommStatusValid(boolean deviceCommStatusValid) {
        isDeviceCommStatusValid = deviceCommStatusValid;
    }

    public void setOperatorIdValid(boolean operatorIdValid) {
        isOperatorIdValid = operatorIdValid;
    }

    public void setEventIdValid(boolean eventIdValid) {
        isEventIdValid = eventIdValid;
    }

    public void setResponseIdValid(boolean responseIdValid) {
        isResponseIdValid = responseIdValid;
    }

    public void setLastCommTimeValid(boolean lastCommTimeValid) {
        isLastCommTimeValid = lastCommTimeValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isOrganizationInformationValid=true;
        isDeviceIdValid=true;
        isDeviceStatusValid=true;
        isCenterIdValid=true;
        isDeviceCommStatusValid=true;
        isOperatorIdValid=true;
        isEventIdValid=true;
        isResponseIdValid=true;
        isLastCommTimeValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Checking each element
    public void Check(DeviceStatusHeader deviceStatusHeader){

        // Organization ID
        if(deviceStatusHeader.getOrganizationInformation()==null){
            isOrganizationInformationValid=false;
            errorMessages+="Empty organization information;";
        }else {
            if (deviceStatusHeader.getOrganizationInformation().getOrganizationId() == null) {
                isOrganizationInformationValid = false;
                errorMessages+="Empty organization ID;";
            }
        }

        // Device ID
        if(deviceStatusHeader.getDeviceId()==null){
            isDeviceIdValid=false;
            errorMessages+="Empty device ID;";
        }

        // Device Status
        if(deviceStatusHeader.getDeviceStatus()==null){
            isDeviceStatusValid=false;
            errorMessages+="Empty device status;";
        }

        // Center ID
        if(deviceStatusHeader.getCenterId()==null){
            isCenterIdValid=false;
            errorMessages+="Empty center ID;";
        }

        // Device Comm Status
        if(deviceStatusHeader.getDeviceCommStatus()==null){
            isDeviceCommStatusValid=false;
            errorMessages+="Empty device comm status;";
        }

        // Operator ID
        if(deviceStatusHeader.getOperatorId()==null){
            isOperatorIdValid=false;
            errorMessages+="Empty operator ID;";
        }

        // Event ID
        if(deviceStatusHeader.getEventId()==null){
            isEventIdValid=false;
            errorMessages+="Empty event ID;";
        }

        // Response Plan ID
        if(deviceStatusHeader.getResponsePlanId()==null){
            isResponseIdValid=false;
            errorMessages+="Empty response plan ID;";
        }

        // Last Comm Time
        if(deviceStatusHeader.getLastCommTime()==null){
            isLastCommTimeValid=false;
            errorMessages+="Empty last comm time;";
        }else{
            if(deviceStatusHeader.getLastCommTime().getDate()==null){
                isLastCommTimeValid=false;
                errorMessages+="Empty last comm time--date;";
            }
            if(deviceStatusHeader.getLastCommTime().getTime()==null){
                isLastCommTimeValid=false;
                errorMessages+="Empty last comm time--time;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();

    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Organization Information
        if(!isOrganizationInformationValid){
            validOrNot=false;
        }

        // Device Id
        if(!isDeviceIdValid){
            validOrNot=false;
        }

        // Device Status
        if(!isDeviceCommStatusValid){
            validOrNot=false;
        }

        // Currently do not check the following
        // Center Id, Device Comm Status, Operator Id, Event Id, Response Plan Id, Last Comm Time

        return validOrNot;
    }

}
