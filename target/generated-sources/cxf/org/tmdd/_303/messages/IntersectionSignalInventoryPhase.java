
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
 * <p>Java class for IntersectionSignalInventoryPhase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalInventoryPhase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
 *         &lt;element name="coordinated-phase" type="{http://www.ntcip.org/c2f-object-references}SplitCoordPhase"/&gt;
 *         &lt;element name="concurrent-phases-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
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
@XmlType(name = "IntersectionSignalInventoryPhase", propOrder = {
    "phaseIdentifier",
    "coordinatedPhase",
    "concurrentPhasesList",
    "activeMovementsList",
    "any"
})
public class IntersectionSignalInventoryPhase
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "phase-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseIdentifier;
    @XmlElement(name = "coordinated-phase")
    @XmlSchemaType(name = "unsignedByte")
    protected short coordinatedPhase;
    @XmlElement(name = "concurrent-phases-list", required = true)
    protected IntersectionSignalInventoryPhase.ConcurrentPhasesList concurrentPhasesList;
    @XmlElement(name = "active-movements-list")
    protected IntersectionSignalInventoryPhase.ActiveMovementsList activeMovementsList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the phaseIdentifier property.
     * 
     */
    public short getPhaseIdentifier() {
        return phaseIdentifier;
    }

    /**
     * Sets the value of the phaseIdentifier property.
     * 
     */
    public void setPhaseIdentifier(short value) {
        this.phaseIdentifier = value;
    }

    /**
     * Gets the value of the coordinatedPhase property.
     * 
     */
    public short getCoordinatedPhase() {
        return coordinatedPhase;
    }

    /**
     * Sets the value of the coordinatedPhase property.
     * 
     */
    public void setCoordinatedPhase(short value) {
        this.coordinatedPhase = value;
    }

    /**
     * Gets the value of the concurrentPhasesList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventoryPhase.ConcurrentPhasesList }
     *     
     */
    public IntersectionSignalInventoryPhase.ConcurrentPhasesList getConcurrentPhasesList() {
        return concurrentPhasesList;
    }

    /**
     * Sets the value of the concurrentPhasesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventoryPhase.ConcurrentPhasesList }
     *     
     */
    public void setConcurrentPhasesList(IntersectionSignalInventoryPhase.ConcurrentPhasesList value) {
        this.concurrentPhasesList = value;
    }

    /**
     * Gets the value of the activeMovementsList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventoryPhase.ActiveMovementsList }
     *     
     */
    public IntersectionSignalInventoryPhase.ActiveMovementsList getActiveMovementsList() {
        return activeMovementsList;
    }

    /**
     * Sets the value of the activeMovementsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventoryPhase.ActiveMovementsList }
     *     
     */
    public void setActiveMovementsList(IntersectionSignalInventoryPhase.ActiveMovementsList value) {
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
     *       &lt;sequence maxOccurs="16"&gt;
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
    public static class ConcurrentPhasesList
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
