
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import lrms_adopted_02_00_00.GeoLocation;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ResponsePlan&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ResponsePlanPersonnelDeployment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsePlanPersonnelDeployment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personnel-organization" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="personnel-contact-details" type="{http://www.tmdd.org/303/messages}ContactDetails"/&gt;
 *         &lt;element name="activity-start-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="activity-end-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="deployment-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="deployment-instructions" type="{http://www.tmdd.org/303/messages}Response-plan-informational-text"/&gt;
 *         &lt;element name="contact-for-questions" type="{http://www.tmdd.org/303/messages}ContactDetails"/&gt;
 *         &lt;element name="contact-on-site" type="{http://www.tmdd.org/303/messages}ContactDetails"/&gt;
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
@XmlType(name = "ResponsePlanPersonnelDeployment", propOrder = {
    "personnelOrganization",
    "personnelContactDetails",
    "activityStartTime",
    "activityEndTime",
    "deploymentLocation",
    "deploymentInstructions",
    "contactForQuestions",
    "contactOnSite",
    "any"
})
public class ResponsePlanPersonnelDeployment
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "personnel-organization", required = true)
    protected OrganizationInformation personnelOrganization;
    @XmlElement(name = "personnel-contact-details", required = true)
    protected ContactDetails personnelContactDetails;
    @XmlElement(name = "activity-start-time", required = true)
    protected DateTimeZone activityStartTime;
    @XmlElement(name = "activity-end-time")
    protected DateTimeZone activityEndTime;
    @XmlElement(name = "deployment-location")
    protected GeoLocation deploymentLocation;
    @XmlElement(name = "deployment-instructions", required = true)
    protected String deploymentInstructions;
    @XmlElement(name = "contact-for-questions", required = true)
    protected ContactDetails contactForQuestions;
    @XmlElement(name = "contact-on-site", required = true)
    protected ContactDetails contactOnSite;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the personnelOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getPersonnelOrganization() {
        return personnelOrganization;
    }

    /**
     * Sets the value of the personnelOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setPersonnelOrganization(OrganizationInformation value) {
        this.personnelOrganization = value;
    }

    /**
     * Gets the value of the personnelContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getPersonnelContactDetails() {
        return personnelContactDetails;
    }

    /**
     * Sets the value of the personnelContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setPersonnelContactDetails(ContactDetails value) {
        this.personnelContactDetails = value;
    }

    /**
     * Gets the value of the activityStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * Sets the value of the activityStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setActivityStartTime(DateTimeZone value) {
        this.activityStartTime = value;
    }

    /**
     * Gets the value of the activityEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * Sets the value of the activityEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setActivityEndTime(DateTimeZone value) {
        this.activityEndTime = value;
    }

    /**
     * Gets the value of the deploymentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getDeploymentLocation() {
        return deploymentLocation;
    }

    /**
     * Sets the value of the deploymentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setDeploymentLocation(GeoLocation value) {
        this.deploymentLocation = value;
    }

    /**
     * Gets the value of the deploymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeploymentInstructions() {
        return deploymentInstructions;
    }

    /**
     * Sets the value of the deploymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeploymentInstructions(String value) {
        this.deploymentInstructions = value;
    }

    /**
     * Gets the value of the contactForQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactForQuestions() {
        return contactForQuestions;
    }

    /**
     * Sets the value of the contactForQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactForQuestions(ContactDetails value) {
        this.contactForQuestions = value;
    }

    /**
     * Gets the value of the contactOnSite property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactOnSite() {
        return contactOnSite;
    }

    /**
     * Sets the value of the contactOnSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactOnSite(ContactDetails value) {
        this.contactOnSite = value;
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
