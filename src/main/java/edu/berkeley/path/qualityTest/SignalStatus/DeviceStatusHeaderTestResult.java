package edu.berkeley.path.qualityTest.SignalStatus;

import org.tmdd._303.messages.DeviceStatusHeader;

public class DeviceStatusHeaderTestResult {

    // Organization information
    private boolean isOrganizationInformationExist; // TMDD format
    private boolean isOrganizationIdValid;

    // Device ID
    private boolean isDeviceIdValid; // String

    // Enumerated: on(1),off(2),out-of-service(3),unavailable(4),unknown(5),marginal(6),failed(7),other(8)
    private boolean isDeviceStatusValid;

    private boolean isCenterIdValid; // String

    // Enumerated: operational(1),offline(2),failed(3),unknown(4)
    private boolean isDeviceCommStatusValid;

    // Other attributes
    private boolean isOperatorIdValid;// String
    private boolean isEventIdValid; // String
    private boolean isResponsePlanIdValid; // String
    private boolean isLastCommTimeValid; // DateTimeZone

    // Assessment
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

    public boolean isDeviceStatusValid() {
        return isDeviceStatusValid;
    }

    public boolean isCenterIdValid() {
        return isCenterIdValid;
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

    public boolean isResponsePlanIdValid() {
        return isResponsePlanIdValid;
    }

    public boolean isLastCommTimeValid() {
        return isLastCommTimeValid;
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

    public void setResponsePlanIdValid(boolean responsePlanIdValid) {
        isResponsePlanIdValid = responsePlanIdValid;
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
        isOrganizationInformationExist=true;
        isOrganizationIdValid=true;
        isDeviceIdValid=true;
        isDeviceStatusValid=true;
        isCenterIdValid=true;
        isDeviceCommStatusValid=true;
        isOperatorIdValid=true;
        isEventIdValid=true;
        isResponsePlanIdValid=true;
        isLastCommTimeValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(DeviceStatusHeader deviceStatusHeader){

        // Organization Information & Organization Id
        if(deviceStatusHeader.getOrganizationInformation()==null){
            isOrganizationInformationExist=false;
            errorMessages+="Empty organization information;";
        }else{// Not empty
            if(deviceStatusHeader.getOrganizationInformation().getOrganizationId()==null){
                isOrganizationIdValid=false;
                errorMessages+="Empty organization id;";
            }
        }

        // Device Id
        if(deviceStatusHeader.getDeviceId()==null){
            isDeviceIdValid=false;
            errorMessages+="Empty device id;";
        }

        // Device Status
        if(deviceStatusHeader.getDeviceStatus()==null){
            isDeviceStatusValid=false;
            errorMessages+="Empty device status;";
        }

        // Center Id
        if(deviceStatusHeader.getCenterId()==null){
            isCenterIdValid=false;
            errorMessages+="Empty center id;";
        }

        // Device Comm Status
        if(deviceStatusHeader.getDeviceCommStatus()==null){
            isDeviceCommStatusValid=false;
            errorMessages+="Empty device comm status;";
        }

        // Operator Id
        if(deviceStatusHeader.getOperatorId()==null){
            isOperatorIdValid=false;
            errorMessages+="Empty operator id;";
        }

        // Event Id
        if(deviceStatusHeader.getEventId()==null){
            isEventIdValid=false;
            errorMessages+="Empty event id;";
        }

        // Response Plan Id
        if(deviceStatusHeader.getResponsePlanId()==null){
            isResponsePlanIdValid=false;
            errorMessages+="Empty response plan id;";
        }

        // Last Comm Time
        if(deviceStatusHeader.getLastCommTime()==null){
            isLastCommTimeValid=false;
            errorMessages+="Empty last comm time;";
        }else{
            if(deviceStatusHeader.getLastCommTime().getDate()==null){
                isLastCommTimeValid=false;
                errorMessages+="Last comm time invalid: empty date;";
            }
            if(deviceStatusHeader.getLastCommTime().getTime()==null){
                isLastCommTimeValid=false;
                errorMessages+="Last comm time invalid: empty time;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();

    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Organization Information: Required
        if(!isOrganizationInformationExist
                || !isOrganizationIdValid){
            validOrNot=false;
        }

        // Device Id : Required
        if(!isDeviceIdValid){
            validOrNot=false;
        }

        // Device Status: Required
        if(!isDeviceStatusValid){
            validOrNot=false;
        }

        // We can add more in the future if needed!
        // Users can configure this part

        return validOrNot;
    }

}

