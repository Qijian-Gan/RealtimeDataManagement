
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for RecurrentTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurrentTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recurrent-period" type="{http://www.tmdd.org/303/messages}EventPeriod"/&gt;
 *         &lt;element name="schedule-times" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="time" type="{http://www.tmdd.org/303/messages}Event-timeline-schedule-times"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="utc-offset" type="{http://www.tmdd.org/303/messages}Time-offset-utc"/&gt;
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
@XmlType(name = "RecurrentTime", propOrder = {
    "recurrentPeriod",
    "scheduleTimes",
    "utcOffset",
    "any"
})
public class RecurrentTime
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "recurrent-period", required = true)
    protected EventPeriod recurrentPeriod;
    @XmlElement(name = "schedule-times")
    protected RecurrentTime.ScheduleTimes scheduleTimes;
    @XmlElement(name = "utc-offset", required = true)
    protected String utcOffset;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the recurrentPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EventPeriod }
     *     
     */
    public EventPeriod getRecurrentPeriod() {
        return recurrentPeriod;
    }

    /**
     * Sets the value of the recurrentPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPeriod }
     *     
     */
    public void setRecurrentPeriod(EventPeriod value) {
        this.recurrentPeriod = value;
    }

    /**
     * Gets the value of the scheduleTimes property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrentTime.ScheduleTimes }
     *     
     */
    public RecurrentTime.ScheduleTimes getScheduleTimes() {
        return scheduleTimes;
    }

    /**
     * Sets the value of the scheduleTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrentTime.ScheduleTimes }
     *     
     */
    public void setScheduleTimes(RecurrentTime.ScheduleTimes value) {
        this.scheduleTimes = value;
    }

    /**
     * Gets the value of the utcOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtcOffset() {
        return utcOffset;
    }

    /**
     * Sets the value of the utcOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtcOffset(String value) {
        this.utcOffset = value;
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
     *         &lt;element name="time" type="{http://www.tmdd.org/303/messages}Event-timeline-schedule-times"/&gt;
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
        "time"
    })
    public static class ScheduleTimes
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<String> time;

        /**
         * Gets the value of the time property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the time property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTime() {
            if (time == null) {
                time = new ArrayList<String>();
            }
            return this.time;
        }

    }

}
