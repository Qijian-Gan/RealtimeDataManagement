
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CCTV&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CCTVControlRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTVControlRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-request-header" type="{http://www.tmdd.org/303/messages}DeviceControlRequestHeader"/&gt;
 *         &lt;element name="cctv-request-command" type="{http://www.tmdd.org/303/messages}Cctv-request-command"/&gt;
 *         &lt;element name="cctv-command-parameters" type="{http://www.tmdd.org/303/messages}CCTVControlDetails"/&gt;
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
@XmlType(name = "CCTVControlRequest", propOrder = {
    "deviceControlRequestHeader",
    "cctvRequestCommand",
    "cctvCommandParameters",
    "any"
})
public class CCTVControlRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-request-header", required = true)
    protected DeviceControlRequestHeader deviceControlRequestHeader;
    @XmlElement(name = "cctv-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String cctvRequestCommand;
    @XmlElement(name = "cctv-command-parameters", required = true)
    protected CCTVControlDetails cctvCommandParameters;
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
     * Gets the value of the cctvRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvRequestCommand() {
        return cctvRequestCommand;
    }

    /**
     * Sets the value of the cctvRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvRequestCommand(String value) {
        this.cctvRequestCommand = value;
    }

    /**
     * Gets the value of the cctvCommandParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CCTVControlDetails }
     *     
     */
    public CCTVControlDetails getCctvCommandParameters() {
        return cctvCommandParameters;
    }

    /**
     * Sets the value of the cctvCommandParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTVControlDetails }
     *     
     */
    public void setCctvCommandParameters(CCTVControlDetails value) {
        this.cctvCommandParameters = value;
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
