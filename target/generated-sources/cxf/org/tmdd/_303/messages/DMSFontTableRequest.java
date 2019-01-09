
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
 * <p>Java class for DMSFontTableRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSFontTableRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-information-request-header" type="{http://www.tmdd.org/303/messages}DeviceInformationRequest"/&gt;
 *         &lt;element name="fontNumber" type="{http://www.ntcip.org/c2f-object-references}FontNumber" minOccurs="0"/&gt;
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
@XmlType(name = "DMSFontTableRequest", propOrder = {
    "deviceInformationRequestHeader",
    "fontNumber",
    "any"
})
public class DMSFontTableRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-information-request-header", required = true)
    protected DeviceInformationRequest deviceInformationRequestHeader;
    @XmlSchemaType(name = "unsignedByte")
    protected Short fontNumber;
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
     * Gets the value of the fontNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFontNumber() {
        return fontNumber;
    }

    /**
     * Sets the value of the fontNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFontNumber(Short value) {
        this.fontNumber = value;
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
