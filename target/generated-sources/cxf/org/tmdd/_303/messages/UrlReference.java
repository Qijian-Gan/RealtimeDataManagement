
package org.tmdd._303.messages;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Global&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for UrlReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="url-reference" type="{http://www.tmdd.org/303/messages}Url-reference"/&gt;
 *         &lt;element name="url-reference-medium" type="{http://www.tmdd.org/303/messages}Url-reference-type" minOccurs="0"/&gt;
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
@XmlType(name = "UrlReference", propOrder = {
    "urlReference",
    "urlReferenceMedium",
    "any"
})
public class UrlReference
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "url-reference", required = true)
    protected String urlReference;
    @XmlElement(name = "url-reference-medium")
    protected String urlReferenceMedium;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the urlReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlReference() {
        return urlReference;
    }

    /**
     * Sets the value of the urlReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlReference(String value) {
        this.urlReference = value;
    }

    /**
     * Gets the value of the urlReferenceMedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlReferenceMedium() {
        return urlReferenceMedium;
    }

    /**
     * Sets the value of the urlReferenceMedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlReferenceMedium(String value) {
        this.urlReferenceMedium = value;
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
