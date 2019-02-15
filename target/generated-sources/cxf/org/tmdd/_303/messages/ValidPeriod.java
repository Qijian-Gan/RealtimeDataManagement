
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
 * <p>Java class for ValidPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValidPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="expected-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="estimated-duration" type="{http://www.tmdd.org/303/messages}Event-timeline-estimated-duration"/&gt;
 *         &lt;element name="effective-periods"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="effective-period" type="{http://www.tmdd.org/303/messages}EventPeriod"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "ValidPeriod", propOrder = {
    "expectedEndTime",
    "estimatedDuration",
    "effectivePeriods",
    "any"
})
public class ValidPeriod
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "expected-end-time")
    protected DateTimeZone expectedEndTime;
    @XmlElement(name = "estimated-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected Long estimatedDuration;
    @XmlElement(name = "effective-periods")
    protected ValidPeriod.EffectivePeriods effectivePeriods;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the estimatedDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedDuration() {
        return estimatedDuration;
    }

    /**
     * Sets the value of the estimatedDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedDuration(Long value) {
        this.estimatedDuration = value;
    }

    /**
     * Gets the value of the effectivePeriods property.
     * 
     * @return
     *     possible object is
     *     {@link ValidPeriod.EffectivePeriods }
     *     
     */
    public ValidPeriod.EffectivePeriods getEffectivePeriods() {
        return effectivePeriods;
    }

    /**
     * Sets the value of the effectivePeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidPeriod.EffectivePeriods }
     *     
     */
    public void setEffectivePeriods(ValidPeriod.EffectivePeriods value) {
        this.effectivePeriods = value;
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
     *       &lt;sequence maxOccurs="16"&gt;
     *         &lt;element name="effective-period" type="{http://www.tmdd.org/303/messages}EventPeriod"/&gt;
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
        "effectivePeriod"
    })
    public static class EffectivePeriods
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "effective-period", required = true)
        protected List<EventPeriod> effectivePeriod;

        /**
         * Gets the value of the effectivePeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the effectivePeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEffectivePeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventPeriod }
         * 
         * 
         */
        public List<EventPeriod> getEffectivePeriod() {
            if (effectivePeriod == null) {
                effectivePeriod = new ArrayList<EventPeriod>();
            }
            return this.effectivePeriod;
        }

    }

}
