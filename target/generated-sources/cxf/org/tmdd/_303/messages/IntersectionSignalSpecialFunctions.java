
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
 * <p>Java class for IntersectionSignalSpecialFunctions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntersectionSignalSpecialFunctions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="special-function-identifier" type="{http://www.ntcip.org/c2f-object-references}SpecialFunctionOutputNumber"/&gt;
 *         &lt;element name="special-function-description" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
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
@XmlType(name = "IntersectionSignalSpecialFunctions", propOrder = {
    "specialFunctionIdentifier",
    "specialFunctionDescription",
    "any"
})
public class IntersectionSignalSpecialFunctions
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "special-function-identifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short specialFunctionIdentifier;
    @XmlElement(name = "special-function-description")
    protected String specialFunctionDescription;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the specialFunctionIdentifier property.
     * 
     */
    public short getSpecialFunctionIdentifier() {
        return specialFunctionIdentifier;
    }

    /**
     * Sets the value of the specialFunctionIdentifier property.
     * 
     */
    public void setSpecialFunctionIdentifier(short value) {
        this.specialFunctionIdentifier = value;
    }

    /**
     * Gets the value of the specialFunctionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFunctionDescription() {
        return specialFunctionDescription;
    }

    /**
     * Sets the value of the specialFunctionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFunctionDescription(String value) {
        this.specialFunctionDescription = value;
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
