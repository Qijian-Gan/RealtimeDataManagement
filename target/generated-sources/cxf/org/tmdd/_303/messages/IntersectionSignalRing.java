
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
 * <p>Java class for IntersectionSignalRing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalRing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ring-identifier" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="ring-phase-assignment"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="ring-phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
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
@XmlType(name = "IntersectionSignalRing", propOrder = {
    "ringIdentifier",
    "ringPhaseAssignment",
    "any"
})
public class IntersectionSignalRing
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ring-identifier", required = true)
    protected String ringIdentifier;
    @XmlElement(name = "ring-phase-assignment", required = true)
    protected IntersectionSignalRing.RingPhaseAssignment ringPhaseAssignment;
    @XmlAnyElement(lax = true)
    protected Object any;

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
     * Gets the value of the ringPhaseAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link IntersectionSignalRing.RingPhaseAssignment }
     *     
     */
    public IntersectionSignalRing.RingPhaseAssignment getRingPhaseAssignment() {
        return ringPhaseAssignment;
    }

    /**
     * Sets the value of the ringPhaseAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntersectionSignalRing.RingPhaseAssignment }
     *     
     */
    public void setRingPhaseAssignment(IntersectionSignalRing.RingPhaseAssignment value) {
        this.ringPhaseAssignment = value;
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
     *         &lt;element name="ring-phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
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
        "ringPhaseIdentifier"
    })
    public static class RingPhaseAssignment
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ring-phase-identifier", type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> ringPhaseIdentifier;

        /**
         * Gets the value of the ringPhaseIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ringPhaseIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRingPhaseIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getRingPhaseIdentifier() {
            if (ringPhaseIdentifier == null) {
                ringPhaseIdentifier = new ArrayList<Short>();
            }
            return this.ringPhaseIdentifier;
        }

    }

}
