package edu.berkeley.path.objects;

import edu.berkeley.path.util.DateTimeConversion;
import lrms_adopted_02_00_00.GeoLocation;
import org.tmdd._303.messages.DetectorInventory;
import org.tmdd._303.messages.DetectorInventoryDetails;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetectorInventoryIndividual {

    private String organizationId; // Organization Id in Detector Station Inventory Header
    private String stationId;  // Device Id in Detector Station Inventory Header
    private GeoLocation stationLocation; // Device Location in Detector Station Inventory Header
    private String deviceId; // Device Id in Detector Inventory List
    private Date lastUpdateTime; // Last Update Time in Detector Inventory List

    private DetectorInventoryDetails detectorInventoryDetails;

    public DetectorInventoryIndividual(String _organizationId, String _stationId, GeoLocation _stationLocation,
                                       String _deviceId,Date _lastUpdateTime,
                                       DetectorInventoryDetails _detectorInventoryDetails){
        organizationId=_organizationId;
        stationId=_stationId;
        stationLocation=_stationLocation;
        deviceId=_deviceId;
        lastUpdateTime=_lastUpdateTime;
        detectorInventoryDetails=_detectorInventoryDetails;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getStationId() {
        return stationId;
    }

    public GeoLocation getStationLocation() {
        return stationLocation;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public DetectorInventoryDetails getDetectorInventoryDetails() {
        return detectorInventoryDetails;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationLocation(GeoLocation stationLocation) {
        this.stationLocation = stationLocation;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setDetectorInventoryDetails(DetectorInventoryDetails detectorInventoryDetails) {
        this.detectorInventoryDetails = detectorInventoryDetails;
    }

    public static List<DetectorInventoryIndividual> constructIndividualDetectorInventory(DetectorInventory detectorInventory) throws ParseException {
        // Construct detector inventory for individual detectors

        // Station Information
        String organizationId=detectorInventory.getDetectorStationInventoryHeader().
                getOrganizationInformation().getOrganizationId();
        String stationId=detectorInventory.getDetectorStationInventoryHeader().getDeviceId();
        GeoLocation stationLocation=detectorInventory.getDetectorStationInventoryHeader().getDeviceLocation();

        // Loop for each detector
        List<DetectorInventoryDetails> detectorInventoryDetailsList=detectorInventory.getDetectorInventoryList().getDetector();
        List<DetectorInventoryIndividual> detectorInventoryIndividualList=new ArrayList<>();
        for(int i=0;i<detectorInventoryDetailsList.size();i++){
            String deviceId=detectorInventoryDetailsList.get(i).getDetectorInventoryHeader().getDeviceId();
            String updateDate=detectorInventoryDetailsList.get(i).getDetectorInventoryHeader().getLastUpdateTime().getDate();
            String updateTime=detectorInventoryDetailsList.get(i).getDetectorInventoryHeader().getLastUpdateTime().getTime();
            Date lastUpdateTime= DateTimeConversion.TMDDDateTimeToRegularDateTime(updateDate,updateTime);

            DetectorInventoryIndividual detectorInventoryIndividual=new DetectorInventoryIndividual(organizationId,
                    stationId, stationLocation, deviceId, lastUpdateTime,detectorInventoryDetailsList.get(i));
            detectorInventoryIndividualList.add(detectorInventoryIndividual);
        }

        return detectorInventoryIndividualList;
    }

}
