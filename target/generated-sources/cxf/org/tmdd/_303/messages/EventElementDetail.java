
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
 * <p>Java class for EventElementDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventElementDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="element-id" type="{http://www.tmdd.org/303/messages}Event-element-identifier" minOccurs="0"/&gt;
 *         &lt;element name="schedule-element-id" type="{http://www.tmdd.org/303/messages}Event-schedule-element-identifier" minOccurs="0"/&gt;
 *         &lt;element name="event-category" type="{http://www.tmdd.org/303/messages}Event-category" minOccurs="0"/&gt;
 *         &lt;element name="event-source" type="{http://www.tmdd.org/303/messages}EventSource" minOccurs="0"/&gt;
 *         &lt;element name="event-descriptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="event-description" type="{http://www.tmdd.org/303/messages}EventDescription"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-locations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="event-location" type="{http://www.tmdd.org/303/messages}EventLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-times" type="{http://www.tmdd.org/303/messages}EventTimes"/&gt;
 *         &lt;element name="event-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="event-lanes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="256"&gt;
 *                   &lt;element name="event-lane" type="{http://www.tmdd.org/303/messages}EventLane"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-transit-locations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="event-transit-location-item" type="{http://www.tmdd.org/303/messages}EventTransitLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-hazmat-details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="event-hazmat-details-item" type="{http://www.tmdd.org/303/messages}Hazmat"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="confidence-level" type="{http://www.tmdd.org/303/messages}Event-description-confidence-level" minOccurs="0"/&gt;
 *         &lt;element name="access-level" type="{http://www.tmdd.org/303/messages}Event-access-level" minOccurs="0"/&gt;
 *         &lt;element name="event-zone-of-influence" type="{http://www.tmdd.org/303/messages}BoundingBox" minOccurs="0"/&gt;
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
@XmlType(name = "EventElementDetail", propOrder = {
    "elementId",
    "scheduleElementId",
    "eventCategory",
    "eventSource",
    "eventDescriptions",
    "eventLocations",
    "eventTimes",
    "eventName",
    "eventLanes",
    "eventTransitLocations",
    "eventHazmatDetails",
    "confidenceLevel",
    "accessLevel",
    "eventZoneOfInfluence",
    "any"
})
public class EventElementDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "element-id")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer elementId;
    @XmlElement(name = "schedule-element-id")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer scheduleElementId;
    @XmlElement(name = "event-category")
    @XmlSchemaType(name = "anySimpleType")
    protected String eventCategory;
    @XmlElement(name = "event-source")
    protected EventSource eventSource;
    @XmlElement(name = "event-descriptions")
    protected EventElementDetail.EventDescriptions eventDescriptions;
    @XmlElement(name = "event-locations")
    protected EventElementDetail.EventLocations eventLocations;
    @XmlElement(name = "event-times", required = true)
    protected EventTimes eventTimes;
    @XmlElement(name = "event-name")
    protected String eventName;
    @XmlElement(name = "event-lanes")
    protected EventElementDetail.EventLanes eventLanes;
    @XmlElement(name = "event-transit-locations")
    protected EventElementDetail.EventTransitLocations eventTransitLocations;
    @XmlElement(name = "event-hazmat-details")
    protected EventElementDetail.EventHazmatDetails eventHazmatDetails;
    @XmlElement(name = "confidence-level")
    @XmlSchemaType(name = "anySimpleType")
    protected String confidenceLevel;
    @XmlElement(name = "access-level")
    @XmlSchemaType(name = "anySimpleType")
    protected String accessLevel;
    @XmlElement(name = "event-zone-of-influence")
    protected BoundingBox eventZoneOfInfluence;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the elementId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getElementId() {
        return elementId;
    }

    /**
     * Sets the value of the elementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setElementId(Integer value) {
        this.elementId = value;
    }

    /**
     * Gets the value of the scheduleElementId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScheduleElementId() {
        return scheduleElementId;
    }

    /**
     * Sets the value of the scheduleElementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScheduleElementId(Integer value) {
        this.scheduleElementId = value;
    }

    /**
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategory(String value) {
        this.eventCategory = value;
    }

    /**
     * Gets the value of the eventSource property.
     * 
     * @return
     *     possible object is
     *     {@link EventSource }
     *     
     */
    public EventSource getEventSource() {
        return eventSource;
    }

    /**
     * Sets the value of the eventSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSource }
     *     
     */
    public void setEventSource(EventSource value) {
        this.eventSource = value;
    }

    /**
     * Gets the value of the eventDescriptions property.
     * 
     * @return
     *     possible object is
     *     {@link EventElementDetail.EventDescriptions }
     *     
     */
    public EventElementDetail.EventDescriptions getEventDescriptions() {
        return eventDescriptions;
    }

    /**
     * Sets the value of the eventDescriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventElementDetail.EventDescriptions }
     *     
     */
    public void setEventDescriptions(EventElementDetail.EventDescriptions value) {
        this.eventDescriptions = value;
    }

    /**
     * Gets the value of the eventLocations property.
     * 
     * @return
     *     possible object is
     *     {@link EventElementDetail.EventLocations }
     *     
     */
    public EventElementDetail.EventLocations getEventLocations() {
        return eventLocations;
    }

    /**
     * Sets the value of the eventLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventElementDetail.EventLocations }
     *     
     */
    public void setEventLocations(EventElementDetail.EventLocations value) {
        this.eventLocations = value;
    }

    /**
     * Gets the value of the eventTimes property.
     * 
     * @return
     *     possible object is
     *     {@link EventTimes }
     *     
     */
    public EventTimes getEventTimes() {
        return eventTimes;
    }

    /**
     * Sets the value of the eventTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTimes }
     *     
     */
    public void setEventTimes(EventTimes value) {
        this.eventTimes = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventLanes property.
     * 
     * @return
     *     possible object is
     *     {@link EventElementDetail.EventLanes }
     *     
     */
    public EventElementDetail.EventLanes getEventLanes() {
        return eventLanes;
    }

    /**
     * Sets the value of the eventLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventElementDetail.EventLanes }
     *     
     */
    public void setEventLanes(EventElementDetail.EventLanes value) {
        this.eventLanes = value;
    }

    /**
     * Gets the value of the eventTransitLocations property.
     * 
     * @return
     *     possible object is
     *     {@link EventElementDetail.EventTransitLocations }
     *     
     */
    public EventElementDetail.EventTransitLocations getEventTransitLocations() {
        return eventTransitLocations;
    }

    /**
     * Sets the value of the eventTransitLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventElementDetail.EventTransitLocations }
     *     
     */
    public void setEventTransitLocations(EventElementDetail.EventTransitLocations value) {
        this.eventTransitLocations = value;
    }

    /**
     * Gets the value of the eventHazmatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EventElementDetail.EventHazmatDetails }
     *     
     */
    public EventElementDetail.EventHazmatDetails getEventHazmatDetails() {
        return eventHazmatDetails;
    }

    /**
     * Sets the value of the eventHazmatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventElementDetail.EventHazmatDetails }
     *     
     */
    public void setEventHazmatDetails(EventElementDetail.EventHazmatDetails value) {
        this.eventHazmatDetails = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceLevel(String value) {
        this.confidenceLevel = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the eventZoneOfInfluence property.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBox }
     *     
     */
    public BoundingBox getEventZoneOfInfluence() {
        return eventZoneOfInfluence;
    }

    /**
     * Sets the value of the eventZoneOfInfluence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBox }
     *     
     */
    public void setEventZoneOfInfluence(BoundingBox value) {
        this.eventZoneOfInfluence = value;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="event-description" type="{http://www.tmdd.org/303/messages}EventDescription"/&gt;
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
        "eventDescription"
    })
    public static class EventDescriptions
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-description", required = true)
        protected List<EventDescription> eventDescription;

        /**
         * Gets the value of the eventDescription property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventDescription property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventDescription }
         * 
         * 
         */
        public List<EventDescription> getEventDescription() {
            if (eventDescription == null) {
                eventDescription = new ArrayList<EventDescription>();
            }
            return this.eventDescription;
        }

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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="event-hazmat-details-item" type="{http://www.tmdd.org/303/messages}Hazmat"/&gt;
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
        "eventHazmatDetailsItem"
    })
    public static class EventHazmatDetails
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-hazmat-details-item", required = true)
        protected List<Hazmat> eventHazmatDetailsItem;

        /**
         * Gets the value of the eventHazmatDetailsItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventHazmatDetailsItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventHazmatDetailsItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hazmat }
         * 
         * 
         */
        public List<Hazmat> getEventHazmatDetailsItem() {
            if (eventHazmatDetailsItem == null) {
                eventHazmatDetailsItem = new ArrayList<Hazmat>();
            }
            return this.eventHazmatDetailsItem;
        }

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
     *       &lt;sequence maxOccurs="256"&gt;
     *         &lt;element name="event-lane" type="{http://www.tmdd.org/303/messages}EventLane"/&gt;
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
        "eventLane"
    })
    public static class EventLanes
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-lane", required = true)
        protected List<EventLane> eventLane;

        /**
         * Gets the value of the eventLane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventLane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventLane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventLane }
         * 
         * 
         */
        public List<EventLane> getEventLane() {
            if (eventLane == null) {
                eventLane = new ArrayList<EventLane>();
            }
            return this.eventLane;
        }

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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="event-location" type="{http://www.tmdd.org/303/messages}EventLocation"/&gt;
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
        "eventLocation"
    })
    public static class EventLocations
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-location", required = true)
        protected List<EventLocation> eventLocation;

        /**
         * Gets the value of the eventLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventLocation }
         * 
         * 
         */
        public List<EventLocation> getEventLocation() {
            if (eventLocation == null) {
                eventLocation = new ArrayList<EventLocation>();
            }
            return this.eventLocation;
        }

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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="event-transit-location-item" type="{http://www.tmdd.org/303/messages}EventTransitLocation"/&gt;
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
        "eventTransitLocationItem"
    })
    public static class EventTransitLocations
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-transit-location-item", required = true)
        protected List<EventTransitLocation> eventTransitLocationItem;

        /**
         * Gets the value of the eventTransitLocationItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventTransitLocationItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventTransitLocationItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventTransitLocation }
         * 
         * 
         */
        public List<EventTransitLocation> getEventTransitLocationItem() {
            if (eventTransitLocationItem == null) {
                eventTransitLocationItem = new ArrayList<EventTransitLocation>();
            }
            return this.eventTransitLocationItem;
        }

    }

}
