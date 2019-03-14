package edu.berkeley.path.qualityTest.DetectorData;

import org.tmdd._303.messages.DetectorData;
import org.tmdd._303.messages.DetectorDataDetail;

import java.util.ArrayList;
import java.util.List;
public class DetectorDataTestResult {

    // Organization Information
    private boolean isOrganizationInformationValid;

    // Detector Data List
    private boolean isDetectorDataListExist;
    private boolean isDetectorDataListValid;
    private int maxDetectorDataList=65535;
    private boolean isDetectorDataListOutOfBound;
    private List<DetectorDataDetailTestResult> detectorDataDetailTestResultList;
    private List<Integer> errorMessageIndex;

    // Detector Data Ext
    private boolean isDetectorDataExtValid;

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

    public int getMaxDetectorDataList() {
        return maxDetectorDataList;
    }

    public boolean isDetectorDataExtValid() {
        return isDetectorDataExtValid;
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

    public void setDetectorDataExtValid(boolean detectorDataExtValid) {
        isDetectorDataExtValid = detectorDataExtValid;
    }

    public void setMaxDetectorDataList(int maxDetectorDataList) {
        this.maxDetectorDataList = maxDetectorDataList;
    }

    public void setErrorMessages(String errorMessages) {
        this.errorMessages = errorMessages;
    }

    public void setValidOrNot(boolean validOrNot) {
        this.validOrNot = validOrNot;
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
        isDetectorDataExtValid=true;
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
                    if(!detectorDataDetailTestResult.isValidOrNot()){// Not empty error messages
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

        // Assessment
        validOrNot=assessmentValidOrNot();
    }

    private boolean assessmentValidOrNot(){

        boolean validOrNot=true;

        // Organization Information
        if(!isOrganizationInformationValid){
            validOrNot=false;
        }

        // Detector Data List
        if(!isDetectorDataListExist || !isDetectorDataListValid ||isDetectorDataListOutOfBound){
            validOrNot=false;
        }

        // Detector Data Ext
        // Currently do not check this field

        return validOrNot;
    }

}
