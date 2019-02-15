
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
 * <p>Java class for ESSInventoryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSInventoryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ess-sensor-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="lane-number" type="{http://www.tmdd.org/303/messages}Link-lane-number" minOccurs="0"/&gt;
 *         &lt;element name="sensor-location-elevation" type="{http://www.tmdd.org/303/messages}Device-location-elevation" minOccurs="0"/&gt;
 *         &lt;element name="sensor-location-height" type="{http://www.tmdd.org/303/messages}Device-location-height" minOccurs="0"/&gt;
 *         &lt;element name="sensor-type" type="{http://www.tmdd.org/303/messages}Ess-sensor-type" minOccurs="0"/&gt;
 *         &lt;element name="sensor-operation-type" type="{http://www.tmdd.org/303/messages}Device-operation-type" minOccurs="0"/&gt;
 *         &lt;element name="sensor-mobility-type" type="{http://www.tmdd.org/303/messages}Device-mobility-type" minOccurs="0"/&gt;
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
@XmlType(name = "ESSInventoryDetails", propOrder = {
    "essSensorInventoryHeader",
    "laneNumber",
    "sensorLocationElevation",
    "sensorLocationHeight",
    "sensorType",
    "sensorOperationType",
    "sensorMobilityType",
    "any"
})
public class ESSInventoryDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ess-sensor-inventory-header", required = true)
    protected DeviceInventoryHeader essSensorInventoryHeader;
    @XmlElement(name = "lane-number")
    @XmlSchemaType(name = "unsignedByte")
    protected Short laneNumber;
    @XmlElement(name = "sensor-location-elevation")
    protected Integer sensorLocationElevation;
    @XmlElement(name = "sensor-location-height")
    protected Short sensorLocationHeight;
    @XmlElement(name = "sensor-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sensorType;
    @XmlElement(name = "sensor-operation-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sensorOperationType;
    @XmlElement(name = "sensor-mobility-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String sensorMobilityType;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the essSensorInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getEssSensorInventoryHeader() {
        return essSensorInventoryHeader;
    }

    /**
     * Sets the value of the essSensorInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setEssSensorInventoryHeader(DeviceInventoryHeader value) {
        this.essSensorInventoryHeader = value;
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
     * Gets the value of the sensorLocationElevation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSensorLocationElevation() {
        return sensorLocationElevation;
    }

    /**
     * Sets the value of the sensorLocationElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSensorLocationElevation(Integer value) {
        this.sensorLocationElevation = value;
    }

    /**
     * Gets the value of the sensorLocationHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSensorLocationHeight() {
        return sensorLocationHeight;
    }

    /**
     * Sets the value of the sensorLocationHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSensorLocationHeight(Short value) {
        this.sensorLocationHeight = value;
    }

    /**
     * Gets the value of the sensorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorType(String value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the sensorOperationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorOperationType() {
        return sensorOperationType;
    }

    /**
     * Sets the value of the sensorOperationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorOperationType(String value) {
        this.sensorOperationType = value;
    }

    /**
     * Gets the value of the sensorMobilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorMobilityType() {
        return sensorMobilityType;
    }

    /**
     * Sets the value of the sensorMobilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorMobilityType(String value) {
        this.sensorMobilityType = value;
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
