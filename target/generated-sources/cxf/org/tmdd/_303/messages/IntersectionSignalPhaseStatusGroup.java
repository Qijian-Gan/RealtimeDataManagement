
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
 * <p>Java class for IntersectionSignalPhaseStatusGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalPhaseStatusGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phase-status-group-number" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupNumber"/&gt;
 *         &lt;element name="phase-status-group-greens" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupGreens"/&gt;
 *         &lt;element name="phase-status-group-yellows" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupYellows" minOccurs="0"/&gt;
 *         &lt;element name="phase-status-group-reds" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupReds" minOccurs="0"/&gt;
 *         &lt;element name="phase-status-group-walks" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupWalks" minOccurs="0"/&gt;
 *         &lt;element name="phase-status-group-pedclears" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupPedClears" minOccurs="0"/&gt;
 *         &lt;element name="phase-status-group-dontwalks" type="{http://www.ntcip.org/c2f-object-references}PhaseStatusGroupDontWalks" minOccurs="0"/&gt;
 *         &lt;element name="phase-status-group-right-on-red-prohib" type="{http://www.tmdd.org/303/messages}phase-status-group-right-on-red-prohib" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalPhaseStatusGroup", propOrder = {
    "phaseStatusGroupNumber",
    "phaseStatusGroupGreens",
    "phaseStatusGroupYellows",
    "phaseStatusGroupReds",
    "phaseStatusGroupWalks",
    "phaseStatusGroupPedclears",
    "phaseStatusGroupDontwalks",
    "phaseStatusGroupRightOnRedProhib",
    "any"
})
public class IntersectionSignalPhaseStatusGroup
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "phase-status-group-number")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseStatusGroupNumber;
    @XmlElement(name = "phase-status-group-greens")
    @XmlSchemaType(name = "unsignedByte")
    protected short phaseStatusGroupGreens;
    @XmlElement(name = "phase-status-group-yellows")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupYellows;
    @XmlElement(name = "phase-status-group-reds")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupReds;
    @XmlElement(name = "phase-status-group-walks")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupWalks;
    @XmlElement(name = "phase-status-group-pedclears")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupPedclears;
    @XmlElement(name = "phase-status-group-dontwalks")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupDontwalks;
    @XmlElement(name = "phase-status-group-right-on-red-prohib")
    @XmlSchemaType(name = "unsignedByte")
    protected Short phaseStatusGroupRightOnRedProhib;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the phaseStatusGroupNumber property.
     * 
     */
    public short getPhaseStatusGroupNumber() {
        return phaseStatusGroupNumber;
    }

    /**
     * Sets the value of the phaseStatusGroupNumber property.
     * 
     */
    public void setPhaseStatusGroupNumber(short value) {
        this.phaseStatusGroupNumber = value;
    }

    /**
     * Gets the value of the phaseStatusGroupGreens property.
     * 
     */
    public short getPhaseStatusGroupGreens() {
        return phaseStatusGroupGreens;
    }

    /**
     * Sets the value of the phaseStatusGroupGreens property.
     * 
     */
    public void setPhaseStatusGroupGreens(short value) {
        this.phaseStatusGroupGreens = value;
    }

    /**
     * Gets the value of the phaseStatusGroupYellows property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupYellows() {
        return phaseStatusGroupYellows;
    }

    /**
     * Sets the value of the phaseStatusGroupYellows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupYellows(Short value) {
        this.phaseStatusGroupYellows = value;
    }

    /**
     * Gets the value of the phaseStatusGroupReds property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupReds() {
        return phaseStatusGroupReds;
    }

    /**
     * Sets the value of the phaseStatusGroupReds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupReds(Short value) {
        this.phaseStatusGroupReds = value;
    }

    /**
     * Gets the value of the phaseStatusGroupWalks property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupWalks() {
        return phaseStatusGroupWalks;
    }

    /**
     * Sets the value of the phaseStatusGroupWalks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupWalks(Short value) {
        this.phaseStatusGroupWalks = value;
    }

    /**
     * Gets the value of the phaseStatusGroupPedclears property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupPedclears() {
        return phaseStatusGroupPedclears;
    }

    /**
     * Sets the value of the phaseStatusGroupPedclears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupPedclears(Short value) {
        this.phaseStatusGroupPedclears = value;
    }

    /**
     * Gets the value of the phaseStatusGroupDontwalks property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupDontwalks() {
        return phaseStatusGroupDontwalks;
    }

    /**
     * Sets the value of the phaseStatusGroupDontwalks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupDontwalks(Short value) {
        this.phaseStatusGroupDontwalks = value;
    }

    /**
     * Gets the value of the phaseStatusGroupRightOnRedProhib property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPhaseStatusGroupRightOnRedProhib() {
        return phaseStatusGroupRightOnRedProhib;
    }

    /**
     * Sets the value of the phaseStatusGroupRightOnRedProhib property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPhaseStatusGroupRightOnRedProhib(Short value) {
        this.phaseStatusGroupRightOnRedProhib = value;
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
