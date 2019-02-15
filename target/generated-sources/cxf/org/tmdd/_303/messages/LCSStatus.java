
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;LCS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LCSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCSStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="lane-current-state" type="{http://www.tmdd.org/303/messages}Lcs-lane-current-state"/&gt;
 *         &lt;element name="link-direction" type="{http://www.tmdd.org/303/messages}Link-direction"/&gt;
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
@XmlType(name = "LCSStatus", propOrder = {
    "deviceStatusHeader",
    "laneCurrentState",
    "linkDirection",
    "any"
})
public class LCSStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "lane-current-state", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String laneCurrentState;
    @XmlElement(name = "link-direction", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDirection;
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
     * Gets the value of the laneCurrentState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaneCurrentState() {
        return laneCurrentState;
    }

    /**
     * Sets the value of the laneCurrentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaneCurrentState(String value) {
        this.laneCurrentState = value;
    }

    /**
     * Gets the value of the linkDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDirection() {
        return linkDirection;
    }

    /**
     * Sets the value of the linkDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDirection(String value) {
        this.linkDirection = value;
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
