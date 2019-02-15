
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Organization&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for OrganizationInformationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationInformationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organization-information-type" type="{http://www.tmdd.org/303/messages}Organization-information-type"/&gt;
 *         &lt;element name="organization-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="center-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="center-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "OrganizationInformationRequest", propOrder = {
    "authentication",
    "organizationRequesting",
    "organizationInformationType",
    "organizationId",
    "centerIdList",
    "any"
})
public class OrganizationInformationRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "organization-requesting", required = true)
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "organization-information-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String organizationInformationType;
    @XmlElement(name = "organization-id")
    protected String organizationId;
    @XmlElement(name = "center-id-list")
    protected OrganizationInformationRequest.CenterIdList centerIdList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link Authentication }
     *     
     */
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authentication }
     *     
     */
    public void setAuthentication(Authentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the organizationRequesting property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationRequesting() {
        return organizationRequesting;
    }

    /**
     * Sets the value of the organizationRequesting property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationRequesting(OrganizationInformation value) {
        this.organizationRequesting = value;
    }

    /**
     * Gets the value of the organizationInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationInformationType() {
        return organizationInformationType;
    }

    /**
     * Sets the value of the organizationInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationInformationType(String value) {
        this.organizationInformationType = value;
    }

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
     * Gets the value of the centerIdList property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformationRequest.CenterIdList }
     *     
     */
    public OrganizationInformationRequest.CenterIdList getCenterIdList() {
        return centerIdList;
    }

    /**
     * Sets the value of the centerIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformationRequest.CenterIdList }
     *     
     */
    public void setCenterIdList(OrganizationInformationRequest.CenterIdList value) {
        this.centerIdList = value;
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
     *         &lt;element name="center-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "centerId"
    })
    public static class CenterIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "center-id", required = true)
        protected List<String> centerId;

        /**
         * Gets the value of the centerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCenterId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCenterId() {
            if (centerId == null) {
                centerId = new ArrayList<String>();
            }
            return this.centerId;
        }

    }

}
