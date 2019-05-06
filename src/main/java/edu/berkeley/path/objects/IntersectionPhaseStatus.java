package edu.berkeley.path.objects;

public class IntersectionPhaseStatus {

    private int phaseId;
    private double splitDuration;
    private double greenDuration;
    private double yellowDuration;
    private double redDuration;
    private double minGreen;
    private double maxGreen;
    // "measured" (can be calculated directly), "estimated"(need to be estimated),
    // "adjusted" (after adjustment to fit into a valid cycle)
    // "planned" (planned in the inventory)
    // "initialized" (initial value)
    private String status;
    private String errorMessage;

    // Get functions
    public int getPhaseId() {
        return phaseId;
    }

    public double getSplitDuration() {
        return splitDuration;
    }

    public double getGreenDuration() {
        return greenDuration;
    }

    public double getYellowDuration() {
        return yellowDuration;
    }

    public double getRedDuration() {
        return redDuration;
    }

    public double getMinGreen() {
        return minGreen;
    }

    public double getMaxGreen() {
        return maxGreen;
    }

    public String getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    // Set functions
    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }

    public void setSplitDuration(double splitDuration) {
        this.splitDuration = splitDuration;
    }

    public void setGreenDuration(double greenDuration) {
        this.greenDuration = greenDuration;
    }

    public void setYellowDuration(double yellowDuration) {
        this.yellowDuration = yellowDuration;
    }

    public void setRedDuration(double redDuration) {
        this.redDuration = redDuration;
    }

    public void setMaxGreen(double maxGreen) {
        this.maxGreen = maxGreen;
    }

    public void setMinGreen(double minGreen) {
        this.minGreen = minGreen;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    // Initialization
    public void initialization(){
        phaseId=-1;
        splitDuration=-1;
        greenDuration=-1;
        yellowDuration=-1;
        redDuration=-1;
        minGreen=-1;
        maxGreen=-1;
        status=null;
        errorMessage=null;
    }
    public void setValues(int _phaseId, double _splitDuration, double _greenDuration, double _yellowDuration, double _redDuration
            , double _minGreen, double _maxGreen, String _status,String _errorMessage){
        phaseId=_phaseId;
        splitDuration=_splitDuration;
        greenDuration=_greenDuration;
        yellowDuration=_yellowDuration;
        redDuration=_redDuration;
        minGreen=_minGreen;
        maxGreen=_maxGreen;
        status=_status;
        errorMessage=_errorMessage;
    }

}
