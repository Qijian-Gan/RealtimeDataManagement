package edu.berkeley.path.qualityTest.DetectorInventory;

import org.tmdd._303.messages.DeviceInventoryHeader;

public class DetectorInventoryHeaderTestResult {
    // This part is required by TMDD
    private boolean isOrganizationInformationValid; // Required; Struct: OrganizationInformation
    private boolean isDeviceIdValid; // Required; Struct: Organization resource identifier; String
    private boolean isDeviceLocationValid; // Required; Struct: LRMS.Geolocation: Latitude & Longitude
    private boolean isDeviceNameValid; // Required; Struct: Organization resource name

    private boolean isDeviceDescriptionValid; // Required by PATH; Struct: Organization resource name
    // Required by PATH; Struct: Device control type; Enumerated: status-only (1), command-only(2), status-and-command (3), not-specified(4)
    private boolean isDeviceControlTypeValid;
    private boolean isControllerDescriptionValid; // Required by PATH; Struct: Organization resource name
    private boolean isLastUpdateTimeValid; // Required by PATH; Struct: DateTimeZone

    private String errorMessages;

    // Get functions
    public boolean isOrganizationInformationValid() {
        return isOrganizationInformationValid;
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
    public void setOrganizationInformationValid(boolean organizationInformationValid) {
        isOrganizationInformationValid = organizationInformationValid;
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
        this.isOrganizationInformationValid=true;
        this.isDeviceIdValid=true;
        this.isDeviceLocationValid=true;
        this.isDeviceNameValid=true;
        this.isDeviceDescriptionValid=true;
        this.isDeviceControlTypeValid=true;
        this.isControllerDescriptionValid=true;
        this.isLastUpdateTimeValid=true;
        this.errorMessages="";
    }

    // Check each element
    public void Check(DeviceInventoryHeader deviceInventoryHeader){

        // Organization Information
        if(deviceInventoryHeader.getOrganizationInformation()==null){
            isOrganizationInformationValid=false;
            errorMessages+="Empty organization information;";
        }else{
            // Only check the required fields: organization id
            // Other fileds are unchecked: organization name, organization location, organization function,
            // organization contact details, center contact list, last update time
            if(deviceInventoryHeader.getOrganizationInformation().getOrganizationId()==null){
                isOrganizationInformationValid=false;
                errorMessages+="Empty organization Id;";
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

        // Device Controller Description
        if(deviceInventoryHeader.getControllerDescription()==null){
            isControllerDescriptionValid=false;
            errorMessages+="Empty controller description;";
        }

        // Last Update Time : DateTimeZone
        if(deviceInventoryHeader.getLastUpdateTime()==null){
            isLastUpdateTimeValid=false;
            errorMessages+="Empty last update time;";
        }else{
            if(deviceInventoryHeader.getLastUpdateTime().getDate()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time: empty date;";
            }
            if(deviceInventoryHeader.getLastUpdateTime().getTime()==null){
                isLastUpdateTimeValid=false;
                errorMessages+="Last update time: empty time;";
            }
        }
    }

}
