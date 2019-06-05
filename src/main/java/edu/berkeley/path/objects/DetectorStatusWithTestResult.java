package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.DetectorStatus.DetectorStatusTestResult;
import org.tmdd._303.messages.DetectorStatus;

public class DetectorStatusWithTestResult {

    private String organizationId;
    private int deviceId;
    private long receivedTime;
    private DetectorStatus message;
    private DetectorStatusTestResult testResult;

    public DetectorStatusWithTestResult(String _organizationId,int _deviceId,long _receivedTime,DetectorStatus _message,DetectorStatusTestResult _testResult){
        this.organizationId=_organizationId;
        this.deviceId=_deviceId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public DetectorStatus getMessage() {
        return message;
    }

    public DetectorStatusTestResult getTestResult() {
        return testResult;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    // Set functions
    public void setMessage(DetectorStatus message) {
        this.message = message;
    }

    public void setTestResult(DetectorStatusTestResult testResult) {
        this.testResult = testResult;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
