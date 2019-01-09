
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EventAdvice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventAdvice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="suggestion" type="{http://www.ITIS-Adopted-03-00-02}SuggestionAdvice"/&gt;
 *         &lt;element name="warning" type="{http://www.ITIS-Adopted-03-00-02}WarningAdvice"/&gt;
 *         &lt;element name="instruction-recommendation" type="{http://www.ITIS-Adopted-03-00-02}AdviceInstructionsRecommendations"/&gt;
 *         &lt;element name="instruction-mandatory" type="{http://www.ITIS-Adopted-03-00-02}AdviceInstructionsMandatory"/&gt;
 *         &lt;element name="alternate-route" type="{http://www.ITIS-Adopted-03-00-02}AlternateRoute"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventAdvice", propOrder = {
    "suggestion",
    "warning",
    "instructionRecommendation",
    "instructionMandatory",
    "alternateRoute",
    "any"
})
public class EventAdvice
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlSchemaType(name = "anySimpleType")
    protected String suggestion;
    @XmlSchemaType(name = "anySimpleType")
    protected String warning;
    @XmlElement(name = "instruction-recommendation")
    @XmlSchemaType(name = "anySimpleType")
    protected String instructionRecommendation;
    @XmlElement(name = "instruction-mandatory")
    @XmlSchemaType(name = "anySimpleType")
    protected String instructionMandatory;
    @XmlElement(name = "alternate-route")
    @XmlSchemaType(name = "anySimpleType")
    protected String alternateRoute;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the suggestion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * Sets the value of the suggestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestion(String value) {
        this.suggestion = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarning() {
        return warning;
    }

    /**
     * Sets the value of the warning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarning(String value) {
        this.warning = value;
    }

    /**
     * Gets the value of the instructionRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionRecommendation() {
        return instructionRecommendation;
    }

    /**
     * Sets the value of the instructionRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionRecommendation(String value) {
        this.instructionRecommendation = value;
    }

    /**
     * Gets the value of the instructionMandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionMandatory() {
        return instructionMandatory;
    }

    /**
     * Sets the value of the instructionMandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionMandatory(String value) {
        this.instructionMandatory = value;
    }

    /**
     * Gets the value of the alternateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateRoute() {
        return alternateRoute;
    }

    /**
     * Sets the value of the alternateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateRoute(String value) {
        this.alternateRoute = value;
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
