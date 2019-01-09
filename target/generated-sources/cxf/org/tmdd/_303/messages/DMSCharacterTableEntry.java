
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DMS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DMSCharacterTableEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSCharacterTableEntry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="character-number" type="{http://www.ntcip.org/c2f-object-references}CharacterNumber"/&gt;
 *         &lt;element name="character-width" type="{http://www.ntcip.org/c2f-object-references}CharacterWidth"/&gt;
 *         &lt;element name="character-bitmap" type="{http://www.ntcip.org/c2f-object-references}CharacterBitmap"/&gt;
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
@XmlType(name = "DMSCharacterTableEntry", propOrder = {
    "characterNumber",
    "characterWidth",
    "characterBitmap",
    "any"
})
public class DMSCharacterTableEntry
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "character-number")
    @XmlSchemaType(name = "unsignedShort")
    protected int characterNumber;
    @XmlElement(name = "character-width")
    @XmlSchemaType(name = "unsignedByte")
    protected short characterWidth;
    @XmlElement(name = "character-bitmap", required = true)
    protected String characterBitmap;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the characterNumber property.
     * 
     */
    public int getCharacterNumber() {
        return characterNumber;
    }

    /**
     * Sets the value of the characterNumber property.
     * 
     */
    public void setCharacterNumber(int value) {
        this.characterNumber = value;
    }

    /**
     * Gets the value of the characterWidth property.
     * 
     */
    public short getCharacterWidth() {
        return characterWidth;
    }

    /**
     * Sets the value of the characterWidth property.
     * 
     */
    public void setCharacterWidth(short value) {
        this.characterWidth = value;
    }

    /**
     * Gets the value of the characterBitmap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterBitmap() {
        return characterBitmap;
    }

    /**
     * Sets the value of the characterBitmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterBitmap(String value) {
        this.characterBitmap = value;
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
