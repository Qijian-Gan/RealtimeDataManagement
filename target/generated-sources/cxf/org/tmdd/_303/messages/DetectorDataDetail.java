
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Detector&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DetectorDataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorDataDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="station-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="detector-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="detection-time-stamp" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="vehicle-count" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-occupancy" type="{http://www.tmdd.org/303/messages}Detector-occupancy" minOccurs="0"/&gt;
 *         &lt;element name="start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="detector-data-type" type="{http://www.tmdd.org/303/messages}Link-data-type" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-speed" type="{http://www.tmdd.org/303/messages}Detector-vehicle-speed" minOccurs="0"/&gt;
 *         &lt;element name="queue-length" type="{http://www.tmdd.org/303/messages}Detector-vehicle-queue-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-stops" type="{http://www.tmdd.org/303/messages}Detector-vehicle-stops" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin1" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin2" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin3" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin4" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin5" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin6" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-count-bin7" type="{http://www.tmdd.org/303/messages}Detector-vehicle-count" minOccurs="0"/&gt;
 *         &lt;element name="detector-status" type="{http://www.tmdd.org/303/messages}Device-operational-status" minOccurs="0"/&gt;
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
@XmlType(name = "DetectorDataDetail", propOrder = {
    "stationId",
    "detectorId",
    "detectionTimeStamp",
    "vehicleCount",
    "vehicleOccupancy",
    "startTime",
    "endTime",
    "detectorDataType",
    "vehicleSpeed",
    "queueLength",
    "vehicleStops",
    "vehicleCountBin1",
    "vehicleCountBin2",
    "vehicleCountBin3",
    "vehicleCountBin4",
    "vehicleCountBin5",
    "vehicleCountBin6",
    "vehicleCountBin7",
    "detectorStatus",
    "any"
})
public class DetectorDataDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "station-id")
    protected String stationId;
    @XmlElement(name = "detector-id", required = true)
    protected String detectorId;
    @XmlElement(name = "detection-time-stamp", required = true)
    protected DateTimeZone detectionTimeStamp;
    @XmlElement(name = "vehicle-count")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCount;
    @XmlElement(name = "vehicle-occupancy")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer vehicleOccupancy;
    @XmlElement(name = "start-time")
    protected DateTimeZone startTime;
    @XmlElement(name = "end-time")
    protected DateTimeZone endTime;
    @XmlElement(name = "detector-data-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String detectorDataType;
    @XmlElement(name = "vehicle-speed")
    @XmlSchemaType(name = "unsignedByte")
    protected Short vehicleSpeed;
    @XmlElement(name = "queue-length")
    @XmlSchemaType(name = "unsignedInt")
    protected Long queueLength;
    @XmlElement(name = "vehicle-stops")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleStops;
    @XmlElement(name = "vehicle-count-bin1")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin1;
    @XmlElement(name = "vehicle-count-bin2")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin2;
    @XmlElement(name = "vehicle-count-bin3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin3;
    @XmlElement(name = "vehicle-count-bin4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin4;
    @XmlElement(name = "vehicle-count-bin5")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin5;
    @XmlElement(name = "vehicle-count-bin6")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin6;
    @XmlElement(name = "vehicle-count-bin7")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleCountBin7;
    @XmlElement(name = "detector-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String detectorStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the stationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Gets the value of the detectorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * Sets the value of the detectorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorId(String value) {
        this.detectorId = value;
    }

    /**
     * Gets the value of the detectionTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDetectionTimeStamp() {
        return detectionTimeStamp;
    }

    /**
     * Sets the value of the detectionTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDetectionTimeStamp(DateTimeZone value) {
        this.detectionTimeStamp = value;
    }

    /**
     * Gets the value of the vehicleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCount() {
        return vehicleCount;
    }

    /**
     * Sets the value of the vehicleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCount(Long value) {
        this.vehicleCount = value;
    }

    /**
     * Gets the value of the vehicleOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehicleOccupancy() {
        return vehicleOccupancy;
    }

    /**
     * Sets the value of the vehicleOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehicleOccupancy(Integer value) {
        this.vehicleOccupancy = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setStartTime(DateTimeZone value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setEndTime(DateTimeZone value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the detectorDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorDataType() {
        return detectorDataType;
    }

    /**
     * Sets the value of the detectorDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorDataType(String value) {
        this.detectorDataType = value;
    }

    /**
     * Gets the value of the vehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Sets the value of the vehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVehicleSpeed(Short value) {
        this.vehicleSpeed = value;
    }

    /**
     * Gets the value of the queueLength property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQueueLength() {
        return queueLength;
    }

    /**
     * Sets the value of the queueLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQueueLength(Long value) {
        this.queueLength = value;
    }

    /**
     * Gets the value of the vehicleStops property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleStops() {
        return vehicleStops;
    }

    /**
     * Sets the value of the vehicleStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleStops(Long value) {
        this.vehicleStops = value;
    }

    /**
     * Gets the value of the vehicleCountBin1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin1() {
        return vehicleCountBin1;
    }

    /**
     * Sets the value of the vehicleCountBin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin1(Long value) {
        this.vehicleCountBin1 = value;
    }

    /**
     * Gets the value of the vehicleCountBin2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin2() {
        return vehicleCountBin2;
    }

    /**
     * Sets the value of the vehicleCountBin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin2(Long value) {
        this.vehicleCountBin2 = value;
    }

    /**
     * Gets the value of the vehicleCountBin3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin3() {
        return vehicleCountBin3;
    }

    /**
     * Sets the value of the vehicleCountBin3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin3(Long value) {
        this.vehicleCountBin3 = value;
    }

    /**
     * Gets the value of the vehicleCountBin4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin4() {
        return vehicleCountBin4;
    }

    /**
     * Sets the value of the vehicleCountBin4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin4(Long value) {
        this.vehicleCountBin4 = value;
    }

    /**
     * Gets the value of the vehicleCountBin5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin5() {
        return vehicleCountBin5;
    }

    /**
     * Sets the value of the vehicleCountBin5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin5(Long value) {
        this.vehicleCountBin5 = value;
    }

    /**
     * Gets the value of the vehicleCountBin6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin6() {
        return vehicleCountBin6;
    }

    /**
     * Sets the value of the vehicleCountBin6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin6(Long value) {
        this.vehicleCountBin6 = value;
    }

    /**
     * Gets the value of the vehicleCountBin7 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleCountBin7() {
        return vehicleCountBin7;
    }

    /**
     * Sets the value of the vehicleCountBin7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleCountBin7(Long value) {
        this.vehicleCountBin7 = value;
    }

    /**
     * Gets the value of the detectorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorStatus() {
        return detectorStatus;
    }

    /**
     * Sets the value of the detectorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorStatus(String value) {
        this.detectorStatus = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     {@link Element }
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
     *     {@link Object }
     *     {@link Element }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
