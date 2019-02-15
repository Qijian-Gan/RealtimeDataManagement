
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;IntersectionSignal&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IntersectionSignalPhaseSplit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalPhaseSplit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase-identifier" type="{http://www.ntcip.org/c2f-object-references}PhaseNumber"/&gt;
 *         &lt;element name="phase-duration" type="{http://www.tmdd.org/303/messages}Intersection-timing-duration"/&gt;
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
@XmlType(name = "IntersectionSignalPhaseSplit", propOrder = {
    "phaseIdentifier",
    "phaseDuration",
    "any"
})
public class IntersectionSignalPhaseSplit
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "phase-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseIdentifier;
    @XmlElement(name = "phase-duration")
    @XmlSchemaType(name = "unsignedInt")
    protected long phaseDuration;
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
     * Gets the value of the phaseDuration property.
     * 
     */
    public long getPhaseDuration() {
        return phaseDuration;
    }

    /**
     * Sets the value of the phaseDuration property.
     * 
     */
    public void setPhaseDuration(long value) {
        this.phaseDuration = value;
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
