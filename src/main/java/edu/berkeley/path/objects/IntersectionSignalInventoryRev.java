package edu.berkeley.path.objects;

import org.tmdd._303.messages.IntersectionSignalInventory;

public class IntersectionSignalInventoryRev {

    // Keys for intersection signal inventory
    private String organizationId;
    private String deviceId;
    private String date;
    private String time;

    // The main body of intersection signal inventory
    private IntersectionSignalInventory intersectionSignalInventory;

    public IntersectionSignalInventoryRev(String _organizationId,String _deviceId, String _date, String _time,
                                          IntersectionSignalInventory _intersectionSignalInventory){
        this.organizationId=_organizationId;
        this.deviceId=_deviceId;
        this.date=_date;
        this.time=_time;
        this.intersectionSignalInventory=_intersectionSignalInventory;
    }

    // Get functions
    public String getOrganizationId() {
        return organizationId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
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

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setIntersectionSignalInventory(IntersectionSignalInventory intersectionSignalInventory) {
        this.intersectionSignalInventory = intersectionSignalInventory;
    }

}
