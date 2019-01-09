
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
 * <p>Java class for DMSInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DMSInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="dms-sign-type" type="{http://www.ntcip.org/c2f-object-references}DmsSignType"/&gt;
 *         &lt;element name="signTechnology" type="{http://www.ntcip.org/c2f-object-references}DmsSignTechnology" minOccurs="0"/&gt;
 *         &lt;element name="signHeightPixels" type="{http://www.ntcip.org/c2f-object-references}VmsSignHeightPixels" minOccurs="0"/&gt;
 *         &lt;element name="signWidthPixels" type="{http://www.ntcip.org/c2f-object-references}VmsSignWidthPixels" minOccurs="0"/&gt;
 *         &lt;element name="signHeight" type="{http://www.ntcip.org/c2f-object-references}DmsSignHeight" minOccurs="0"/&gt;
 *         &lt;element name="signWidth" type="{http://www.ntcip.org/c2f-object-references}DmsSignWidth" minOccurs="0"/&gt;
 *         &lt;element name="charHeightPixels" type="{http://www.ntcip.org/c2f-object-references}VmsCharacterHeightPixels" minOccurs="0"/&gt;
 *         &lt;element name="charWidthPixels" type="{http://www.ntcip.org/c2f-object-references}VmsCharacterWidthPixels" minOccurs="0"/&gt;
 *         &lt;element name="dms-beacon-type" type="{http://www.ntcip.org/c2f-object-references}DmsBeaconType" minOccurs="0"/&gt;
 *         &lt;element name="dms-vertical-border" type="{http://www.ntcip.org/c2f-object-references}DmsVerticalBorder" minOccurs="0"/&gt;
 *         &lt;element name="dms-horizontal-border" type="{http://www.ntcip.org/c2f-object-references}DmsHorizontalBorder" minOccurs="0"/&gt;
 *         &lt;element name="dms-vertical-pixel-pitch" type="{http://www.ntcip.org/c2f-object-references}VmsVerticalPitch" minOccurs="0"/&gt;
 *         &lt;element name="dms-horizontal-pixel-pitch" type="{http://www.ntcip.org/c2f-object-references}VmsHorizontalPitch" minOccurs="0"/&gt;
 *         &lt;element name="dms-max-pages" type="{http://www.ntcip.org/c2f-object-references}DmsMaxNumberPages" minOccurs="0"/&gt;
 *         &lt;element name="dms-max-message-length" type="{http://www.ntcip.org/c2f-object-references}DmsMaxMultiStringLength" minOccurs="0"/&gt;
 *         &lt;element name="dms-color-scheme" type="{http://www.ntcip.org/c2f-object-references}DmsColorScheme" minOccurs="0"/&gt;
 *         &lt;element name="dms-multi-tag-support" type="{http://www.ntcip.org/c2f-object-references}DmsSupportedMultiTags" minOccurs="0"/&gt;
 *         &lt;element name="display-line-count" type="{http://www.tmdd.org/303/messages}Dms-display-line-count" minOccurs="0"/&gt;
 *         &lt;element name="character-per-line-count" type="{http://www.tmdd.org/303/messages}Dms-character-per-line-count" minOccurs="0"/&gt;
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
@XmlType(name = "DMSInventory", propOrder = {
    "deviceInventoryHeader",
    "dmsSignType",
    "signTechnology",
    "signHeightPixels",
    "signWidthPixels",
    "signHeight",
    "signWidth",
    "charHeightPixels",
    "charWidthPixels",
    "dmsBeaconType",
    "dmsVerticalBorder",
    "dmsHorizontalBorder",
    "dmsVerticalPixelPitch",
    "dmsHorizontalPixelPitch",
    "dmsMaxPages",
    "dmsMaxMessageLength",
    "dmsColorScheme",
    "dmsMultiTagSupport",
    "displayLineCount",
    "characterPerLineCount",
    "any"
})
public class DMSInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "dms-sign-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String dmsSignType;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer signTechnology;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer signHeightPixels;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer signWidthPixels;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer signHeight;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer signWidth;
    @XmlSchemaType(name = "unsignedByte")
    protected Short charHeightPixels;
    @XmlSchemaType(name = "unsignedByte")
    protected Short charWidthPixels;
    @XmlElement(name = "dms-beacon-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String dmsBeaconType;
    @XmlElement(name = "dms-vertical-border")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dmsVerticalBorder;
    @XmlElement(name = "dms-horizontal-border")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dmsHorizontalBorder;
    @XmlElement(name = "dms-vertical-pixel-pitch")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dmsVerticalPixelPitch;
    @XmlElement(name = "dms-horizontal-pixel-pitch")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dmsHorizontalPixelPitch;
    @XmlElement(name = "dms-max-pages")
    @XmlSchemaType(name = "unsignedByte")
    protected Short dmsMaxPages;
    @XmlElement(name = "dms-max-message-length")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer dmsMaxMessageLength;
    @XmlElement(name = "dms-color-scheme")
    @XmlSchemaType(name = "anySimpleType")
    protected String dmsColorScheme;
    @XmlElement(name = "dms-multi-tag-support")
    protected String dmsMultiTagSupport;
    @XmlElement(name = "display-line-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer displayLineCount;
    @XmlElement(name = "character-per-line-count")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer characterPerLineCount;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getDeviceInventoryHeader() {
        return deviceInventoryHeader;
    }

    /**
     * Sets the value of the deviceInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setDeviceInventoryHeader(DeviceInventoryHeader value) {
        this.deviceInventoryHeader = value;
    }

    /**
     * Gets the value of the dmsSignType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsSignType() {
        return dmsSignType;
    }

    /**
     * Sets the value of the dmsSignType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsSignType(String value) {
        this.dmsSignType = value;
    }

    /**
     * Gets the value of the signTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignTechnology() {
        return signTechnology;
    }

    /**
     * Sets the value of the signTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignTechnology(Integer value) {
        this.signTechnology = value;
    }

    /**
     * Gets the value of the signHeightPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignHeightPixels() {
        return signHeightPixels;
    }

    /**
     * Sets the value of the signHeightPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignHeightPixels(Integer value) {
        this.signHeightPixels = value;
    }

    /**
     * Gets the value of the signWidthPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignWidthPixels() {
        return signWidthPixels;
    }

    /**
     * Sets the value of the signWidthPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignWidthPixels(Integer value) {
        this.signWidthPixels = value;
    }

    /**
     * Gets the value of the signHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignHeight() {
        return signHeight;
    }

    /**
     * Sets the value of the signHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignHeight(Integer value) {
        this.signHeight = value;
    }

    /**
     * Gets the value of the signWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignWidth() {
        return signWidth;
    }

    /**
     * Sets the value of the signWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignWidth(Integer value) {
        this.signWidth = value;
    }

    /**
     * Gets the value of the charHeightPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCharHeightPixels() {
        return charHeightPixels;
    }

    /**
     * Sets the value of the charHeightPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCharHeightPixels(Short value) {
        this.charHeightPixels = value;
    }

    /**
     * Gets the value of the charWidthPixels property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCharWidthPixels() {
        return charWidthPixels;
    }

    /**
     * Sets the value of the charWidthPixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCharWidthPixels(Short value) {
        this.charWidthPixels = value;
    }

    /**
     * Gets the value of the dmsBeaconType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsBeaconType() {
        return dmsBeaconType;
    }

    /**
     * Sets the value of the dmsBeaconType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsBeaconType(String value) {
        this.dmsBeaconType = value;
    }

    /**
     * Gets the value of the dmsVerticalBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDmsVerticalBorder() {
        return dmsVerticalBorder;
    }

    /**
     * Sets the value of the dmsVerticalBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDmsVerticalBorder(Integer value) {
        this.dmsVerticalBorder = value;
    }

    /**
     * Gets the value of the dmsHorizontalBorder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDmsHorizontalBorder() {
        return dmsHorizontalBorder;
    }

    /**
     * Sets the value of the dmsHorizontalBorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDmsHorizontalBorder(Integer value) {
        this.dmsHorizontalBorder = value;
    }

    /**
     * Gets the value of the dmsVerticalPixelPitch property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDmsVerticalPixelPitch() {
        return dmsVerticalPixelPitch;
    }

    /**
     * Sets the value of the dmsVerticalPixelPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDmsVerticalPixelPitch(Short value) {
        this.dmsVerticalPixelPitch = value;
    }

    /**
     * Gets the value of the dmsHorizontalPixelPitch property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDmsHorizontalPixelPitch() {
        return dmsHorizontalPixelPitch;
    }

    /**
     * Sets the value of the dmsHorizontalPixelPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDmsHorizontalPixelPitch(Short value) {
        this.dmsHorizontalPixelPitch = value;
    }

    /**
     * Gets the value of the dmsMaxPages property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDmsMaxPages() {
        return dmsMaxPages;
    }

    /**
     * Sets the value of the dmsMaxPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDmsMaxPages(Short value) {
        this.dmsMaxPages = value;
    }

    /**
     * Gets the value of the dmsMaxMessageLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDmsMaxMessageLength() {
        return dmsMaxMessageLength;
    }

    /**
     * Sets the value of the dmsMaxMessageLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDmsMaxMessageLength(Integer value) {
        this.dmsMaxMessageLength = value;
    }

    /**
     * Gets the value of the dmsColorScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsColorScheme() {
        return dmsColorScheme;
    }

    /**
     * Sets the value of the dmsColorScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsColorScheme(String value) {
        this.dmsColorScheme = value;
    }

    /**
     * Gets the value of the dmsMultiTagSupport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmsMultiTagSupport() {
        return dmsMultiTagSupport;
    }

    /**
     * Sets the value of the dmsMultiTagSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmsMultiTagSupport(String value) {
        this.dmsMultiTagSupport = value;
    }

    /**
     * Gets the value of the displayLineCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplayLineCount() {
        return displayLineCount;
    }

    /**
     * Sets the value of the displayLineCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplayLineCount(Integer value) {
        this.displayLineCount = value;
    }

    /**
     * Gets the value of the characterPerLineCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharacterPerLineCount() {
        return characterPerLineCount;
    }

    /**
     * Sets the value of the characterPerLineCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharacterPerLineCount(Integer value) {
        this.characterPerLineCount = value;
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
