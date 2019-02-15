
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ArchivedData&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ArchivedDataTrafficMonitoringMetadataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchivedDataTrafficMonitoringMetadataRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentication" type="{http://www.tmdd.org/303/messages}Authentication" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="organization-requesting" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="filter-data-set-type" type="{http://www.tmdd.org/303/messages}Archived-data-set-type" minOccurs="0"/&gt;
 *         &lt;element name="filter-collection-period-start" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="filter-collection-period-end" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="filter-location-county" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="filter-location-state" type="{http://www.tmdd.org/303/messages}Contact-mailing-address-state" minOccurs="0"/&gt;
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
@XmlType(name = "ArchivedDataTrafficMonitoringMetadataRequest", propOrder = {
    "authentication",
    "organizationInformation",
    "organizationRequesting",
    "filterDataSetType",
    "filterCollectionPeriodStart",
    "filterCollectionPeriodEnd",
    "filterLocationCounty",
    "filterLocationState",
    "any"
})
public class ArchivedDataTrafficMonitoringMetadataRequest
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Authentication authentication;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "organization-requesting", required = true)
    protected OrganizationInformation organizationRequesting;
    @XmlElement(name = "filter-data-set-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String filterDataSetType;
    @XmlElement(name = "filter-collection-period-start")
    protected DateTimeZone filterCollectionPeriodStart;
    @XmlElement(name = "filter-collection-period-end")
    protected DateTimeZone filterCollectionPeriodEnd;
    @XmlElement(name = "filter-location-county")
    protected String filterLocationCounty;
    @XmlElement(name = "filter-location-state")
    protected String filterLocationState;
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
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
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
     * Gets the value of the filterDataSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterDataSetType() {
        return filterDataSetType;
    }

    /**
     * Sets the value of the filterDataSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterDataSetType(String value) {
        this.filterDataSetType = value;
    }

    /**
     * Gets the value of the filterCollectionPeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getFilterCollectionPeriodStart() {
        return filterCollectionPeriodStart;
    }

    /**
     * Sets the value of the filterCollectionPeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setFilterCollectionPeriodStart(DateTimeZone value) {
        this.filterCollectionPeriodStart = value;
    }

    /**
     * Gets the value of the filterCollectionPeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getFilterCollectionPeriodEnd() {
        return filterCollectionPeriodEnd;
    }

    /**
     * Sets the value of the filterCollectionPeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setFilterCollectionPeriodEnd(DateTimeZone value) {
        this.filterCollectionPeriodEnd = value;
    }

    /**
     * Gets the value of the filterLocationCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLocationCounty() {
        return filterLocationCounty;
    }

    /**
     * Sets the value of the filterLocationCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLocationCounty(String value) {
        this.filterLocationCounty = value;
    }

    /**
     * Gets the value of the filterLocationState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterLocationState() {
        return filterLocationState;
    }

    /**
     * Sets the value of the filterLocationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterLocationState(String value) {
        this.filterLocationState = value;
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
