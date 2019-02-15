
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSSiteMetadataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSSiteMetadataDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="site-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="site-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
 *         &lt;element name="site-directions-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="site-representativeness" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="site-obstructions-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="site-landscape-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments" minOccurs="0"/&gt;
 *         &lt;element name="site-has-access-control-flag" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-linear-reference" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-linear-reference-version" type="{http://www.tmdd.org/303/messages}Link-location-linear-reference-version" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-linear-reference-units" type="{http://www.LRMS-Adopted-02-00-00}LRMethod" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-to-station-distance" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="site-roadway-to-station-elevation" type="{http://www.tmdd.org/303/messages}Ess-distance-meters" minOccurs="0"/&gt;
 *         &lt;element name="site-jurisdiction-name" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="site-state-code" type="{http://www.tmdd.org/303/messages}Contact-mailing-address-state" minOccurs="0"/&gt;
 *         &lt;element name="site-country-code" type="{http://www.tmdd.org/303/messages}Ess-site-country-code" minOccurs="0"/&gt;
 *         &lt;element name="site-slope-angle" type="{http://www.tmdd.org/303/messages}Ess-angle-degrees" minOccurs="0"/&gt;
 *         &lt;element name="site-grade-direction" type="{http://www.tmdd.org/303/messages}Ess-angle-degrees" minOccurs="0"/&gt;
 *         &lt;element name="site-wind-roughness-from-north" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-wind-roughness-from-south" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-wind-roughness-from-east" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-wind-roughness-from-west" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-soil-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="site-soil-percent-sand" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-soil-percent-silt" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
 *         &lt;element name="site-soil-percent-clay" type="{http://www.tmdd.org/303/messages}Ess-observation-percent" minOccurs="0"/&gt;
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
@XmlType(name = "ESSSiteMetadataDetail", propOrder = {
    "siteId",
    "siteDescription",
    "siteDirectionsDescription",
    "siteRepresentativeness",
    "siteObstructionsDescription",
    "siteLandscapeDescription",
    "siteHasAccessControlFlag",
    "siteRoadwayName",
    "siteRoadwayLinearReference",
    "siteRoadwayLinearReferenceVersion",
    "siteRoadwayLinearReferenceUnits",
    "siteRoadwayToStationDistance",
    "siteRoadwayToStationElevation",
    "siteJurisdictionName",
    "siteStateCode",
    "siteCountryCode",
    "siteSlopeAngle",
    "siteGradeDirection",
    "siteWindRoughnessFromNorth",
    "siteWindRoughnessFromSouth",
    "siteWindRoughnessFromEast",
    "siteWindRoughnessFromWest",
    "siteSoilDescription",
    "siteSoilPercentSand",
    "siteSoilPercentSilt",
    "siteSoilPercentClay",
    "any"
})
public class ESSSiteMetadataDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "site-id")
    protected String siteId;
    @XmlElement(name = "site-description", required = true)
    protected String siteDescription;
    @XmlElement(name = "site-directions-description")
    protected String siteDirectionsDescription;
    @XmlElement(name = "site-representativeness")
    protected String siteRepresentativeness;
    @XmlElement(name = "site-obstructions-description")
    protected String siteObstructionsDescription;
    @XmlElement(name = "site-landscape-description")
    protected String siteLandscapeDescription;
    @XmlElement(name = "site-has-access-control-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String siteHasAccessControlFlag;
    @XmlElement(name = "site-roadway-name")
    protected String siteRoadwayName;
    @XmlElement(name = "site-roadway-linear-reference")
    protected String siteRoadwayLinearReference;
    @XmlElement(name = "site-roadway-linear-reference-version")
    @XmlSchemaType(name = "unsignedByte")
    protected Short siteRoadwayLinearReferenceVersion;
    @XmlElement(name = "site-roadway-linear-reference-units")
    @XmlSchemaType(name = "anySimpleType")
    protected String siteRoadwayLinearReferenceUnits;
    @XmlElement(name = "site-roadway-to-station-distance")
    protected Float siteRoadwayToStationDistance;
    @XmlElement(name = "site-roadway-to-station-elevation")
    protected Float siteRoadwayToStationElevation;
    @XmlElement(name = "site-jurisdiction-name")
    protected String siteJurisdictionName;
    @XmlElement(name = "site-state-code")
    protected String siteStateCode;
    @XmlElement(name = "site-country-code")
    @XmlSchemaType(name = "anySimpleType")
    protected String siteCountryCode;
    @XmlElement(name = "site-slope-angle")
    protected Integer siteSlopeAngle;
    @XmlElement(name = "site-grade-direction")
    protected Integer siteGradeDirection;
    @XmlElement(name = "site-wind-roughness-from-north")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteWindRoughnessFromNorth;
    @XmlElement(name = "site-wind-roughness-from-south")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteWindRoughnessFromSouth;
    @XmlElement(name = "site-wind-roughness-from-east")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteWindRoughnessFromEast;
    @XmlElement(name = "site-wind-roughness-from-west")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteWindRoughnessFromWest;
    @XmlElement(name = "site-soil-description")
    protected String siteSoilDescription;
    @XmlElement(name = "site-soil-percent-sand")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteSoilPercentSand;
    @XmlElement(name = "site-soil-percent-silt")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteSoilPercentSilt;
    @XmlElement(name = "site-soil-percent-clay")
    @XmlSchemaType(name = "unsignedInt")
    protected Long siteSoilPercentClay;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteId(String value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the value of the siteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * Gets the value of the siteDirectionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDirectionsDescription() {
        return siteDirectionsDescription;
    }

    /**
     * Sets the value of the siteDirectionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDirectionsDescription(String value) {
        this.siteDirectionsDescription = value;
    }

    /**
     * Gets the value of the siteRepresentativeness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteRepresentativeness() {
        return siteRepresentativeness;
    }

    /**
     * Sets the value of the siteRepresentativeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteRepresentativeness(String value) {
        this.siteRepresentativeness = value;
    }

    /**
     * Gets the value of the siteObstructionsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteObstructionsDescription() {
        return siteObstructionsDescription;
    }

    /**
     * Sets the value of the siteObstructionsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteObstructionsDescription(String value) {
        this.siteObstructionsDescription = value;
    }

    /**
     * Gets the value of the siteLandscapeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteLandscapeDescription() {
        return siteLandscapeDescription;
    }

    /**
     * Sets the value of the siteLandscapeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteLandscapeDescription(String value) {
        this.siteLandscapeDescription = value;
    }

    /**
     * Gets the value of the siteHasAccessControlFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteHasAccessControlFlag() {
        return siteHasAccessControlFlag;
    }

    /**
     * Sets the value of the siteHasAccessControlFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteHasAccessControlFlag(String value) {
        this.siteHasAccessControlFlag = value;
    }

    /**
     * Gets the value of the siteRoadwayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteRoadwayName() {
        return siteRoadwayName;
    }

    /**
     * Sets the value of the siteRoadwayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteRoadwayName(String value) {
        this.siteRoadwayName = value;
    }

    /**
     * Gets the value of the siteRoadwayLinearReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteRoadwayLinearReference() {
        return siteRoadwayLinearReference;
    }

    /**
     * Sets the value of the siteRoadwayLinearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteRoadwayLinearReference(String value) {
        this.siteRoadwayLinearReference = value;
    }

    /**
     * Gets the value of the siteRoadwayLinearReferenceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSiteRoadwayLinearReferenceVersion() {
        return siteRoadwayLinearReferenceVersion;
    }

    /**
     * Sets the value of the siteRoadwayLinearReferenceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSiteRoadwayLinearReferenceVersion(Short value) {
        this.siteRoadwayLinearReferenceVersion = value;
    }

    /**
     * Gets the value of the siteRoadwayLinearReferenceUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteRoadwayLinearReferenceUnits() {
        return siteRoadwayLinearReferenceUnits;
    }

    /**
     * Sets the value of the siteRoadwayLinearReferenceUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteRoadwayLinearReferenceUnits(String value) {
        this.siteRoadwayLinearReferenceUnits = value;
    }

    /**
     * Gets the value of the siteRoadwayToStationDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSiteRoadwayToStationDistance() {
        return siteRoadwayToStationDistance;
    }

    /**
     * Sets the value of the siteRoadwayToStationDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSiteRoadwayToStationDistance(Float value) {
        this.siteRoadwayToStationDistance = value;
    }

    /**
     * Gets the value of the siteRoadwayToStationElevation property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSiteRoadwayToStationElevation() {
        return siteRoadwayToStationElevation;
    }

    /**
     * Sets the value of the siteRoadwayToStationElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSiteRoadwayToStationElevation(Float value) {
        this.siteRoadwayToStationElevation = value;
    }

    /**
     * Gets the value of the siteJurisdictionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteJurisdictionName() {
        return siteJurisdictionName;
    }

    /**
     * Sets the value of the siteJurisdictionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteJurisdictionName(String value) {
        this.siteJurisdictionName = value;
    }

    /**
     * Gets the value of the siteStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteStateCode() {
        return siteStateCode;
    }

    /**
     * Sets the value of the siteStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteStateCode(String value) {
        this.siteStateCode = value;
    }

    /**
     * Gets the value of the siteCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCountryCode() {
        return siteCountryCode;
    }

    /**
     * Sets the value of the siteCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCountryCode(String value) {
        this.siteCountryCode = value;
    }

    /**
     * Gets the value of the siteSlopeAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteSlopeAngle() {
        return siteSlopeAngle;
    }

    /**
     * Sets the value of the siteSlopeAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteSlopeAngle(Integer value) {
        this.siteSlopeAngle = value;
    }

    /**
     * Gets the value of the siteGradeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSiteGradeDirection() {
        return siteGradeDirection;
    }

    /**
     * Sets the value of the siteGradeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSiteGradeDirection(Integer value) {
        this.siteGradeDirection = value;
    }

    /**
     * Gets the value of the siteWindRoughnessFromNorth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteWindRoughnessFromNorth() {
        return siteWindRoughnessFromNorth;
    }

    /**
     * Sets the value of the siteWindRoughnessFromNorth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteWindRoughnessFromNorth(Long value) {
        this.siteWindRoughnessFromNorth = value;
    }

    /**
     * Gets the value of the siteWindRoughnessFromSouth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteWindRoughnessFromSouth() {
        return siteWindRoughnessFromSouth;
    }

    /**
     * Sets the value of the siteWindRoughnessFromSouth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteWindRoughnessFromSouth(Long value) {
        this.siteWindRoughnessFromSouth = value;
    }

    /**
     * Gets the value of the siteWindRoughnessFromEast property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteWindRoughnessFromEast() {
        return siteWindRoughnessFromEast;
    }

    /**
     * Sets the value of the siteWindRoughnessFromEast property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteWindRoughnessFromEast(Long value) {
        this.siteWindRoughnessFromEast = value;
    }

    /**
     * Gets the value of the siteWindRoughnessFromWest property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteWindRoughnessFromWest() {
        return siteWindRoughnessFromWest;
    }

    /**
     * Sets the value of the siteWindRoughnessFromWest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteWindRoughnessFromWest(Long value) {
        this.siteWindRoughnessFromWest = value;
    }

    /**
     * Gets the value of the siteSoilDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteSoilDescription() {
        return siteSoilDescription;
    }

    /**
     * Sets the value of the siteSoilDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteSoilDescription(String value) {
        this.siteSoilDescription = value;
    }

    /**
     * Gets the value of the siteSoilPercentSand property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteSoilPercentSand() {
        return siteSoilPercentSand;
    }

    /**
     * Sets the value of the siteSoilPercentSand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteSoilPercentSand(Long value) {
        this.siteSoilPercentSand = value;
    }

    /**
     * Gets the value of the siteSoilPercentSilt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteSoilPercentSilt() {
        return siteSoilPercentSilt;
    }

    /**
     * Sets the value of the siteSoilPercentSilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteSoilPercentSilt(Long value) {
        this.siteSoilPercentSilt = value;
    }

    /**
     * Gets the value of the siteSoilPercentClay property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteSoilPercentClay() {
        return siteSoilPercentClay;
    }

    /**
     * Sets the value of the siteSoilPercentClay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteSoilPercentClay(Long value) {
        this.siteSoilPercentClay = value;
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
