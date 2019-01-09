
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalControlSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalControlSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-control-schedule-header" type="{http://www.tmdd.org/303/messages}DeviceControlScheduleHeader"/&gt;
 *         &lt;element name="request-control-mode" type="{http://www.tmdd.org/303/messages}Intersection-signal-control-mode"/&gt;
 *         &lt;element name="timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "IntersectionSignalControlSchedule", propOrder = {
    "deviceControlScheduleHeader",
    "requestControlMode",
    "timingPatternId",
    "any"
})
public class IntersectionSignalControlSchedule
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-control-schedule-header", required = true)
    protected DeviceControlScheduleHeader deviceControlScheduleHeader;
    @XmlElement(name = "request-control-mode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String requestControlMode;
    @XmlElement(name = "timing-pattern-id", required = true)
    protected String timingPatternId;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceControlScheduleHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlScheduleHeader }
     *     
     */
    public DeviceControlScheduleHeader getDeviceControlScheduleHeader() {
        return deviceControlScheduleHeader;
    }

    /**
     * Sets the value of the deviceControlScheduleHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlScheduleHeader }
     *     
     */
    public void setDeviceControlScheduleHeader(DeviceControlScheduleHeader value) {
        this.deviceControlScheduleHeader = value;
    }

    /**
     * Gets the value of the requestControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestControlMode() {
        return requestControlMode;
    }

    /**
     * Sets the value of the requestControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestControlMode(String value) {
        this.requestControlMode = value;
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
