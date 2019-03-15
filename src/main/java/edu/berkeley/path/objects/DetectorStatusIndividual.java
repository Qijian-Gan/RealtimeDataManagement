package edu.berkeley.path.objects;

import edu.berkeley.path.util.DateTimeConversion;
import org.tmdd._303.messages.DetectorStatus;
import org.tmdd._303.messages.DetectorStatusDetails;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetectorStatusIndividual {
    // Detector Status for individual detectors

    private String organizationId; // OrganizationId in DetectorStationStatusHeader
    private String stationId; // DeviceId in DetectorStationStatusHeader
    private String stationStatus; // DeviceStatus in DetectorStationStatusHeader
    private String deviceId; // DeviceId in DetectorStatusList
    private Date lastUpdateTime;

    private DetectorStatusDetails detectorStatusDetails;

    public DetectorStatusIndividual(String _organizationId, String _stationId, String _stationStatus,
                                    String _deviceId, Date _lastUpdateTime,
                                    DetectorStatusDetails _detectorStatusDetails){
        organizationId=_organizationId;
        stationId=_stationId;
        stationStatus=_stationStatus;
        deviceId=_deviceId;
        lastUpdateTime=_lastUpdateTime;
        detectorStatusDetails=_detectorStatusDetails;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getStationId() {
        return stationId;
    }

    public String getStationStatus() {
        return stationStatus;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public DetectorStatusDetails getDetectorStatusDetails() {
        return detectorStatusDetails;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setStationStatus(String stationStatus) {
        this.stationStatus = stationStatus;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setDetectorStatusDetails(DetectorStatusDetails detectorStatusDetails) {
        this.detectorStatusDetails = detectorStatusDetails;
    }


    public static List<DetectorStatusIndividual> constructIndividualDetectorStatus(DetectorStatus detectorStatus){
        // Construct individual detector status

        // Get the station information
        String organizationId=detectorStatus.getDetectorStationStatusHeader().getOrganizationInformation()
                .getOrganizationId();
        String stationId=detectorStatus.getDetectorStationStatusHeader().getDeviceId();
        String stationStatus=detectorStatus.getDetectorStationStatusHeader().getDeviceStatus();

        // TODO: currently the Last-Update-Time is missing in the messages
        // TODO: therefore, fill this attribute with the current date time
        Date lastUpdateTime= DateTimeConversion.GetCurrentDateTime();

        // Loop for each detector
        List<DetectorStatusDetails> detectorStatusDetailsList=detectorStatus.getDetectorStatusList().getDetector();
        List<DetectorStatusIndividual> detectorStatusIndividualList=new ArrayList<>();
        for(int i=0;i<detectorStatusDetailsList.size();i++){
            // Detector Id
            String deviceId=detectorStatusDetailsList.get(i).getDetectorStatusHeader().getDeviceId();
            DetectorStatusIndividual detectorStatusIndividual=new DetectorStatusIndividual(organizationId,
                    stationId,stationStatus,deviceId,lastUpdateTime,detectorStatusDetailsList.get(i));
            detectorStatusIndividualList.add(detectorStatusIndividual);
        }

        return detectorStatusIndividualList;
    }

}
