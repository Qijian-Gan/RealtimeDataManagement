
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
 * <p>Java class for ResponsePlanRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanRequestFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="evaluation-cycle-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128"&gt;
 *                   &lt;element name="evaluation-cycle" type="{http://www.tmdd.org/303/messages}Response-plan-evaluation-cycle"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response-plan-rank-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128"&gt;
 *                   &lt;element name="response-plan-rank" type="{http://www.tmdd.org/303/messages}Response-plan-rank"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="response-plan-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128"&gt;
 *                   &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="plan-type" type="{http://www.tmdd.org/303/messages}Response-plan-type" minOccurs="0"/&gt;
 *         &lt;element name="response-plan-status-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128"&gt;
 *                   &lt;element name="response-plan-status" type="{http://www.tmdd.org/303/messages}Response-plan-status"/&gt;
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
@XmlType(name = "ResponsePlanRequestFilter", propOrder = {
    "eventId",
    "evaluationCycleList",
    "responsePlanRankList",
    "responsePlanIdList",
    "planType",
    "responsePlanStatusList",
    "any"
})
public class ResponsePlanRequestFilter
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "event-id", required = true)
    protected String eventId;
    @XmlElement(name = "evaluation-cycle-list")
    protected ResponsePlanRequestFilter.EvaluationCycleList evaluationCycleList;
    @XmlElement(name = "response-plan-rank-list")
    protected ResponsePlanRequestFilter.ResponsePlanRankList responsePlanRankList;
    @XmlElement(name = "response-plan-id-list")
    protected ResponsePlanRequestFilter.ResponsePlanIdList responsePlanIdList;
    @XmlElement(name = "plan-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String planType;
    @XmlElement(name = "response-plan-status-list")
    protected ResponsePlanRequestFilter.ResponsePlanStatusList responsePlanStatusList;
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
     * Gets the value of the evaluationCycleList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestFilter.EvaluationCycleList }
     *     
     */
    public ResponsePlanRequestFilter.EvaluationCycleList getEvaluationCycleList() {
        return evaluationCycleList;
    }

    /**
     * Sets the value of the evaluationCycleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestFilter.EvaluationCycleList }
     *     
     */
    public void setEvaluationCycleList(ResponsePlanRequestFilter.EvaluationCycleList value) {
        this.evaluationCycleList = value;
    }

    /**
     * Gets the value of the responsePlanRankList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanRankList }
     *     
     */
    public ResponsePlanRequestFilter.ResponsePlanRankList getResponsePlanRankList() {
        return responsePlanRankList;
    }

    /**
     * Sets the value of the responsePlanRankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanRankList }
     *     
     */
    public void setResponsePlanRankList(ResponsePlanRequestFilter.ResponsePlanRankList value) {
        this.responsePlanRankList = value;
    }

    /**
     * Gets the value of the responsePlanIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanIdList }
     *     
     */
    public ResponsePlanRequestFilter.ResponsePlanIdList getResponsePlanIdList() {
        return responsePlanIdList;
    }

    /**
     * Sets the value of the responsePlanIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanIdList }
     *     
     */
    public void setResponsePlanIdList(ResponsePlanRequestFilter.ResponsePlanIdList value) {
        this.responsePlanIdList = value;
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
     * Gets the value of the responsePlanStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanStatusList }
     *     
     */
    public ResponsePlanRequestFilter.ResponsePlanStatusList getResponsePlanStatusList() {
        return responsePlanStatusList;
    }

    /**
     * Sets the value of the responsePlanStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestFilter.ResponsePlanStatusList }
     *     
     */
    public void setResponsePlanStatusList(ResponsePlanRequestFilter.ResponsePlanStatusList value) {
        this.responsePlanStatusList = value;
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
     *         &lt;element name="evaluation-cycle" type="{http://www.tmdd.org/303/messages}Response-plan-evaluation-cycle"/&gt;
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
        "evaluationCycle"
    })
    public static class EvaluationCycleList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "evaluation-cycle", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> evaluationCycle;

        /**
         * Gets the value of the evaluationCycle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evaluationCycle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvaluationCycle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getEvaluationCycle() {
            if (evaluationCycle == null) {
                evaluationCycle = new ArrayList<Long>();
            }
            return this.evaluationCycle;
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
     *       &lt;sequence maxOccurs="128"&gt;
     *         &lt;element name="response-plan-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "responsePlanId"
    })
    public static class ResponsePlanIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-id", required = true)
        protected List<String> responsePlanId;

        /**
         * Gets the value of the responsePlanId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResponsePlanId() {
            if (responsePlanId == null) {
                responsePlanId = new ArrayList<String>();
            }
            return this.responsePlanId;
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
     *       &lt;sequence maxOccurs="128"&gt;
     *         &lt;element name="response-plan-rank" type="{http://www.tmdd.org/303/messages}Response-plan-rank"/&gt;
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
        "responsePlanRank"
    })
    public static class ResponsePlanRankList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-rank", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> responsePlanRank;

        /**
         * Gets the value of the responsePlanRank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanRank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanRank().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getResponsePlanRank() {
            if (responsePlanRank == null) {
                responsePlanRank = new ArrayList<Long>();
            }
            return this.responsePlanRank;
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
     *       &lt;sequence maxOccurs="128"&gt;
     *         &lt;element name="response-plan-status" type="{http://www.tmdd.org/303/messages}Response-plan-status"/&gt;
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
        "responsePlanStatus"
    })
    public static class ResponsePlanStatusList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-status", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> responsePlanStatus;

        /**
         * Gets the value of the responsePlanStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getResponsePlanStatus() {
            if (responsePlanStatus == null) {
                responsePlanStatus = new ArrayList<String>();
            }
            return this.responsePlanStatus;
        }

    }

}
