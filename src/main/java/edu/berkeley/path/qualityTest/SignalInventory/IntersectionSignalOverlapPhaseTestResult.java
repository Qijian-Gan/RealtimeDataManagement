package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalOverlapPhase;

public class IntersectionSignalOverlapPhaseTestResult {

    private boolean isOverlapIdentifierValid; // Phase Id
    private boolean isOverlapIncludedPhasesExist; // Included Phases
    private boolean isOverlapIncludedPhasesOutOfBound;
    private int maxOverlapIncludedPhases=8;
    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isOverlapIdentifierValid() {
        return isOverlapIdentifierValid;
    }

    public boolean isOverlapIncludedPhasesExist() {
        return isOverlapIncludedPhasesExist;
    }

    public boolean isOverlapIncludedPhasesOutOfBound() {
        return isOverlapIncludedPhasesOutOfBound;
    }

    public int getMaxOverlapIncludedPhases() {
        return maxOverlapIncludedPhases;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setOverlapIdentifierValid(boolean overlapIdentifierValid) {
        isOverlapIdentifierValid = overlapIdentifierValid;
    }

    public void setOverlapIncludedPhasesExist(boolean overlapIncludedPhasesExist) {
        isOverlapIncludedPhasesExist = overlapIncludedPhasesExist;
    }

    public void setOverlapIncludedPhasesOutOfBound(boolean overlapIncludedPhasesOutOfBound) {
        isOverlapIncludedPhasesOutOfBound = overlapIncludedPhasesOutOfBound;
    }

    public void setMaxOverlapIncludedPhases(int maxOverlapIncludedPhases) {
        this.maxOverlapIncludedPhases = maxOverlapIncludedPhases;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isOverlapIdentifierValid=true;
        isOverlapIncludedPhasesExist=true;
        isOverlapIncludedPhasesOutOfBound=false;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalOverlapPhase intersectionSignalOverlapPhase){

        // Overlap Identifier
        if(intersectionSignalOverlapPhase.getOverlapIdentifier()<1 ||
                intersectionSignalOverlapPhase.getOverlapIdentifier()>255){
            isOverlapIdentifierValid=false;
            errorMessages+="Overlap identifier invalid;";
        }

        // Overlap Included Phases
        if(intersectionSignalOverlapPhase.getOverlapIncludedPhases()==null){
            isOverlapIncludedPhasesExist=false;
            errorMessages+="Empty overlap included phases;";
        }else{
            if(intersectionSignalOverlapPhase.getOverlapIncludedPhases().getPhaseIdentifier()==null){
                isOverlapIncludedPhasesExist=false;
                errorMessages+="Empty overlap included phases;";
            }

            if(intersectionSignalOverlapPhase.getOverlapIncludedPhases().getPhaseIdentifier().size()
                    >maxOverlapIncludedPhases){
                isOverlapIncludedPhasesOutOfBound=true;
                errorMessages+="Overlap included phases out of bound;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Overlap Identifier
        if(!isOverlapIdentifierValid){
            validOrNot=false;
        }

        // Overlap Included Phases
        if(!isOverlapIncludedPhasesExist || isOverlapIncludedPhasesOutOfBound){
            validOrNot=false;
        }

        return validOrNot;
    }

}
