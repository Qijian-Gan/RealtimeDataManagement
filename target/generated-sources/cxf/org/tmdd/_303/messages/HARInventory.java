
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;HAR&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HARInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HARInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="device-beacon" type="{http://www.tmdd.org/303/messages}Device-beacon"/&gt;
 *         &lt;element name="har-characteristics" type="{http://www.tmdd.org/303/messages}Har-characteristics" minOccurs="0"/&gt;
 *         &lt;element name="har-frequency-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="har-call-sign" type="{http://www.tmdd.org/303/messages}Har-call-sign" minOccurs="0"/&gt;
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
@XmlType(name = "HARInventory", propOrder = {
    "deviceInventoryHeader",
    "deviceBeacon",
    "harCharacteristics",
    "harFrequencyDescription",
    "harCallSign",
    "any"
})
public class HARInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "device-beacon", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String deviceBeacon;
    @XmlElement(name = "har-characteristics")
    protected String harCharacteristics;
    @XmlElement(name = "har-frequency-description")
    protected String harFrequencyDescription;
    @XmlElement(name = "har-call-sign")
    protected String harCallSign;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getDeviceInventoryHeader() {
        return deviceInventoryHeader;
    }

    /**
     * Sets the value of the deviceInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setDeviceInventoryHeader(DeviceInventoryHeader value) {
        this.deviceInventoryHeader = value;
    }

    /**
     * Gets the value of the deviceBeacon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceBeacon() {
        return deviceBeacon;
    }

    /**
     * Sets the value of the deviceBeacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceBeacon(String value) {
        this.deviceBeacon = value;
    }

    /**
     * Gets the value of the harCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarCharacteristics() {
        return harCharacteristics;
    }

    /**
     * Sets the value of the harCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarCharacteristics(String value) {
        this.harCharacteristics = value;
    }

    /**
     * Gets the value of the harFrequencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarFrequencyDescription() {
        return harFrequencyDescription;
    }

    /**
     * Sets the value of the harFrequencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarFrequencyDescription(String value) {
        this.harFrequencyDescription = value;
    }

    /**
     * Gets the value of the harCallSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarCallSign() {
        return harCallSign;
    }

    /**
     * Sets the value of the harCallSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarCallSign(String value) {
        this.harCallSign = value;
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
