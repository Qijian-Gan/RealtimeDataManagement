package edu.berkeley.path.objects;

import edu.berkeley.path.settings.DetectorHealthThresholds;

import java.util.Date;

public class DetectorHealthMetrics {

    // Index keys
    private String organizationId;
    private int stationId;
    private int detectorId;
    private long date;
    private int year;
    private int month;
    private int day;
    private int health;

    // Variables/settings
    private int interval;
    private int numOfLanes;
    private DetectorHealthThresholds detectorHealthThresholds;
    private double missingRate;
    private double maxZeroValue;
    private double highValueRate;
    private int constantOrNot;
    private double inconsisRateWithoutSpeed;

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public int getStationId() {
        return stationId;
    }

    public int getDetectorId() {
        return detectorId;
    }

    public long getDate() {
        return date;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHealth() {
        return health;
    }

    public int getInterval() {
        return interval;
    }

    public int getNumOfLanes() {
        return numOfLanes;
    }

    public DetectorHealthThresholds getDetectorHealthThresholds() {
        return detectorHealthThresholds;
    }

    public double getMissingRate() {
        return missingRate;
    }

    public double getMaxZeroValue() {
        return maxZeroValue;
    }

    public int getConstantOrNot() {
        return constantOrNot;
    }

    public double getHighValueRate() {
        return highValueRate;
    }

    public double getInconsisRateWithoutSpeed() {
        return inconsisRateWithoutSpeed;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setDetectorId(int detectorId) {
        this.detectorId = detectorId;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public void setNumOfLanes(int numOfLanes) {
        this.numOfLanes = numOfLanes;
    }

    public void setDetectorHealthThresholds(DetectorHealthThresholds detectorHealthThresholds) {
        this.detectorHealthThresholds = detectorHealthThresholds;
    }

    public void setMissingRate(double missingRate) {
        this.missingRate = missingRate;
    }

    public void setMaxZeroValue(double maxZeroValue) {
        this.maxZeroValue = maxZeroValue;
    }

    public void setConstantOrNot(int constantOrNot) {
        this.constantOrNot = constantOrNot;
    }

    public void setHighValueRate(double highValueRate) {
        this.highValueRate = highValueRate;
    }

    public void setInconsisRateWithoutSpeed(double inconsisRateWithoutSpeed) {
        this.inconsisRateWithoutSpeed = inconsisRateWithoutSpeed;
    }

    // Initialization
    public void Initialization(String organizationId, int stationId, int detectorId, long _date, int year, int month, int day, int health, int interval, int numOfLanes
            , DetectorHealthThresholds detectorHealthThresholds, double missingRate, double maxZeroValue, double highValueRate, int constantOrNot
            , double inconsisRateWithoutSpeed){

        this.organizationId=organizationId;
        this.stationId=stationId;
        this.detectorId=detectorId;
        this.date=_date;
        this.year=year;
        this.month=month;
        this.day=day;
        this.health=health;
        this.interval=interval;
        this.numOfLanes=numOfLanes;
        this.detectorHealthThresholds=detectorHealthThresholds;
        this.missingRate=missingRate;
        this.maxZeroValue=maxZeroValue;
        this.highValueRate=highValueRate;
        this.constantOrNot=constantOrNot;
        this.inconsisRateWithoutSpeed=inconsisRateWithoutSpeed;
    }

}
