
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
 * <p>Java class for ResponsePlanAgencyApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanAgencyApproval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization-approving" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="approval-decision" type="{http://www.tmdd.org/303/messages}Response-plan-approval-decision"/&gt;
 *         &lt;element name="decision-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "ResponsePlanAgencyApproval", propOrder = {
    "organizationApproving",
    "approvalDecision",
    "decisionTime",
    "any"
})
public class ResponsePlanAgencyApproval
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "organization-approving", required = true)
    protected OrganizationInformation organizationApproving;
    @XmlElement(name = "approval-decision", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String approvalDecision;
    @XmlElement(name = "decision-time")
    protected DateTimeZone decisionTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the organizationApproving property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationApproving() {
        return organizationApproving;
    }

    /**
     * Sets the value of the organizationApproving property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationApproving(OrganizationInformation value) {
        this.organizationApproving = value;
    }

    /**
     * Gets the value of the approvalDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalDecision() {
        return approvalDecision;
    }

    /**
     * Sets the value of the approvalDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalDecision(String value) {
        this.approvalDecision = value;
    }

    /**
     * Gets the value of the decisionTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDecisionTime() {
        return decisionTime;
    }

    /**
     * Sets the value of the decisionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDecisionTime(DateTimeZone value) {
        this.decisionTime = value;
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
