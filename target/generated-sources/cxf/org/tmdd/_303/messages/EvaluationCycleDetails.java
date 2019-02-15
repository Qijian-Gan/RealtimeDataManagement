
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EvaluationCycleDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluationCycleDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evaluation-cycle" type="{http://www.tmdd.org/303/messages}Response-plan-evaluation-cycle"/&gt;
 *         &lt;element name="evaluation-cycle-reason" type="{http://www.tmdd.org/303/messages}Evaluation-cycle-reason"/&gt;
 *         &lt;element name="evaluation-start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="evaluation-cycle-duration" type="{http://www.tmdd.org/303/messages}Evaluation-cycle-duration"/&gt;
 *         &lt;element name="ranked-response-plan-count" type="{http://www.tmdd.org/303/messages}Response-plan-rank"/&gt;
 *         &lt;element name="submitted-response-plan-count" type="{http://www.tmdd.org/303/messages}Response-plan-rank"/&gt;
 *         &lt;element name="event-details" type="{http://www.tmdd.org/303/messages}EventDetails"/&gt;
 *         &lt;element name="response-plan-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128"&gt;
 *                   &lt;element name="response-plan-details" type="{http://www.tmdd.org/303/messages}ResponsePlanDetails"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "EvaluationCycleDetails", propOrder = {
    "evaluationCycle",
    "evaluationCycleReason",
    "evaluationStartTime",
    "evaluationCycleDuration",
    "rankedResponsePlanCount",
    "submittedResponsePlanCount",
    "eventDetails",
    "responsePlanList",
    "any"
})
public class EvaluationCycleDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "evaluation-cycle")
    @XmlSchemaType(name = "unsignedInt")
    protected long evaluationCycle;
    @XmlElement(name = "evaluation-cycle-reason", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String evaluationCycleReason;
    @XmlElement(name = "evaluation-start-time", required = true)
    protected DateTimeZone evaluationStartTime;
    @XmlElement(name = "evaluation-cycle-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected long evaluationCycleDuration;
    @XmlElement(name = "ranked-response-plan-count")
    @XmlSchemaType(name = "unsignedInt")
    protected long rankedResponsePlanCount;
    @XmlElement(name = "submitted-response-plan-count")
    @XmlSchemaType(name = "unsignedInt")
    protected long submittedResponsePlanCount;
    @XmlElement(name = "event-details", required = true)
    protected EventDetails eventDetails;
    @XmlElement(name = "response-plan-list")
    protected EvaluationCycleDetails.ResponsePlanList responsePlanList;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the evaluationCycleReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationCycleReason() {
        return evaluationCycleReason;
    }

    /**
     * Sets the value of the evaluationCycleReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationCycleReason(String value) {
        this.evaluationCycleReason = value;
    }

    /**
     * Gets the value of the evaluationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getEvaluationStartTime() {
        return evaluationStartTime;
    }

    /**
     * Sets the value of the evaluationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setEvaluationStartTime(DateTimeZone value) {
        this.evaluationStartTime = value;
    }

    /**
     * Gets the value of the evaluationCycleDuration property.
     * 
     */
    public long getEvaluationCycleDuration() {
        return evaluationCycleDuration;
    }

    /**
     * Sets the value of the evaluationCycleDuration property.
     * 
     */
    public void setEvaluationCycleDuration(long value) {
        this.evaluationCycleDuration = value;
    }

    /**
     * Gets the value of the rankedResponsePlanCount property.
     * 
     */
    public long getRankedResponsePlanCount() {
        return rankedResponsePlanCount;
    }

    /**
     * Sets the value of the rankedResponsePlanCount property.
     * 
     */
    public void setRankedResponsePlanCount(long value) {
        this.rankedResponsePlanCount = value;
    }

    /**
     * Gets the value of the submittedResponsePlanCount property.
     * 
     */
    public long getSubmittedResponsePlanCount() {
        return submittedResponsePlanCount;
    }

    /**
     * Sets the value of the submittedResponsePlanCount property.
     * 
     */
    public void setSubmittedResponsePlanCount(long value) {
        this.submittedResponsePlanCount = value;
    }

    /**
     * Gets the value of the eventDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EventDetails }
     *     
     */
    public EventDetails getEventDetails() {
        return eventDetails;
    }

    /**
     * Sets the value of the eventDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDetails }
     *     
     */
    public void setEventDetails(EventDetails value) {
        this.eventDetails = value;
    }

    /**
     * Gets the value of the responsePlanList property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationCycleDetails.ResponsePlanList }
     *     
     */
    public EvaluationCycleDetails.ResponsePlanList getResponsePlanList() {
        return responsePlanList;
    }

    /**
     * Sets the value of the responsePlanList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationCycleDetails.ResponsePlanList }
     *     
     */
    public void setResponsePlanList(EvaluationCycleDetails.ResponsePlanList value) {
        this.responsePlanList = value;
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
     *       &lt;sequence maxOccurs="128"&gt;
     *         &lt;element name="response-plan-details" type="{http://www.tmdd.org/303/messages}ResponsePlanDetails"/&gt;
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
        "responsePlanDetails"
    })
    public static class ResponsePlanList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-details", required = true)
        protected List<ResponsePlanDetails> responsePlanDetails;

        /**
         * Gets the value of the responsePlanDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsePlanDetails }
         * 
         * 
         */
        public List<ResponsePlanDetails> getResponsePlanDetails() {
            if (responsePlanDetails == null) {
                responsePlanDetails = new ArrayList<ResponsePlanDetails>();
            }
            return this.responsePlanDetails;
        }

    }

}
