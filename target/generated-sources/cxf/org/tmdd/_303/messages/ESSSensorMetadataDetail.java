
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSSensorMetadataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSSensorMetadataDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="station-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="sensor-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="sensor-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="sensor-information-distribution-group" type="{http://www.tmdd.org/303/messages}Ess-distribution-group"/&gt;
 *         &lt;element name="sensor-installation-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="ess-observation-type" type="{http://www.tmdd.org/303/messages}Ess-object-name"/&gt;
 *         &lt;element name="sensor-min-value-range" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number" minOccurs="0"/&gt;
 *         &lt;element name="sensor-max-value-range" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number" minOccurs="0"/&gt;
 *         &lt;element name="sensor-manufacturer" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="sensor-model-number" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="sensor-index" type="{http://www.tmdd.org/303/messages}Ess-observation-sensor-index"/&gt;
 *         &lt;element name="sensor-rate-of-change-interval" type="{http://www.tmdd.org/303/messages}Ess-time-span-seconds" minOccurs="0"/&gt;
 *         &lt;element name="sensor-max-positive-rate-of-change" type="{http://www.tmdd.org/303/messages}Ess-observation-rate-of-change" minOccurs="0"/&gt;
 *         &lt;element name="sensor-max-negative-rate-of-change" type="{http://www.tmdd.org/303/messages}Ess-observation-rate-of-change" minOccurs="0"/&gt;
 *         &lt;element name="sensor-persistence-interval" type="{http://www.tmdd.org/303/messages}Ess-time-span-seconds" minOccurs="0"/&gt;
 *         &lt;element name="sensor-persistence-threshhold" type="{http://www.tmdd.org/303/messages}Ess-observation-rate-of-change" minOccurs="0"/&gt;
 *         &lt;element name="sensor-like-instrument-threshhold" type="{http://www.tmdd.org/303/messages}Ess-sensor-resolution" minOccurs="0"/&gt;
 *         &lt;element name="sensor-maintenance-calibration-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="sensor-last-maintenance-date" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="sensor-serial-number" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="sensor-resolution" type="{http://www.tmdd.org/303/messages}Ess-sensor-resolution" minOccurs="0"/&gt;
 *         &lt;element name="sensor-accuracy" type="{http://www.tmdd.org/303/messages}Ess-sensor-accuracy" minOccurs="0"/&gt;
 *         &lt;element name="sensor-min-value-output" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number" minOccurs="0"/&gt;
 *         &lt;element name="sensor-max-value-output" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number" minOccurs="0"/&gt;
 *         &lt;element name="sensor-to-station-north-south-offset" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="sensor-to-station-east-west-offset" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="sensor-to-station-elevation-offset" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="sensor-to-surface-elevation-offset" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="sensor-embedded-material-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="sensor-output-average-interval" type="{http://www.tmdd.org/303/messages}Ess-time-span-milliseconds" minOccurs="0"/&gt;
 *         &lt;element name="sensor-output-internal-units" type="{http://www.tmdd.org/303/messages}Ess-observation-units" minOccurs="0"/&gt;
 *         &lt;element name="sensor-last-out-of-service-begin-date-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="sensor-last-out-of-service-end-date-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="sensor-sampling-interval" type="{http://www.tmdd.org/303/messages}Ess-time-span-seconds" minOccurs="0"/&gt;
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
@XmlType(name = "ESSSensorMetadataDetail", propOrder = {
    "stationId",
    "sensorId",
    "sensorDescription",
    "sensorInformationDistributionGroup",
    "sensorInstallationDate",
    "essObservationType",
    "sensorMinValueRange",
    "sensorMaxValueRange",
    "sensorManufacturer",
    "sensorModelNumber",
    "sensorIndex",
    "sensorRateOfChangeInterval",
    "sensorMaxPositiveRateOfChange",
    "sensorMaxNegativeRateOfChange",
    "sensorPersistenceInterval",
    "sensorPersistenceThreshhold",
    "sensorLikeInstrumentThreshhold",
    "sensorMaintenanceCalibrationDate",
    "sensorLastMaintenanceDate",
    "sensorSerialNumber",
    "sensorResolution",
    "sensorAccuracy",
    "sensorMinValueOutput",
    "sensorMaxValueOutput",
    "sensorToStationNorthSouthOffset",
    "sensorToStationEastWestOffset",
    "sensorToStationElevationOffset",
    "sensorToSurfaceElevationOffset",
    "sensorEmbeddedMaterialDescription",
    "sensorOutputAverageInterval",
    "sensorOutputInternalUnits",
    "sensorLastOutOfServiceBeginDateTime",
    "sensorLastOutOfServiceEndDateTime",
    "sensorSamplingInterval",
    "any"
})
public class ESSSensorMetadataDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "station-id", required = true)
    protected String stationId;
    @XmlElement(name = "sensor-id", required = true)
    protected String sensorId;
    @XmlElement(name = "sensor-description")
    protected String sensorDescription;
    @XmlElement(name = "sensor-information-distribution-group", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sensorInformationDistributionGroup;
    @XmlElement(name = "sensor-installation-date")
    protected DateTimeZone sensorInstallationDate;
    @XmlElement(name = "ess-observation-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String essObservationType;
    @XmlElement(name = "sensor-min-value-range")
    protected Integer sensorMinValueRange;
    @XmlElement(name = "sensor-max-value-range")
    protected Integer sensorMaxValueRange;
    @XmlElement(name = "sensor-manufacturer", required = true)
    protected String sensorManufacturer;
    @XmlElement(name = "sensor-model-number", required = true)
    protected String sensorModelNumber;
    @XmlElement(name = "sensor-index")
    protected int sensorIndex;
    @XmlElement(name = "sensor-rate-of-change-interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sensorRateOfChangeInterval;
    @XmlElement(name = "sensor-max-positive-rate-of-change")
    protected Float sensorMaxPositiveRateOfChange;
    @XmlElement(name = "sensor-max-negative-rate-of-change")
    protected Float sensorMaxNegativeRateOfChange;
    @XmlElement(name = "sensor-persistence-interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sensorPersistenceInterval;
    @XmlElement(name = "sensor-persistence-threshhold")
    protected Float sensorPersistenceThreshhold;
    @XmlElement(name = "sensor-like-instrument-threshhold")
    protected Float sensorLikeInstrumentThreshhold;
    @XmlElement(name = "sensor-maintenance-calibration-date")
    protected DateTimeZone sensorMaintenanceCalibrationDate;
    @XmlElement(name = "sensor-last-maintenance-date")
    protected DateTimeZone sensorLastMaintenanceDate;
    @XmlElement(name = "sensor-serial-number")
    protected String sensorSerialNumber;
    @XmlElement(name = "sensor-resolution")
    protected Float sensorResolution;
    @XmlElement(name = "sensor-accuracy")
    protected Float sensorAccuracy;
    @XmlElement(name = "sensor-min-value-output")
    protected Integer sensorMinValueOutput;
    @XmlElement(name = "sensor-max-value-output")
    protected Integer sensorMaxValueOutput;
    @XmlElement(name = "sensor-to-station-north-south-offset")
    protected Float sensorToStationNorthSouthOffset;
    @XmlElement(name = "sensor-to-station-east-west-offset")
    protected Float sensorToStationEastWestOffset;
    @XmlElement(name = "sensor-to-station-elevation-offset")
    protected Float sensorToStationElevationOffset;
    @XmlElement(name = "sensor-to-surface-elevation-offset")
    protected Float sensorToSurfaceElevationOffset;
    @XmlElement(name = "sensor-embedded-material-description")
    protected String sensorEmbeddedMaterialDescription;
    @XmlElement(name = "sensor-output-average-interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sensorOutputAverageInterval;
    @XmlElement(name = "sensor-output-internal-units")
    protected String sensorOutputInternalUnits;
    @XmlElement(name = "sensor-last-out-of-service-begin-date-time")
    protected DateTimeZone sensorLastOutOfServiceBeginDateTime;
    @XmlElement(name = "sensor-last-out-of-service-end-date-time")
    protected DateTimeZone sensorLastOutOfServiceEndDateTime;
    @XmlElement(name = "sensor-sampling-interval")
    @XmlSchemaType(name = "unsignedInt")
    protected Long sensorSamplingInterval;
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
     * Gets the value of the sensorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorId() {
        return sensorId;
    }

    /**
     * Sets the value of the sensorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorId(String value) {
        this.sensorId = value;
    }

    /**
     * Gets the value of the sensorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorDescription() {
        return sensorDescription;
    }

    /**
     * Sets the value of the sensorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorDescription(String value) {
        this.sensorDescription = value;
    }

    /**
     * Gets the value of the sensorInformationDistributionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorInformationDistributionGroup() {
        return sensorInformationDistributionGroup;
    }

    /**
     * Sets the value of the sensorInformationDistributionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorInformationDistributionGroup(String value) {
        this.sensorInformationDistributionGroup = value;
    }

    /**
     * Gets the value of the sensorInstallationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSensorInstallationDate() {
        return sensorInstallationDate;
    }

    /**
     * Sets the value of the sensorInstallationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSensorInstallationDate(DateTimeZone value) {
        this.sensorInstallationDate = value;
    }

    /**
     * Gets the value of the essObservationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssObservationType() {
        return essObservationType;
    }

    /**
     * Sets the value of the essObservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssObservationType(String value) {
        this.essObservationType = value;
    }

    /**
     * Gets the value of the sensorMinValueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorMinValueRange() {
        return sensorMinValueRange;
    }

    /**
     * Sets the value of the sensorMinValueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorMinValueRange(Integer value) {
        this.sensorMinValueRange = value;
    }

    /**
     * Gets the value of the sensorMaxValueRange property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorMaxValueRange() {
        return sensorMaxValueRange;
    }

    /**
     * Sets the value of the sensorMaxValueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorMaxValueRange(Integer value) {
        this.sensorMaxValueRange = value;
    }

    /**
     * Gets the value of the sensorManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorManufacturer() {
        return sensorManufacturer;
    }

    /**
     * Sets the value of the sensorManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorManufacturer(String value) {
        this.sensorManufacturer = value;
    }

    /**
     * Gets the value of the sensorModelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorModelNumber() {
        return sensorModelNumber;
    }

    /**
     * Sets the value of the sensorModelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorModelNumber(String value) {
        this.sensorModelNumber = value;
    }

    /**
     * Gets the value of the sensorIndex property.
     * 
     */
    public int getSensorIndex() {
        return sensorIndex;
    }

    /**
     * Sets the value of the sensorIndex property.
     * 
     */
    public void setSensorIndex(int value) {
        this.sensorIndex = value;
    }

    /**
     * Gets the value of the sensorRateOfChangeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorRateOfChangeInterval() {
        return sensorRateOfChangeInterval;
    }

    /**
     * Sets the value of the sensorRateOfChangeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorRateOfChangeInterval(Long value) {
        this.sensorRateOfChangeInterval = value;
    }

    /**
     * Gets the value of the sensorMaxPositiveRateOfChange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorMaxPositiveRateOfChange() {
        return sensorMaxPositiveRateOfChange;
    }

    /**
     * Sets the value of the sensorMaxPositiveRateOfChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorMaxPositiveRateOfChange(Float value) {
        this.sensorMaxPositiveRateOfChange = value;
    }

    /**
     * Gets the value of the sensorMaxNegativeRateOfChange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorMaxNegativeRateOfChange() {
        return sensorMaxNegativeRateOfChange;
    }

    /**
     * Sets the value of the sensorMaxNegativeRateOfChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorMaxNegativeRateOfChange(Float value) {
        this.sensorMaxNegativeRateOfChange = value;
    }

    /**
     * Gets the value of the sensorPersistenceInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorPersistenceInterval() {
        return sensorPersistenceInterval;
    }

    /**
     * Sets the value of the sensorPersistenceInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorPersistenceInterval(Long value) {
        this.sensorPersistenceInterval = value;
    }

    /**
     * Gets the value of the sensorPersistenceThreshhold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorPersistenceThreshhold() {
        return sensorPersistenceThreshhold;
    }

    /**
     * Sets the value of the sensorPersistenceThreshhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorPersistenceThreshhold(Float value) {
        this.sensorPersistenceThreshhold = value;
    }

    /**
     * Gets the value of the sensorLikeInstrumentThreshhold property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorLikeInstrumentThreshhold() {
        return sensorLikeInstrumentThreshhold;
    }

    /**
     * Sets the value of the sensorLikeInstrumentThreshhold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorLikeInstrumentThreshhold(Float value) {
        this.sensorLikeInstrumentThreshhold = value;
    }

    /**
     * Gets the value of the sensorMaintenanceCalibrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSensorMaintenanceCalibrationDate() {
        return sensorMaintenanceCalibrationDate;
    }

    /**
     * Sets the value of the sensorMaintenanceCalibrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSensorMaintenanceCalibrationDate(DateTimeZone value) {
        this.sensorMaintenanceCalibrationDate = value;
    }

    /**
     * Gets the value of the sensorLastMaintenanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSensorLastMaintenanceDate() {
        return sensorLastMaintenanceDate;
    }

    /**
     * Sets the value of the sensorLastMaintenanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSensorLastMaintenanceDate(DateTimeZone value) {
        this.sensorLastMaintenanceDate = value;
    }

    /**
     * Gets the value of the sensorSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorSerialNumber() {
        return sensorSerialNumber;
    }

    /**
     * Sets the value of the sensorSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorSerialNumber(String value) {
        this.sensorSerialNumber = value;
    }

    /**
     * Gets the value of the sensorResolution property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorResolution() {
        return sensorResolution;
    }

    /**
     * Sets the value of the sensorResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorResolution(Float value) {
        this.sensorResolution = value;
    }

    /**
     * Gets the value of the sensorAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorAccuracy() {
        return sensorAccuracy;
    }

    /**
     * Sets the value of the sensorAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorAccuracy(Float value) {
        this.sensorAccuracy = value;
    }

    /**
     * Gets the value of the sensorMinValueOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorMinValueOutput() {
        return sensorMinValueOutput;
    }

    /**
     * Sets the value of the sensorMinValueOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorMinValueOutput(Integer value) {
        this.sensorMinValueOutput = value;
    }

    /**
     * Gets the value of the sensorMaxValueOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorMaxValueOutput() {
        return sensorMaxValueOutput;
    }

    /**
     * Sets the value of the sensorMaxValueOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorMaxValueOutput(Integer value) {
        this.sensorMaxValueOutput = value;
    }

    /**
     * Gets the value of the sensorToStationNorthSouthOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorToStationNorthSouthOffset() {
        return sensorToStationNorthSouthOffset;
    }

    /**
     * Sets the value of the sensorToStationNorthSouthOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorToStationNorthSouthOffset(Float value) {
        this.sensorToStationNorthSouthOffset = value;
    }

    /**
     * Gets the value of the sensorToStationEastWestOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorToStationEastWestOffset() {
        return sensorToStationEastWestOffset;
    }

    /**
     * Sets the value of the sensorToStationEastWestOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorToStationEastWestOffset(Float value) {
        this.sensorToStationEastWestOffset = value;
    }

    /**
     * Gets the value of the sensorToStationElevationOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorToStationElevationOffset() {
        return sensorToStationElevationOffset;
    }

    /**
     * Sets the value of the sensorToStationElevationOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorToStationElevationOffset(Float value) {
        this.sensorToStationElevationOffset = value;
    }

    /**
     * Gets the value of the sensorToSurfaceElevationOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSensorToSurfaceElevationOffset() {
        return sensorToSurfaceElevationOffset;
    }

    /**
     * Sets the value of the sensorToSurfaceElevationOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSensorToSurfaceElevationOffset(Float value) {
        this.sensorToSurfaceElevationOffset = value;
    }

    /**
     * Gets the value of the sensorEmbeddedMaterialDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorEmbeddedMaterialDescription() {
        return sensorEmbeddedMaterialDescription;
    }

    /**
     * Sets the value of the sensorEmbeddedMaterialDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorEmbeddedMaterialDescription(String value) {
        this.sensorEmbeddedMaterialDescription = value;
    }

    /**
     * Gets the value of the sensorOutputAverageInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorOutputAverageInterval() {
        return sensorOutputAverageInterval;
    }

    /**
     * Sets the value of the sensorOutputAverageInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorOutputAverageInterval(Long value) {
        this.sensorOutputAverageInterval = value;
    }

    /**
     * Gets the value of the sensorOutputInternalUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorOutputInternalUnits() {
        return sensorOutputInternalUnits;
    }

    /**
     * Sets the value of the sensorOutputInternalUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorOutputInternalUnits(String value) {
        this.sensorOutputInternalUnits = value;
    }

    /**
     * Gets the value of the sensorLastOutOfServiceBeginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSensorLastOutOfServiceBeginDateTime() {
        return sensorLastOutOfServiceBeginDateTime;
    }

    /**
     * Sets the value of the sensorLastOutOfServiceBeginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSensorLastOutOfServiceBeginDateTime(DateTimeZone value) {
        this.sensorLastOutOfServiceBeginDateTime = value;
    }

    /**
     * Gets the value of the sensorLastOutOfServiceEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSensorLastOutOfServiceEndDateTime() {
        return sensorLastOutOfServiceEndDateTime;
    }

    /**
     * Sets the value of the sensorLastOutOfServiceEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSensorLastOutOfServiceEndDateTime(DateTimeZone value) {
        this.sensorLastOutOfServiceEndDateTime = value;
    }

    /**
     * Gets the value of the sensorSamplingInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSensorSamplingInterval() {
        return sensorSamplingInterval;
    }

    /**
     * Sets the value of the sensorSamplingInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSensorSamplingInterval(Long value) {
        this.sensorSamplingInterval = value;
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
