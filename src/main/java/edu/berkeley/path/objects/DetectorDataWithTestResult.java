package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorData.DetectorDataTestResult;
import org.tmdd._303.messages.DetectorData;

public class DetectorDataWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private DetectorData message;
    private DetectorDataTestResult testResult;

    public DetectorDataWithTestResult(String _organizationId,int _stationId,long _receivedTime,DetectorData _message, DetectorDataTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorData getMessage() {
        return message;
    }

    public DetectorDataTestResult getTestResult() {
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
    public void setMessage(DetectorData message) {
        this.message = message;
    }

    public void setTestResult(DetectorDataTestResult testResult) {
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
