package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalRing;

public class IntersectionSignalRingTestResult {

    private boolean isRingIdentifierValid;
    private boolean isRingPhaseAssignmentExist;
    private boolean isRingPhaseAssignmentOutOfBound;
    private int maxRingPhaseAssignment=16;
    private String errorMessages;

    // Get functions
    public boolean isRingIdentifierValid() {
        return isRingIdentifierValid;
    }

    public boolean isRingPhaseAssignmentExist() {
        return isRingPhaseAssignmentExist;
    }

    public boolean isRingPhaseAssignmentOutOfBound() {
        return isRingPhaseAssignmentOutOfBound;
    }

    public int getMaxRingPhaseAssignment() {
        return maxRingPhaseAssignment;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setRingIdentifierValid(boolean ringIdentifierValid) {
        isRingIdentifierValid = ringIdentifierValid;
    }

    public void setRingPhaseAssignmentExist(boolean ringPhaseAssignmentExist) {
        isRingPhaseAssignmentExist = ringPhaseAssignmentExist;
    }

    public void setRingPhaseAssignmentOutOfBound(boolean ringPhaseAssignmentOutOfBound) {
        isRingPhaseAssignmentOutOfBound = ringPhaseAssignmentOutOfBound;
    }

    public void setMaxRingPhaseAssignment(int maxRingPhaseAssignment) {
        this.maxRingPhaseAssignment = maxRingPhaseAssignment;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isRingIdentifierValid=true;
        isRingPhaseAssignmentExist=true;
        isRingPhaseAssignmentOutOfBound=false;
        errorMessages="";
    }

    // Check each element
    public void Check(IntersectionSignalRing intersectionSignalRing){

        // Ring Identifier
        if(intersectionSignalRing.getRingIdentifier()==null){
            isRingIdentifierValid=false;
            errorMessages+="Empty ring identifier;";
        }

        // Ring Phase Assignment
        if(intersectionSignalRing.getRingPhaseAssignment()==null){
            isRingPhaseAssignmentExist=false;
            errorMessages+="Empty ring phase assignment;";
        }else{
            if(intersectionSignalRing.getRingPhaseAssignment().getRingPhaseIdentifier()==null){
                isRingPhaseAssignmentExist=false;
                errorMessages+="Empty ring phase assignment;";
            }
            if(intersectionSignalRing.getRingPhaseAssignment().getRingPhaseIdentifier().size()>maxRingPhaseAssignment){
                isRingPhaseAssignmentOutOfBound=true;
                errorMessages+="Ring phase assignment out of bound;";
            }
        }
    }

}
