
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ArchivedData&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ArchivedDataProcessingDocumentationMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchivedDataProcessingDocumentationMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="last-update-date" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="processing-metadata-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name"/&gt;
 *         &lt;element name="processing-metadata-version" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="publication-date-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
 *         &lt;element name="processing-method-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="processing-method-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="processing-method-application-rules" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="processing-method-results" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
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
@XmlType(name = "ArchivedDataProcessingDocumentationMetadata", propOrder = {
    "restrictions",
    "organizationInformation",
    "lastUpdateDate",
    "processingMetadataName",
    "processingMetadataVersion",
    "publicationDateTime",
    "processingMethodName",
    "processingMethodDescription",
    "processingMethodApplicationRules",
    "processingMethodResults",
    "any"
})
public class ArchivedDataProcessingDocumentationMetadata
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "last-update-date", required = true)
    protected DateTimeZone lastUpdateDate;
    @XmlElement(name = "processing-metadata-name", required = true)
    protected String processingMetadataName;
    @XmlElement(name = "processing-metadata-version", required = true)
    protected String processingMetadataVersion;
    @XmlElement(name = "publication-date-time")
    protected DateTimeZone publicationDateTime;
    @XmlElement(name = "processing-method-name")
    protected String processingMethodName;
    @XmlElement(name = "processing-method-description")
    protected String processingMethodDescription;
    @XmlElement(name = "processing-method-application-rules")
    protected String processingMethodApplicationRules;
    @XmlElement(name = "processing-method-results")
    protected String processingMethodResults;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
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
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateDate(DateTimeZone value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the processingMetadataName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMetadataName() {
        return processingMetadataName;
    }

    /**
     * Sets the value of the processingMetadataName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMetadataName(String value) {
        this.processingMetadataName = value;
    }

    /**
     * Gets the value of the processingMetadataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMetadataVersion() {
        return processingMetadataVersion;
    }

    /**
     * Sets the value of the processingMetadataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMetadataVersion(String value) {
        this.processingMetadataVersion = value;
    }

    /**
     * Gets the value of the publicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getPublicationDateTime() {
        return publicationDateTime;
    }

    /**
     * Sets the value of the publicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setPublicationDateTime(DateTimeZone value) {
        this.publicationDateTime = value;
    }

    /**
     * Gets the value of the processingMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMethodName() {
        return processingMethodName;
    }

    /**
     * Sets the value of the processingMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMethodName(String value) {
        this.processingMethodName = value;
    }

    /**
     * Gets the value of the processingMethodDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMethodDescription() {
        return processingMethodDescription;
    }

    /**
     * Sets the value of the processingMethodDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMethodDescription(String value) {
        this.processingMethodDescription = value;
    }

    /**
     * Gets the value of the processingMethodApplicationRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMethodApplicationRules() {
        return processingMethodApplicationRules;
    }

    /**
     * Sets the value of the processingMethodApplicationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMethodApplicationRules(String value) {
        this.processingMethodApplicationRules = value;
    }

    /**
     * Gets the value of the processingMethodResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingMethodResults() {
        return processingMethodResults;
    }

    /**
     * Sets the value of the processingMethodResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingMethodResults(String value) {
        this.processingMethodResults = value;
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
