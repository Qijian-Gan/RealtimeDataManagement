package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalStatus;

import java.util.Date;

public class IntersectionSignalStatusRev {

    // Keys for intersection signal inventory
    private String organizationId;
    private String deviceId;
    private Date lastUpdateTime;

    // The main body of intersection signal status
    IntersectionSignalStatus intersectionSignalStatus;

    public IntersectionSignalStatusRev(String _organizationId, String _deviceId, Date _lastUpdateTime,
                                       IntersectionSignalStatus _intersectionSignalStatus){
        this.organizationId=_organizationId;
        this.deviceId=_deviceId;
        this.lastUpdateTime=_lastUpdateTime;
        this.intersectionSignalStatus=_intersectionSignalStatus;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public IntersectionSignalStatus getIntersectionSignalStatus() {
        return intersectionSignalStatus;
    }

    // Set functions
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setIntersectionSignalStatus(IntersectionSignalStatus intersectionSignalStatus) {
        this.intersectionSignalStatus = intersectionSignalStatus;
    }
}
