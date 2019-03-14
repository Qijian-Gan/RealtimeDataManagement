package edu.berkeley.path.qualityTest.SignalStatus;

import org.tmdd._303.messages.IntersectionSignalRingStatus;

public class IntersectionSignalRingStatusTestResult {

    private boolean isRingIdentifierValid;
    private boolean isRingStatusValid;
    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isRingIdentifierValid() {
        return isRingIdentifierValid;
    }

    public boolean isRingStatusValid() {
        return isRingStatusValid;
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

    public void setRingStatusValid(boolean ringStatusValid) {
        isRingStatusValid = ringStatusValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        this.isRingIdentifierValid=true;
        this.isRingStatusValid=true;
        this.errorMessages="";
        this.validOrNot=true;
    }

    // Checking each element
    public void Check(IntersectionSignalRingStatus intersectionSignalRingStatus){

        if(intersectionSignalRingStatus.getRingIdentifier()==null){
            isRingIdentifierValid=false;
            errorMessages+="Empty ring identifier;";
        }

        if(intersectionSignalRingStatus.getRingStatus()<0 || intersectionSignalRingStatus.getRingStatus()>255){
            isRingStatusValid=false;
            errorMessages+="Ring status out of bound;";
        }

        validOrNot=assessmentValidOrNot();
    }

    // Assessment
    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Ring Id: Required
        if(!isRingIdentifierValid){
            validOrNot=false;
        }

        // Ring Status: Required
        if(!isRingStatusValid){
            validOrNot=false;
        }

        return validOrNot;
    }

}
