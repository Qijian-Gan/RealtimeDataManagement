package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalPlanInventory.IntersectionSignalTimingPatternInventoryTestResult;
import org.tmdd._303.messages.IntersectionSignalTimingPatternInventory;

public class IntersectionSignalTimingPatternInventoryWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private IntersectionSignalTimingPatternInventory message;
    private IntersectionSignalTimingPatternInventoryTestResult testResult;

    public IntersectionSignalTimingPatternInventoryWithTestResult(String _organizationId,int _stationId,long _receivedTime, IntersectionSignalTimingPatternInventory _message,
                                                                  IntersectionSignalTimingPatternInventoryTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalTimingPatternInventory getMessage() {
        return message;
    }

    public IntersectionSignalTimingPatternInventoryTestResult getTestResult() {
        return testResult;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    public int getStationId() {
        return stationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    // Set functions
    public void setMessage(IntersectionSignalTimingPatternInventory message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalTimingPatternInventoryTestResult testResult) {
        this.testResult = testResult;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
