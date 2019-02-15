
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IncidentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="evaluation-cycle-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="evaluation-cycle-detail" type="{http://www.tmdd.org/303/messages}EvaluationCycleDetails" minOccurs="0"/&gt;
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
@XmlType(name = "IncidentResponse", propOrder = {
    "eventId",
    "evaluationCycleList",
    "any"
})
public class IncidentResponse
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "event-id", required = true)
    protected String eventId;
    @XmlElement(name = "evaluation-cycle-list", required = true)
    protected IncidentResponse.EvaluationCycleList evaluationCycleList;
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
     *     {@link IncidentResponse.EvaluationCycleList }
     *     
     */
    public IncidentResponse.EvaluationCycleList getEvaluationCycleList() {
        return evaluationCycleList;
    }

    /**
     * Sets the value of the evaluationCycleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentResponse.EvaluationCycleList }
     *     
     */
    public void setEvaluationCycleList(IncidentResponse.EvaluationCycleList value) {
        this.evaluationCycleList = value;
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
     *         &lt;element name="evaluation-cycle-detail" type="{http://www.tmdd.org/303/messages}EvaluationCycleDetails" minOccurs="0"/&gt;
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
        "evaluationCycleDetail"
    })
    public static class EvaluationCycleList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "evaluation-cycle-detail")
        protected List<EvaluationCycleDetails> evaluationCycleDetail;

        /**
         * Gets the value of the evaluationCycleDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evaluationCycleDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvaluationCycleDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvaluationCycleDetails }
         * 
         * 
         */
        public List<EvaluationCycleDetails> getEvaluationCycleDetail() {
            if (evaluationCycleDetail == null) {
                evaluationCycleDetail = new ArrayList<EvaluationCycleDetails>();
            }
            return this.evaluationCycleDetail;
        }

    }

}
