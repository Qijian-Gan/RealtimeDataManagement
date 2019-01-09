
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SectionSignalTimingPatternInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionSignalTimingPatternInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intersection-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="cycle-length" type="{http://www.ntcip.org/c2f-object-references}PatternCycleTime"/&gt;
 *         &lt;element name="offset-time" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime"/&gt;
 *         &lt;element name="phase-tp-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="40"&gt;
 *                   &lt;element name="phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalTPInventoryPhase"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sequence-information" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="sequence-information" type="{http://www.tmdd.org/303/messages}IntersectionSignalSequenceData"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionSignalTimingPatternInventory", propOrder = {
    "intersectionId",
    "cycleLength",
    "offsetTime",
    "phaseTpList",
    "sequenceInformation"
})
public class SectionSignalTimingPatternInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "intersection-id", required = true)
    protected String intersectionId;
    @XmlElement(name = "cycle-length")
    @XmlSchemaType(name = "unsignedByte")
    protected short cycleLength;
    @XmlElement(name = "offset-time")
    @XmlSchemaType(name = "unsignedByte")
    protected short offsetTime;
    @XmlElement(name = "phase-tp-list", required = true)
    protected SectionSignalTimingPatternInventory.PhaseTpList phaseTpList;
    @XmlElement(name = "sequence-information")
    protected SectionSignalTimingPatternInventory.SequenceInformation sequenceInformation;

    /**
     * Gets the value of the intersectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntersectionId() {
        return intersectionId;
    }

    /**
     * Sets the value of the intersectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntersectionId(String value) {
        this.intersectionId = value;
    }

    /**
     * Gets the value of the cycleLength property.
     * 
     */
    public short getCycleLength() {
        return cycleLength;
    }

    /**
     * Sets the value of the cycleLength property.
     * 
     */
    public void setCycleLength(short value) {
        this.cycleLength = value;
    }

    /**
     * Gets the value of the offsetTime property.
     * 
     */
    public short getOffsetTime() {
        return offsetTime;
    }

    /**
     * Sets the value of the offsetTime property.
     * 
     */
    public void setOffsetTime(short value) {
        this.offsetTime = value;
    }

    /**
     * Gets the value of the phaseTpList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionSignalTimingPatternInventory.PhaseTpList }
     *     
     */
    public SectionSignalTimingPatternInventory.PhaseTpList getPhaseTpList() {
        return phaseTpList;
    }

    /**
     * Sets the value of the phaseTpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionSignalTimingPatternInventory.PhaseTpList }
     *     
     */
    public void setPhaseTpList(SectionSignalTimingPatternInventory.PhaseTpList value) {
        this.phaseTpList = value;
    }

    /**
     * Gets the value of the sequenceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SectionSignalTimingPatternInventory.SequenceInformation }
     *     
     */
    public SectionSignalTimingPatternInventory.SequenceInformation getSequenceInformation() {
        return sequenceInformation;
    }

    /**
     * Sets the value of the sequenceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionSignalTimingPatternInventory.SequenceInformation }
     *     
     */
    public void setSequenceInformation(SectionSignalTimingPatternInventory.SequenceInformation value) {
        this.sequenceInformation = value;
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
     *         &lt;element name="phases" type="{http://www.tmdd.org/303/messages}IntersectionSignalTPInventoryPhase"/&gt;
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
    public static class PhaseTpList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<IntersectionSignalTPInventoryPhase> phases;

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
         * {@link IntersectionSignalTPInventoryPhase }
         * 
         * 
         */
        public List<IntersectionSignalTPInventoryPhase> getPhases() {
            if (phases == null) {
                phases = new ArrayList<IntersectionSignalTPInventoryPhase>();
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="sequence-information" type="{http://www.tmdd.org/303/messages}IntersectionSignalSequenceData"/&gt;
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
        "sequenceInformation"
    })
    public static class SequenceInformation
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "sequence-information", required = true)
        protected List<IntersectionSignalSequenceData> sequenceInformation;

        /**
         * Gets the value of the sequenceInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sequenceInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSequenceInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IntersectionSignalSequenceData }
         * 
         * 
         */
        public List<IntersectionSignalSequenceData> getSequenceInformation() {
            if (sequenceInformation == null) {
                sequenceInformation = new ArrayList<IntersectionSignalSequenceData>();
            }
            return this.sequenceInformation;
        }

    }

}
