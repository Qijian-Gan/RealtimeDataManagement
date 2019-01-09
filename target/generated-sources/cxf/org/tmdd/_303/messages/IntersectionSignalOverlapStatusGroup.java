
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
 * <p>Java class for IntersectionSignalOverlapStatusGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalOverlapStatusGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overlap-status-group-number" type="{http://www.ntcip.org/c2f-object-references}OverlapStatusGroupNumber"/&gt;
 *         &lt;element name="overlap-status-group-greens" type="{http://www.ntcip.org/c2f-object-references}OverlapStatusGroupGreens"/&gt;
 *         &lt;element name="overlap-status-group-yellows" type="{http://www.ntcip.org/c2f-object-references}OverlapStatusGroupYellows" minOccurs="0"/&gt;
 *         &lt;element name="overlap-status-group-reds" type="{http://www.ntcip.org/c2f-object-references}OverlapStatusGroupReds" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalOverlapStatusGroup", propOrder = {
    "overlapStatusGroupNumber",
    "overlapStatusGroupGreens",
    "overlapStatusGroupYellows",
    "overlapStatusGroupReds",
    "any"
})
public class IntersectionSignalOverlapStatusGroup
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "overlap-status-group-number")
    @XmlSchemaType(name = "unsignedByte")
    protected short overlapStatusGroupNumber;
    @XmlElement(name = "overlap-status-group-greens")
    @XmlSchemaType(name = "unsignedByte")
    protected short overlapStatusGroupGreens;
    @XmlElement(name = "overlap-status-group-yellows")
    @XmlSchemaType(name = "unsignedByte")
    protected Short overlapStatusGroupYellows;
    @XmlElement(name = "overlap-status-group-reds")
    @XmlSchemaType(name = "unsignedByte")
    protected Short overlapStatusGroupReds;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the overlapStatusGroupNumber property.
     * 
     */
    public short getOverlapStatusGroupNumber() {
        return overlapStatusGroupNumber;
    }

    /**
     * Sets the value of the overlapStatusGroupNumber property.
     * 
     */
    public void setOverlapStatusGroupNumber(short value) {
        this.overlapStatusGroupNumber = value;
    }

    /**
     * Gets the value of the overlapStatusGroupGreens property.
     * 
     */
    public short getOverlapStatusGroupGreens() {
        return overlapStatusGroupGreens;
    }

    /**
     * Sets the value of the overlapStatusGroupGreens property.
     * 
     */
    public void setOverlapStatusGroupGreens(short value) {
        this.overlapStatusGroupGreens = value;
    }

    /**
     * Gets the value of the overlapStatusGroupYellows property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOverlapStatusGroupYellows() {
        return overlapStatusGroupYellows;
    }

    /**
     * Sets the value of the overlapStatusGroupYellows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOverlapStatusGroupYellows(Short value) {
        this.overlapStatusGroupYellows = value;
    }

    /**
     * Gets the value of the overlapStatusGroupReds property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getOverlapStatusGroupReds() {
        return overlapStatusGroupReds;
    }

    /**
     * Sets the value of the overlapStatusGroupReds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setOverlapStatusGroupReds(Short value) {
        this.overlapStatusGroupReds = value;
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

}
