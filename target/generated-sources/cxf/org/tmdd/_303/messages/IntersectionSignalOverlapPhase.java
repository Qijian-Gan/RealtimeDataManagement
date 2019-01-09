
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalOverlapPhase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalOverlapPhase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overlap-identifier" type="{http://www.ntcip.org/c2f-object-references}OverlapNumber"/&gt;
 *         &lt;element name="overlap-included-phases"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="active-movements-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="movement-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "IntersectionSignalOverlapPhase", propOrder = {
    "overlapIdentifier",
    "overlapIncludedPhases",
    "activeMovementsList",
    "any"
})
public class IntersectionSignalOverlapPhase
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "overlap-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short overlapIdentifier;
    @XmlElement(name = "overlap-included-phases", required = true)
    protected IntersectionSignalOverlapPhase.OverlapIncludedPhases overlapIncludedPhases;
    @XmlElement(name = "active-movements-list")
    protected IntersectionSignalOverlapPhase.ActiveMovementsList activeMovementsList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the overlapIdentifier property.
     * 
     */
    public short getOverlapIdentifier() {
        return overlapIdentifier;
    }

    /**
     * Sets the value of the overlapIdentifier property.
     * 
     */
    public void setOverlapIdentifier(short value) {
        this.overlapIdentifier = value;
    }

    /**
     * Gets the value of the overlapIncludedPhases property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalOverlapPhase.OverlapIncludedPhases }
     *     
     */
    public IntersectionSignalOverlapPhase.OverlapIncludedPhases getOverlapIncludedPhases() {
        return overlapIncludedPhases;
    }

    /**
     * Sets the value of the overlapIncludedPhases property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalOverlapPhase.OverlapIncludedPhases }
     *     
     */
    public void setOverlapIncludedPhases(IntersectionSignalOverlapPhase.OverlapIncludedPhases value) {
        this.overlapIncludedPhases = value;
    }

    /**
     * Gets the value of the activeMovementsList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalOverlapPhase.ActiveMovementsList }
     *     
     */
    public IntersectionSignalOverlapPhase.ActiveMovementsList getActiveMovementsList() {
        return activeMovementsList;
    }

    /**
     * Sets the value of the activeMovementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalOverlapPhase.ActiveMovementsList }
     *     
     */
    public void setActiveMovementsList(IntersectionSignalOverlapPhase.ActiveMovementsList value) {
        this.activeMovementsList = value;
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
     *       &lt;sequence maxOccurs="16"&gt;
     *         &lt;element name="movement-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "movementIdentifier"
    })
    public static class ActiveMovementsList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "movement-identifier", required = true)
        protected List<String> movementIdentifier;

        /**
         * Gets the value of the movementIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the movementIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMovementIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMovementIdentifier() {
            if (movementIdentifier == null) {
                movementIdentifier = new ArrayList<String>();
            }
            return this.movementIdentifier;
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
     *         &lt;element name="phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
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
        "phaseIdentifier"
    })
    public static class OverlapIncludedPhases
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "phase-identifier", type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> phaseIdentifier;

        /**
         * Gets the value of the phaseIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phaseIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhaseIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getPhaseIdentifier() {
            if (phaseIdentifier == null) {
                phaseIdentifier = new ArrayList<Short>();
            }
            return this.phaseIdentifier;
        }

    }

}
