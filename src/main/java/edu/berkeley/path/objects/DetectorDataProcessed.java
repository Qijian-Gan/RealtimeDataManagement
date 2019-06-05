package edu.berkeley.path.objects;

import edu.berkeley.path.settings.ImputationFilteringSettings;

import java.util.Date;

public class DetectorDataProcessed {
    // This is a new structure for processed detector data

    private String organizationId;
    private int stationId;
    private int detectorId;
    private Date date; // Date and Time
    private int year;
    private int month;
    private int day;
    private int timeInSeconds;
    private ImputationFilteringSettings imputationFilteringSettings;
    private int interval;
    private double vehicleCount; // Veh/Hr
    private double vehicleOccupancy; // Percentage
    private double vehicleSpeed; // mph

    public DetectorDataProcessed(String _organizationId, int _stationId, int _detectorId, Date _date, int _year, int _month, int _day
            , int _timeInSeconds, ImputationFilteringSettings _imputationFilteringSettings, int _interval, double _vehicleCount
            , double _vehicleOccupancy, double _vehicleSpeed){
        // Keys
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.detectorId=_detectorId;
        this.date=_date;
        this.year=_year;
        this.month=_month;
        this.day=_day;
        this.timeInSeconds=_timeInSeconds;

        this.imputationFilteringSettings=_imputationFilteringSettings;
        this.interval=_interval;
        this.vehicleCount=_vehicleCount;
        this.vehicleOccupancy=_vehicleOccupancy;
        this.vehicleSpeed=_vehicleSpeed;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public Date getDate() {
        return date;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getInterval() {
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

    public ImputationFilteringSettings getImputationFilteringSettings() {
        return imputationFilteringSettings;
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public int getStationId() {
        return stationId;
    }

    public int getDetectorId() {
        return detectorId;
    }
    // Set functions

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDetectorId(int detectorId) {
        this.detectorId = detectorId;
    }

    public void setImputationFilteringSettings(ImputationFilteringSettings imputationFilteringSettings) {
        this.imputationFilteringSettings = imputationFilteringSettings;
    }

    public void setTimeInSeconds(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
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
