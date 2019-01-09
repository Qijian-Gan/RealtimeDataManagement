
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for LinkLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="link-ownership" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="link-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="second-link-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator" minOccurs="0"/&gt;
 *         &lt;element name="link-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier" minOccurs="0"/&gt;
 *         &lt;element name="link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="primary-location" type="{http://www.tmdd.org/303/messages}PointOnLink"/&gt;
 *         &lt;element name="secondary-location" type="{http://www.tmdd.org/303/messages}PointOnLink" minOccurs="0"/&gt;
 *         &lt;element name="link-direction" type="{http://www.tmdd.org/303/messages}Link-direction" minOccurs="0"/&gt;
 *         &lt;element name="link-alignment" type="{http://www.tmdd.org/303/messages}Link-alignment" minOccurs="0"/&gt;
 *         &lt;element name="linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
 *         &lt;element name="alternate-designations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="alternate-designation" type="{http://www.tmdd.org/303/messages}LinkLocation"/&gt;
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
@XmlType(name = "LinkLocation", propOrder = {
    "linkOwnership",
    "linkDesignator",
    "secondLinkDesignator",
    "linkId",
    "linkName",
    "primaryLocation",
    "secondaryLocation",
    "linkDirection",
    "linkAlignment",
    "linearReferenceVersion",
    "alternateDesignations",
    "any"
})
public class LinkLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "link-ownership")
    protected String linkOwnership;
    @XmlElement(name = "link-designator")
    protected String linkDesignator;
    @XmlElement(name = "second-link-designator")
    protected String secondLinkDesignator;
    @XmlElement(name = "link-id")
    protected String linkId;
    @XmlElement(name = "link-name")
    protected String linkName;
    @XmlElement(name = "primary-location", required = true)
    protected PointOnLink primaryLocation;
    @XmlElement(name = "secondary-location")
    protected PointOnLink secondaryLocation;
    @XmlElement(name = "link-direction")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkDirection;
    @XmlElement(name = "link-alignment")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkAlignment;
    @XmlElement(name = "linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short linearReferenceVersion;
    @XmlElement(name = "alternate-designations")
    protected LinkLocation.AlternateDesignations alternateDesignations;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the linkOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkOwnership() {
        return linkOwnership;
    }

    /**
     * Sets the value of the linkOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkOwnership(String value) {
        this.linkOwnership = value;
    }

    /**
     * Gets the value of the linkDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDesignator() {
        return linkDesignator;
    }

    /**
     * Sets the value of the linkDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDesignator(String value) {
        this.linkDesignator = value;
    }

    /**
     * Gets the value of the secondLinkDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLinkDesignator() {
        return secondLinkDesignator;
    }

    /**
     * Sets the value of the secondLinkDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLinkDesignator(String value) {
        this.secondLinkDesignator = value;
    }

    /**
     * Gets the value of the linkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Sets the value of the linkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * Sets the value of the linkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkName(String value) {
        this.linkName = value;
    }

    /**
     * Gets the value of the primaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLink }
     *     
     */
    public PointOnLink getPrimaryLocation() {
        return primaryLocation;
    }

    /**
     * Sets the value of the primaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLink }
     *     
     */
    public void setPrimaryLocation(PointOnLink value) {
        this.primaryLocation = value;
    }

    /**
     * Gets the value of the secondaryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLink }
     *     
     */
    public PointOnLink getSecondaryLocation() {
        return secondaryLocation;
    }

    /**
     * Sets the value of the secondaryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLink }
     *     
     */
    public void setSecondaryLocation(PointOnLink value) {
        this.secondaryLocation = value;
    }

    /**
     * Gets the value of the linkDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkDirection() {
        return linkDirection;
    }

    /**
     * Sets the value of the linkDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkDirection(String value) {
        this.linkDirection = value;
    }

    /**
     * Gets the value of the linkAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkAlignment() {
        return linkAlignment;
    }

    /**
     * Sets the value of the linkAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkAlignment(String value) {
        this.linkAlignment = value;
    }

    /**
     * Gets the value of the linearReferenceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLinearReferenceVersion() {
        return linearReferenceVersion;
    }

    /**
     * Sets the value of the linearReferenceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLinearReferenceVersion(Short value) {
        this.linearReferenceVersion = value;
    }

    /**
     * Gets the value of the alternateDesignations property.
     * 
     * @return
     *     possible object is
     *     {@link LinkLocation.AlternateDesignations }
     *     
     */
    public LinkLocation.AlternateDesignations getAlternateDesignations() {
        return alternateDesignations;
    }

    /**
     * Sets the value of the alternateDesignations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkLocation.AlternateDesignations }
     *     
     */
    public void setAlternateDesignations(LinkLocation.AlternateDesignations value) {
        this.alternateDesignations = value;
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="alternate-designation" type="{http://www.tmdd.org/303/messages}LinkLocation"/&gt;
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
        "alternateDesignation"
    })
    public static class AlternateDesignations
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "alternate-designation", required = true)
        protected List<LinkLocation> alternateDesignation;

        /**
         * Gets the value of the alternateDesignation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateDesignation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateDesignation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkLocation }
         * 
         * 
         */
        public List<LinkLocation> getAlternateDesignation() {
            if (alternateDesignation == null) {
                alternateDesignation = new ArrayList<LinkLocation>();
            }
            return this.alternateDesignation;
        }

    }

}
