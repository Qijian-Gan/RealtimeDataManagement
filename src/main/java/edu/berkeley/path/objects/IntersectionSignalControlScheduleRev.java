package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalControlSchedule;

public class IntersectionSignalControlScheduleRev {

    private String organizationId;
    private int deviceId;
    private long lastUpdateTime;
    private int timingPatternId;
    private IntersectionSignalControlSchedule intersectionSignalControlSchedule;

    public IntersectionSignalControlScheduleRev(String _organizationId,int _deviceId,long _lastUpdateTime
            ,int _timingPatternId,IntersectionSignalControlSchedule _intersectionSignalControlSchedule){
        this.organizationId=_organizationId;
        this.deviceId=_deviceId;
        this.timingPatternId=_timingPatternId;
        this.intersectionSignalControlSchedule=_intersectionSignalControlSchedule;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public int getTimingPatternId() {
        return timingPatternId;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public IntersectionSignalControlSchedule getIntersectionSignalControlSchedule() {
        return intersectionSignalControlSchedule;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public void setTimingPatternId(int timingPatternId) {
        this.timingPatternId = timingPatternId;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setIntersectionSignalControlSchedule(IntersectionSignalControlSchedule intersectionSignalControlSchedule) {
        this.intersectionSignalControlSchedule = intersectionSignalControlSchedule;
    }

}
