
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
 * <p>Java class for RampMeterLaneStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterLaneStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metered-lane-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="meter-implemented-action" type="{http://www.ntcip.org/c2f-object-references}RmcImplementAction"/&gt;
 *         &lt;element name="requested-meter-command-source" type="{http://www.ntcip.org/c2f-object-references}RmcRequestCommandSource" minOccurs="0"/&gt;
 *         &lt;element name="implemented-meter-command-source" type="{http://www.ntcip.org/c2f-object-references}RmcImplementCommandSource" minOccurs="0"/&gt;
 *         &lt;element name="meter-implemented-plan" type="{http://www.ntcip.org/c2f-object-references}RmcImplementPlan" minOccurs="0"/&gt;
 *         &lt;element name="meter-implemented-rate" type="{http://www.ntcip.org/c2f-object-references}RmcImplementRate" minOccurs="0"/&gt;
 *         &lt;element name="meter-implemented-vehicles-per-green" type="{http://www.ntcip.org/c2f-object-references}RmcImplementVehiclesPerGrn" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-action" type="{http://www.ntcip.org/c2f-object-references}RmcRequestAction" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-plan" type="{http://www.ntcip.org/c2f-object-references}RmcRequestPlan" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-rate" type="{http://www.ntcip.org/c2f-object-references}RmcRequestRate" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-vehicles-per-green" type="{http://www.ntcip.org/c2f-object-references}RmcRequestVehiclesPerGrn" minOccurs="0"/&gt;
 *         &lt;element name="operational-min-meter-rate" type="{http://www.ntcip.org/c2f-object-references}RmcOperMinMeterRateStatus" minOccurs="0"/&gt;
 *         &lt;element name="operational-max-meter-rate" type="{http://www.ntcip.org/c2f-object-references}RmcOperMaxMeterRateStatus" minOccurs="0"/&gt;
 *         &lt;element name="meter-demand-detector-status" type="{http://www.ntcip.org/c2f-object-references}RmcDemandStatus" minOccurs="0"/&gt;
 *         &lt;element name="meter-passage-detector-status" type="{http://www.ntcip.org/c2f-object-references}RmcPassageStatus" minOccurs="0"/&gt;
 *         &lt;element name="meter-queue-detector-status" type="{http://www.ntcip.org/c2f-object-references}RmcQueueStatus" minOccurs="0"/&gt;
 *         &lt;element name="meter-cycle-count" type="{http://www.tmdd.org/303/messages}Meter-greens-per-cycle" minOccurs="0"/&gt;
 *         &lt;element name="metered-lane-vehicle-count" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="meter-queue-detected-flag" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
 *         &lt;element name="metered-lane-violation-count" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="hov-allow-meter-bypass" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
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
@XmlType(name = "RampMeterLaneStatusDetails", propOrder = {
    "meteredLaneStatusHeader",
    "meterImplementedAction",
    "requestedMeterCommandSource",
    "implementedMeterCommandSource",
    "meterImplementedPlan",
    "meterImplementedRate",
    "meterImplementedVehiclesPerGreen",
    "meterRequestedAction",
    "meterRequestedPlan",
    "meterRequestedRate",
    "meterRequestedVehiclesPerGreen",
    "operationalMinMeterRate",
    "operationalMaxMeterRate",
    "meterDemandDetectorStatus",
    "meterPassageDetectorStatus",
    "meterQueueDetectorStatus",
    "meterCycleCount",
    "meteredLaneVehicleCount",
    "meterQueueDetectedFlag",
    "meteredLaneViolationCount",
    "hovAllowMeterBypass",
    "any"
})
public class RampMeterLaneStatusDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "metered-lane-status-header", required = true)
    protected DeviceStatusHeader meteredLaneStatusHeader;
    @XmlElement(name = "meter-implemented-action", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String meterImplementedAction;
    @XmlElement(name = "requested-meter-command-source")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestedMeterCommandSource;
    @XmlElement(name = "implemented-meter-command-source")
    @XmlSchemaType(name = "anySimpleType")
    protected String implementedMeterCommandSource;
    @XmlElement(name = "meter-implemented-plan")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterImplementedPlan;
    @XmlElement(name = "meter-implemented-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer meterImplementedRate;
    @XmlElement(name = "meter-implemented-vehicles-per-green")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterImplementedVehiclesPerGreen;
    @XmlElement(name = "meter-requested-action")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterRequestedAction;
    @XmlElement(name = "meter-requested-plan")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterRequestedPlan;
    @XmlElement(name = "meter-requested-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer meterRequestedRate;
    @XmlElement(name = "meter-requested-vehicles-per-green")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterRequestedVehiclesPerGreen;
    @XmlElement(name = "operational-min-meter-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer operationalMinMeterRate;
    @XmlElement(name = "operational-max-meter-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer operationalMaxMeterRate;
    @XmlElement(name = "meter-demand-detector-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterDemandDetectorStatus;
    @XmlElement(name = "meter-passage-detector-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterPassageDetectorStatus;
    @XmlElement(name = "meter-queue-detector-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterQueueDetectorStatus;
    @XmlElement(name = "meter-cycle-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long meterCycleCount;
    @XmlElement(name = "metered-lane-vehicle-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long meteredLaneVehicleCount;
    @XmlElement(name = "meter-queue-detected-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String meterQueueDetectedFlag;
    @XmlElement(name = "metered-lane-violation-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long meteredLaneViolationCount;
    @XmlElement(name = "hov-allow-meter-bypass")
    @XmlSchemaType(name = "anySimpleType")
    protected String hovAllowMeterBypass;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the meteredLaneStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getMeteredLaneStatusHeader() {
        return meteredLaneStatusHeader;
    }

    /**
     * Sets the value of the meteredLaneStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setMeteredLaneStatusHeader(DeviceStatusHeader value) {
        this.meteredLaneStatusHeader = value;
    }

    /**
     * Gets the value of the meterImplementedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterImplementedAction() {
        return meterImplementedAction;
    }

    /**
     * Sets the value of the meterImplementedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterImplementedAction(String value) {
        this.meterImplementedAction = value;
    }

    /**
     * Gets the value of the requestedMeterCommandSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedMeterCommandSource() {
        return requestedMeterCommandSource;
    }

    /**
     * Sets the value of the requestedMeterCommandSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedMeterCommandSource(String value) {
        this.requestedMeterCommandSource = value;
    }

    /**
     * Gets the value of the implementedMeterCommandSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementedMeterCommandSource() {
        return implementedMeterCommandSource;
    }

    /**
     * Sets the value of the implementedMeterCommandSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementedMeterCommandSource(String value) {
        this.implementedMeterCommandSource = value;
    }

    /**
     * Gets the value of the meterImplementedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterImplementedPlan() {
        return meterImplementedPlan;
    }

    /**
     * Sets the value of the meterImplementedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterImplementedPlan(Short value) {
        this.meterImplementedPlan = value;
    }

    /**
     * Gets the value of the meterImplementedRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeterImplementedRate() {
        return meterImplementedRate;
    }

    /**
     * Sets the value of the meterImplementedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeterImplementedRate(Integer value) {
        this.meterImplementedRate = value;
    }

    /**
     * Gets the value of the meterImplementedVehiclesPerGreen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterImplementedVehiclesPerGreen() {
        return meterImplementedVehiclesPerGreen;
    }

    /**
     * Sets the value of the meterImplementedVehiclesPerGreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterImplementedVehiclesPerGreen(Short value) {
        this.meterImplementedVehiclesPerGreen = value;
    }

    /**
     * Gets the value of the meterRequestedAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterRequestedAction() {
        return meterRequestedAction;
    }

    /**
     * Sets the value of the meterRequestedAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterRequestedAction(String value) {
        this.meterRequestedAction = value;
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
     * Gets the value of the meterRequestedVehiclesPerGreen property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterRequestedVehiclesPerGreen() {
        return meterRequestedVehiclesPerGreen;
    }

    /**
     * Sets the value of the meterRequestedVehiclesPerGreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterRequestedVehiclesPerGreen(Short value) {
        this.meterRequestedVehiclesPerGreen = value;
    }

    /**
     * Gets the value of the operationalMinMeterRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationalMinMeterRate() {
        return operationalMinMeterRate;
    }

    /**
     * Sets the value of the operationalMinMeterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationalMinMeterRate(Integer value) {
        this.operationalMinMeterRate = value;
    }

    /**
     * Gets the value of the operationalMaxMeterRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationalMaxMeterRate() {
        return operationalMaxMeterRate;
    }

    /**
     * Sets the value of the operationalMaxMeterRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationalMaxMeterRate(Integer value) {
        this.operationalMaxMeterRate = value;
    }

    /**
     * Gets the value of the meterDemandDetectorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterDemandDetectorStatus() {
        return meterDemandDetectorStatus;
    }

    /**
     * Sets the value of the meterDemandDetectorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterDemandDetectorStatus(String value) {
        this.meterDemandDetectorStatus = value;
    }

    /**
     * Gets the value of the meterPassageDetectorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterPassageDetectorStatus() {
        return meterPassageDetectorStatus;
    }

    /**
     * Sets the value of the meterPassageDetectorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterPassageDetectorStatus(String value) {
        this.meterPassageDetectorStatus = value;
    }

    /**
     * Gets the value of the meterQueueDetectorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterQueueDetectorStatus() {
        return meterQueueDetectorStatus;
    }

    /**
     * Sets the value of the meterQueueDetectorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterQueueDetectorStatus(String value) {
        this.meterQueueDetectorStatus = value;
    }

    /**
     * Gets the value of the meterCycleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeterCycleCount() {
        return meterCycleCount;
    }

    /**
     * Sets the value of the meterCycleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeterCycleCount(Long value) {
        this.meterCycleCount = value;
    }

    /**
     * Gets the value of the meteredLaneVehicleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeteredLaneVehicleCount() {
        return meteredLaneVehicleCount;
    }

    /**
     * Sets the value of the meteredLaneVehicleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeteredLaneVehicleCount(Long value) {
        this.meteredLaneVehicleCount = value;
    }

    /**
     * Gets the value of the meterQueueDetectedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterQueueDetectedFlag() {
        return meterQueueDetectedFlag;
    }

    /**
     * Sets the value of the meterQueueDetectedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterQueueDetectedFlag(String value) {
        this.meterQueueDetectedFlag = value;
    }

    /**
     * Gets the value of the meteredLaneViolationCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMeteredLaneViolationCount() {
        return meteredLaneViolationCount;
    }

    /**
     * Sets the value of the meteredLaneViolationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMeteredLaneViolationCount(Long value) {
        this.meteredLaneViolationCount = value;
    }

    /**
     * Gets the value of the hovAllowMeterBypass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHovAllowMeterBypass() {
        return hovAllowMeterBypass;
    }

    /**
     * Sets the value of the hovAllowMeterBypass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHovAllowMeterBypass(String value) {
        this.hovAllowMeterBypass = value;
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
