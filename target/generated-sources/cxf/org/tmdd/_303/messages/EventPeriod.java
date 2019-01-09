
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EventPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="days-of-the-week" type="{http://www.tmdd.org/303/messages}Event-timeline-schedule-days-of-the-week"/&gt;
 *         &lt;element name="effective-period-qualifier" type="{http://www.tmdd.org/303/messages}Event-effective-period-qualifier" minOccurs="0"/&gt;
 *         &lt;element name="holiday-day" type="{http://www.tmdd.org/303/messages}Event-holiday-day" minOccurs="0"/&gt;
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
@XmlType(name = "EventPeriod", propOrder = {
    "daysOfTheWeek",
    "effectivePeriodQualifier",
    "holidayDay",
    "any"
})
public class EventPeriod
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "days-of-the-week", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String daysOfTheWeek;
    @XmlElement(name = "effective-period-qualifier")
    @XmlSchemaType(name = "anySimpleType")
    protected String effectivePeriodQualifier;
    @XmlElement(name = "holiday-day")
    @XmlSchemaType(name = "unsignedByte")
    protected Short holidayDay;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the daysOfTheWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    /**
     * Sets the value of the daysOfTheWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOfTheWeek(String value) {
        this.daysOfTheWeek = value;
    }

    /**
     * Gets the value of the effectivePeriodQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectivePeriodQualifier() {
        return effectivePeriodQualifier;
    }

    /**
     * Sets the value of the effectivePeriodQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectivePeriodQualifier(String value) {
        this.effectivePeriodQualifier = value;
    }

    /**
     * Gets the value of the holidayDay property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getHolidayDay() {
        return holidayDay;
    }

    /**
     * Sets the value of the holidayDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setHolidayDay(Short value) {
        this.holidayDay = value;
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
