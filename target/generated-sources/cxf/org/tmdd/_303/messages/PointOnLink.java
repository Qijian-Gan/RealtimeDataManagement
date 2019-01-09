
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
import lrms_adopted_02_00_00.GeoLocation;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PointOnLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOnLink"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geo-location" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation"/&gt;
 *         &lt;element name="linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference" minOccurs="0"/&gt;
 *         &lt;element name="link-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="point-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="cross-street-designator" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="cross-street-identifier" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cross-street-name" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="cross-street-name-item" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="signed-destination" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="signed-destination-item" type="{http://www.tmdd.org/303/messages}Event-signed-destination"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="location-rank" type="{http://www.tmdd.org/303/messages}Event-location-rank" minOccurs="0"/&gt;
 *         &lt;element name="landmark-type" type="{http://www.tmdd.org/303/messages}Event-location-landmark-type" minOccurs="0"/&gt;
 *         &lt;element name="upward-area-reference" type="{http://www.tmdd.org/303/messages}AreaLocation" minOccurs="0"/&gt;
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
@XmlType(name = "PointOnLink", propOrder = {
    "geoLocation",
    "linearReference",
    "linkName",
    "pointName",
    "crossStreetDesignator",
    "crossStreetName",
    "signedDestination",
    "locationRank",
    "landmarkType",
    "upwardAreaReference",
    "any"
})
public class PointOnLink
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "geo-location", required = true)
    protected GeoLocation geoLocation;
    @XmlElement(name = "linear-reference")
    protected String linearReference;
    @XmlElement(name = "link-name")
    protected String linkName;
    @XmlElement(name = "point-name")
    protected String pointName;
    @XmlElement(name = "cross-street-designator")
    protected PointOnLink.CrossStreetDesignator crossStreetDesignator;
    @XmlElement(name = "cross-street-name")
    protected PointOnLink.CrossStreetName crossStreetName;
    @XmlElement(name = "signed-destination")
    protected PointOnLink.SignedDestination signedDestination;
    @XmlElement(name = "location-rank")
    @XmlSchemaType(name = "unsignedByte")
    protected Short locationRank;
    @XmlElement(name = "landmark-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String landmarkType;
    @XmlElement(name = "upward-area-reference")
    protected AreaLocation upwardAreaReference;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the geoLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    /**
     * Sets the value of the geoLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setGeoLocation(GeoLocation value) {
        this.geoLocation = value;
    }

    /**
     * Gets the value of the linearReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearReference() {
        return linearReference;
    }

    /**
     * Sets the value of the linearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearReference(String value) {
        this.linearReference = value;
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
     * Gets the value of the pointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointName() {
        return pointName;
    }

    /**
     * Sets the value of the pointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointName(String value) {
        this.pointName = value;
    }

    /**
     * Gets the value of the crossStreetDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLink.CrossStreetDesignator }
     *     
     */
    public PointOnLink.CrossStreetDesignator getCrossStreetDesignator() {
        return crossStreetDesignator;
    }

    /**
     * Sets the value of the crossStreetDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLink.CrossStreetDesignator }
     *     
     */
    public void setCrossStreetDesignator(PointOnLink.CrossStreetDesignator value) {
        this.crossStreetDesignator = value;
    }

    /**
     * Gets the value of the crossStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLink.CrossStreetName }
     *     
     */
    public PointOnLink.CrossStreetName getCrossStreetName() {
        return crossStreetName;
    }

    /**
     * Sets the value of the crossStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLink.CrossStreetName }
     *     
     */
    public void setCrossStreetName(PointOnLink.CrossStreetName value) {
        this.crossStreetName = value;
    }

    /**
     * Gets the value of the signedDestination property.
     * 
     * @return
     *     possible object is
     *     {@link PointOnLink.SignedDestination }
     *     
     */
    public PointOnLink.SignedDestination getSignedDestination() {
        return signedDestination;
    }

    /**
     * Sets the value of the signedDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOnLink.SignedDestination }
     *     
     */
    public void setSignedDestination(PointOnLink.SignedDestination value) {
        this.signedDestination = value;
    }

    /**
     * Gets the value of the locationRank property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLocationRank() {
        return locationRank;
    }

    /**
     * Sets the value of the locationRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLocationRank(Short value) {
        this.locationRank = value;
    }

    /**
     * Gets the value of the landmarkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandmarkType() {
        return landmarkType;
    }

    /**
     * Sets the value of the landmarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandmarkType(String value) {
        this.landmarkType = value;
    }

    /**
     * Gets the value of the upwardAreaReference property.
     * 
     * @return
     *     possible object is
     *     {@link AreaLocation }
     *     
     */
    public AreaLocation getUpwardAreaReference() {
        return upwardAreaReference;
    }

    /**
     * Sets the value of the upwardAreaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaLocation }
     *     
     */
    public void setUpwardAreaReference(AreaLocation value) {
        this.upwardAreaReference = value;
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
     *         &lt;element name="cross-street-identifier" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "crossStreetIdentifier"
    })
    public static class CrossStreetDesignator
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "cross-street-identifier", required = true)
        protected List<String> crossStreetIdentifier;

        /**
         * Gets the value of the crossStreetIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crossStreetIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrossStreetIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCrossStreetIdentifier() {
            if (crossStreetIdentifier == null) {
                crossStreetIdentifier = new ArrayList<String>();
            }
            return this.crossStreetIdentifier;
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="cross-street-name-item" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
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
        "crossStreetNameItem"
    })
    public static class CrossStreetName
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "cross-street-name-item", required = true)
        protected List<String> crossStreetNameItem;

        /**
         * Gets the value of the crossStreetNameItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crossStreetNameItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrossStreetNameItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCrossStreetNameItem() {
            if (crossStreetNameItem == null) {
                crossStreetNameItem = new ArrayList<String>();
            }
            return this.crossStreetNameItem;
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="signed-destination-item" type="{http://www.tmdd.org/303/messages}Event-signed-destination"/&gt;
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
        "signedDestinationItem"
    })
    public static class SignedDestination
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "signed-destination-item", required = true)
        protected List<String> signedDestinationItem;

        /**
         * Gets the value of the signedDestinationItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the signedDestinationItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSignedDestinationItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSignedDestinationItem() {
            if (signedDestinationItem == null) {
                signedDestinationItem = new ArrayList<String>();
            }
            return this.signedDestinationItem;
        }

    }

}
