
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DMS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DMSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="current-message" type="{http://www.ntcip.org/c2f-object-references}DmsMessageMultiString"/&gt;
 *         &lt;element name="message-number" type="{http://www.ntcip.org/c2f-object-references}DmsMsgTableSource" minOccurs="0"/&gt;
 *         &lt;element name="message-time-remaining" type="{http://www.ntcip.org/c2f-object-references}DmsMessageTimeRemaining" minOccurs="0"/&gt;
 *         &lt;element name="message-source-mode" type="{http://www.ntcip.org/c2f-object-references}DmsMsgSourceMode" minOccurs="0"/&gt;
 *         &lt;element name="message-beacon" type="{http://www.ntcip.org/c2f-object-references}DmsMessageBeacon" minOccurs="0"/&gt;
 *         &lt;element name="location-when-not-in-use" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation" minOccurs="0"/&gt;
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
@XmlType(name = "DMSStatus", propOrder = {
    "deviceStatusHeader",
    "currentMessage",
    "messageNumber",
    "messageTimeRemaining",
    "messageSourceMode",
    "messageBeacon",
    "locationWhenNotInUse",
    "any"
})
public class DMSStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "current-message", required = true)
    protected String currentMessage;
    @XmlElement(name = "message-number")
    protected String messageNumber;
    @XmlElement(name = "message-time-remaining")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer messageTimeRemaining;
    @XmlElement(name = "message-source-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String messageSourceMode;
    @XmlElement(name = "message-beacon")
    @XmlSchemaType(name = "unsignedByte")
    protected Short messageBeacon;
    @XmlElement(name = "location-when-not-in-use")
    protected GeoLocation locationWhenNotInUse;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDeviceStatusHeader() {
        return deviceStatusHeader;
    }

    /**
     * Sets the value of the deviceStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDeviceStatusHeader(DeviceStatusHeader value) {
        this.deviceStatusHeader = value;
    }

    /**
     * Gets the value of the currentMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentMessage() {
        return currentMessage;
    }

    /**
     * Sets the value of the currentMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentMessage(String value) {
        this.currentMessage = value;
    }

    /**
     * Gets the value of the messageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageNumber() {
        return messageNumber;
    }

    /**
     * Sets the value of the messageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageNumber(String value) {
        this.messageNumber = value;
    }

    /**
     * Gets the value of the messageTimeRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageTimeRemaining() {
        return messageTimeRemaining;
    }

    /**
     * Sets the value of the messageTimeRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageTimeRemaining(Integer value) {
        this.messageTimeRemaining = value;
    }

    /**
     * Gets the value of the messageSourceMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSourceMode() {
        return messageSourceMode;
    }

    /**
     * Sets the value of the messageSourceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSourceMode(String value) {
        this.messageSourceMode = value;
    }

    /**
     * Gets the value of the messageBeacon property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMessageBeacon() {
        return messageBeacon;
    }

    /**
     * Sets the value of the messageBeacon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMessageBeacon(Short value) {
        this.messageBeacon = value;
    }

    /**
     * Gets the value of the locationWhenNotInUse property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getLocationWhenNotInUse() {
        return locationWhenNotInUse;
    }

    /**
     * Sets the value of the locationWhenNotInUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setLocationWhenNotInUse(GeoLocation value) {
        this.locationWhenNotInUse = value;
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
