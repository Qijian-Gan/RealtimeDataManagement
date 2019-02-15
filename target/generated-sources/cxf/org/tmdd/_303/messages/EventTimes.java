
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
 * <p>Java class for EventTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTimes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="valid-period" type="{http://www.tmdd.org/303/messages}ValidPeriod" minOccurs="0"/&gt;
 *         &lt;element name="schedule-element-ids" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="event-schedule-element-identifier" type="{http://www.tmdd.org/303/messages}Event-schedule-element-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sequence-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="alternate-start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="alternate-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="expected-start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="expected-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="recurrent-times" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="recurrent-time" type="{http://www.tmdd.org/303/messages}RecurrentTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="planned-event-continuous-flag" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
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
@XmlType(name = "EventTimes", propOrder = {
    "updateTime",
    "validPeriod",
    "scheduleElementIds",
    "sequenceTime",
    "startTime",
    "alternateStartTime",
    "alternateEndTime",
    "expectedStartTime",
    "expectedEndTime",
    "recurrentTimes",
    "plannedEventContinuousFlag",
    "any"
})
public class EventTimes
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "update-time", required = true)
    protected DateTimeZone updateTime;
    @XmlElement(name = "valid-period")
    protected ValidPeriod validPeriod;
    @XmlElement(name = "schedule-element-ids")
    protected EventTimes.ScheduleElementIds scheduleElementIds;
    @XmlElement(name = "sequence-time")
    protected DateTimeZone sequenceTime;
    @XmlElement(name = "start-time")
    protected DateTimeZone startTime;
    @XmlElement(name = "alternate-start-time")
    protected DateTimeZone alternateStartTime;
    @XmlElement(name = "alternate-end-time")
    protected DateTimeZone alternateEndTime;
    @XmlElement(name = "expected-start-time")
    protected DateTimeZone expectedStartTime;
    @XmlElement(name = "expected-end-time")
    protected DateTimeZone expectedEndTime;
    @XmlElement(name = "recurrent-times")
    protected EventTimes.RecurrentTimes recurrentTimes;
    @XmlElement(name = "planned-event-continuous-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String plannedEventContinuousFlag;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setUpdateTime(DateTimeZone value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidPeriod }
     *     
     */
    public ValidPeriod getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidPeriod }
     *     
     */
    public void setValidPeriod(ValidPeriod value) {
        this.validPeriod = value;
    }

    /**
     * Gets the value of the scheduleElementIds property.
     * 
     * @return
     *     possible object is
     *     {@link EventTimes.ScheduleElementIds }
     *     
     */
    public EventTimes.ScheduleElementIds getScheduleElementIds() {
        return scheduleElementIds;
    }

    /**
     * Sets the value of the scheduleElementIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTimes.ScheduleElementIds }
     *     
     */
    public void setScheduleElementIds(EventTimes.ScheduleElementIds value) {
        this.scheduleElementIds = value;
    }

    /**
     * Gets the value of the sequenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSequenceTime() {
        return sequenceTime;
    }

    /**
     * Sets the value of the sequenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSequenceTime(DateTimeZone value) {
        this.sequenceTime = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setStartTime(DateTimeZone value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the alternateStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getAlternateStartTime() {
        return alternateStartTime;
    }

    /**
     * Sets the value of the alternateStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setAlternateStartTime(DateTimeZone value) {
        this.alternateStartTime = value;
    }

    /**
     * Gets the value of the alternateEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getAlternateEndTime() {
        return alternateEndTime;
    }

    /**
     * Sets the value of the alternateEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setAlternateEndTime(DateTimeZone value) {
        this.alternateEndTime = value;
    }

    /**
     * Gets the value of the expectedStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getExpectedStartTime() {
        return expectedStartTime;
    }

    /**
     * Sets the value of the expectedStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setExpectedStartTime(DateTimeZone value) {
        this.expectedStartTime = value;
    }

    /**
     * Gets the value of the expectedEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getExpectedEndTime() {
        return expectedEndTime;
    }

    /**
     * Sets the value of the expectedEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setExpectedEndTime(DateTimeZone value) {
        this.expectedEndTime = value;
    }

    /**
     * Gets the value of the recurrentTimes property.
     * 
     * @return
     *     possible object is
     *     {@link EventTimes.RecurrentTimes }
     *     
     */
    public EventTimes.RecurrentTimes getRecurrentTimes() {
        return recurrentTimes;
    }

    /**
     * Sets the value of the recurrentTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTimes.RecurrentTimes }
     *     
     */
    public void setRecurrentTimes(EventTimes.RecurrentTimes value) {
        this.recurrentTimes = value;
    }

    /**
     * Gets the value of the plannedEventContinuousFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedEventContinuousFlag() {
        return plannedEventContinuousFlag;
    }

    /**
     * Sets the value of the plannedEventContinuousFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedEventContinuousFlag(String value) {
        this.plannedEventContinuousFlag = value;
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
     *         &lt;element name="recurrent-time" type="{http://www.tmdd.org/303/messages}RecurrentTime"/&gt;
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
        "recurrentTime"
    })
    public static class RecurrentTimes
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "recurrent-time", required = true)
        protected List<RecurrentTime> recurrentTime;

        /**
         * Gets the value of the recurrentTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recurrentTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecurrentTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecurrentTime }
         * 
         * 
         */
        public List<RecurrentTime> getRecurrentTime() {
            if (recurrentTime == null) {
                recurrentTime = new ArrayList<RecurrentTime>();
            }
            return this.recurrentTime;
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
     *         &lt;element name="event-schedule-element-identifier" type="{http://www.tmdd.org/303/messages}Event-schedule-element-identifier"/&gt;
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
        "eventScheduleElementIdentifier"
    })
    public static class ScheduleElementIds
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-schedule-element-identifier", type = Integer.class)
        @XmlSchemaType(name = "unsignedShort")
        protected List<Integer> eventScheduleElementIdentifier;

        /**
         * Gets the value of the eventScheduleElementIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventScheduleElementIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventScheduleElementIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Integer }
         * 
         * 
         */
        public List<Integer> getEventScheduleElementIdentifier() {
            if (eventScheduleElementIdentifier == null) {
                eventScheduleElementIdentifier = new ArrayList<Integer>();
            }
            return this.eventScheduleElementIdentifier;
        }

    }

}
