
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
 * <p>Java class for ESSObservationReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="station-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="ess-data-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64" minOccurs="0"&gt;
 *                   &lt;element name="ess-sensor" type="{http://www.tmdd.org/303/messages}ESSObservationReportDetail"/&gt;
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
@XmlType(name = "ESSObservationReport", propOrder = {
    "restrictions",
    "organizationInformation",
    "stationId",
    "essDataList",
    "any"
})
public class ESSObservationReport
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "station-id", required = true)
    protected String stationId;
    @XmlElement(name = "ess-data-list", required = true)
    protected ESSObservationReport.EssDataList essDataList;
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
     * Gets the value of the stationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationId() {
        return stationId;
    }

    /**
     * Sets the value of the stationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationId(String value) {
        this.stationId = value;
    }

    /**
     * Gets the value of the essDataList property.
     * 
     * @return
     *     possible object is
     *     {@link ESSObservationReport.EssDataList }
     *     
     */
    public ESSObservationReport.EssDataList getEssDataList() {
        return essDataList;
    }

    /**
     * Sets the value of the essDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSObservationReport.EssDataList }
     *     
     */
    public void setEssDataList(ESSObservationReport.EssDataList value) {
        this.essDataList = value;
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
     *       &lt;sequence maxOccurs="64" minOccurs="0"&gt;
     *         &lt;element name="ess-sensor" type="{http://www.tmdd.org/303/messages}ESSObservationReportDetail"/&gt;
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
        "essSensor"
    })
    public static class EssDataList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ess-sensor")
        protected List<ESSObservationReportDetail> essSensor;

        /**
         * Gets the value of the essSensor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the essSensor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEssSensor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESSObservationReportDetail }
         * 
         * 
         */
        public List<ESSObservationReportDetail> getEssSensor() {
            if (essSensor == null) {
                essSensor = new ArrayList<ESSObservationReportDetail>();
            }
            return this.essSensor;
        }

    }

}
