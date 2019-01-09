
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalSequenceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalSequenceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ring-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="sequence-data"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntersectionSignalSequenceData", propOrder = {
    "ringIdentifier",
    "sequenceData"
})
public class IntersectionSignalSequenceData
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ring-identifier", required = true)
    protected String ringIdentifier;
    @XmlElement(name = "sequence-data", required = true)
    protected IntersectionSignalSequenceData.SequenceData sequenceData;

    /**
     * Gets the value of the ringIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingIdentifier() {
        return ringIdentifier;
    }

    /**
     * Sets the value of the ringIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingIdentifier(String value) {
        this.ringIdentifier = value;
    }

    /**
     * Gets the value of the sequenceData property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalSequenceData.SequenceData }
     *     
     */
    public IntersectionSignalSequenceData.SequenceData getSequenceData() {
        return sequenceData;
    }

    /**
     * Sets the value of the sequenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalSequenceData.SequenceData }
     *     
     */
    public void setSequenceData(IntersectionSignalSequenceData.SequenceData value) {
        this.sequenceData = value;
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
    public static class SequenceData
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
