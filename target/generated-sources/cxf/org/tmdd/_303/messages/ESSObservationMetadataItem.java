
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSObservationMetadataItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationMetadataItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ess-observation-positional-order" type="{http://www.tmdd.org/303/messages}Ess-observation-positional-order"/&gt;
 *         &lt;element name="ess-observation-label" type="{http://www.tmdd.org/303/messages}Ess-object-label"/&gt;
 *         &lt;element name="ess-observation-type" type="{http://www.tmdd.org/303/messages}Ess-object-name" minOccurs="0"/&gt;
 *         &lt;element name="ess-observation-null-value" type="{http://www.tmdd.org/303/messages}Ess-object-null-value" minOccurs="0"/&gt;
 *         &lt;element name="ess-observation-units" type="{http://www.tmdd.org/303/messages}Ess-observation-units"/&gt;
 *         &lt;element name="ess-observation-decimal-scaling-factor" type="{http://www.tmdd.org/303/messages}Ess-observation-decimal-scaling-factor"/&gt;
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
@XmlType(name = "ESSObservationMetadataItem", propOrder = {
    "essObservationPositionalOrder",
    "essObservationLabel",
    "essObservationType",
    "essObservationNullValue",
    "essObservationUnits",
    "essObservationDecimalScalingFactor",
    "any"
})
public class ESSObservationMetadataItem
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ess-observation-positional-order")
    protected int essObservationPositionalOrder;
    @XmlElement(name = "ess-observation-label", required = true)
    protected String essObservationLabel;
    @XmlElement(name = "ess-observation-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String essObservationType;
    @XmlElement(name = "ess-observation-null-value")
    protected String essObservationNullValue;
    @XmlElement(name = "ess-observation-units", required = true)
    protected String essObservationUnits;
    @XmlElement(name = "ess-observation-decimal-scaling-factor")
    protected float essObservationDecimalScalingFactor;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the essObservationPositionalOrder property.
     * 
     */
    public int getEssObservationPositionalOrder() {
        return essObservationPositionalOrder;
    }

    /**
     * Sets the value of the essObservationPositionalOrder property.
     * 
     */
    public void setEssObservationPositionalOrder(int value) {
        this.essObservationPositionalOrder = value;
    }

    /**
     * Gets the value of the essObservationLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssObservationLabel() {
        return essObservationLabel;
    }

    /**
     * Sets the value of the essObservationLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssObservationLabel(String value) {
        this.essObservationLabel = value;
    }

    /**
     * Gets the value of the essObservationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssObservationType() {
        return essObservationType;
    }

    /**
     * Sets the value of the essObservationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssObservationType(String value) {
        this.essObservationType = value;
    }

    /**
     * Gets the value of the essObservationNullValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssObservationNullValue() {
        return essObservationNullValue;
    }

    /**
     * Sets the value of the essObservationNullValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssObservationNullValue(String value) {
        this.essObservationNullValue = value;
    }

    /**
     * Gets the value of the essObservationUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssObservationUnits() {
        return essObservationUnits;
    }

    /**
     * Sets the value of the essObservationUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssObservationUnits(String value) {
        this.essObservationUnits = value;
    }

    /**
     * Gets the value of the essObservationDecimalScalingFactor property.
     * 
     */
    public float getEssObservationDecimalScalingFactor() {
        return essObservationDecimalScalingFactor;
    }

    /**
     * Sets the value of the essObservationDecimalScalingFactor property.
     * 
     */
    public void setEssObservationDecimalScalingFactor(float value) {
        this.essObservationDecimalScalingFactor = value;
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
