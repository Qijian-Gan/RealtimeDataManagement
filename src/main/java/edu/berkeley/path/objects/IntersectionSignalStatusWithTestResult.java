package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalStatus.IntersectionSignalStatusTestResult;
import org.tmdd._303.messages.IntersectionSignalStatus;

public class IntersectionSignalStatusWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private IntersectionSignalStatus message;
    private IntersectionSignalStatusTestResult testResult;

    public IntersectionSignalStatusWithTestResult(String _organizationId,int _stationId,long _receivedTime,IntersectionSignalStatus _message
            , IntersectionSignalStatusTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalStatus getMessage() {
        return message;
    }

    public IntersectionSignalStatusTestResult getTestResult() {
        return testResult;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public int getStationId() {
        return stationId;
    }

    public long getReceivedTime() {
        return receivedTime;
    }

    // Set functions
    public void setMessage(IntersectionSignalStatus message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalStatusTestResult testResult) {
        this.testResult = testResult;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setReceivedTime(long receivedTime) {
        this.receivedTime = receivedTime;
    }
}
