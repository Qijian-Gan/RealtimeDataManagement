
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DataLinkRestrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataLinkRestrictions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="speed-limit-advisory" type="{http://www.tmdd.org/303/messages}Link-speed-limit"/&gt;
 *         &lt;element name="speed-limit" type="{http://www.tmdd.org/303/messages}Link-speed-limit"/&gt;
 *         &lt;element name="speed-limit-truck" type="{http://www.tmdd.org/303/messages}Link-speed-limit"/&gt;
 *         &lt;element name="restriction-length" type="{http://www.tmdd.org/303/messages}Link-restriction-length"/&gt;
 *         &lt;element name="restriction-height" type="{http://www.tmdd.org/303/messages}Link-restriction-height"/&gt;
 *         &lt;element name="restriction-width" type="{http://www.tmdd.org/303/messages}Link-restriction-width"/&gt;
 *         &lt;element name="restriction-weight-vehicle" type="{http://www.tmdd.org/303/messages}Link-restriction-weight-vehicle"/&gt;
 *         &lt;element name="restriction-weight-axle" type="{http://www.tmdd.org/303/messages}Link-restriction-weight-axle"/&gt;
 *         &lt;element name="restriction-axle-count" type="{http://www.tmdd.org/303/messages}Link-restriction-axle-count"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataLinkRestrictions", propOrder = {
    "speedLimitAdvisory",
    "speedLimit",
    "speedLimitTruck",
    "restrictionLength",
    "restrictionHeight",
    "restrictionWidth",
    "restrictionWeightVehicle",
    "restrictionWeightAxle",
    "restrictionAxleCount",
    "any"
})
public class DataLinkRestrictions
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "speed-limit-advisory")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedLimitAdvisory;
    @XmlElement(name = "speed-limit")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedLimit;
    @XmlElement(name = "speed-limit-truck")
    @XmlSchemaType(name = "unsignedByte")
    protected Short speedLimitTruck;
    @XmlElement(name = "restriction-length")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionLength;
    @XmlElement(name = "restriction-height")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionHeight;
    @XmlElement(name = "restriction-width")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionWidth;
    @XmlElement(name = "restriction-weight-vehicle")
    @XmlSchemaType(name = "unsignedInt")
    protected Long restrictionWeightVehicle;
    @XmlElement(name = "restriction-weight-axle")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer restrictionWeightAxle;
    @XmlElement(name = "restriction-axle-count")
    @XmlSchemaType(name = "unsignedByte")
    protected Short restrictionAxleCount;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the speedLimitAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedLimitAdvisory() {
        return speedLimitAdvisory;
    }

    /**
     * Sets the value of the speedLimitAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedLimitAdvisory(Short value) {
        this.speedLimitAdvisory = value;
    }

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedLimit(Short value) {
        this.speedLimit = value;
    }

    /**
     * Gets the value of the speedLimitTruck property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSpeedLimitTruck() {
        return speedLimitTruck;
    }

    /**
     * Sets the value of the speedLimitTruck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSpeedLimitTruck(Short value) {
        this.speedLimitTruck = value;
    }

    /**
     * Gets the value of the restrictionLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionLength() {
        return restrictionLength;
    }

    /**
     * Sets the value of the restrictionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionLength(Integer value) {
        this.restrictionLength = value;
    }

    /**
     * Gets the value of the restrictionHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionHeight() {
        return restrictionHeight;
    }

    /**
     * Sets the value of the restrictionHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionHeight(Integer value) {
        this.restrictionHeight = value;
    }

    /**
     * Gets the value of the restrictionWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionWidth() {
        return restrictionWidth;
    }

    /**
     * Sets the value of the restrictionWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionWidth(Integer value) {
        this.restrictionWidth = value;
    }

    /**
     * Gets the value of the restrictionWeightVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictionWeightVehicle() {
        return restrictionWeightVehicle;
    }

    /**
     * Sets the value of the restrictionWeightVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictionWeightVehicle(Long value) {
        this.restrictionWeightVehicle = value;
    }

    /**
     * Gets the value of the restrictionWeightAxle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRestrictionWeightAxle() {
        return restrictionWeightAxle;
    }

    /**
     * Sets the value of the restrictionWeightAxle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRestrictionWeightAxle(Integer value) {
        this.restrictionWeightAxle = value;
    }

    /**
     * Gets the value of the restrictionAxleCount property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRestrictionAxleCount() {
        return restrictionAxleCount;
    }

    /**
     * Sets the value of the restrictionAxleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRestrictionAxleCount(Short value) {
        this.restrictionAxleCount = value;
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
