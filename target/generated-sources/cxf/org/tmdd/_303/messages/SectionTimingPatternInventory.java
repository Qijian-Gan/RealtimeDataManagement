
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SectionTimingPatternInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionTimingPatternInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="section-timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="section-timing-pattern-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="section-cycle-length" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime"/&gt;
 *         &lt;element name="intersection-tp-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="128" minOccurs="0"&gt;
 *                   &lt;element name="intersection-timing" type="{http://www.tmdd.org/303/messages}SectionSignalTimingPatternInventory"/&gt;
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
@XmlType(name = "SectionTimingPatternInventory", propOrder = {
    "restrictions",
    "organizationInformation",
    "sectionId",
    "sectionTimingPatternId",
    "sectionTimingPatternName",
    "sectionCycleLength",
    "intersectionTpList",
    "lastUpdateTime",
    "any"
})
public class SectionTimingPatternInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "section-id", required = true)
    protected String sectionId;
    @XmlElement(name = "section-timing-pattern-id", required = true)
    protected String sectionTimingPatternId;
    @XmlElement(name = "section-timing-pattern-name")
    protected String sectionTimingPatternName;
    @XmlElement(name = "section-cycle-length")
    @XmlSchemaType(name = "unsignedByte")
    protected short sectionCycleLength;
    @XmlElement(name = "intersection-tp-list", required = true)
    protected SectionTimingPatternInventory.IntersectionTpList intersectionTpList;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
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
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the sectionTimingPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTimingPatternId() {
        return sectionTimingPatternId;
    }

    /**
     * Sets the value of the sectionTimingPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTimingPatternId(String value) {
        this.sectionTimingPatternId = value;
    }

    /**
     * Gets the value of the sectionTimingPatternName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTimingPatternName() {
        return sectionTimingPatternName;
    }

    /**
     * Sets the value of the sectionTimingPatternName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTimingPatternName(String value) {
        this.sectionTimingPatternName = value;
    }

    /**
     * Gets the value of the sectionCycleLength property.
     * 
     */
    public short getSectionCycleLength() {
        return sectionCycleLength;
    }

    /**
     * Sets the value of the sectionCycleLength property.
     * 
     */
    public void setSectionCycleLength(short value) {
        this.sectionCycleLength = value;
    }

    /**
     * Gets the value of the intersectionTpList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionTimingPatternInventory.IntersectionTpList }
     *     
     */
    public SectionTimingPatternInventory.IntersectionTpList getIntersectionTpList() {
        return intersectionTpList;
    }

    /**
     * Sets the value of the intersectionTpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionTimingPatternInventory.IntersectionTpList }
     *     
     */
    public void setIntersectionTpList(SectionTimingPatternInventory.IntersectionTpList value) {
        this.intersectionTpList = value;
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
     *       &lt;sequence maxOccurs="128" minOccurs="0"&gt;
     *         &lt;element name="intersection-timing" type="{http://www.tmdd.org/303/messages}SectionSignalTimingPatternInventory"/&gt;
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
        "intersectionTiming"
    })
    public static class IntersectionTpList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "intersection-timing")
        protected List<SectionSignalTimingPatternInventory> intersectionTiming;

        /**
         * Gets the value of the intersectionTiming property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intersectionTiming property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntersectionTiming().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SectionSignalTimingPatternInventory }
         * 
         * 
         */
        public List<SectionSignalTimingPatternInventory> getIntersectionTiming() {
            if (intersectionTiming == null) {
                intersectionTiming = new ArrayList<SectionSignalTimingPatternInventory>();
            }
            return this.intersectionTiming;
        }

    }

}
