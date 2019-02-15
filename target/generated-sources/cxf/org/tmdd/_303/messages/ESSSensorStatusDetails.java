
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSSensorStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSSensorStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
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
@XmlType(name = "ESSSensorStatusDetails", propOrder = {
    "deviceStatusHeader",
    "any"
})
public class ESSSensorStatusDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
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
