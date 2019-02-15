
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="plan-type" type="{http://www.tmdd.org/303/messages}Response-plan-type"/&gt;
 *         &lt;element name="evaluation-cycle" type="{http://www.tmdd.org/303/messages}Response-plan-evaluation-cycle"/&gt;
 *         &lt;element name="response-plan-rank" type="{http://www.tmdd.org/303/messages}Response-plan-rank" minOccurs="0"/&gt;
 *         &lt;element name="submission-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "ResponsePlanHeader", propOrder = {
    "eventId",
    "responsePlanId",
    "planType",
    "evaluationCycle",
    "responsePlanRank",
    "submissionTime",
    "any"
})
public class ResponsePlanHeader
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "event-id", required = true)
    protected String eventId;
    @XmlElement(name = "response-plan-id", required = true)
    protected String responsePlanId;
    @XmlElement(name = "plan-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String planType;
    @XmlElement(name = "evaluation-cycle")
    @XmlSchemaType(name = "unsignedInt")
    protected long evaluationCycle;
    @XmlElement(name = "response-plan-rank")
    @XmlSchemaType(name = "unsignedInt")
    protected Long responsePlanRank;
    @XmlElement(name = "submission-time")
    protected DateTimeZone submissionTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the responsePlanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePlanId() {
        return responsePlanId;
    }

    /**
     * Sets the value of the responsePlanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePlanId(String value) {
        this.responsePlanId = value;
    }

    /**
     * Gets the value of the planType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanType() {
        return planType;
    }

    /**
     * Sets the value of the planType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanType(String value) {
        this.planType = value;
    }

    /**
     * Gets the value of the evaluationCycle property.
     * 
     */
    public long getEvaluationCycle() {
        return evaluationCycle;
    }

    /**
     * Sets the value of the evaluationCycle property.
     * 
     */
    public void setEvaluationCycle(long value) {
        this.evaluationCycle = value;
    }

    /**
     * Gets the value of the responsePlanRank property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResponsePlanRank() {
        return responsePlanRank;
    }

    /**
     * Sets the value of the responsePlanRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResponsePlanRank(Long value) {
        this.responsePlanRank = value;
    }

    /**
     * Gets the value of the submissionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getSubmissionTime() {
        return submissionTime;
    }

    /**
     * Sets the value of the submissionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setSubmissionTime(DateTimeZone value) {
        this.submissionTime = value;
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

}
