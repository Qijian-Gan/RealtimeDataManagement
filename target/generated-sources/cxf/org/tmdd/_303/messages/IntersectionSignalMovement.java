
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalMovement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalMovement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movement-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="approach-link-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="departing-link-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="crossing-point" type="{http://www.LRMS-Adopted-02-00-00}GeoLocation" minOccurs="0"/&gt;
 *         &lt;element name="approach-vector" type="{http://www.tmdd.org/303/messages}Intersection-turning-movement-angle"/&gt;
 *         &lt;element name="turning-movement-code" type="{http://www.tmdd.org/303/messages}Intersection-turning-movement-code"/&gt;
 *         &lt;element name="turning-movement-lanes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="turning-movement-text" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalMovement", propOrder = {
    "movementIdentifier",
    "approachLinkId",
    "departingLinkId",
    "crossingPoint",
    "approachVector",
    "turningMovementCode",
    "turningMovementLanes",
    "turningMovementText",
    "any"
})
public class IntersectionSignalMovement
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "movement-identifier", required = true)
    protected String movementIdentifier;
    @XmlElement(name = "approach-link-id", required = true)
    protected String approachLinkId;
    @XmlElement(name = "departing-link-id")
    protected String departingLinkId;
    @XmlElement(name = "crossing-point")
    protected GeoLocation crossingPoint;
    @XmlElement(name = "approach-vector")
    @XmlSchemaType(name = "unsignedInt")
    protected long approachVector;
    @XmlElement(name = "turning-movement-code", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String turningMovementCode;
    @XmlElement(name = "turning-movement-lanes")
    protected IntersectionSignalMovement.TurningMovementLanes turningMovementLanes;
    @XmlElement(name = "turning-movement-text")
    protected String turningMovementText;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the movementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementIdentifier() {
        return movementIdentifier;
    }

    /**
     * Sets the value of the movementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementIdentifier(String value) {
        this.movementIdentifier = value;
    }

    /**
     * Gets the value of the approachLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproachLinkId() {
        return approachLinkId;
    }

    /**
     * Sets the value of the approachLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproachLinkId(String value) {
        this.approachLinkId = value;
    }

    /**
     * Gets the value of the departingLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartingLinkId() {
        return departingLinkId;
    }

    /**
     * Sets the value of the departingLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartingLinkId(String value) {
        this.departingLinkId = value;
    }

    /**
     * Gets the value of the crossingPoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeoLocation }
     *     
     */
    public GeoLocation getCrossingPoint() {
        return crossingPoint;
    }

    /**
     * Sets the value of the crossingPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocation }
     *     
     */
    public void setCrossingPoint(GeoLocation value) {
        this.crossingPoint = value;
    }

    /**
     * Gets the value of the approachVector property.
     * 
     */
    public long getApproachVector() {
        return approachVector;
    }

    /**
     * Sets the value of the approachVector property.
     * 
     */
    public void setApproachVector(long value) {
        this.approachVector = value;
    }

    /**
     * Gets the value of the turningMovementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurningMovementCode() {
        return turningMovementCode;
    }

    /**
     * Sets the value of the turningMovementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurningMovementCode(String value) {
        this.turningMovementCode = value;
    }

    /**
     * Gets the value of the turningMovementLanes property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalMovement.TurningMovementLanes }
     *     
     */
    public IntersectionSignalMovement.TurningMovementLanes getTurningMovementLanes() {
        return turningMovementLanes;
    }

    /**
     * Sets the value of the turningMovementLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalMovement.TurningMovementLanes }
     *     
     */
    public void setTurningMovementLanes(IntersectionSignalMovement.TurningMovementLanes value) {
        this.turningMovementLanes = value;
    }

    /**
     * Gets the value of the turningMovementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurningMovementText() {
        return turningMovementText;
    }

    /**
     * Sets the value of the turningMovementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurningMovementText(String value) {
        this.turningMovementText = value;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
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
        "lanes"
    })
    public static class TurningMovementLanes
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> lanes;

        /**
         * Gets the value of the lanes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lanes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getLanes() {
            if (lanes == null) {
                lanes = new ArrayList<Short>();
            }
            return this.lanes;
        }

    }

}
