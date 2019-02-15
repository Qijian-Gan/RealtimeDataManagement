
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
 * <p>Java class for ResponsePlanLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response-plan-request-header" type="{http://www.tmdd.org/303/messages}ResponsePlanRequestHeader"/&gt;
 *         &lt;element name="response-plan-header" type="{http://www.tmdd.org/303/messages}ResponsePlanHeader"/&gt;
 *         &lt;element name="log-detail-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="response-plan-log-details" type="{http://www.tmdd.org/303/messages}ResponsePlanLogDetails"/&gt;
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
@XmlType(name = "ResponsePlanLog", propOrder = {
    "responsePlanRequestHeader",
    "responsePlanHeader",
    "logDetailList",
    "any"
})
public class ResponsePlanLog
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "response-plan-request-header", required = true)
    protected ResponsePlanRequestHeader responsePlanRequestHeader;
    @XmlElement(name = "response-plan-header", required = true)
    protected ResponsePlanHeader responsePlanHeader;
    @XmlElement(name = "log-detail-list", required = true)
    protected ResponsePlanLog.LogDetailList logDetailList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the responsePlanRequestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public ResponsePlanRequestHeader getResponsePlanRequestHeader() {
        return responsePlanRequestHeader;
    }

    /**
     * Sets the value of the responsePlanRequestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanRequestHeader }
     *     
     */
    public void setResponsePlanRequestHeader(ResponsePlanRequestHeader value) {
        this.responsePlanRequestHeader = value;
    }

    /**
     * Gets the value of the responsePlanHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanHeader }
     *     
     */
    public ResponsePlanHeader getResponsePlanHeader() {
        return responsePlanHeader;
    }

    /**
     * Sets the value of the responsePlanHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanHeader }
     *     
     */
    public void setResponsePlanHeader(ResponsePlanHeader value) {
        this.responsePlanHeader = value;
    }

    /**
     * Gets the value of the logDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePlanLog.LogDetailList }
     *     
     */
    public ResponsePlanLog.LogDetailList getLogDetailList() {
        return logDetailList;
    }

    /**
     * Sets the value of the logDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePlanLog.LogDetailList }
     *     
     */
    public void setLogDetailList(ResponsePlanLog.LogDetailList value) {
        this.logDetailList = value;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="response-plan-log-details" type="{http://www.tmdd.org/303/messages}ResponsePlanLogDetails"/&gt;
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
        "responsePlanLogDetails"
    })
    public static class LogDetailList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "response-plan-log-details", required = true)
        protected List<ResponsePlanLogDetails> responsePlanLogDetails;

        /**
         * Gets the value of the responsePlanLogDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsePlanLogDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsePlanLogDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsePlanLogDetails }
         * 
         * 
         */
        public List<ResponsePlanLogDetails> getResponsePlanLogDetails() {
            if (responsePlanLogDetails == null) {
                responsePlanLogDetails = new ArrayList<ResponsePlanLogDetails>();
            }
            return this.responsePlanLogDetails;
        }

    }

}
