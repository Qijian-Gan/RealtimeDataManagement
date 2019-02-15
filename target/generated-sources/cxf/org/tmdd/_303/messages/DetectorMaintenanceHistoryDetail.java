
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
 * <p>Java class for DetectorMaintenanceHistoryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorMaintenanceHistoryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="station-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="detector-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="detector-type" type="{http://www.tmdd.org/303/messages}Detector-type" minOccurs="0"/&gt;
 *         &lt;element name="detector-installation-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="detector-calibration-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="detector-calibration-method" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="detector-last-operational-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="detector-last-non-operational-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="detector-repair-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
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
@XmlType(name = "DetectorMaintenanceHistoryDetail", propOrder = {
    "stationId",
    "detectorId",
    "detectorType",
    "detectorInstallationDate",
    "detectorCalibrationDate",
    "detectorCalibrationMethod",
    "detectorLastOperationalDate",
    "detectorLastNonOperationalDate",
    "detectorRepairDescription",
    "lastUpdateTime",
    "any"
})
public class DetectorMaintenanceHistoryDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "station-id")
    protected String stationId;
    @XmlElement(name = "detector-id", required = true)
    protected String detectorId;
    @XmlElement(name = "detector-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String detectorType;
    @XmlElement(name = "detector-installation-date")
    protected DateTimeZone detectorInstallationDate;
    @XmlElement(name = "detector-calibration-date")
    protected DateTimeZone detectorCalibrationDate;
    @XmlElement(name = "detector-calibration-method")
    protected String detectorCalibrationMethod;
    @XmlElement(name = "detector-last-operational-date")
    protected DateTimeZone detectorLastOperationalDate;
    @XmlElement(name = "detector-last-non-operational-date")
    protected DateTimeZone detectorLastNonOperationalDate;
    @XmlElement(name = "detector-repair-description")
    protected String detectorRepairDescription;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
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
     * Gets the value of the detectorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorType() {
        return detectorType;
    }

    /**
     * Sets the value of the detectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorType(String value) {
        this.detectorType = value;
    }

    /**
     * Gets the value of the detectorInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDetectorInstallationDate() {
        return detectorInstallationDate;
    }

    /**
     * Sets the value of the detectorInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDetectorInstallationDate(DateTimeZone value) {
        this.detectorInstallationDate = value;
    }

    /**
     * Gets the value of the detectorCalibrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDetectorCalibrationDate() {
        return detectorCalibrationDate;
    }

    /**
     * Sets the value of the detectorCalibrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDetectorCalibrationDate(DateTimeZone value) {
        this.detectorCalibrationDate = value;
    }

    /**
     * Gets the value of the detectorCalibrationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorCalibrationMethod() {
        return detectorCalibrationMethod;
    }

    /**
     * Sets the value of the detectorCalibrationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorCalibrationMethod(String value) {
        this.detectorCalibrationMethod = value;
    }

    /**
     * Gets the value of the detectorLastOperationalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDetectorLastOperationalDate() {
        return detectorLastOperationalDate;
    }

    /**
     * Sets the value of the detectorLastOperationalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDetectorLastOperationalDate(DateTimeZone value) {
        this.detectorLastOperationalDate = value;
    }

    /**
     * Gets the value of the detectorLastNonOperationalDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDetectorLastNonOperationalDate() {
        return detectorLastNonOperationalDate;
    }

    /**
     * Sets the value of the detectorLastNonOperationalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDetectorLastNonOperationalDate(DateTimeZone value) {
        this.detectorLastNonOperationalDate = value;
    }

    /**
     * Gets the value of the detectorRepairDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorRepairDescription() {
        return detectorRepairDescription;
    }

    /**
     * Sets the value of the detectorRepairDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorRepairDescription(String value) {
        this.detectorRepairDescription = value;
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
