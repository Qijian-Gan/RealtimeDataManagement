package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalInventory.IntersectionSignalInventoryTestResult;
import org.tmdd._303.messages.IntersectionSignalInventory;

public class IntersectionSignalInventoryWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private IntersectionSignalInventory message;
    private IntersectionSignalInventoryTestResult testResult;

    public IntersectionSignalInventoryWithTestResult(String _organizationId,int _stationId,long _receivedTime,IntersectionSignalInventory _message,IntersectionSignalInventoryTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalInventory getMessage() {
        return message;
    }

    public IntersectionSignalInventoryTestResult getTestResult() {
        return testResult;
    }

    public int getStationId() {
        return stationId;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    // Set functions
    public void setMessage(IntersectionSignalInventory message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalInventoryTestResult testResult) {
        this.testResult = testResult;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
