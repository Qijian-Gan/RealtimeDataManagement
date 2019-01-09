
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSObservationMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="ess-observation-data-set-metadata" type="{http://www.tmdd.org/303/messages}ESSObservationDataSetMetadataDetail"/&gt;
 *         &lt;element name="ess-collector-configuration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="ess-collector-metadata" type="{http://www.tmdd.org/303/messages}ESSObservationMetadataItem"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation" minOccurs="0"/&gt;
 *         &lt;element name="ess-sensor-metadata-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="ess-sensor-metadata" type="{http://www.tmdd.org/303/messages}ESSSensorMetadataDetail"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="site-information" type="{http://www.tmdd.org/303/messages}ESSSiteMetadataDetail" minOccurs="0"/&gt;
 *         &lt;element name="station-information" type="{http://www.tmdd.org/303/messages}ESSStationMetadataDetail" minOccurs="0"/&gt;
 *         &lt;element name="climate-record-information" type="{http://www.tmdd.org/303/messages}ESSClimateRecordDetail" minOccurs="0"/&gt;
 *         &lt;element name="data-collector-information" type="{http://www.tmdd.org/303/messages}ESSDataCollectorInformation" minOccurs="0"/&gt;
 *         &lt;element name="image-information" type="{http://www.tmdd.org/303/messages}ESSImageInformation" minOccurs="0"/&gt;
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
@XmlType(name = "ESSObservationMetadata", propOrder = {
    "restrictions",
    "essObservationDataSetMetadata",
    "essCollectorConfiguration",
    "organizationInformation",
    "essSensorMetadataList",
    "siteInformation",
    "stationInformation",
    "climateRecordInformation",
    "dataCollectorInformation",
    "imageInformation",
    "any"
})
public class ESSObservationMetadata
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "ess-observation-data-set-metadata", required = true)
    protected ESSObservationDataSetMetadataDetail essObservationDataSetMetadata;
    @XmlElement(name = "ess-collector-configuration")
    protected ESSObservationMetadata.EssCollectorConfiguration essCollectorConfiguration;
    @XmlElement(name = "organization-information")
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "ess-sensor-metadata-list")
    protected ESSObservationMetadata.EssSensorMetadataList essSensorMetadataList;
    @XmlElement(name = "site-information")
    protected ESSSiteMetadataDetail siteInformation;
    @XmlElement(name = "station-information")
    protected ESSStationMetadataDetail stationInformation;
    @XmlElement(name = "climate-record-information")
    protected ESSClimateRecordDetail climateRecordInformation;
    @XmlElement(name = "data-collector-information")
    protected ESSDataCollectorInformation dataCollectorInformation;
    @XmlElement(name = "image-information")
    protected ESSImageInformation imageInformation;
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
     * Gets the value of the essObservationDataSetMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ESSObservationDataSetMetadataDetail }
     *     
     */
    public ESSObservationDataSetMetadataDetail getEssObservationDataSetMetadata() {
        return essObservationDataSetMetadata;
    }

    /**
     * Sets the value of the essObservationDataSetMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSObservationDataSetMetadataDetail }
     *     
     */
    public void setEssObservationDataSetMetadata(ESSObservationDataSetMetadataDetail value) {
        this.essObservationDataSetMetadata = value;
    }

    /**
     * Gets the value of the essCollectorConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ESSObservationMetadata.EssCollectorConfiguration }
     *     
     */
    public ESSObservationMetadata.EssCollectorConfiguration getEssCollectorConfiguration() {
        return essCollectorConfiguration;
    }

    /**
     * Sets the value of the essCollectorConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSObservationMetadata.EssCollectorConfiguration }
     *     
     */
    public void setEssCollectorConfiguration(ESSObservationMetadata.EssCollectorConfiguration value) {
        this.essCollectorConfiguration = value;
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
     * Gets the value of the essSensorMetadataList property.
     * 
     * @return
     *     possible object is
     *     {@link ESSObservationMetadata.EssSensorMetadataList }
     *     
     */
    public ESSObservationMetadata.EssSensorMetadataList getEssSensorMetadataList() {
        return essSensorMetadataList;
    }

    /**
     * Sets the value of the essSensorMetadataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSObservationMetadata.EssSensorMetadataList }
     *     
     */
    public void setEssSensorMetadataList(ESSObservationMetadata.EssSensorMetadataList value) {
        this.essSensorMetadataList = value;
    }

    /**
     * Gets the value of the siteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ESSSiteMetadataDetail }
     *     
     */
    public ESSSiteMetadataDetail getSiteInformation() {
        return siteInformation;
    }

    /**
     * Sets the value of the siteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSSiteMetadataDetail }
     *     
     */
    public void setSiteInformation(ESSSiteMetadataDetail value) {
        this.siteInformation = value;
    }

    /**
     * Gets the value of the stationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ESSStationMetadataDetail }
     *     
     */
    public ESSStationMetadataDetail getStationInformation() {
        return stationInformation;
    }

    /**
     * Sets the value of the stationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSStationMetadataDetail }
     *     
     */
    public void setStationInformation(ESSStationMetadataDetail value) {
        this.stationInformation = value;
    }

    /**
     * Gets the value of the climateRecordInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ESSClimateRecordDetail }
     *     
     */
    public ESSClimateRecordDetail getClimateRecordInformation() {
        return climateRecordInformation;
    }

    /**
     * Sets the value of the climateRecordInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSClimateRecordDetail }
     *     
     */
    public void setClimateRecordInformation(ESSClimateRecordDetail value) {
        this.climateRecordInformation = value;
    }

    /**
     * Gets the value of the dataCollectorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ESSDataCollectorInformation }
     *     
     */
    public ESSDataCollectorInformation getDataCollectorInformation() {
        return dataCollectorInformation;
    }

    /**
     * Sets the value of the dataCollectorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSDataCollectorInformation }
     *     
     */
    public void setDataCollectorInformation(ESSDataCollectorInformation value) {
        this.dataCollectorInformation = value;
    }

    /**
     * Gets the value of the imageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ESSImageInformation }
     *     
     */
    public ESSImageInformation getImageInformation() {
        return imageInformation;
    }

    /**
     * Sets the value of the imageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSImageInformation }
     *     
     */
    public void setImageInformation(ESSImageInformation value) {
        this.imageInformation = value;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="ess-collector-metadata" type="{http://www.tmdd.org/303/messages}ESSObservationMetadataItem"/&gt;
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
        "essCollectorMetadata"
    })
    public static class EssCollectorConfiguration
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ess-collector-metadata", required = true)
        protected List<ESSObservationMetadataItem> essCollectorMetadata;

        /**
         * Gets the value of the essCollectorMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the essCollectorMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEssCollectorMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESSObservationMetadataItem }
         * 
         * 
         */
        public List<ESSObservationMetadataItem> getEssCollectorMetadata() {
            if (essCollectorMetadata == null) {
                essCollectorMetadata = new ArrayList<ESSObservationMetadataItem>();
            }
            return this.essCollectorMetadata;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="ess-sensor-metadata" type="{http://www.tmdd.org/303/messages}ESSSensorMetadataDetail"/&gt;
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
        "essSensorMetadata"
    })
    public static class EssSensorMetadataList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ess-sensor-metadata", required = true)
        protected List<ESSSensorMetadataDetail> essSensorMetadata;

        /**
         * Gets the value of the essSensorMetadata property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the essSensorMetadata property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEssSensorMetadata().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESSSensorMetadataDetail }
         * 
         * 
         */
        public List<ESSSensorMetadataDetail> getEssSensorMetadata() {
            if (essSensorMetadata == null) {
                essSensorMetadata = new ArrayList<ESSSensorMetadataDetail>();
            }
            return this.essSensorMetadata;
        }

    }

}
