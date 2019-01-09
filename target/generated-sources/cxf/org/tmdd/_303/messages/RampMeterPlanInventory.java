
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RampMeter&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RampMeterPlanInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterPlanInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="meter-plan" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="meter-level" type="{http://www.ntcip.org/c2f-object-references}RmcMeteringLevel"/&gt;
 *         &lt;element name="meter-rate" type="{http://www.ntcip.org/c2f-object-references}RmcMeteringRate"/&gt;
 *         &lt;element name="flow-rate-threshhold" type="{http://www.ntcip.org/c2f-object-references}RmcFlowRateThreshold"/&gt;
 *         &lt;element name="occupancy-threshhold" type="{http://www.ntcip.org/c2f-object-references}RmcOccupancyThreshold"/&gt;
 *         &lt;element name="speed-threshhold" type="{http://www.ntcip.org/c2f-object-references}RmcSpeedThreshold"/&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RampMeterPlanInventory", propOrder = {
    "restrictions",
    "organizationInformation",
    "deviceId",
    "meterPlan",
    "meterLevel",
    "meterRate",
    "flowRateThreshhold",
    "occupancyThreshhold",
    "speedThreshhold",
    "lastUpdateTime",
    "any"
})
public class RampMeterPlanInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "device-id", required = true)
    protected String deviceId;
    @XmlElement(name = "meter-plan", required = true)
    protected String meterPlan;
    @XmlElement(name = "meter-level")
    @XmlSchemaType(name = "unsignedByte")
    protected short meterLevel;
    @XmlElement(name = "meter-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected int meterRate;
    @XmlElement(name = "flow-rate-threshhold")
    @XmlSchemaType(name = "unsignedShort")
    protected int flowRateThreshhold;
    @XmlElement(name = "occupancy-threshhold")
    @XmlSchemaType(name = "unsignedShort")
    protected int occupancyThreshhold;
    @XmlElement(name = "speed-threshhold")
    @XmlSchemaType(name = "unsignedByte")
    protected short speedThreshhold;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the meterPlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterPlan() {
        return meterPlan;
    }

    /**
     * Sets the value of the meterPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterPlan(String value) {
        this.meterPlan = value;
    }

    /**
     * Gets the value of the meterLevel property.
     * 
     */
    public short getMeterLevel() {
        return meterLevel;
    }

    /**
     * Sets the value of the meterLevel property.
     * 
     */
    public void setMeterLevel(short value) {
        this.meterLevel = value;
    }

    /**
     * Gets the value of the meterRate property.
     * 
     */
    public int getMeterRate() {
        return meterRate;
    }

    /**
     * Sets the value of the meterRate property.
     * 
     */
    public void setMeterRate(int value) {
        this.meterRate = value;
    }

    /**
     * Gets the value of the flowRateThreshhold property.
     * 
     */
    public int getFlowRateThreshhold() {
        return flowRateThreshhold;
    }

    /**
     * Sets the value of the flowRateThreshhold property.
     * 
     */
    public void setFlowRateThreshhold(int value) {
        this.flowRateThreshhold = value;
    }

    /**
     * Gets the value of the occupancyThreshhold property.
     * 
     */
    public int getOccupancyThreshhold() {
        return occupancyThreshhold;
    }

    /**
     * Sets the value of the occupancyThreshhold property.
     * 
     */
    public void setOccupancyThreshhold(int value) {
        this.occupancyThreshhold = value;
    }

    /**
     * Gets the value of the speedThreshhold property.
     * 
     */
    public short getSpeedThreshhold() {
        return speedThreshhold;
    }

    /**
     * Sets the value of the speedThreshhold property.
     * 
     */
    public void setSpeedThreshhold(short value) {
        this.speedThreshhold = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateTime(DateTimeZone value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
