
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
 * <p>Java class for EventIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventIndicator"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="status" type="{http://www.tmdd.org/303/messages}Event-incident-status"/&gt;
 *         &lt;element name="duration-exceeded-flag" type="{http://www.tmdd.org/303/messages}Binary-flag"/&gt;
 *         &lt;element name="priority-level" type="{http://www.tmdd.org/303/messages}Event-description-priority-level"/&gt;
 *         &lt;element name="severity" type="{http://www.tmdd.org/303/messages}Event-severity"/&gt;
 *         &lt;element name="impact-level" type="{http://www.tmdd.org/303/messages}Event-impact-level"/&gt;
 *         &lt;element name="active-flag" type="{http://www.tmdd.org/303/messages}Binary-flag"/&gt;
 *         &lt;element name="planned-event-class" type="{http://www.tmdd.org/303/messages}Event-planned-event-class"/&gt;
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
@XmlType(name = "EventIndicator", propOrder = {
    "status",
    "durationExceededFlag",
    "priorityLevel",
    "severity",
    "impactLevel",
    "activeFlag",
    "plannedEventClass",
    "any"
})
public class EventIndicator
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlSchemaType(name = "anySimpleType")
    protected String status;
    @XmlElement(name = "duration-exceeded-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String durationExceededFlag;
    @XmlElement(name = "priority-level")
    @XmlSchemaType(name = "unsignedByte")
    protected Short priorityLevel;
    @XmlSchemaType(name = "anySimpleType")
    protected String severity;
    @XmlElement(name = "impact-level")
    @XmlSchemaType(name = "unsignedInt")
    protected Long impactLevel;
    @XmlElement(name = "active-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String activeFlag;
    @XmlElement(name = "planned-event-class")
    @XmlSchemaType(name = "anySimpleType")
    protected String plannedEventClass;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the durationExceededFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationExceededFlag() {
        return durationExceededFlag;
    }

    /**
     * Sets the value of the durationExceededFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationExceededFlag(String value) {
        this.durationExceededFlag = value;
    }

    /**
     * Gets the value of the priorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * Sets the value of the priorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriorityLevel(Short value) {
        this.priorityLevel = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the impactLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpactLevel() {
        return impactLevel;
    }

    /**
     * Sets the value of the impactLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpactLevel(Long value) {
        this.impactLevel = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveFlag(String value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the plannedEventClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlannedEventClass() {
        return plannedEventClass;
    }

    /**
     * Sets the value of the plannedEventClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlannedEventClass(String value) {
        this.plannedEventClass = value;
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
