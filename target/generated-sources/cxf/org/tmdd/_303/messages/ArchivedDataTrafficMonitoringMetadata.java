
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ArchivedData&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ArchivedDataTrafficMonitoringMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArchivedDataTrafficMonitoringMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="data-set-type" type="{http://www.tmdd.org/303/messages}Archived-data-set-type"/&gt;
 *         &lt;element name="data-set-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
 *         &lt;element name="data-collection-time-period-start" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="data-collection-time-period-end" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="data-set-publication-date-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="data-set-purpose" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="data-set-title" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="data-set-version" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="data-set-publication-information" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="data-set-progress-status" type="{http://www.tmdd.org/303/messages}Archived-data-set-progress-status" minOccurs="0"/&gt;
 *         &lt;element name="data-set-maintenance-frequency" type="{http://www.tmdd.org/303/messages}Archived-data-set-maintenance-frequency" minOccurs="0"/&gt;
 *         &lt;element name="data-set-url" type="{http://www.tmdd.org/303/messages}UrlReference" minOccurs="0"/&gt;
 *         &lt;element name="data-set-roadway-network-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20480"&gt;
 *                   &lt;element name="data-set-roadway-network-id-list" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="data-set-link-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20480"&gt;
 *                   &lt;element name="data-set-link-id-list" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="data-set-route-designator-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2048"&gt;
 *                   &lt;element name="data-set-route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="data-set-linear-reference-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="2048"&gt;
 *                   &lt;element name="data-set-linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="data-set-linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
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
@XmlType(name = "ArchivedDataTrafficMonitoringMetadata", propOrder = {
    "restrictions",
    "organizationInformation",
    "dataSetType",
    "dataSetDescription",
    "dataCollectionTimePeriodStart",
    "dataCollectionTimePeriodEnd",
    "dataSetPublicationDateTime",
    "dataSetPurpose",
    "dataSetTitle",
    "dataSetVersion",
    "dataSetPublicationInformation",
    "dataSetProgressStatus",
    "dataSetMaintenanceFrequency",
    "dataSetUrl",
    "dataSetRoadwayNetworkIdList",
    "dataSetLinkIdList",
    "dataSetRouteDesignatorList",
    "dataSetLinearReferenceList",
    "dataSetLinearReferenceVersion",
    "any"
})
public class ArchivedDataTrafficMonitoringMetadata
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "data-set-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSetType;
    @XmlElement(name = "data-set-description", required = true)
    protected String dataSetDescription;
    @XmlElement(name = "data-collection-time-period-start", required = true)
    protected DateTimeZone dataCollectionTimePeriodStart;
    @XmlElement(name = "data-collection-time-period-end", required = true)
    protected DateTimeZone dataCollectionTimePeriodEnd;
    @XmlElement(name = "data-set-publication-date-time", required = true)
    protected DateTimeZone dataSetPublicationDateTime;
    @XmlElement(name = "data-set-purpose")
    protected String dataSetPurpose;
    @XmlElement(name = "data-set-title")
    protected String dataSetTitle;
    @XmlElement(name = "data-set-version")
    protected String dataSetVersion;
    @XmlElement(name = "data-set-publication-information")
    protected String dataSetPublicationInformation;
    @XmlElement(name = "data-set-progress-status")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSetProgressStatus;
    @XmlElement(name = "data-set-maintenance-frequency")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataSetMaintenanceFrequency;
    @XmlElement(name = "data-set-url")
    protected UrlReference dataSetUrl;
    @XmlElement(name = "data-set-roadway-network-id-list")
    protected ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList dataSetRoadwayNetworkIdList;
    @XmlElement(name = "data-set-link-id-list")
    protected ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList dataSetLinkIdList;
    @XmlElement(name = "data-set-route-designator-list")
    protected ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList dataSetRouteDesignatorList;
    @XmlElement(name = "data-set-linear-reference-list")
    protected ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList dataSetLinearReferenceList;
    @XmlElement(name = "data-set-linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dataSetLinearReferenceVersion;
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
     * Gets the value of the dataSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetType() {
        return dataSetType;
    }

    /**
     * Sets the value of the dataSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetType(String value) {
        this.dataSetType = value;
    }

    /**
     * Gets the value of the dataSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetDescription() {
        return dataSetDescription;
    }

    /**
     * Sets the value of the dataSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetDescription(String value) {
        this.dataSetDescription = value;
    }

    /**
     * Gets the value of the dataCollectionTimePeriodStart property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDataCollectionTimePeriodStart() {
        return dataCollectionTimePeriodStart;
    }

    /**
     * Sets the value of the dataCollectionTimePeriodStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDataCollectionTimePeriodStart(DateTimeZone value) {
        this.dataCollectionTimePeriodStart = value;
    }

    /**
     * Gets the value of the dataCollectionTimePeriodEnd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDataCollectionTimePeriodEnd() {
        return dataCollectionTimePeriodEnd;
    }

    /**
     * Sets the value of the dataCollectionTimePeriodEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDataCollectionTimePeriodEnd(DateTimeZone value) {
        this.dataCollectionTimePeriodEnd = value;
    }

    /**
     * Gets the value of the dataSetPublicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getDataSetPublicationDateTime() {
        return dataSetPublicationDateTime;
    }

    /**
     * Sets the value of the dataSetPublicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setDataSetPublicationDateTime(DateTimeZone value) {
        this.dataSetPublicationDateTime = value;
    }

    /**
     * Gets the value of the dataSetPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetPurpose() {
        return dataSetPurpose;
    }

    /**
     * Sets the value of the dataSetPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetPurpose(String value) {
        this.dataSetPurpose = value;
    }

    /**
     * Gets the value of the dataSetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetTitle() {
        return dataSetTitle;
    }

    /**
     * Sets the value of the dataSetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetTitle(String value) {
        this.dataSetTitle = value;
    }

    /**
     * Gets the value of the dataSetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetVersion() {
        return dataSetVersion;
    }

    /**
     * Sets the value of the dataSetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetVersion(String value) {
        this.dataSetVersion = value;
    }

    /**
     * Gets the value of the dataSetPublicationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetPublicationInformation() {
        return dataSetPublicationInformation;
    }

    /**
     * Sets the value of the dataSetPublicationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetPublicationInformation(String value) {
        this.dataSetPublicationInformation = value;
    }

    /**
     * Gets the value of the dataSetProgressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetProgressStatus() {
        return dataSetProgressStatus;
    }

    /**
     * Sets the value of the dataSetProgressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetProgressStatus(String value) {
        this.dataSetProgressStatus = value;
    }

    /**
     * Gets the value of the dataSetMaintenanceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetMaintenanceFrequency() {
        return dataSetMaintenanceFrequency;
    }

    /**
     * Sets the value of the dataSetMaintenanceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetMaintenanceFrequency(String value) {
        this.dataSetMaintenanceFrequency = value;
    }

    /**
     * Gets the value of the dataSetUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlReference }
     *     
     */
    public UrlReference getDataSetUrl() {
        return dataSetUrl;
    }

    /**
     * Sets the value of the dataSetUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlReference }
     *     
     */
    public void setDataSetUrl(UrlReference value) {
        this.dataSetUrl = value;
    }

    /**
     * Gets the value of the dataSetRoadwayNetworkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList }
     *     
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList getDataSetRoadwayNetworkIdList() {
        return dataSetRoadwayNetworkIdList;
    }

    /**
     * Sets the value of the dataSetRoadwayNetworkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList }
     *     
     */
    public void setDataSetRoadwayNetworkIdList(ArchivedDataTrafficMonitoringMetadata.DataSetRoadwayNetworkIdList value) {
        this.dataSetRoadwayNetworkIdList = value;
    }

    /**
     * Gets the value of the dataSetLinkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList }
     *     
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList getDataSetLinkIdList() {
        return dataSetLinkIdList;
    }

    /**
     * Sets the value of the dataSetLinkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList }
     *     
     */
    public void setDataSetLinkIdList(ArchivedDataTrafficMonitoringMetadata.DataSetLinkIdList value) {
        this.dataSetLinkIdList = value;
    }

    /**
     * Gets the value of the dataSetRouteDesignatorList property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList }
     *     
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList getDataSetRouteDesignatorList() {
        return dataSetRouteDesignatorList;
    }

    /**
     * Sets the value of the dataSetRouteDesignatorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList }
     *     
     */
    public void setDataSetRouteDesignatorList(ArchivedDataTrafficMonitoringMetadata.DataSetRouteDesignatorList value) {
        this.dataSetRouteDesignatorList = value;
    }

    /**
     * Gets the value of the dataSetLinearReferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList }
     *     
     */
    public ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList getDataSetLinearReferenceList() {
        return dataSetLinearReferenceList;
    }

    /**
     * Sets the value of the dataSetLinearReferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList }
     *     
     */
    public void setDataSetLinearReferenceList(ArchivedDataTrafficMonitoringMetadata.DataSetLinearReferenceList value) {
        this.dataSetLinearReferenceList = value;
    }

    /**
     * Gets the value of the dataSetLinearReferenceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDataSetLinearReferenceVersion() {
        return dataSetLinearReferenceVersion;
    }

    /**
     * Sets the value of the dataSetLinearReferenceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDataSetLinearReferenceVersion(Short value) {
        this.dataSetLinearReferenceVersion = value;
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
     *       &lt;sequence maxOccurs="2048"&gt;
     *         &lt;element name="data-set-linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference"/&gt;
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
        "dataSetLinearReference"
    })
    public static class DataSetLinearReferenceList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "data-set-linear-reference", required = true)
        protected List<String> dataSetLinearReference;

        /**
         * Gets the value of the dataSetLinearReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSetLinearReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSetLinearReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataSetLinearReference() {
            if (dataSetLinearReference == null) {
                dataSetLinearReference = new ArrayList<String>();
            }
            return this.dataSetLinearReference;
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
     *       &lt;sequence maxOccurs="20480"&gt;
     *         &lt;element name="data-set-link-id-list" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "dataSetLinkIdList"
    })
    public static class DataSetLinkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "data-set-link-id-list", required = true)
        protected List<String> dataSetLinkIdList;

        /**
         * Gets the value of the dataSetLinkIdList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSetLinkIdList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSetLinkIdList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataSetLinkIdList() {
            if (dataSetLinkIdList == null) {
                dataSetLinkIdList = new ArrayList<String>();
            }
            return this.dataSetLinkIdList;
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
     *       &lt;sequence maxOccurs="20480"&gt;
     *         &lt;element name="data-set-roadway-network-id-list" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "dataSetRoadwayNetworkIdList"
    })
    public static class DataSetRoadwayNetworkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "data-set-roadway-network-id-list", required = true)
        protected List<String> dataSetRoadwayNetworkIdList;

        /**
         * Gets the value of the dataSetRoadwayNetworkIdList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSetRoadwayNetworkIdList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSetRoadwayNetworkIdList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataSetRoadwayNetworkIdList() {
            if (dataSetRoadwayNetworkIdList == null) {
                dataSetRoadwayNetworkIdList = new ArrayList<String>();
            }
            return this.dataSetRoadwayNetworkIdList;
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
     *       &lt;sequence maxOccurs="2048"&gt;
     *         &lt;element name="data-set-route-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
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
        "dataSetRouteDesignator"
    })
    public static class DataSetRouteDesignatorList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "data-set-route-designator", required = true)
        protected List<String> dataSetRouteDesignator;

        /**
         * Gets the value of the dataSetRouteDesignator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataSetRouteDesignator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataSetRouteDesignator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDataSetRouteDesignator() {
            if (dataSetRouteDesignator == null) {
                dataSetRouteDesignator = new ArrayList<String>();
            }
            return this.dataSetRouteDesignator;
        }

    }

}
