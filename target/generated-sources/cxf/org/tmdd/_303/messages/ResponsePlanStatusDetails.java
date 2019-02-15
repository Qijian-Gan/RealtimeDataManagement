
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
 * <p>Java class for ResponsePlanStatusDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanStatusDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response-plan-header" type="{http://www.tmdd.org/303/messages}ResponsePlanHeader"/&gt;
 *         &lt;element name="response-plan-status" type="{http://www.tmdd.org/303/messages}Response-plan-status"/&gt;
 *         &lt;element name="status-last-revised" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
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
@XmlType(name = "ResponsePlanStatusDetails", propOrder = {
    "responsePlanHeader",
    "responsePlanStatus",
    "statusLastRevised",
    "any"
})
public class ResponsePlanStatusDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "response-plan-header", required = true)
    protected ResponsePlanHeader responsePlanHeader;
    @XmlElement(name = "response-plan-status", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String responsePlanStatus;
    @XmlElement(name = "status-last-revised", required = true)
    protected DateTimeZone statusLastRevised;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the responsePlanStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsePlanStatus() {
        return responsePlanStatus;
    }

    /**
     * Sets the value of the responsePlanStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsePlanStatus(String value) {
        this.responsePlanStatus = value;
    }

    /**
     * Gets the value of the statusLastRevised property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getStatusLastRevised() {
        return statusLastRevised;
    }

    /**
     * Sets the value of the statusLastRevised property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setStatusLastRevised(DateTimeZone value) {
        this.statusLastRevised = value;
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
