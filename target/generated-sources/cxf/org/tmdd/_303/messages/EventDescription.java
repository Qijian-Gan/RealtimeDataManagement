
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
 * <p>Java class for EventDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="phrase" type="{http://www.tmdd.org/303/messages}EventType"/&gt;
 *         &lt;element name="cause" type="{http://www.tmdd.org/303/messages}EventType"/&gt;
 *         &lt;element name="advice" type="{http://www.tmdd.org/303/messages}EventAdvice"/&gt;
 *         &lt;element name="qualifier" type="{http://www.tmdd.org/303/messages}EventQualifier"/&gt;
 *         &lt;element name="quantity" type="{http://www.tmdd.org/303/messages}EventQuantity"/&gt;
 *         &lt;element name="related-landmark" type="{http://www.tmdd.org/303/messages}LandmarkLocation"/&gt;
 *         &lt;element name="detour" type="{http://www.tmdd.org/303/messages}AlternateRouteDetail"/&gt;
 *         &lt;element name="additional-text" type="{http://www.tmdd.org/303/messages}AdditionalText"/&gt;
 *         &lt;element name="qualifier-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
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
@XmlType(name = "EventDescription", propOrder = {
    "phrase",
    "cause",
    "advice",
    "qualifier",
    "quantity",
    "relatedLandmark",
    "detour",
    "additionalText",
    "qualifierTime",
    "any"
})
public class EventDescription
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected EventType phrase;
    protected EventType cause;
    protected EventAdvice advice;
    protected EventQualifier qualifier;
    protected EventQuantity quantity;
    @XmlElement(name = "related-landmark")
    protected LandmarkLocation relatedLandmark;
    protected AlternateRouteDetail detour;
    @XmlElement(name = "additional-text")
    protected AdditionalText additionalText;
    @XmlElement(name = "qualifier-time")
    protected DateTimeZone qualifierTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the phrase property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setPhrase(EventType value) {
        this.phrase = value;
    }

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setCause(EventType value) {
        this.cause = value;
    }

    /**
     * Gets the value of the advice property.
     * 
     * @return
     *     possible object is
     *     {@link EventAdvice }
     *     
     */
    public EventAdvice getAdvice() {
        return advice;
    }

    /**
     * Sets the value of the advice property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventAdvice }
     *     
     */
    public void setAdvice(EventAdvice value) {
        this.advice = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link EventQualifier }
     *     
     */
    public EventQualifier getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventQualifier }
     *     
     */
    public void setQualifier(EventQualifier value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link EventQuantity }
     *     
     */
    public EventQuantity getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventQuantity }
     *     
     */
    public void setQuantity(EventQuantity value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the relatedLandmark property.
     * 
     * @return
     *     possible object is
     *     {@link LandmarkLocation }
     *     
     */
    public LandmarkLocation getRelatedLandmark() {
        return relatedLandmark;
    }

    /**
     * Sets the value of the relatedLandmark property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandmarkLocation }
     *     
     */
    public void setRelatedLandmark(LandmarkLocation value) {
        this.relatedLandmark = value;
    }

    /**
     * Gets the value of the detour property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateRouteDetail }
     *     
     */
    public AlternateRouteDetail getDetour() {
        return detour;
    }

    /**
     * Sets the value of the detour property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRouteDetail }
     *     
     */
    public void setDetour(AlternateRouteDetail value) {
        this.detour = value;
    }

    /**
     * Gets the value of the additionalText property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalText }
     *     
     */
    public AdditionalText getAdditionalText() {
        return additionalText;
    }

    /**
     * Sets the value of the additionalText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalText }
     *     
     */
    public void setAdditionalText(AdditionalText value) {
        this.additionalText = value;
    }

    /**
     * Gets the value of the qualifierTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getQualifierTime() {
        return qualifierTime;
    }

    /**
     * Sets the value of the qualifierTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setQualifierTime(DateTimeZone value) {
        this.qualifierTime = value;
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
