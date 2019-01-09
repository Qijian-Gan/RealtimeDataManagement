
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
 * <p>Java class for IntersectionSignalPriorityQueue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalPriorityQueue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-priority-queue-header" type="{http://www.tmdd.org/303/messages}DevicePriorityQueueHeader"/&gt;
 *         &lt;element name="intersection-request-command" type="{http://www.tmdd.org/303/messages}Intersection-signal-request-command"/&gt;
 *         &lt;element name="intersection-queue-parameters" type="{http://www.tmdd.org/303/messages}IntersectionSignalControlDetails"/&gt;
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
@XmlType(name = "IntersectionSignalPriorityQueue", propOrder = {
    "devicePriorityQueueHeader",
    "intersectionRequestCommand",
    "intersectionQueueParameters",
    "any"
})
public class IntersectionSignalPriorityQueue
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-priority-queue-header", required = true)
    protected DevicePriorityQueueHeader devicePriorityQueueHeader;
    @XmlElement(name = "intersection-request-command", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String intersectionRequestCommand;
    @XmlElement(name = "intersection-queue-parameters", required = true)
    protected IntersectionSignalControlDetails intersectionQueueParameters;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the devicePriorityQueueHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePriorityQueueHeader }
     *     
     */
    public DevicePriorityQueueHeader getDevicePriorityQueueHeader() {
        return devicePriorityQueueHeader;
    }

    /**
     * Sets the value of the devicePriorityQueueHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePriorityQueueHeader }
     *     
     */
    public void setDevicePriorityQueueHeader(DevicePriorityQueueHeader value) {
        this.devicePriorityQueueHeader = value;
    }

    /**
     * Gets the value of the intersectionRequestCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionRequestCommand() {
        return intersectionRequestCommand;
    }

    /**
     * Sets the value of the intersectionRequestCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionRequestCommand(String value) {
        this.intersectionRequestCommand = value;
    }

    /**
     * Gets the value of the intersectionQueueParameters property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalControlDetails }
     *     
     */
    public IntersectionSignalControlDetails getIntersectionQueueParameters() {
        return intersectionQueueParameters;
    }

    /**
     * Sets the value of the intersectionQueueParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalControlDetails }
     *     
     */
    public void setIntersectionQueueParameters(IntersectionSignalControlDetails value) {
        this.intersectionQueueParameters = value;
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
