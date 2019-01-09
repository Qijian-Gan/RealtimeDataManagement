
package org.tmdd._303.messages;

import java.io.Serializable;
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
 * <p>Java class for SectionControlDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionControlDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request-control-mode" type="{http://www.tmdd.org/303/messages}Intersection-signal-control-mode" minOccurs="0"/&gt;
 *         &lt;element name="timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="section-offset-adjustment" type="{http://www.ntcip.org/c2f-object-references}PatternOffsetTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionControlDetails", propOrder = {
    "requestControlMode",
    "timingPatternId",
    "sectionOffsetAdjustment"
})
public class SectionControlDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "request-control-mode")
    @XmlSchemaType(name = "anySimpleType")
    protected String requestControlMode;
    @XmlElement(name = "timing-pattern-id")
    protected String timingPatternId;
    @XmlElement(name = "section-offset-adjustment")
    @XmlSchemaType(name = "unsignedByte")
    protected Short sectionOffsetAdjustment;

    /**
     * Gets the value of the requestControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestControlMode() {
        return requestControlMode;
    }

    /**
     * Sets the value of the requestControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestControlMode(String value) {
        this.requestControlMode = value;
    }

    /**
     * Gets the value of the timingPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternId() {
        return timingPatternId;
    }

    /**
     * Sets the value of the timingPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternId(String value) {
        this.timingPatternId = value;
    }

    /**
     * Gets the value of the sectionOffsetAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getSectionOffsetAdjustment() {
        return sectionOffsetAdjustment;
    }

    /**
     * Sets the value of the sectionOffsetAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSectionOffsetAdjustment(Short value) {
        this.sectionOffsetAdjustment = value;
    }

}
