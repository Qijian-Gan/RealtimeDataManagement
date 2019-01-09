package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalOverlapPhase;

public class IntersectionSignalOverlapPhaseTestResult {

    private boolean isOverlapIdentifierValid;
    private boolean isOverlapIncludedPhasesExist;
    private boolean isOverlapIncludedPhasesOutOfBound;
    private int maxOverlapIncludedPhases=8;
    private String errorMessages;

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

    // Initialization
    public void Initialization(){
        isOverlapIdentifierValid=true;
        isOverlapIncludedPhasesExist=true;
        isOverlapIncludedPhasesOutOfBound=false;
        errorMessages="";
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

            if(intersectionSignalOverlapPhase.getOverlapIncludedPhases().getPhaseIdentifier().size()>maxOverlapIncludedPhases){
                isOverlapIncludedPhasesOutOfBound=true;
                errorMessages+="Overlap included phases out of bound;";
            }
        }
    }

}
