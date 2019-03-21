package edu.berkeley.path.qualityTest.SignalStatus;

import org.tmdd._303.messages.IntersectionSignalPhaseStatusGroup;

public class IntersectionSignalPhaseStatusGroupTestResult {

    private boolean isPhaseStatusGroupNumberValid; // CC required
    private boolean isPhaseStatusGroupGreensValid; // CC required

    private boolean isPhaseStatusGroupYellowsValid; // Required when applicable
    private boolean isPhaseStatusGroupRedsValid; // Required when applicable
    private boolean isPhaseStatusGroupRightOnRedProhibValid;// Required when applicable, extension

    private boolean isPhaseStatusGroupWalksValid; // Not required
    private boolean isPhaseStatusGroupPedclearsValid; // Not required
    private boolean isPhaseStatusGroupDontwalksValid; // Not required

    private String errorMessages;
    private boolean validOrNot;

    // Get functions
    public boolean isPhaseStatusGroupNumberValid() {
        return isPhaseStatusGroupNumberValid;
    }

    public boolean isPhaseStatusGroupGreensValid() {
        return isPhaseStatusGroupGreensValid;
    }

    public boolean isPhaseStatusGroupYellowsValid() {
        return isPhaseStatusGroupYellowsValid;
    }

    public boolean isPhaseStatusGroupRedsValid() {
        return isPhaseStatusGroupRedsValid;
    }

    public boolean isPhaseStatusGroupRightOnRedProhibValid() {
        return isPhaseStatusGroupRightOnRedProhibValid;
    }

    public boolean isPhaseStatusGroupWalksValid() {
        return isPhaseStatusGroupWalksValid;
    }

    public boolean isPhaseStatusGroupPedclearsValid() {
        return isPhaseStatusGroupPedclearsValid;
    }

    public boolean isPhaseStatusGroupDontwalksValid() {
        return isPhaseStatusGroupDontwalksValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    // Set functions
    public void setPhaseStatusGroupNumberValid(boolean phaseStatusGroupNumberValid) {
        isPhaseStatusGroupNumberValid = phaseStatusGroupNumberValid;
    }

    public void setPhaseStatusGroupGreensValid(boolean phaseStatusGroupGreensValid) {
        isPhaseStatusGroupGreensValid = phaseStatusGroupGreensValid;
    }

    public void setPhaseStatusGroupYellowsValid(boolean phaseStatusGroupYellowsValid) {
        isPhaseStatusGroupYellowsValid = phaseStatusGroupYellowsValid;
    }

    public void setPhaseStatusGroupRedsValid(boolean phaseStatusGroupRedsValid) {
        isPhaseStatusGroupRedsValid = phaseStatusGroupRedsValid;
    }

    public void setPhaseStatusGroupRightOnRedProhibValid(boolean phaseStatusGroupRightOnRedProhibValid) {
        isPhaseStatusGroupRightOnRedProhibValid = phaseStatusGroupRightOnRedProhibValid;
    }

    public void setPhaseStatusGroupWalksValid(boolean phaseStatusGroupWalksValid) {
        isPhaseStatusGroupWalksValid = phaseStatusGroupWalksValid;
    }

    public void setPhaseStatusGroupPedclearsValid(boolean phaseStatusGroupPedclearsValid) {
        isPhaseStatusGroupPedclearsValid = phaseStatusGroupPedclearsValid;
    }

    public void setPhaseStatusGroupDontwalksValid(boolean phaseStatusGroupDontwalksValid) {
        isPhaseStatusGroupDontwalksValid = phaseStatusGroupDontwalksValid;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
    }

    // Initialization
    public void Initialization(){
        isPhaseStatusGroupNumberValid=true;
        isPhaseStatusGroupGreensValid=true;
        isPhaseStatusGroupYellowsValid=true;
        isPhaseStatusGroupRedsValid=true;
        isPhaseStatusGroupRightOnRedProhibValid=true;
        isPhaseStatusGroupWalksValid=true;
        isPhaseStatusGroupPedclearsValid=true;
        isPhaseStatusGroupDontwalksValid=true;
        errorMessages="";
        validOrNot=true;
    }

    // Check each element
    public void Check(IntersectionSignalPhaseStatusGroup intersectionSignalPhaseStatusGroup){

        // Phase Status Group Number
        if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupNumber()<1 ||
        intersectionSignalPhaseStatusGroup.getPhaseStatusGroupNumber()>255){
            isPhaseStatusGroupNumberValid=false;
            errorMessages+="Phase status group number is out of bound;";
        }

        // Phase Status Group Greens
        if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupGreens()<0 ||
        intersectionSignalPhaseStatusGroup.getPhaseStatusGroupGreens()>255){
            isPhaseStatusGroupGreensValid=false;
            errorMessages+="Phase status group greens is out of bound;";
        }

        // Phase Status Group Yellows
        if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupYellows()==null){
            isPhaseStatusGroupYellowsValid = false;
            errorMessages += "Phase status group yellows is empty;";
        }else{
            if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupYellows()<0||
                    intersectionSignalPhaseStatusGroup.getPhaseStatusGroupYellows()>255) {
                isPhaseStatusGroupYellowsValid = false;
                errorMessages += "Phase status group yellows is out of bound;";
            }
        }

        // Phase Status Group Reds
        if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupReds()==null){
            isPhaseStatusGroupRedsValid=false;
            errorMessages+="Phase status group reds is empty;";
        }else{
            if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupReds()<0||
                    intersectionSignalPhaseStatusGroup.getPhaseStatusGroupReds()>255){
                isPhaseStatusGroupRedsValid=false;
                errorMessages+="Phase status group reds is out of bound;";
            }
        }

        // Phase Status Group Right On Red Prohib: extension, not available in TMDD documents
        if(intersectionSignalPhaseStatusGroup.getPhaseStatusGroupRightOnRedProhib()==null){
            isPhaseStatusGroupRightOnRedProhibValid=false;
            errorMessages+="Phase status group right on red prohib is empty;";
        }else {
            if (intersectionSignalPhaseStatusGroup.getPhaseStatusGroupRightOnRedProhib() < 0 ||
                    intersectionSignalPhaseStatusGroup.getPhaseStatusGroupRightOnRedProhib() > 255) {
                isPhaseStatusGroupRightOnRedProhibValid = false;
                errorMessages += "Phase status group right on red prohib is out of bound;";
            }
        }

        // Do not check the following attributes
        // Phase-Status-Group-Walks, Phase-Status-Group-Pedclears, Phase-Status-Group-Dontwalks

        // Assessment
        validOrNot=assessmentValidOrNot();

    }

    // Assessment
    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Group Number: Required
        if(!isPhaseStatusGroupNumberValid){
            validOrNot=false;
        }

        // Greens: Required
        if(!isPhaseStatusGroupGreensValid){
            validOrNot=false;
        }

        // Yellows: Required when applicable
        if(!isPhaseStatusGroupYellowsValid){
            validOrNot=false;
        }

        // Reds: Required when applicable
        if(!isPhaseStatusGroupRedsValid){
            validOrNot=false;
        }

        // Phase status group right on red prohib: Extension; Required when applicable
        // Currently do not check this field

        return validOrNot;
    }

}
