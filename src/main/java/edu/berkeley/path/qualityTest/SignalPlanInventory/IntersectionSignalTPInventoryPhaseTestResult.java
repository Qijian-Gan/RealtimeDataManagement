package edu.berkeley.path.qualityTest.SignalPlanInventory;

import org.tmdd._303.messages.IntersectionSignalTPInventoryPhase;

public class IntersectionSignalTPInventoryPhaseTestResult {

    private boolean isPhaseIdentifierValid;
    private boolean isCoordinatedPhaseValid;
    private boolean isSplitModeValid;
    private boolean isPhaseSplitValid;
    private boolean isMaximumGreenDurationValid; // Required by PATH
    private boolean isMinimumGreenDurationValid; // Required by PATH
    private boolean isVehicleClearanceDurationValid; // Required by PATH
    private boolean isVehicleRedDurationValid; // Required by PATH
    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isPhaseIdentifierValid() {
        return isPhaseIdentifierValid;
    }

    public boolean isCoordinatedPhaseValid() {
        return isCoordinatedPhaseValid;
    }

    public boolean isSplitModeValid() {
        return isSplitModeValid;
    }

    public boolean isPhaseSplitValid() {
        return isPhaseSplitValid;
    }

    public boolean isMaximumGreenDurationValid() {
        return isMaximumGreenDurationValid;
    }

    public boolean isMinimumGreenDurationValid() {
        return isMinimumGreenDurationValid;
    }

    public boolean isVehicleClearanceDurationValid() {
        return isVehicleClearanceDurationValid;
    }

    public boolean isVehicleRedDurationValid() {
        return isVehicleRedDurationValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setPhaseIdentifierValid(boolean phaseIdentifierValid) {
        isPhaseIdentifierValid = phaseIdentifierValid;
    }

    public void setCoordinatedPhaseValid(boolean coordinatedPhaseValid) {
        isCoordinatedPhaseValid = coordinatedPhaseValid;
    }

    public void setSplitModeValid(boolean splitModeValid) {
        isSplitModeValid = splitModeValid;
    }

    public void setPhaseSplitValid(boolean phaseSplitValid) {
        isPhaseSplitValid = phaseSplitValid;
    }

    public void setMaximumGreenDurationValid(boolean maximumGreenDurationValid) {
        isMaximumGreenDurationValid = maximumGreenDurationValid;
    }

    public void setMinimumGreenDurationValid(boolean minimumGreenDurationValid) {
        isMinimumGreenDurationValid = minimumGreenDurationValid;
    }

    public void setVehicleClearanceDurationValid(boolean vehicleClearanceDurationValid) {
        isVehicleClearanceDurationValid = vehicleClearanceDurationValid;
    }

    public void setVehicleRedDurationValid(boolean vehicleRedDurationValid) {
        isVehicleRedDurationValid = vehicleRedDurationValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isPhaseIdentifierValid=true;
        isCoordinatedPhaseValid=true;
        isSplitModeValid=true;
        isPhaseSplitValid=true;
        isMaximumGreenDurationValid=true;
        isMinimumGreenDurationValid=true;
        isVehicleClearanceDurationValid=true;
        isVehicleRedDurationValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalTPInventoryPhase intersectionSignalTPInventoryPhase){

        // Phase Identifier
        if(intersectionSignalTPInventoryPhase.getPhaseIdentifier()<0 ||
                intersectionSignalTPInventoryPhase.getPhaseIdentifier()>255){
            isPhaseIdentifierValid=false;
            errorMessages+="Phase identifier is invalid;";
        }

        // Coordinated Phase
        if(intersectionSignalTPInventoryPhase.getCoordinatedPhase()!=0 ||
                intersectionSignalTPInventoryPhase.getCoordinatedPhase()!=1){
            isCoordinatedPhaseValid=false;
            errorMessages+="Coordinated phase is invalid;";
        }

        // Split Mode
        if (intersectionSignalTPInventoryPhase.getSplitMode() == null) {
            isSplitModeValid = false;
            errorMessages += "Empty split mode;";
        }

        // Phase Split
        if(intersectionSignalTPInventoryPhase.getPhaseSplit()<0 ||intersectionSignalTPInventoryPhase.getPhaseSplit()>255){
            isPhaseSplitValid=false;
            errorMessages+="Phase split is invalid;";
        }

        // Maximum green duration
        if(intersectionSignalTPInventoryPhase.getMaximumGreenDuration()==null){
            isMaximumGreenDurationValid = false;
            errorMessages += "Maximum green duration is empty;";
        }else {
            if (intersectionSignalTPInventoryPhase.getMaximumGreenDuration() < 0 ||
                    intersectionSignalTPInventoryPhase.getMaximumGreenDuration() > 3600) {
                isMaximumGreenDurationValid = false;
                errorMessages += "Maximum green duration is invalid;";
            }
        }

        // Minimum green duration
        if(intersectionSignalTPInventoryPhase.getMinimumGreenDuration()==null){
            isMinimumGreenDurationValid = false;
            errorMessages += "Minimum green duration is empty;";
        }else {
            if (intersectionSignalTPInventoryPhase.getMinimumGreenDuration() < 0 ||
                    intersectionSignalTPInventoryPhase.getMinimumGreenDuration() > 3600) {
                isMinimumGreenDurationValid = false;
                errorMessages += "Minimum green duration is invalid;";
            }
        }

        // Vehicle Clearance Duration
        if(intersectionSignalTPInventoryPhase.getVehicleClearanceDuration()==null){
            isVehicleClearanceDurationValid = false;
            errorMessages += "Vehicle clearance duration is empty;";
        }else {
            if (intersectionSignalTPInventoryPhase.getVehicleClearanceDuration() < 0 ||
                    intersectionSignalTPInventoryPhase.getVehicleClearanceDuration() > 3600) {
                isVehicleClearanceDurationValid = false;
                errorMessages += "Vehicle clearance duration is invalid;";
            }
        }

        // Vehicle Red Duration
        if(intersectionSignalTPInventoryPhase.getVehicleRedDuration()==null){
            isVehicleRedDurationValid = false;
            errorMessages += "Vehicle red duration is empty;";
        }else {
            if (intersectionSignalTPInventoryPhase.getVehicleRedDuration() < 0 ||
                    intersectionSignalTPInventoryPhase.getVehicleRedDuration() > 3600) {
                isVehicleRedDurationValid = false;
                errorMessages += "Vehicle red duration is invalid;";
            }
        }

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Phase Identifier
        if(!isPhaseIdentifierValid){
            validOrNot=false;
        }

        // Coordinated Phase
        if(!isCoordinatedPhaseValid){
            validOrNot=false;
        }

        // Split Mode
        if(!isSplitModeValid){
            validOrNot=false;
        }

        // Phase Split
        if(!isPhaseSplitValid){
            validOrNot=false;
        }

        // Maximum Green Duration
        if(!isMaximumGreenDurationValid){
            validOrNot=false;
        }

        // Minimum Green Duration
        if(!isMinimumGreenDurationValid){
            validOrNot=false;
        }

        // Vehicle Clearance Duration
        if(!isVehicleClearanceDurationValid){
            validOrNot=false;
        }

        // Vehicle Red Duration
        if(!isVehicleRedDurationValid){
            validOrNot=false;
        }

        return validOrNot;
    }

}
