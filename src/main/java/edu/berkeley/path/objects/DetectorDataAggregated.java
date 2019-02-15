package edu.berkeley.path.objects;

import java.util.Date;

public class DetectorDataAggregated {
    // This is a new structure for aggregated detector data

    private String organizationId;
    private String stationId;
    private String detectorId;
    private String startTimeStampStr; // Date and Time string
    private Date startTimeStamp; // Date and Time
    private double interval;
    private double vehicleCount; // Veh/Hr
    private double vehicleOccupancy; // Percentage
    private double vehicleSpeed; // mph

    public DetectorDataAggregated(String _organizationId, String _stationId, String _detectorId
            , String _startTimeStampStr, Date _startTimeStamp, double _interval, double _vehicleCount
            ,double _vehicleOccupancy, double _vehicleSpeed){

        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.detectorId=_detectorId;
        this.startTimeStampStr=_startTimeStampStr;
        this.startTimeStamp=_startTimeStamp;
        this.interval=_interval;
        this.vehicleCount=_vehicleCount;
        this.vehicleOccupancy=_vehicleOccupancy;
        this.vehicleSpeed=_vehicleSpeed;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getStationId() {
        return stationId;
    }

    public String getDetectorId() {
        return detectorId;
    }

    public String getStartTimeStampStr() {
        return startTimeStampStr;
    }

    public Date getStartTimeStamp() {
        return startTimeStamp;
    }

    public double getInterval() {
        return interval;
    }

    public double getVehicleCount() {
        return vehicleCount;
    }

    public double getVehicleOccupancy() {
        return vehicleOccupancy;
    }

    public double getVehicleSpeed() {
        return vehicleSpeed;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    public void setStartTimeStampStr(String startTimeStampStr) {
        this.startTimeStampStr = startTimeStampStr;
    }

    public void setStartTimeStamp(Date startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }

    public void setVehicleCount(double vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public void setVehicleOccupancy(double vehicleOccupancy) {
        this.vehicleOccupancy = vehicleOccupancy;
    }

    public void setVehicleSpeed(double vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }
}
