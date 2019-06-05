package edu.berkeley.path.objects;

import edu.berkeley.path.qualityTest.SignalControlSchedule.IntersectionSignalControlScheduleTestResult;
import org.tmdd._303.messages.IntersectionSignalControlSchedule;

public class IntersectionSignalControlScheduleWithTestResult {

    private String organizationId;
    private int stationId;
    private long receivedTime;
    private IntersectionSignalControlSchedule message;
    private IntersectionSignalControlScheduleTestResult testResult;

    public IntersectionSignalControlScheduleWithTestResult(String _organizationId,int _stationId,long _receivedTime,IntersectionSignalControlSchedule _message,IntersectionSignalControlScheduleTestResult _testResult){
        this.organizationId=_organizationId;
        this.stationId=_stationId;
        this.receivedTime=_receivedTime;
        this.message=_message;
        this.testResult=_testResult;
    }

    // Get functions
    public IntersectionSignalControlSchedule getMessage() {
        return message;
    }

    public IntersectionSignalControlScheduleTestResult getTestResult() {
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
    public void setMessage(IntersectionSignalControlSchedule message) {
        this.message = message;
    }

    public void setTestResult(IntersectionSignalControlScheduleTestResult testResult) {
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
