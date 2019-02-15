
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalTimingPatternInventoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalTimingPatternInventoryRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-information-request-header" type="{http://www.tmdd.org/303/messages}DeviceInformationRequest"/&gt;
 *         &lt;element name="timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalTimingPatternInventoryRequest", propOrder = {
    "deviceInformationRequestHeader",
    "timingPatternId",
    "any"
})
public class IntersectionSignalTimingPatternInventoryRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-information-request-header", required = true)
    protected DeviceInformationRequest deviceInformationRequestHeader;
    @XmlElement(name = "timing-pattern-id")
    protected String timingPatternId;
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
     * Gets the value of the timingPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternId() {
        return timingPatternId;
    }

    /**
     * Sets the value of the timingPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternId(String value) {
        this.timingPatternId = value;
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
