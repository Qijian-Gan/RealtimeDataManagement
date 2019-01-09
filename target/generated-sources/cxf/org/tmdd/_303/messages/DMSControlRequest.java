
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DMS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DMSControlRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSControlRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-request-header" type="{http://www.tmdd.org/303/messages}DeviceControlRequestHeader"/&gt;
 *         &lt;element name="dms-request-command" type="{http://www.tmdd.org/303/messages}Dms-request-command"/&gt;
 *         &lt;element name="dms-command-parameters" type="{http://www.tmdd.org/303/messages}DMSControlDetails"/&gt;
 *         &lt;element name="dms-beacon-control" type="{http://www.ntcip.org/c2f-object-references}DmsMessageBeacon" minOccurs="0"/&gt;
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
@XmlType(name = "DMSControlRequest", propOrder = {
    "deviceControlRequestHeader",
    "dmsRequestCommand",
    "dmsCommandParameters",
    "dmsBeaconControl",
    "any"
})
public class DMSControlRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-request-header", required = true)
    protected DeviceControlRequestHeader deviceControlRequestHeader;
    @XmlElement(name = "dms-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dmsRequestCommand;
    @XmlElement(name = "dms-command-parameters", required = true)
    protected DMSControlDetails dmsCommandParameters;
    @XmlElement(name = "dms-beacon-control")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dmsBeaconControl;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceControlRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlRequestHeader }
     *     
     */
    public DeviceControlRequestHeader getDeviceControlRequestHeader() {
        return deviceControlRequestHeader;
    }

    /**
     * Sets the value of the deviceControlRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlRequestHeader }
     *     
     */
    public void setDeviceControlRequestHeader(DeviceControlRequestHeader value) {
        this.deviceControlRequestHeader = value;
    }

    /**
     * Gets the value of the dmsRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsRequestCommand() {
        return dmsRequestCommand;
    }

    /**
     * Sets the value of the dmsRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsRequestCommand(String value) {
        this.dmsRequestCommand = value;
    }

    /**
     * Gets the value of the dmsCommandParameters property.
     * 
     * @return
     *     possible object is
     *     {@link DMSControlDetails }
     *     
     */
    public DMSControlDetails getDmsCommandParameters() {
        return dmsCommandParameters;
    }

    /**
     * Sets the value of the dmsCommandParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSControlDetails }
     *     
     */
    public void setDmsCommandParameters(DMSControlDetails value) {
        this.dmsCommandParameters = value;
    }

    /**
     * Gets the value of the dmsBeaconControl property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDmsBeaconControl() {
        return dmsBeaconControl;
    }

    /**
     * Sets the value of the dmsBeaconControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDmsBeaconControl(Short value) {
        this.dmsBeaconControl = value;
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
