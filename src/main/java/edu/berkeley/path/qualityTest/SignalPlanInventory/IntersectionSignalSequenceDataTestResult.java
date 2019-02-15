package edu.berkeley.path.qualityTest.SignalPlanInventory;

import org.tmdd._303.messages.IntersectionSignalSequenceData;
import java.util.List;

public class IntersectionSignalSequenceDataTestResult {

    private boolean isRingIdentifierValid;
    private boolean isSequenceDataExist;
    private int maxSequenceData=16;
    private boolean isSequenceDataOutOfBound;
    private String errorMessages;

    // Get functions
    public boolean isRingIdentifierValid() {
        return isRingIdentifierValid;
    }

    public boolean isSequenceDataExist() {
        return isSequenceDataExist;
    }

    public boolean isSequenceDataOutOfBound() {
        return isSequenceDataOutOfBound;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public int getMaxSequenceData() {
        return maxSequenceData;
    }

    // Set functions
    public void setRingIdentifierValid(boolean ringIdentifierValid) {
        isRingIdentifierValid = ringIdentifierValid;
    }

    public void setSequenceDataExist(boolean sequenceDataExist) {
        isSequenceDataExist = sequenceDataExist;
    }

    public void setSequenceDataOutOfBound(boolean sequenceDataOutOfBound) {
        isSequenceDataOutOfBound = sequenceDataOutOfBound;
    }

    public void setMaxSequenceData(int maxSequenceData) {
        this.maxSequenceData = maxSequenceData;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    // Initialization
    public void Initialization(){
        isRingIdentifierValid=true;
        isSequenceDataExist=true;
        isSequenceDataOutOfBound=false;
        errorMessages="";
    }

    // Check each element
    public void Check(IntersectionSignalSequenceData intersectionSignalSequenceData){

        if(intersectionSignalSequenceData.getRingIdentifier()==null){
            errorMessages+="Empty ring identifier;";
            isRingIdentifierValid=false;
        }

        if(intersectionSignalSequenceData.getSequenceData()==null){
            errorMessages+="Empty sequence data;";
            isSequenceDataExist=false;
        }else{
            List<Short> phaseIdentifierList=intersectionSignalSequenceData.getSequenceData().getPhaseIdentifier();
            if(phaseIdentifierList==null){
                errorMessages+="Empty sequence data;";
                isSequenceDataExist=false;
            }else{
                if(phaseIdentifierList.size()>maxSequenceData){
                    errorMessages+="Sequence data is out of bound;";
                    isSequenceDataOutOfBound=true;
                }
            }
        }
    }


}
