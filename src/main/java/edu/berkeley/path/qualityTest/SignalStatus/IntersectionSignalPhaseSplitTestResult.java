package edu.berkeley.path.qualityTest.SignalStatus;

import org.tmdd._303.messages.IntersectionSignalPhaseSplit;

public class IntersectionSignalPhaseSplitTestResult {

    private boolean isPhaseIdentifierValid;
    private boolean isPhaseDurationValid;
    private String errorMassages;
    private boolean validOrNot;

    // Get functions
    public boolean isPhaseIdentifierValid() {
        return isPhaseIdentifierValid;
    }

    public boolean isPhaseDurationValid() {
        return isPhaseDurationValid;
    }

    public String getErrorMassages() {
        return errorMassages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setPhaseIdentifierValid(boolean phaseIdentifierValid) {
        isPhaseIdentifierValid = phaseIdentifierValid;
    }

    public void setPhaseDurationValid(boolean phaseDurationValid) {
        isPhaseDurationValid = phaseDurationValid;
    }

    public void setErrorMassages(String errorMassages) {
        this.errorMassages = errorMassages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        this.isPhaseIdentifierValid=true;
        this.isPhaseDurationValid=true;
        this.errorMassages="";
        this.validOrNot=true;
    }

    // Check
    public void Check(IntersectionSignalPhaseSplit intersectionSignalPhaseSplit){

        if(intersectionSignalPhaseSplit.getPhaseIdentifier()<1 || intersectionSignalPhaseSplit.getPhaseIdentifier()>255){
            isPhaseIdentifierValid=false;
            errorMassages+="Phase identifier out of bound;";
        }

        if(intersectionSignalPhaseSplit.getPhaseDuration()<0 || intersectionSignalPhaseSplit.getPhaseDuration()>3600){
            isPhaseDurationValid=false;
            errorMassages+="Phase duration out of bound;";
        }

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Phase Id: Required
        if(!isPhaseIdentifierValid){
            validOrNot=false;
        }

        // Phase Duration: Required
        if(!isPhaseDurationValid){
            validOrNot=false;
        }

        return validOrNot;
    }

}
