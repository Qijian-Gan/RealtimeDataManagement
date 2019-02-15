
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
 * <p>Java class for DMSMessageInventoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSMessageInventoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-information-request-header" type="{http://www.tmdd.org/303/messages}DeviceInformationRequest"/&gt;
 *         &lt;element name="message-number" type="{http://www.ntcip.org/c2f-object-references}DmsMsgTableSource" minOccurs="0"/&gt;
 *         &lt;element name="message-memory-type" type="{http://www.ntcip.org/c2f-object-references}DmsMessageMemoryType" minOccurs="0"/&gt;
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
@XmlType(name = "DMSMessageInventoryRequest", propOrder = {
    "deviceInformationRequestHeader",
    "messageNumber",
    "messageMemoryType",
    "any"
})
public class DMSMessageInventoryRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-information-request-header", required = true)
    protected DeviceInformationRequest deviceInformationRequestHeader;
    @XmlElement(name = "message-number")
    protected String messageNumber;
    @XmlElement(name = "message-memory-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String messageMemoryType;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceInformationRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequest }
     *     
     */
    public DeviceInformationRequest getDeviceInformationRequestHeader() {
        return deviceInformationRequestHeader;
    }

    /**
     * Sets the value of the deviceInformationRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequest }
     *     
     */
    public void setDeviceInformationRequestHeader(DeviceInformationRequest value) {
        this.deviceInformationRequestHeader = value;
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
     * Gets the value of the messageMemoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageMemoryType() {
        return messageMemoryType;
    }

    /**
     * Sets the value of the messageMemoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageMemoryType(String value) {
        this.messageMemoryType = value;
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
