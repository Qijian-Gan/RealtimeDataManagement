
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;DMS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DMSFontTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSFontTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="defaultFont" type="{http://www.ntcip.org/c2f-object-references}DefaultFont"/&gt;
 *         &lt;element name="fontNumber" type="{http://www.ntcip.org/c2f-object-references}FontNumber"/&gt;
 *         &lt;element name="fontHeight" type="{http://www.ntcip.org/c2f-object-references}FontHeight"/&gt;
 *         &lt;element name="fontCharSpacing" type="{http://www.ntcip.org/c2f-object-references}FontCharSpacing"/&gt;
 *         &lt;element name="fontLineSpacing" type="{http://www.ntcip.org/c2f-object-references}FontLineSpacing"/&gt;
 *         &lt;element name="fontVersionID" type="{http://www.ntcip.org/c2f-object-references}FontVersionID"/&gt;
 *         &lt;element name="fontStatus" type="{http://www.ntcip.org/c2f-object-references}FontStatus"/&gt;
 *         &lt;element name="characterTable"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="65535"&gt;
 *                   &lt;element name="characterTableEntry" type="{http://www.tmdd.org/303/messages}DMSCharacterTableEntry"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone" minOccurs="0"/&gt;
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
@XmlType(name = "DMSFontTable", propOrder = {
    "restrictions",
    "organizationInformation",
    "deviceId",
    "defaultFont",
    "fontNumber",
    "fontHeight",
    "fontCharSpacing",
    "fontLineSpacing",
    "fontVersionID",
    "fontStatus",
    "characterTable",
    "lastUpdateTime",
    "any"
})
public class DMSFontTable
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "device-id", required = true)
    protected String deviceId;
    @XmlSchemaType(name = "unsignedByte")
    protected short defaultFont;
    @XmlSchemaType(name = "unsignedByte")
    protected short fontNumber;
    @XmlSchemaType(name = "unsignedByte")
    protected short fontHeight;
    @XmlSchemaType(name = "unsignedByte")
    protected short fontCharSpacing;
    @XmlSchemaType(name = "unsignedByte")
    protected short fontLineSpacing;
    @XmlSchemaType(name = "unsignedShort")
    protected int fontVersionID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String fontStatus;
    @XmlElement(required = true)
    protected DMSFontTable.CharacterTable characterTable;
    @XmlElement(name = "last-update-time")
    protected DateTimeZone lastUpdateTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Gets the value of the defaultFont property.
     * 
     */
    public short getDefaultFont() {
        return defaultFont;
    }

    /**
     * Sets the value of the defaultFont property.
     * 
     */
    public void setDefaultFont(short value) {
        this.defaultFont = value;
    }

    /**
     * Gets the value of the fontNumber property.
     * 
     */
    public short getFontNumber() {
        return fontNumber;
    }

    /**
     * Sets the value of the fontNumber property.
     * 
     */
    public void setFontNumber(short value) {
        this.fontNumber = value;
    }

    /**
     * Gets the value of the fontHeight property.
     * 
     */
    public short getFontHeight() {
        return fontHeight;
    }

    /**
     * Sets the value of the fontHeight property.
     * 
     */
    public void setFontHeight(short value) {
        this.fontHeight = value;
    }

    /**
     * Gets the value of the fontCharSpacing property.
     * 
     */
    public short getFontCharSpacing() {
        return fontCharSpacing;
    }

    /**
     * Sets the value of the fontCharSpacing property.
     * 
     */
    public void setFontCharSpacing(short value) {
        this.fontCharSpacing = value;
    }

    /**
     * Gets the value of the fontLineSpacing property.
     * 
     */
    public short getFontLineSpacing() {
        return fontLineSpacing;
    }

    /**
     * Sets the value of the fontLineSpacing property.
     * 
     */
    public void setFontLineSpacing(short value) {
        this.fontLineSpacing = value;
    }

    /**
     * Gets the value of the fontVersionID property.
     * 
     */
    public int getFontVersionID() {
        return fontVersionID;
    }

    /**
     * Sets the value of the fontVersionID property.
     * 
     */
    public void setFontVersionID(int value) {
        this.fontVersionID = value;
    }

    /**
     * Gets the value of the fontStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStatus() {
        return fontStatus;
    }

    /**
     * Sets the value of the fontStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStatus(String value) {
        this.fontStatus = value;
    }

    /**
     * Gets the value of the characterTable property.
     * 
     * @return
     *     possible object is
     *     {@link DMSFontTable.CharacterTable }
     *     
     */
    public DMSFontTable.CharacterTable getCharacterTable() {
        return characterTable;
    }

    /**
     * Sets the value of the characterTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMSFontTable.CharacterTable }
     *     
     */
    public void setCharacterTable(DMSFontTable.CharacterTable value) {
        this.characterTable = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateTime(DateTimeZone value) {
        this.lastUpdateTime = value;
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
     *       &lt;sequence maxOccurs="65535"&gt;
     *         &lt;element name="characterTableEntry" type="{http://www.tmdd.org/303/messages}DMSCharacterTableEntry"/&gt;
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
        "characterTableEntry"
    })
    public static class CharacterTable
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<DMSCharacterTableEntry> characterTableEntry;

        /**
         * Gets the value of the characterTableEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characterTableEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacterTableEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DMSCharacterTableEntry }
         * 
         * 
         */
        public List<DMSCharacterTableEntry> getCharacterTableEntry() {
            if (characterTableEntry == null) {
                characterTableEntry = new ArrayList<DMSCharacterTableEntry>();
            }
            return this.characterTableEntry;
        }

    }

}
