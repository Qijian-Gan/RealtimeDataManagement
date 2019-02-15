
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
 * <p>Java class for IntersectionSignalInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="intersection-name" type="{http://www.tmdd.org/303/messages}Transportation-network-name"/&gt;
 *         &lt;element name="controller-master-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="intersection-link-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="link" type="{http://www.tmdd.org/303/messages}IntersectionSignalInventoryLinkList"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="movement-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="intersection-movements" type="{http://www.tmdd.org/303/messages}IntersectionSignalMovement"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="phase-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="40"&gt;
 *                   &lt;element name="phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalInventoryPhase"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="overlap-phase-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="overlap-phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalOverlapPhase"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ring-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="rings" type="{http://www.tmdd.org/303/messages}IntersectionSignalRing"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="special-functions-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="special-functions" type="{http://www.tmdd.org/303/messages}IntersectionSignalSpecialFunctions"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="time-reference-code" type="{http://www.tmdd.org/303/messages}Time-reference-code" minOccurs="0"/&gt;
 *         &lt;element name="pattern-sync-reference" type="{http://www.ntcip.org/c2f-object-references}TimebaseAscPatternSync" minOccurs="0"/&gt;
 *         &lt;element name="signal-controller-type" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
 *         &lt;element name="signal-controller-firmware" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalInventory", propOrder = {
    "deviceInventoryHeader",
    "intersectionName",
    "controllerMasterId",
    "intersectionLinkList",
    "movementList",
    "phaseList",
    "overlapPhaseList",
    "ringList",
    "specialFunctionsList",
    "timeReferenceCode",
    "patternSyncReference",
    "signalControllerType",
    "signalControllerFirmware",
    "any"
})
public class IntersectionSignalInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "intersection-name", required = true)
    protected String intersectionName;
    @XmlElement(name = "controller-master-id")
    protected String controllerMasterId;
    @XmlElement(name = "intersection-link-list")
    protected IntersectionSignalInventory.IntersectionLinkList intersectionLinkList;
    @XmlElement(name = "movement-list")
    protected IntersectionSignalInventory.MovementList movementList;
    @XmlElement(name = "phase-list")
    protected IntersectionSignalInventory.PhaseList phaseList;
    @XmlElement(name = "overlap-phase-list")
    protected IntersectionSignalInventory.OverlapPhaseList overlapPhaseList;
    @XmlElement(name = "ring-list")
    protected IntersectionSignalInventory.RingList ringList;
    @XmlElement(name = "special-functions-list")
    protected IntersectionSignalInventory.SpecialFunctionsList specialFunctionsList;
    @XmlElement(name = "time-reference-code")
    @XmlSchemaType(name = "anySimpleType")
    protected String timeReferenceCode;
    @XmlElement(name = "pattern-sync-reference")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer patternSyncReference;
    @XmlElement(name = "signal-controller-type")
    protected String signalControllerType;
    @XmlElement(name = "signal-controller-firmware")
    protected String signalControllerFirmware;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getDeviceInventoryHeader() {
        return deviceInventoryHeader;
    }

    /**
     * Sets the value of the deviceInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setDeviceInventoryHeader(DeviceInventoryHeader value) {
        this.deviceInventoryHeader = value;
    }

    /**
     * Gets the value of the intersectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionName() {
        return intersectionName;
    }

    /**
     * Sets the value of the intersectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionName(String value) {
        this.intersectionName = value;
    }

    /**
     * Gets the value of the controllerMasterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControllerMasterId() {
        return controllerMasterId;
    }

    /**
     * Sets the value of the controllerMasterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControllerMasterId(String value) {
        this.controllerMasterId = value;
    }

    /**
     * Gets the value of the intersectionLinkList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.IntersectionLinkList }
     *     
     */
    public IntersectionSignalInventory.IntersectionLinkList getIntersectionLinkList() {
        return intersectionLinkList;
    }

    /**
     * Sets the value of the intersectionLinkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.IntersectionLinkList }
     *     
     */
    public void setIntersectionLinkList(IntersectionSignalInventory.IntersectionLinkList value) {
        this.intersectionLinkList = value;
    }

    /**
     * Gets the value of the movementList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.MovementList }
     *     
     */
    public IntersectionSignalInventory.MovementList getMovementList() {
        return movementList;
    }

    /**
     * Sets the value of the movementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.MovementList }
     *     
     */
    public void setMovementList(IntersectionSignalInventory.MovementList value) {
        this.movementList = value;
    }

    /**
     * Gets the value of the phaseList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.PhaseList }
     *     
     */
    public IntersectionSignalInventory.PhaseList getPhaseList() {
        return phaseList;
    }

    /**
     * Sets the value of the phaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.PhaseList }
     *     
     */
    public void setPhaseList(IntersectionSignalInventory.PhaseList value) {
        this.phaseList = value;
    }

    /**
     * Gets the value of the overlapPhaseList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.OverlapPhaseList }
     *     
     */
    public IntersectionSignalInventory.OverlapPhaseList getOverlapPhaseList() {
        return overlapPhaseList;
    }

    /**
     * Sets the value of the overlapPhaseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.OverlapPhaseList }
     *     
     */
    public void setOverlapPhaseList(IntersectionSignalInventory.OverlapPhaseList value) {
        this.overlapPhaseList = value;
    }

    /**
     * Gets the value of the ringList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.RingList }
     *     
     */
    public IntersectionSignalInventory.RingList getRingList() {
        return ringList;
    }

    /**
     * Sets the value of the ringList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.RingList }
     *     
     */
    public void setRingList(IntersectionSignalInventory.RingList value) {
        this.ringList = value;
    }

    /**
     * Gets the value of the specialFunctionsList property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalInventory.SpecialFunctionsList }
     *     
     */
    public IntersectionSignalInventory.SpecialFunctionsList getSpecialFunctionsList() {
        return specialFunctionsList;
    }

    /**
     * Sets the value of the specialFunctionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalInventory.SpecialFunctionsList }
     *     
     */
    public void setSpecialFunctionsList(IntersectionSignalInventory.SpecialFunctionsList value) {
        this.specialFunctionsList = value;
    }

    /**
     * Gets the value of the timeReferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeReferenceCode() {
        return timeReferenceCode;
    }

    /**
     * Sets the value of the timeReferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeReferenceCode(String value) {
        this.timeReferenceCode = value;
    }

    /**
     * Gets the value of the patternSyncReference property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPatternSyncReference() {
        return patternSyncReference;
    }

    /**
     * Sets the value of the patternSyncReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPatternSyncReference(Integer value) {
        this.patternSyncReference = value;
    }

    /**
     * Gets the value of the signalControllerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalControllerType() {
        return signalControllerType;
    }

    /**
     * Sets the value of the signalControllerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalControllerType(String value) {
        this.signalControllerType = value;
    }

    /**
     * Gets the value of the signalControllerFirmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalControllerFirmware() {
        return signalControllerFirmware;
    }

    /**
     * Sets the value of the signalControllerFirmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalControllerFirmware(String value) {
        this.signalControllerFirmware = value;
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
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="link" type="{http://www.tmdd.org/303/messages}IntersectionSignalInventoryLinkList"/&gt;
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
        "link"
    })
    public static class IntersectionLinkList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<IntersectionSignalInventoryLinkList> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalInventoryLinkList }
         * 
         * 
         */
        public List<IntersectionSignalInventoryLinkList> getLink() {
            if (link == null) {
                link = new ArrayList<IntersectionSignalInventoryLinkList>();
            }
            return this.link;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="intersection-movements" type="{http://www.tmdd.org/303/messages}IntersectionSignalMovement"/&gt;
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
        "intersectionMovements"
    })
    public static class MovementList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "intersection-movements", required = true)
        protected List<IntersectionSignalMovement> intersectionMovements;

        /**
         * Gets the value of the intersectionMovements property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the intersectionMovements property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIntersectionMovements().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalMovement }
         * 
         * 
         */
        public List<IntersectionSignalMovement> getIntersectionMovements() {
            if (intersectionMovements == null) {
                intersectionMovements = new ArrayList<IntersectionSignalMovement>();
            }
            return this.intersectionMovements;
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
     *         &lt;element name="overlap-phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalOverlapPhase"/&gt;
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
        "overlapPhases"
    })
    public static class OverlapPhaseList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "overlap-phases", required = true)
        protected List<IntersectionSignalOverlapPhase> overlapPhases;

        /**
         * Gets the value of the overlapPhases property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the overlapPhases property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOverlapPhases().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalOverlapPhase }
         * 
         * 
         */
        public List<IntersectionSignalOverlapPhase> getOverlapPhases() {
            if (overlapPhases == null) {
                overlapPhases = new ArrayList<IntersectionSignalOverlapPhase>();
            }
            return this.overlapPhases;
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
     *       &lt;sequence maxOccurs="40"&gt;
     *         &lt;element name="phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalInventoryPhase"/&gt;
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
        "phases"
    })
    public static class PhaseList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<IntersectionSignalInventoryPhase> phases;

        /**
         * Gets the value of the phases property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phases property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhases().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalInventoryPhase }
         * 
         * 
         */
        public List<IntersectionSignalInventoryPhase> getPhases() {
            if (phases == null) {
                phases = new ArrayList<IntersectionSignalInventoryPhase>();
            }
            return this.phases;
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
     *         &lt;element name="rings" type="{http://www.tmdd.org/303/messages}IntersectionSignalRing"/&gt;
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
        "rings"
    })
    public static class RingList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<IntersectionSignalRing> rings;

        /**
         * Gets the value of the rings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalRing }
         * 
         * 
         */
        public List<IntersectionSignalRing> getRings() {
            if (rings == null) {
                rings = new ArrayList<IntersectionSignalRing>();
            }
            return this.rings;
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
     *         &lt;element name="special-functions" type="{http://www.tmdd.org/303/messages}IntersectionSignalSpecialFunctions"/&gt;
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
        "specialFunctions"
    })
    public static class SpecialFunctionsList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "special-functions", required = true)
        protected List<IntersectionSignalSpecialFunctions> specialFunctions;

        /**
         * Gets the value of the specialFunctions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specialFunctions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecialFunctions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalSpecialFunctions }
         * 
         * 
         */
        public List<IntersectionSignalSpecialFunctions> getSpecialFunctions() {
            if (specialFunctions == null) {
                specialFunctions = new ArrayList<IntersectionSignalSpecialFunctions>();
            }
            return this.specialFunctions;
        }

    }

}
