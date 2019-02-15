
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import lrms_adopted_02_00_00.GeoLocation;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSStationMetadataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSStationMetadataDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="station-category" type="{http://www.ntcip.org/c2f-object-references}EssNtcipCategory"/&gt;
 *         &lt;element name="station-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="station-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="station-elevation" type="{http://www.ntcip.org/c2f-object-references}EssReferenceHeight"/&gt;
 *         &lt;element name="station-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="station-type" type="{http://www.ntcip.org/c2f-object-references}EssTypeofStation" minOccurs="0"/&gt;
 *         &lt;element name="station-horizontal-datum" type="{http://www.LRMS-Adopted-02-00-00}HorizontalDatum" minOccurs="0"/&gt;
 *         &lt;element name="station-vertical-datum" type="{http://www.LRMS-Adopted-02-00-00}VerticalDatum" minOccurs="0"/&gt;
 *         &lt;element name="station-power-source" type="{http://www.tmdd.org/303/messages}Ess-station-power-source" minOccurs="0"/&gt;
 *         &lt;element name="station-door-status" type="{http://www.ntcip.org/c2f-object-references}EssDoorStatus" minOccurs="0"/&gt;
 *         &lt;element name="station-battery-status" type="{http://www.ntcip.org/c2f-object-references}EssBatteryStatus" minOccurs="0"/&gt;
 *         &lt;element name="station-line-volts" type="{http://www.ntcip.org/c2f-object-references}EssLineVolts" minOccurs="0"/&gt;
 *         &lt;element name="station-maintenance-group-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="station-maintenance-contact-information" type="{http://www.tmdd.org/303/messages}ContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="station-maintenance-frequency" type="{http://www.tmdd.org/303/messages}Ess-time-span-days" minOccurs="0"/&gt;
 *         &lt;element name="station-maintenance-calibration-frequency" type="{http://www.tmdd.org/303/messages}Ess-time-span-days" minOccurs="0"/&gt;
 *         &lt;element name="station-maintenance-status" type="{http://www.tmdd.org/303/messages}Ess-station-maintenance-status" minOccurs="0"/&gt;
 *         &lt;element name="station-installation-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="station-number-of-devices" type="{http://www.tmdd.org/303/messages}Ess-station-number-of-devices" minOccurs="0"/&gt;
 *         &lt;element name="station-comm-method" type="{http://www.tmdd.org/303/messages}Ess-station-comm-method" minOccurs="0"/&gt;
 *         &lt;element name="station-telephone-number" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="station-ip-address" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="station-manufacturer" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="station-observation-collection-frequency" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes" minOccurs="0"/&gt;
 *         &lt;element name="station-observation-collection-offset" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes" minOccurs="0"/&gt;
 *         &lt;element name="station-transmission-frequency" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes" minOccurs="0"/&gt;
 *         &lt;element name="station-transmission-offset" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes" minOccurs="0"/&gt;
 *         &lt;element name="station-transmission-format" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
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
@XmlType(name = "ESSStationMetadataDetail", propOrder = {
    "stationCategory",
    "stationId",
    "stationLocation",
    "stationElevation",
    "stationDescription",
    "stationType",
    "stationHorizontalDatum",
    "stationVerticalDatum",
    "stationPowerSource",
    "stationDoorStatus",
    "stationBatteryStatus",
    "stationLineVolts",
    "stationMaintenanceGroupName",
    "stationMaintenanceContactInformation",
    "stationMaintenanceFrequency",
    "stationMaintenanceCalibrationFrequency",
    "stationMaintenanceStatus",
    "stationInstallationDate",
    "stationNumberOfDevices",
    "stationCommMethod",
    "stationTelephoneNumber",
    "stationIpAddress",
    "stationManufacturer",
    "stationObservationCollectionFrequency",
    "stationObservationCollectionOffset",
    "stationTransmissionFrequency",
    "stationTransmissionOffset",
    "stationTransmissionFormat",
    "any"
})
public class ESSStationMetadataDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "station-category", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String stationCategory;
    @XmlElement(name = "station-id", required = true)
    protected String stationId;
    @XmlElement(name = "station-location", required = true)
    protected GeoLocation stationLocation;
    @XmlElement(name = "station-elevation")
    protected short stationElevation;
    @XmlElement(name = "station-description")
    protected String stationDescription;
    @XmlElement(name = "station-type")
    @XmlSchemaType(name = "unsignedByte")
    protected Short stationType;
    @XmlElement(name = "station-horizontal-datum")
    @XmlSchemaType(name = "anySimpleType")
    protected String stationHorizontalDatum;
    @XmlElement(name = "station-vertical-datum")
    @XmlSchemaType(name = "anySimpleType")
    protected String stationVerticalDatum;
    @XmlElement(name = "station-power-source")
    @XmlSchemaType(name = "anySimpleType")
    protected String stationPowerSource;
    @XmlElement(name = "station-door-status")
    @XmlSchemaType(name = "unsignedByte")
    protected Short stationDoorStatus;
    @XmlElement(name = "station-battery-status")
    @XmlSchemaType(name = "unsignedByte")
    protected Short stationBatteryStatus;
    @XmlElement(name = "station-line-volts")
    @XmlSchemaType(name = "unsignedByte")
    protected Short stationLineVolts;
    @XmlElement(name = "station-maintenance-group-name")
    protected String stationMaintenanceGroupName;
    @XmlElement(name = "station-maintenance-contact-information")
    protected ContactDetails stationMaintenanceContactInformation;
    @XmlElement(name = "station-maintenance-frequency")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationMaintenanceFrequency;
    @XmlElement(name = "station-maintenance-calibration-frequency")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationMaintenanceCalibrationFrequency;
    @XmlElement(name = "station-maintenance-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String stationMaintenanceStatus;
    @XmlElement(name = "station-installation-date")
    protected DateTimeZone stationInstallationDate;
    @XmlElement(name = "station-number-of-devices")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationNumberOfDevices;
    @XmlElement(name = "station-comm-method")
    @XmlSchemaType(name = "anySimpleType")
    protected String stationCommMethod;
    @XmlElement(name = "station-telephone-number")
    protected String stationTelephoneNumber;
    @XmlElement(name = "station-ip-address")
    protected String stationIpAddress;
    @XmlElement(name = "station-manufacturer")
    protected String stationManufacturer;
    @XmlElement(name = "station-observation-collection-frequency")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationObservationCollectionFrequency;
    @XmlElement(name = "station-observation-collection-offset")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationObservationCollectionOffset;
    @XmlElement(name = "station-transmission-frequency")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationTransmissionFrequency;
    @XmlElement(name = "station-transmission-offset")
    @XmlSchemaType(name = "unsignedInt")
    protected Long stationTransmissionOffset;
    @XmlElement(name = "station-transmission-format")
    protected String stationTransmissionFormat;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the stationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCategory() {
        return stationCategory;
    }

    /**
     * Sets the value of the stationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCategory(String value) {
        this.stationCategory = value;
    }

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
     * Gets the value of the stationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getStationLocation() {
        return stationLocation;
    }

    /**
     * Sets the value of the stationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setStationLocation(GeoLocation value) {
        this.stationLocation = value;
    }

    /**
     * Gets the value of the stationElevation property.
     * 
     */
    public short getStationElevation() {
        return stationElevation;
    }

    /**
     * Sets the value of the stationElevation property.
     * 
     */
    public void setStationElevation(short value) {
        this.stationElevation = value;
    }

    /**
     * Gets the value of the stationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationDescription() {
        return stationDescription;
    }

    /**
     * Sets the value of the stationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationDescription(String value) {
        this.stationDescription = value;
    }

    /**
     * Gets the value of the stationType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStationType() {
        return stationType;
    }

    /**
     * Sets the value of the stationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStationType(Short value) {
        this.stationType = value;
    }

    /**
     * Gets the value of the stationHorizontalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationHorizontalDatum() {
        return stationHorizontalDatum;
    }

    /**
     * Sets the value of the stationHorizontalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationHorizontalDatum(String value) {
        this.stationHorizontalDatum = value;
    }

    /**
     * Gets the value of the stationVerticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationVerticalDatum() {
        return stationVerticalDatum;
    }

    /**
     * Sets the value of the stationVerticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationVerticalDatum(String value) {
        this.stationVerticalDatum = value;
    }

    /**
     * Gets the value of the stationPowerSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationPowerSource() {
        return stationPowerSource;
    }

    /**
     * Sets the value of the stationPowerSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationPowerSource(String value) {
        this.stationPowerSource = value;
    }

    /**
     * Gets the value of the stationDoorStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStationDoorStatus() {
        return stationDoorStatus;
    }

    /**
     * Sets the value of the stationDoorStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStationDoorStatus(Short value) {
        this.stationDoorStatus = value;
    }

    /**
     * Gets the value of the stationBatteryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStationBatteryStatus() {
        return stationBatteryStatus;
    }

    /**
     * Sets the value of the stationBatteryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStationBatteryStatus(Short value) {
        this.stationBatteryStatus = value;
    }

    /**
     * Gets the value of the stationLineVolts property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getStationLineVolts() {
        return stationLineVolts;
    }

    /**
     * Sets the value of the stationLineVolts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setStationLineVolts(Short value) {
        this.stationLineVolts = value;
    }

    /**
     * Gets the value of the stationMaintenanceGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationMaintenanceGroupName() {
        return stationMaintenanceGroupName;
    }

    /**
     * Sets the value of the stationMaintenanceGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationMaintenanceGroupName(String value) {
        this.stationMaintenanceGroupName = value;
    }

    /**
     * Gets the value of the stationMaintenanceContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getStationMaintenanceContactInformation() {
        return stationMaintenanceContactInformation;
    }

    /**
     * Sets the value of the stationMaintenanceContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setStationMaintenanceContactInformation(ContactDetails value) {
        this.stationMaintenanceContactInformation = value;
    }

    /**
     * Gets the value of the stationMaintenanceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationMaintenanceFrequency() {
        return stationMaintenanceFrequency;
    }

    /**
     * Sets the value of the stationMaintenanceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationMaintenanceFrequency(Long value) {
        this.stationMaintenanceFrequency = value;
    }

    /**
     * Gets the value of the stationMaintenanceCalibrationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationMaintenanceCalibrationFrequency() {
        return stationMaintenanceCalibrationFrequency;
    }

    /**
     * Sets the value of the stationMaintenanceCalibrationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationMaintenanceCalibrationFrequency(Long value) {
        this.stationMaintenanceCalibrationFrequency = value;
    }

    /**
     * Gets the value of the stationMaintenanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationMaintenanceStatus() {
        return stationMaintenanceStatus;
    }

    /**
     * Sets the value of the stationMaintenanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationMaintenanceStatus(String value) {
        this.stationMaintenanceStatus = value;
    }

    /**
     * Gets the value of the stationInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getStationInstallationDate() {
        return stationInstallationDate;
    }

    /**
     * Sets the value of the stationInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setStationInstallationDate(DateTimeZone value) {
        this.stationInstallationDate = value;
    }

    /**
     * Gets the value of the stationNumberOfDevices property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationNumberOfDevices() {
        return stationNumberOfDevices;
    }

    /**
     * Sets the value of the stationNumberOfDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationNumberOfDevices(Long value) {
        this.stationNumberOfDevices = value;
    }

    /**
     * Gets the value of the stationCommMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCommMethod() {
        return stationCommMethod;
    }

    /**
     * Sets the value of the stationCommMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCommMethod(String value) {
        this.stationCommMethod = value;
    }

    /**
     * Gets the value of the stationTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTelephoneNumber() {
        return stationTelephoneNumber;
    }

    /**
     * Sets the value of the stationTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTelephoneNumber(String value) {
        this.stationTelephoneNumber = value;
    }

    /**
     * Gets the value of the stationIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationIpAddress() {
        return stationIpAddress;
    }

    /**
     * Sets the value of the stationIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationIpAddress(String value) {
        this.stationIpAddress = value;
    }

    /**
     * Gets the value of the stationManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationManufacturer() {
        return stationManufacturer;
    }

    /**
     * Sets the value of the stationManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationManufacturer(String value) {
        this.stationManufacturer = value;
    }

    /**
     * Gets the value of the stationObservationCollectionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationObservationCollectionFrequency() {
        return stationObservationCollectionFrequency;
    }

    /**
     * Sets the value of the stationObservationCollectionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationObservationCollectionFrequency(Long value) {
        this.stationObservationCollectionFrequency = value;
    }

    /**
     * Gets the value of the stationObservationCollectionOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationObservationCollectionOffset() {
        return stationObservationCollectionOffset;
    }

    /**
     * Sets the value of the stationObservationCollectionOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationObservationCollectionOffset(Long value) {
        this.stationObservationCollectionOffset = value;
    }

    /**
     * Gets the value of the stationTransmissionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationTransmissionFrequency() {
        return stationTransmissionFrequency;
    }

    /**
     * Sets the value of the stationTransmissionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationTransmissionFrequency(Long value) {
        this.stationTransmissionFrequency = value;
    }

    /**
     * Gets the value of the stationTransmissionOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStationTransmissionOffset() {
        return stationTransmissionOffset;
    }

    /**
     * Sets the value of the stationTransmissionOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStationTransmissionOffset(Long value) {
        this.stationTransmissionOffset = value;
    }

    /**
     * Gets the value of the stationTransmissionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTransmissionFormat() {
        return stationTransmissionFormat;
    }

    /**
     * Sets the value of the stationTransmissionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTransmissionFormat(String value) {
        this.stationTransmissionFormat = value;
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
