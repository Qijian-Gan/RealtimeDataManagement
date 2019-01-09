package edu.berkeley.path.qualityTest.DetectorInventory;

import org.tmdd._303.messages.DeviceInventoryHeader;

public class DetectorStationInventoryHeaderTestResult {
    // This part is required by PATH, Optional for TMDD

    private boolean isOrganizationInformationValid; // Required; Struct: OrganizationInformation
    private boolean isDeviceIdValid; // Required; Struct: Organization resource identifier; String
    private boolean isDeviceLocationValid; // Required; Struct: LRMS.Geolocation: Latitude & Longitude
    private boolean isDeviceNameValid; // Required; Struct: Organization resource name

    // Other fields are currently not required
    // Device description, device control type, controller description, network id, node id, node name,
    // link id, link name, link direction, linear reference, linear reference version, route designator,
    // device url, last update time

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

    public String getErrorMessesages() {
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

    public void setErrorMessesages(String errorMessesages) {
        this.errorMessages = errorMessesages;
    }

    // Initialization
    public void Initialization(){
        this.isOrganizationInformationValid=true;
        this.isDeviceIdValid=true;
        this.isDeviceLocationValid=true;
        this.isDeviceNameValid=true;
        this.errorMessages="";
    }

    // Check all required fields
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
    }

}


