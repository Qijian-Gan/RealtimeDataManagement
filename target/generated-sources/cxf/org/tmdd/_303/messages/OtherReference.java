
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OtherReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="trip-reference" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="responsible-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="related-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="previous-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="split-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="merged-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="sibling-event" type="{http://www.tmdd.org/303/messages}EventReference"/&gt;
 *         &lt;element name="associated-device" type="{http://www.tmdd.org/303/messages}DeviceReference"/&gt;
 *         &lt;element name="associated-url" type="{http://www.tmdd.org/303/messages}UrlReference"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherReference", propOrder = {
    "tripReference",
    "responsibleEvent",
    "relatedEvent",
    "previousEvent",
    "splitEvent",
    "mergedEvent",
    "siblingEvent",
    "associatedDevice",
    "associatedUrl",
    "any"
})
public class OtherReference
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "trip-reference")
    protected String tripReference;
    @XmlElement(name = "responsible-event")
    protected EventReference responsibleEvent;
    @XmlElement(name = "related-event")
    protected EventReference relatedEvent;
    @XmlElement(name = "previous-event")
    protected EventReference previousEvent;
    @XmlElement(name = "split-event")
    protected EventReference splitEvent;
    @XmlElement(name = "merged-event")
    protected EventReference mergedEvent;
    @XmlElement(name = "sibling-event")
    protected EventReference siblingEvent;
    @XmlElement(name = "associated-device")
    protected DeviceReference associatedDevice;
    @XmlElement(name = "associated-url")
    protected UrlReference associatedUrl;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the tripReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripReference() {
        return tripReference;
    }

    /**
     * Sets the value of the tripReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripReference(String value) {
        this.tripReference = value;
    }

    /**
     * Gets the value of the responsibleEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getResponsibleEvent() {
        return responsibleEvent;
    }

    /**
     * Sets the value of the responsibleEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setResponsibleEvent(EventReference value) {
        this.responsibleEvent = value;
    }

    /**
     * Gets the value of the relatedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getRelatedEvent() {
        return relatedEvent;
    }

    /**
     * Sets the value of the relatedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setRelatedEvent(EventReference value) {
        this.relatedEvent = value;
    }

    /**
     * Gets the value of the previousEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getPreviousEvent() {
        return previousEvent;
    }

    /**
     * Sets the value of the previousEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setPreviousEvent(EventReference value) {
        this.previousEvent = value;
    }

    /**
     * Gets the value of the splitEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getSplitEvent() {
        return splitEvent;
    }

    /**
     * Sets the value of the splitEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setSplitEvent(EventReference value) {
        this.splitEvent = value;
    }

    /**
     * Gets the value of the mergedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getMergedEvent() {
        return mergedEvent;
    }

    /**
     * Sets the value of the mergedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setMergedEvent(EventReference value) {
        this.mergedEvent = value;
    }

    /**
     * Gets the value of the siblingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getSiblingEvent() {
        return siblingEvent;
    }

    /**
     * Sets the value of the siblingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setSiblingEvent(EventReference value) {
        this.siblingEvent = value;
    }

    /**
     * Gets the value of the associatedDevice property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceReference }
     *     
     */
    public DeviceReference getAssociatedDevice() {
        return associatedDevice;
    }

    /**
     * Sets the value of the associatedDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceReference }
     *     
     */
    public void setAssociatedDevice(DeviceReference value) {
        this.associatedDevice = value;
    }

    /**
     * Gets the value of the associatedUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlReference }
     *     
     */
    public UrlReference getAssociatedUrl() {
        return associatedUrl;
    }

    /**
     * Sets the value of the associatedUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlReference }
     *     
     */
    public void setAssociatedUrl(UrlReference value) {
        this.associatedUrl = value;
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
