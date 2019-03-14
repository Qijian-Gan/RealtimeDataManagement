package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalRing;

public class IntersectionSignalRingTestResult {

    private boolean isRingIdentifierValid; // Ring Id

    private boolean isRingPhaseAssignmentExist; // Ring Assignment
    private boolean isRingPhaseAssignmentOutOfBound;
    private int maxRingPhaseAssignment=16;
    private String errorMessages;
    private boolean validOrNot;

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

    public boolean isValidOrNot() {
        return validOrNot;
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

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isRingIdentifierValid=true;
        isRingPhaseAssignmentExist=true;
        isRingPhaseAssignmentOutOfBound=false;
        errorMessages="";
        validOrNot=true;
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

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Ring Id
        if(!isRingIdentifierValid){
            validOrNot=false;
        }

        // Ring Phase Assignment
        if(!isRingPhaseAssignmentExist || isRingPhaseAssignmentOutOfBound){
            validOrNot=false;
        }

        return validOrNot;
    }

}
