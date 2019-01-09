package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.DeviceInventoryHeader;

public class DeviceInventoryHeaderTestResult {

    private boolean isOrganizationInformationExist;
    private boolean isOrganizationIdValid;
    private boolean isDeviceIdValid;
    private boolean isDeviceLocationValid;
    private boolean isDeviceNameValid;
    private boolean isDeviceDescriptionValid; // Required by PATH;
    // Required by PATH; Enumerated: status-only(1),command-only(2),status-and-command(3),not-specified(4)
    private boolean isDeviceControlTypeValid;
    private boolean isControllerDescriptionValid; // Required by PATH;
    private boolean isLastUpdateTimeValid; // Required by PATH
    private String errorMessages;

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

    public boolean isDeviceLocationValid() {
        return isDeviceLocationValid;
    }

    public boolean isDeviceNameValid() {
        return isDeviceNameValid;
    }

    public boolean isDeviceDescriptionValid() {
        return isDeviceDescriptionValid;
    }

    public boolean isDeviceControlTypeValid() {
        return isDeviceControlTypeValid;
    }

    public boolean isControllerDescriptionValid() {
        return isControllerDescriptionValid;
    }

    public boolean isLastUpdateTimeValid() {
        return isLastUpdateTimeValid;
    }

    public String getErrorMessages() {
        return errorMessages;
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

    public void setDeviceLocationValid(boolean deviceLocationValid) {
        isDeviceLocationValid = deviceLocationValid;
    }

    public void setDeviceNameValid(boolean deviceNameValid) {
        isDeviceNameValid = deviceNameValid;
    }

    public void setDeviceDescriptionValid(boolean deviceDescriptionValid) {
        isDeviceDescriptionValid = deviceDescriptionValid;
    }

    public void setDeviceControlTypeValid(boolean deviceControlTypeValid) {
        isDeviceControlTypeValid = deviceControlTypeValid;
    }

    public void setControllerDescriptionValid(boolean controllerDescriptionValid) {
        isControllerDescriptionValid = controllerDescriptionValid;
    }

    public void setLastUpdateTimeValid(boolean lastUpdateTimeValid) {
        isLastUpdateTimeValid = lastUpdateTimeValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isOrganizationInformationExist=true;
        isOrganizationIdValid=true;
        isDeviceIdValid=true;
        isDeviceLocationValid=true;
        isDeviceNameValid=true;
        isDeviceDescriptionValid=true;
        isDeviceControlTypeValid=true;
        isControllerDescriptionValid=true;
        isLastUpdateTimeValid=true;
        errorMessages="";
    }

    // Check each element
    public void Check(DeviceInventoryHeader deviceInventoryHeader){

        // Organization Information
        if(deviceInventoryHeader.getOrganizationInformation()==null){
            isOrganizationInformationExist=false;
            errorMessages+="Empty organization information;";
        }else{
            if(deviceInventoryHeader.getOrganizationInformation().getOrganizationId()==null){
                isOrganizationIdValid=false;
                errorMessages+="Empty organization id;";
            }
        }

        // Device Id
        if(deviceInventoryHeader.getDeviceId()==null){
            isDeviceIdValid=false;
            errorMessages+="Empty device id;";
        }

        // Device Location
        if(deviceInventoryHeader.getDeviceLocation()==null){
            isDeviceLocationValid=false;
            errorMessages+="Empty device location;";
        }else{
            if(deviceInventoryHeader.getDeviceLocation().getLatitude()<-900000000 ||
                    deviceInventoryHeader.getDeviceLocation().getLatitude()>900000001){
                isDeviceLocationValid=false;
                errorMessages+="Device location: latitude out of bound;";
            }

            if(deviceInventoryHeader.getDeviceLocation().getLongitude()<-1800000000 ||
                    deviceInventoryHeader.getDeviceLocation().getLongitude()>1800000001){
                isDeviceLocationValid=false;
                errorMessages+="Device location: longitude out of bound;";
            }
        }

        // Device Name
        if(deviceInventoryHeader.getDeviceName()==null){
            isDeviceNameValid=false;
            errorMessages+="Empty device name;";
        }

        // Device Description
        if(deviceInventoryHeader.getDeviceDescription()==null){
            isDeviceDescriptionValid=false;
            errorMessages+="Empty device description;";
        }

        // Device Control Type
        if(deviceInventoryHeader.getDeviceControlType()==null){
            isDeviceControlTypeValid=false;
            errorMessages+="Empty device control type;";
        }

        // Controller description
        if(deviceInventoryHeader.getControllerDescription()==null){
            isControllerDescriptionValid=false;
            errorMessages+="Empty controller description;";
        }

        // Last Update Time
        if(deviceInventoryHeader.getLastUpdateTime()==null){
            isLastUpdateTimeValid=false;
            errorMessages+="Empty last update time;";
        }else{
            if(deviceInventoryHeader.getLastUpdateTime().getDate()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time invalid: empty date;";
            }
            if(deviceInventoryHeader.getLastUpdateTime().getTime()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time invalid: empty time;";
            }
        }

    }
}
