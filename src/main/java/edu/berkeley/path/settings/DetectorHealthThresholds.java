package edu.berkeley.path.settings;

public class DetectorHealthThresholds {

    // The following variables can be changed for different detectors/intersections/organizations
    private double missingRateThreshold=5; // Default value in percentages
    private double startTime=6; // Start time of checking zero values, in hours
    private double endTime=22; // End time of checking zero values, in hours
    private double maxZeroValueThreshold=4; // Default value in hours. That means maximum of 4 hours
    private double highValueRateThreshold=5; // Default value in percentages
    private double highFlowValue=1200; // Default value in vph
    private double inconsisRateWithoutSpeedThreshold=5; // Default value in percentages

    // Get functions
    public double getMissingRateThreshold() {
        return missingRateThreshold;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public double getHighFlowValue() {
        return highFlowValue;
    }

    public double getHighValueRateThreshold() {
        return highValueRateThreshold;
    }

    public double getInconsisRateWithoutSpeedThreshold() {
        return inconsisRateWithoutSpeedThreshold;
    }

    public double getMaxZeroValueThreshold() {
        return maxZeroValueThreshold;
    }

    // Set functions
    public void setMissingRateThreshold(double missingRateThreshold) {
        this.missingRateThreshold = missingRateThreshold;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void setHighFlowValue(double highFlowValue) {
        this.highFlowValue = highFlowValue;
    }

    public void setHighValueRateThreshold(double highValueRateThreshold) {
        this.highValueRateThreshold = highValueRateThreshold;
    }

    public void setInconsisRateWithoutSpeedThreshold(double inconsisRateWithoutSpeedThreshold) {
        this.inconsisRateWithoutSpeedThreshold = inconsisRateWithoutSpeedThreshold;
    }

    public void setMaxZeroValueThreshold(double maxZeroValueThreshold) {
        this.maxZeroValueThreshold = maxZeroValueThreshold;
    }

    // Initialization
    public void Initialization(double _missingRateThreshold, double _startTime, double _endTime, double _maxZeroValueThreshold
            , double _highValueRateThreshold, double _highFlowValue, double _inconsisRateWithoutSpeedThreshold){
        this.missingRateThreshold=_missingRateThreshold;
        this.startTime=_startTime;
        this.endTime=_endTime;
        this.maxZeroValueThreshold=_maxZeroValueThreshold;
        this.highValueRateThreshold=_highValueRateThreshold;
        this.highFlowValue=_highFlowValue;
        this.inconsisRateWithoutSpeedThreshold=_inconsisRateWithoutSpeedThreshold;
    }
}
