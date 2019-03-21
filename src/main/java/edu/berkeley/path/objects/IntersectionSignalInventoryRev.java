package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalInventory;

import java.util.Date;

public class IntersectionSignalInventoryRev {

    // Keys for intersection signal inventory
    private String organizationId;
    private String deviceId;
    private Date lastUpdateTime;

    // The main body of intersection signal inventory
    private IntersectionSignalInventory intersectionSignalInventory;

    public IntersectionSignalInventoryRev(String _organizationId,String _deviceId, Date _lastUpdateTime,
                                          IntersectionSignalInventory _intersectionSignalInventory){
        this.organizationId=_organizationId;
        this.deviceId=_deviceId;
        this.lastUpdateTime=_lastUpdateTime;
        this.intersectionSignalInventory=_intersectionSignalInventory;
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

    public IntersectionSignalInventory getIntersectionSignalInventory() {
        return intersectionSignalInventory;
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

    public void setIntersectionSignalInventory(IntersectionSignalInventory intersectionSignalInventory) {
        this.intersectionSignalInventory = intersectionSignalInventory;
    }

}
