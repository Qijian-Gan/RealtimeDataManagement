
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EventLane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventLane"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lanes-type" type="{http://www.ITIS-Adopted-03-00-02}LaneRoadway" minOccurs="0"/&gt;
 *         &lt;element name="link-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="lanes-total-original" type="{http://www.tmdd.org/303/messages}Link-lanes-count" minOccurs="0"/&gt;
 *         &lt;element name="lanes-total-affected" type="{http://www.tmdd.org/303/messages}Link-lanes-count" minOccurs="0"/&gt;
 *         &lt;element name="event-lanes-affected" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lanes-status" type="{http://www.ITIS-Adopted-03-00-02}Closures" minOccurs="0"/&gt;
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
@XmlType(name = "EventLane", propOrder = {
    "lanesType",
    "linkDirection",
    "lanesTotalOriginal",
    "lanesTotalAffected",
    "eventLanesAffected",
    "lanesStatus",
    "any"
})
public class EventLane
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "lanes-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String lanesType;
    @XmlElement(name = "link-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDirection;
    @XmlElement(name = "lanes-total-original")
    @XmlSchemaType(name = "unsignedByte")
    protected Short lanesTotalOriginal;
    @XmlElement(name = "lanes-total-affected")
    @XmlSchemaType(name = "unsignedByte")
    protected Short lanesTotalAffected;
    @XmlElement(name = "event-lanes-affected")
    protected EventLane.EventLanesAffected eventLanesAffected;
    @XmlElement(name = "lanes-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String lanesStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the lanesType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanesType() {
        return lanesType;
    }

    /**
     * Sets the value of the lanesType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanesType(String value) {
        this.lanesType = value;
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
     * Gets the value of the lanesTotalOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanesTotalOriginal() {
        return lanesTotalOriginal;
    }

    /**
     * Sets the value of the lanesTotalOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanesTotalOriginal(Short value) {
        this.lanesTotalOriginal = value;
    }

    /**
     * Gets the value of the lanesTotalAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLanesTotalAffected() {
        return lanesTotalAffected;
    }

    /**
     * Sets the value of the lanesTotalAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLanesTotalAffected(Short value) {
        this.lanesTotalAffected = value;
    }

    /**
     * Gets the value of the eventLanesAffected property.
     * 
     * @return
     *     possible object is
     *     {@link EventLane.EventLanesAffected }
     *     
     */
    public EventLane.EventLanesAffected getEventLanesAffected() {
        return eventLanesAffected;
    }

    /**
     * Sets the value of the eventLanesAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventLane.EventLanesAffected }
     *     
     */
    public void setEventLanesAffected(EventLane.EventLanesAffected value) {
        this.eventLanesAffected = value;
    }

    /**
     * Gets the value of the lanesStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanesStatus() {
        return lanesStatus;
    }

    /**
     * Sets the value of the lanesStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanesStatus(String value) {
        this.lanesStatus = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lanes"
    })
    public static class EventLanesAffected
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> lanes;

        /**
         * Gets the value of the lanes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lanes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getLanes() {
            if (lanes == null) {
                lanes = new ArrayList<Short>();
            }
            return this.lanes;
        }

    }

}
