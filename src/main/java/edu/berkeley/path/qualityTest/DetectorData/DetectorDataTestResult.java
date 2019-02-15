package edu.berkeley.path.qualityTest.DetectorData;

import edu.berkeley.path.qualityTest.DetectorInventory.DetectorInventoryDetailsTestResult;
import org.tmdd._303.messages.DetectorData;
import org.tmdd._303.messages.DetectorDataDetail;

import java.util.ArrayList;
import java.util.List;
public class DetectorDataTestResult {

    private boolean isOrganizationInformationValid;

    private boolean isDetectorDataListExist;
    private boolean isDetectorDataListValid;
    private int maxDetectorDataList=65535;
    private boolean isDetectorDataListOutOfBound;
    private List<DetectorDataDetailTestResult> detectorDataDetailTestResultList;
    private List<Integer> errorMessageIndex;

    // Detector data ext
    private boolean isHubOrgIdValid; // BigInt
    private boolean isHubSensorIdValid; //BigInt
    private boolean isInventoryCheckValid; // Enumerated: pass(1),fail:in inventory but missing data(2), fail:not in inventory (3)
    private boolean isFlowBalanceCheckValid;
    // flow-balance-test-id (big int) & flow-balance-result (enumerated: pass(1),fail(2))
    private boolean isDataValueCheckValid; // Enumerated: pass(1), fail(2)

    private String errorMessages;
    private boolean validOrNot;

    //****************************************************************************************
    // Get functions
    //****************************************************************************************
    public boolean isOrganizationInformationValid() {
        return isOrganizationInformationValid;
    }

    public boolean isDetectorDataListExist() {
        return isDetectorDataListExist;
    }

    public boolean isDetectorDataListValid() {
        return isDetectorDataListValid;
    }

    public boolean isDetectorDataListOutOfBound() {
        return isDetectorDataListOutOfBound;
    }

    public List<DetectorDataDetailTestResult> getDetectorDataDetailTestResultList() {
        return detectorDataDetailTestResultList;
    }

    public List<Integer> getErrorMessageIndex() {
        return errorMessageIndex;
    }

    public boolean isHubOrgIdValid() {
        return isHubOrgIdValid;
    }

    public boolean isHubSensorIdValid() {
        return isHubSensorIdValid;
    }

    public boolean isInventoryCheckValid() {
        return isInventoryCheckValid;
    }

    public boolean isFlowBalanceCheckValid() {
        return isFlowBalanceCheckValid;
    }

    public boolean isDataValueCheckValid() {
        return isDataValueCheckValid;
    }

    public String getErrorMessages() {
        return errorMessages;
    }

    public boolean isValidOrNot() {
        return validOrNot;
    }

    //****************************************************************************************
    // Set functions
    //****************************************************************************************
    public void setOrganizationInformationValid(boolean organizationInformationValid) {
        isOrganizationInformationValid = organizationInformationValid;
    }

    public void setDetectorDataListExist(boolean detectorDataListExist) {
        isDetectorDataListExist = detectorDataListExist;
    }

    public void setDetectorDataListValid(boolean detectorDataListValid) {
        isDetectorDataListValid = detectorDataListValid;
    }

    public void setDetectorDataListOutOfBound(boolean detectorDataListOutOfBound) {
        isDetectorDataListOutOfBound = detectorDataListOutOfBound;
    }

    public void setDetectorDataDetailTestResultList(List<DetectorDataDetailTestResult> detectorDataDetailTestResultList) {
        this.detectorDataDetailTestResultList = detectorDataDetailTestResultList;
    }

    public void setErrorMessageIndex(List<Integer> errorMessageIndex) {
        this.errorMessageIndex = errorMessageIndex;
    }

    public void setHubOrgIdValid(boolean hubOrgIdValid) {
        isHubOrgIdValid = hubOrgIdValid;
    }

    public void setHubSensorIdValid(boolean hubSensorIdValid) {
        isHubSensorIdValid = hubSensorIdValid;
    }

    public void setInventoryCheckValid(boolean inventoryCheckValid) {
        isInventoryCheckValid = inventoryCheckValid;
    }

    public void setFlowBalanceCheckValid(boolean flowBalanceCheckValid) {
        isFlowBalanceCheckValid = flowBalanceCheckValid;
    }

    public void setDataValueCheckValid(boolean dataValueCheckValid) {
        isDataValueCheckValid = dataValueCheckValid;
    }

    //****************************************************************************************
    // Initialization
    //****************************************************************************************
    public void Initialization(){
        isOrganizationInformationValid=true;
        isDetectorDataListExist=true;
        isDetectorDataListValid=true;
        isDetectorDataListOutOfBound=false;
        detectorDataDetailTestResultList=new ArrayList<DetectorDataDetailTestResult>();
        errorMessageIndex=new ArrayList<Integer>();
        isHubOrgIdValid=true;
        isHubSensorIdValid=true;
        isInventoryCheckValid=true;
        isFlowBalanceCheckValid=true;
        isDataValueCheckValid=true;
        errorMessages="";
        validOrNot=true;
    }

    //****************************************************************************************
    // Checking each element
    //****************************************************************************************
    public void Check(DetectorData detectorData){

        // Organization Information: Required
        if(detectorData.getOrganizationInformation()==null){
            isOrganizationInformationValid=false;
            errorMessages+="Empty organization information;";
        }else{
            if(detectorData.getOrganizationInformation().getOrganizationId()==null){
                isOrganizationInformationValid=false;
                errorMessages+="Empty organization ID;";
            }
        }

        // Detector Data List: Required
        if(detectorData.getDetectorDataList()==null){
            isDetectorDataListExist=false;
            errorMessages+="Empty detector data list;";
        }else{
            if(detectorData.getDetectorDataList().getDetectorDataDetail()==null){
                isDetectorDataListExist=false;
                errorMessages+="Empty detector data list;";
            }else{
                List<DetectorDataDetail> detectorDataDetailList=detectorData.getDetectorDataList().getDetectorDataDetail();
                // Check the size
                if(detectorDataDetailList.size()>maxDetectorDataList){
                    isDetectorDataListOutOfBound=true;
                    errorMessages+="Detector data list is out of bound;";
                }
                // Check the list
                for(int i=0;i<detectorDataDetailList.size();i++){
                    DetectorDataDetailTestResult detectorDataDetailTestResult=new DetectorDataDetailTestResult();
                    detectorDataDetailTestResult.Initialization();
                    detectorDataDetailTestResult.Check(detectorDataDetailList.get(i));
                    detectorDataDetailTestResultList.add(detectorDataDetailTestResult);
                    if(detectorDataDetailTestResult.getErrorMessages()!=""){// Not empty error messages
                        errorMessageIndex.add(i);
                    }
                }
                if(errorMessageIndex.size()>0){
                    isDetectorDataListValid=false;
                    errorMessages+="Detector data list contains invalid information;";
                }
            }
        }

        // Detector data ext: Currently do not check these fields
        // isHubOrgIdValid; isHubSensorIdValid; isInventoryCheckValid;  isFlowBalanceCheckValid;
        // flow-balance-test-id (big int); isDataValueCheckValid;

        if(errorMessages!=""){ // Contain error messages
            validOrNot=false;
        }
    }

}
