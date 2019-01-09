package edu.berkeley.path.qualityTest.SignalInventory;

import org.tmdd._303.messages.IntersectionSignalInventoryPhase;

public class IntersectionSignalInventoryPhaseTestResult {

    private boolean isPhaseIdentifierValid;
    private boolean isCoordinatedPhaseValid;
    private boolean isConcurrentPhasesListExit; // Required by PATH
    private boolean isConcurrentPhasesListOutOfBound; // Size:1...16
    private int maxConcurrentPhaseList=16;
    private String errorMessages;

    // Get functions
    public boolean isPhaseIdentifierValid() {
        return isPhaseIdentifierValid;
    }

    public boolean isCoordinatedPhaseValid() {
        return isCoordinatedPhaseValid;
    }

    public boolean isConcurrentPhasesListExit() {
        return isConcurrentPhasesListExit;
    }

    public boolean isConcurrentPhasesListOutOfBound() {
        return isConcurrentPhasesListOutOfBound;
    }

    public int getMaxConcurrentPhaseList() {
        return maxConcurrentPhaseList;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    // Set functions
    public void setPhaseIdentifierValid(boolean phaseIdentifierValid) {
        isPhaseIdentifierValid = phaseIdentifierValid;
    }

    public void setCoordinatedPhaseValid(boolean coordinatedPhaseValid) {
        isCoordinatedPhaseValid = coordinatedPhaseValid;
    }

    public void setConcurrentPhasesListExit(boolean concurrentPhasesListExit) {
        isConcurrentPhasesListExit = concurrentPhasesListExit;
    }

    public void setConcurrentPhasesListOutOfBound(boolean concurrentPhasesListOutOfBound) {
        isConcurrentPhasesListOutOfBound = concurrentPhasesListOutOfBound;
    }

    public void setMaxConcurrentPhaseList(int maxConcurrentPhaseList) {
        this.maxConcurrentPhaseList = maxConcurrentPhaseList;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isPhaseIdentifierValid=true;
        isCoordinatedPhaseValid=true;
        isConcurrentPhasesListExit=true;
        isConcurrentPhasesListOutOfBound=false;
        errorMessages="";
    }

    // Check each element
    public void Check(IntersectionSignalInventoryPhase intersectionSignalInventoryPhase){

        // Phase Identifier
        if(intersectionSignalInventoryPhase.getPhaseIdentifier()<1 ||
                intersectionSignalInventoryPhase.getPhaseIdentifier()>255){
            isPhaseIdentifierValid=false;
            errorMessages+="Phase identifier invalid;";
        }

        // Coordinated Phase
        if(intersectionSignalInventoryPhase.getCoordinatedPhase()!=0 ||
                intersectionSignalInventoryPhase.getCoordinatedPhase()!=1){
            isCoordinatedPhaseValid=false;
            errorMessages+="Coordinated phase invalid;";
        }

        // Concurrent Phase List
        if(intersectionSignalInventoryPhase.getConcurrentPhasesList()==null){
            isConcurrentPhasesListExit=false;
            errorMessages+="Empty concurrent phase list;";
        }else{
            if(intersectionSignalInventoryPhase.getConcurrentPhasesList().getPhaseIdentifier()==null){
                isConcurrentPhasesListExit=false;
                errorMessages+="Empty concurrent phase list;";
            }
            if(intersectionSignalInventoryPhase.getConcurrentPhasesList().getPhaseIdentifier().size()>maxConcurrentPhaseList){
                isConcurrentPhasesListOutOfBound=true;
                errorMessages+="Concurrent phase list out of bound;";
            }
        }

    }







}
