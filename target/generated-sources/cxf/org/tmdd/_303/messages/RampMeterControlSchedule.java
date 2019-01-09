
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
 * <p>Java class for RampMeterControlSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterControlSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-schedule-header" type="{http://www.tmdd.org/303/messages}DeviceControlScheduleHeader"/&gt;
 *         &lt;element name="metered-lane-identifier" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
 *         &lt;element name="action-number" type="{http://www.ntcip.org/c2f-object-references}RmcActionNum"/&gt;
 *         &lt;element name="meter-action-control" type="{http://www.ntcip.org/c2f-object-references}RmcTBActionCtrl" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-plan" type="{http://www.ntcip.org/c2f-object-references}RmcTBPlanCtrl" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-rate" type="{http://www.ntcip.org/c2f-object-references}RmcTBRateCtrl" minOccurs="0"/&gt;
 *         &lt;element name="meter-vehicles-per-green" type="{http://www.ntcip.org/c2f-object-references}RmcTBVehiclesPerGrnCtrl" minOccurs="0"/&gt;
 *         &lt;element name="min-meter-rate" type="{http://www.ntcip.org/c2f-object-references}RmcTBCMinMeterRateCtrl" minOccurs="0"/&gt;
 *         &lt;element name="max-meter-rate" type="{http://www.ntcip.org/c2f-object-references}RmcTBCMaxMeterRateCtrl" minOccurs="0"/&gt;
 *         &lt;element name="meter-lane-usage-mode" type="{http://www.ntcip.org/c2f-object-references}RmcTBMLUsageMode" minOccurs="0"/&gt;
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
@XmlType(name = "RampMeterControlSchedule", propOrder = {
    "deviceControlScheduleHeader",
    "meteredLaneIdentifier",
    "actionNumber",
    "meterActionControl",
    "meterRequestedPlan",
    "meterRequestedRate",
    "meterVehiclesPerGreen",
    "minMeterRate",
    "maxMeterRate",
    "meterLaneUsageMode",
    "any"
})
public class RampMeterControlSchedule
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-schedule-header", required = true)
    protected DeviceControlScheduleHeader deviceControlScheduleHeader;
    @XmlElement(name = "metered-lane-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short meteredLaneIdentifier;
    @XmlElement(name = "action-number")
    @XmlSchemaType(name = "unsignedByte")
    protected short actionNumber;
    @XmlElement(name = "meter-action-control")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterActionControl;
    @XmlElement(name = "meter-requested-plan")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterRequestedPlan;
    @XmlElement(name = "meter-requested-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer meterRequestedRate;
    @XmlElement(name = "meter-vehicles-per-green")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterVehiclesPerGreen;
    @XmlElement(name = "min-meter-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer minMeterRate;
    @XmlElement(name = "max-meter-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer maxMeterRate;
    @XmlElement(name = "meter-lane-usage-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterLaneUsageMode;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceControlScheduleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlScheduleHeader }
     *     
     */
    public DeviceControlScheduleHeader getDeviceControlScheduleHeader() {
        return deviceControlScheduleHeader;
    }

    /**
     * Sets the value of the deviceControlScheduleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlScheduleHeader }
     *     
     */
    public void setDeviceControlScheduleHeader(DeviceControlScheduleHeader value) {
        this.deviceControlScheduleHeader = value;
    }

    /**
     * Gets the value of the meteredLaneIdentifier property.
     * 
     */
    public short getMeteredLaneIdentifier() {
        return meteredLaneIdentifier;
    }

    /**
     * Sets the value of the meteredLaneIdentifier property.
     * 
     */
    public void setMeteredLaneIdentifier(short value) {
        this.meteredLaneIdentifier = value;
    }

    /**
     * Gets the value of the actionNumber property.
     * 
     */
    public short getActionNumber() {
        return actionNumber;
    }

    /**
     * Sets the value of the actionNumber property.
     * 
     */
    public void setActionNumber(short value) {
        this.actionNumber = value;
    }

    /**
     * Gets the value of the meterActionControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterActionControl() {
        return meterActionControl;
    }

    /**
     * Sets the value of the meterActionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterActionControl(String value) {
        this.meterActionControl = value;
    }

    /**
     * Gets the value of the meterRequestedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterRequestedPlan() {
        return meterRequestedPlan;
    }

    /**
     * Sets the value of the meterRequestedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterRequestedPlan(Short value) {
        this.meterRequestedPlan = value;
    }

    /**
     * Gets the value of the meterRequestedRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeterRequestedRate() {
        return meterRequestedRate;
    }

    /**
     * Sets the value of the meterRequestedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeterRequestedRate(Integer value) {
        this.meterRequestedRate = value;
    }

    /**
     * Gets the value of the meterVehiclesPerGreen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterVehiclesPerGreen() {
        return meterVehiclesPerGreen;
    }

    /**
     * Sets the value of the meterVehiclesPerGreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterVehiclesPerGreen(Short value) {
        this.meterVehiclesPerGreen = value;
    }

    /**
     * Gets the value of the minMeterRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinMeterRate() {
        return minMeterRate;
    }

    /**
     * Sets the value of the minMeterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinMeterRate(Integer value) {
        this.minMeterRate = value;
    }

    /**
     * Gets the value of the maxMeterRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxMeterRate() {
        return maxMeterRate;
    }

    /**
     * Sets the value of the maxMeterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxMeterRate(Integer value) {
        this.maxMeterRate = value;
    }

    /**
     * Gets the value of the meterLaneUsageMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterLaneUsageMode() {
        return meterLaneUsageMode;
    }

    /**
     * Sets the value of the meterLaneUsageMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterLaneUsageMode(String value) {
        this.meterLaneUsageMode = value;
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
