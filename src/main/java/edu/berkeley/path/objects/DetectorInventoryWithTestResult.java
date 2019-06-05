package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorInventory.DetectorInventoryTestResult;
import org.tmdd._303.messages.DetectorInventory;

public class DetectorInventoryWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private DetectorInventory message;
    private DetectorInventoryTestResult testResult;

    public DetectorInventoryWithTestResult(String _organizationId,int _stationId,long _receivedTime,DetectorInventory _message, DetectorInventoryTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorInventory getMessage() {
        return message;
    }

    public DetectorInventoryTestResult getTestResult() {
        return testResult;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    public int getStationId() {
        return stationId;
    }

    // Set functions
    public void setMessage(DetectorInventory message) {
        this.message = message;
    }

    public void setTestResult(DetectorInventoryTestResult testResult) {
        this.testResult = testResult;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }
}
