
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for RampMeterInventoryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterInventoryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metered-lane-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="ramp-exit-roadway-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
 *         &lt;element name="lane-number" type="{http://www.tmdd.org/303/messages}Link-lane-number" minOccurs="0"/&gt;
 *         &lt;element name="lane-type" type="{http://www.tmdd.org/303/messages}Ramp-lane-type" minOccurs="0"/&gt;
 *         &lt;element name="associated-detectors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="detector-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="absolute-minimum-metering-rate" type="{http://www.ntcip.org/c2f-object-references}RmcAbsoluteMinMeterRate" minOccurs="0"/&gt;
 *         &lt;element name="absolute-maximum-metering-rate" type="{http://www.ntcip.org/c2f-object-references}RmcAbsoluteMaxMeterRate" minOccurs="0"/&gt;
 *         &lt;element name="system-minimum-metering-rate" type="{http://www.ntcip.org/c2f-object-references}RmcSystemMinMeterRate" minOccurs="0"/&gt;
 *         &lt;element name="system-maximum-metering-rate" type="{http://www.ntcip.org/c2f-object-references}RmcSystemMaxMeterRate" minOccurs="0"/&gt;
 *         &lt;element name="signal-controller-type" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="signal-controller-metering-program" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="queue-sensor-distance" type="{http://www.tmdd.org/303/messages}Link-length" minOccurs="0"/&gt;
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
@XmlType(name = "RampMeterInventoryDetails", propOrder = {
    "meteredLaneInventoryHeader",
    "rampExitRoadwayName",
    "laneNumber",
    "laneType",
    "associatedDetectors",
    "absoluteMinimumMeteringRate",
    "absoluteMaximumMeteringRate",
    "systemMinimumMeteringRate",
    "systemMaximumMeteringRate",
    "signalControllerType",
    "signalControllerMeteringProgram",
    "queueSensorDistance",
    "any"
})
public class RampMeterInventoryDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "metered-lane-inventory-header", required = true)
    protected DeviceInventoryHeader meteredLaneInventoryHeader;
    @XmlElement(name = "ramp-exit-roadway-name", required = true)
    protected String rampExitRoadwayName;
    @XmlElement(name = "lane-number")
    @XmlSchemaType(name = "unsignedByte")
    protected Short laneNumber;
    @XmlElement(name = "lane-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String laneType;
    @XmlElement(name = "associated-detectors")
    protected RampMeterInventoryDetails.AssociatedDetectors associatedDetectors;
    @XmlElement(name = "absolute-minimum-metering-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer absoluteMinimumMeteringRate;
    @XmlElement(name = "absolute-maximum-metering-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer absoluteMaximumMeteringRate;
    @XmlElement(name = "system-minimum-metering-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer systemMinimumMeteringRate;
    @XmlElement(name = "system-maximum-metering-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer systemMaximumMeteringRate;
    @XmlElement(name = "signal-controller-type")
    protected String signalControllerType;
    @XmlElement(name = "signal-controller-metering-program")
    protected String signalControllerMeteringProgram;
    @XmlElement(name = "queue-sensor-distance")
    @XmlSchemaType(name = "unsignedInt")
    protected Long queueSensorDistance;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the meteredLaneInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getMeteredLaneInventoryHeader() {
        return meteredLaneInventoryHeader;
    }

    /**
     * Sets the value of the meteredLaneInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setMeteredLaneInventoryHeader(DeviceInventoryHeader value) {
        this.meteredLaneInventoryHeader = value;
    }

    /**
     * Gets the value of the rampExitRoadwayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRampExitRoadwayName() {
        return rampExitRoadwayName;
    }

    /**
     * Sets the value of the rampExitRoadwayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRampExitRoadwayName(String value) {
        this.rampExitRoadwayName = value;
    }

    /**
     * Gets the value of the laneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLaneNumber() {
        return laneNumber;
    }

    /**
     * Sets the value of the laneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLaneNumber(Short value) {
        this.laneNumber = value;
    }

    /**
     * Gets the value of the laneType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneType() {
        return laneType;
    }

    /**
     * Sets the value of the laneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneType(String value) {
        this.laneType = value;
    }

    /**
     * Gets the value of the associatedDetectors property.
     * 
     * @return
     *     possible object is
     *     {@link RampMeterInventoryDetails.AssociatedDetectors }
     *     
     */
    public RampMeterInventoryDetails.AssociatedDetectors getAssociatedDetectors() {
        return associatedDetectors;
    }

    /**
     * Sets the value of the associatedDetectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link RampMeterInventoryDetails.AssociatedDetectors }
     *     
     */
    public void setAssociatedDetectors(RampMeterInventoryDetails.AssociatedDetectors value) {
        this.associatedDetectors = value;
    }

    /**
     * Gets the value of the absoluteMinimumMeteringRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbsoluteMinimumMeteringRate() {
        return absoluteMinimumMeteringRate;
    }

    /**
     * Sets the value of the absoluteMinimumMeteringRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbsoluteMinimumMeteringRate(Integer value) {
        this.absoluteMinimumMeteringRate = value;
    }

    /**
     * Gets the value of the absoluteMaximumMeteringRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAbsoluteMaximumMeteringRate() {
        return absoluteMaximumMeteringRate;
    }

    /**
     * Sets the value of the absoluteMaximumMeteringRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAbsoluteMaximumMeteringRate(Integer value) {
        this.absoluteMaximumMeteringRate = value;
    }

    /**
     * Gets the value of the systemMinimumMeteringRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSystemMinimumMeteringRate() {
        return systemMinimumMeteringRate;
    }

    /**
     * Sets the value of the systemMinimumMeteringRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSystemMinimumMeteringRate(Integer value) {
        this.systemMinimumMeteringRate = value;
    }

    /**
     * Gets the value of the systemMaximumMeteringRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSystemMaximumMeteringRate() {
        return systemMaximumMeteringRate;
    }

    /**
     * Sets the value of the systemMaximumMeteringRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSystemMaximumMeteringRate(Integer value) {
        this.systemMaximumMeteringRate = value;
    }

    /**
     * Gets the value of the signalControllerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalControllerType() {
        return signalControllerType;
    }

    /**
     * Sets the value of the signalControllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalControllerType(String value) {
        this.signalControllerType = value;
    }

    /**
     * Gets the value of the signalControllerMeteringProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalControllerMeteringProgram() {
        return signalControllerMeteringProgram;
    }

    /**
     * Sets the value of the signalControllerMeteringProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalControllerMeteringProgram(String value) {
        this.signalControllerMeteringProgram = value;
    }

    /**
     * Gets the value of the queueSensorDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueueSensorDistance() {
        return queueSensorDistance;
    }

    /**
     * Sets the value of the queueSensorDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueueSensorDistance(Long value) {
        this.queueSensorDistance = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="detector-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detectorId"
    })
    public static class AssociatedDetectors
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "detector-id", required = true)
        protected List<String> detectorId;

        /**
         * Gets the value of the detectorId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detectorId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetectorId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDetectorId() {
            if (detectorId == null) {
                detectorId = new ArrayList<String>();
            }
            return this.detectorId;
        }

    }

}
