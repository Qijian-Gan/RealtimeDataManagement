
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Organization&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OrganizationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="organization-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="organization-location" type="{http://www.tmdd.org/303/messages}Organization-location-fips" minOccurs="0"/&gt;
 *         &lt;element name="organization-function" type="{http://www.tmdd.org/303/messages}Organization-function" minOccurs="0"/&gt;
 *         &lt;element name="organization-contact-details" type="{http://www.tmdd.org/303/messages}ContactDetails" minOccurs="0"/&gt;
 *         &lt;element name="center-contact-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="center-contact-details" type="{http://www.tmdd.org/303/messages}OrganizationCenterInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "OrganizationInformation", propOrder = {
    "organizationId",
    "organizationName",
    "organizationLocation",
    "organizationFunction",
    "organizationContactDetails",
    "centerContactList",
    "lastUpdateTime",
    "any"
})
public class OrganizationInformation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "organization-id", required = true)
    protected String organizationId;
    @XmlElement(name = "organization-name")
    protected String organizationName;
    @XmlElement(name = "organization-location")
    protected String organizationLocation;
    @XmlElement(name = "organization-function")
    protected String organizationFunction;
    @XmlElement(name = "organization-contact-details")
    protected ContactDetails organizationContactDetails;
    @XmlElement(name = "center-contact-list")
    protected OrganizationInformation.CenterContactList centerContactList;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationLocation() {
        return organizationLocation;
    }

    /**
     * Sets the value of the organizationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationLocation(String value) {
        this.organizationLocation = value;
    }

    /**
     * Gets the value of the organizationFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationFunction() {
        return organizationFunction;
    }

    /**
     * Sets the value of the organizationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationFunction(String value) {
        this.organizationFunction = value;
    }

    /**
     * Gets the value of the organizationContactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getOrganizationContactDetails() {
        return organizationContactDetails;
    }

    /**
     * Sets the value of the organizationContactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setOrganizationContactDetails(ContactDetails value) {
        this.organizationContactDetails = value;
    }

    /**
     * Gets the value of the centerContactList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation.CenterContactList }
     *     
     */
    public OrganizationInformation.CenterContactList getCenterContactList() {
        return centerContactList;
    }

    /**
     * Sets the value of the centerContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation.CenterContactList }
     *     
     */
    public void setCenterContactList(OrganizationInformation.CenterContactList value) {
        this.centerContactList = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateTime(DateTimeZone value) {
        this.lastUpdateTime = value;
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
     *         &lt;element name="center-contact-details" type="{http://www.tmdd.org/303/messages}OrganizationCenterInformation"/&gt;
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
        "centerContactDetails"
    })
    public static class CenterContactList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "center-contact-details", required = true)
        protected List<OrganizationCenterInformation> centerContactDetails;

        /**
         * Gets the value of the centerContactDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centerContactDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCenterContactDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationCenterInformation }
         * 
         * 
         */
        public List<OrganizationCenterInformation> getCenterContactDetails() {
            if (centerContactDetails == null) {
                centerContactDetails = new ArrayList<OrganizationCenterInformation>();
            }
            return this.centerContactDetails;
        }

    }

}
