
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CCTV&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CCTVInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTVInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="cctv-requests-supported-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="16"&gt;
 *                   &lt;element name="cctv-requests-supported" type="{http://www.tmdd.org/303/messages}Cctv-request-command"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cctv-image-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="cctv-image" type="{http://www.tmdd.org/303/messages}Cctv-image-supported"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cctv-titling-text" type="{http://www.tmdd.org/303/messages}Cctv-titling-text" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-type" type="{http://www.tmdd.org/303/messages}Cctv-camera-type" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-pan-left-limit" type="{http://www.ntcip.org/c2f-object-references}RangePanLeftLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-pan-right-limit" type="{http://www.ntcip.org/c2f-object-references}RangePanRightLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-tilt-up-limit" type="{http://www.ntcip.org/c2f-object-references}RangeTiltUpLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-tilt-down-limit" type="{http://www.ntcip.org/c2f-object-references}RangeTiltDownLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-zoom-limit" type="{http://www.ntcip.org/c2f-object-references}RangeZoomLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-focus-limit" type="{http://www.ntcip.org/c2f-object-references}RangeFocusLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-iris-limit" type="{http://www.ntcip.org/c2f-object-references}RangeIrisLimit" minOccurs="0"/&gt;
 *         &lt;element name="cctv-camera-environmental" type="{http://www.ntcip.org/c2f-object-references}SystemCameraEquipped" minOccurs="0"/&gt;
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
@XmlType(name = "CCTVInventory", propOrder = {
    "deviceInventoryHeader",
    "cctvRequestsSupportedList",
    "cctvImageList",
    "cctvTitlingText",
    "cctvCameraType",
    "cctvCameraPanLeftLimit",
    "cctvCameraPanRightLimit",
    "cctvCameraTiltUpLimit",
    "cctvCameraTiltDownLimit",
    "cctvCameraZoomLimit",
    "cctvCameraFocusLimit",
    "cctvCameraIrisLimit",
    "cctvCameraEnvironmental",
    "any"
})
public class CCTVInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "cctv-requests-supported-list", required = true)
    protected CCTVInventory.CctvRequestsSupportedList cctvRequestsSupportedList;
    @XmlElement(name = "cctv-image-list", required = true)
    protected CCTVInventory.CctvImageList cctvImageList;
    @XmlElement(name = "cctv-titling-text")
    protected String cctvTitlingText;
    @XmlElement(name = "cctv-camera-type")
    @XmlSchemaType(name = "anySimpleType")
    protected String cctvCameraType;
    @XmlElement(name = "cctv-camera-pan-left-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraPanLeftLimit;
    @XmlElement(name = "cctv-camera-pan-right-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraPanRightLimit;
    @XmlElement(name = "cctv-camera-tilt-up-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraTiltUpLimit;
    @XmlElement(name = "cctv-camera-tilt-down-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraTiltDownLimit;
    @XmlElement(name = "cctv-camera-zoom-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraZoomLimit;
    @XmlElement(name = "cctv-camera-focus-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraFocusLimit;
    @XmlElement(name = "cctv-camera-iris-limit")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer cctvCameraIrisLimit;
    @XmlElement(name = "cctv-camera-environmental")
    protected String cctvCameraEnvironmental;
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
     * Gets the value of the cctvRequestsSupportedList property.
     * 
     * @return
     *     possible object is
     *     {@link CCTVInventory.CctvRequestsSupportedList }
     *     
     */
    public CCTVInventory.CctvRequestsSupportedList getCctvRequestsSupportedList() {
        return cctvRequestsSupportedList;
    }

    /**
     * Sets the value of the cctvRequestsSupportedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTVInventory.CctvRequestsSupportedList }
     *     
     */
    public void setCctvRequestsSupportedList(CCTVInventory.CctvRequestsSupportedList value) {
        this.cctvRequestsSupportedList = value;
    }

    /**
     * Gets the value of the cctvImageList property.
     * 
     * @return
     *     possible object is
     *     {@link CCTVInventory.CctvImageList }
     *     
     */
    public CCTVInventory.CctvImageList getCctvImageList() {
        return cctvImageList;
    }

    /**
     * Sets the value of the cctvImageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTVInventory.CctvImageList }
     *     
     */
    public void setCctvImageList(CCTVInventory.CctvImageList value) {
        this.cctvImageList = value;
    }

    /**
     * Gets the value of the cctvTitlingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvTitlingText() {
        return cctvTitlingText;
    }

    /**
     * Sets the value of the cctvTitlingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvTitlingText(String value) {
        this.cctvTitlingText = value;
    }

    /**
     * Gets the value of the cctvCameraType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraType() {
        return cctvCameraType;
    }

    /**
     * Sets the value of the cctvCameraType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraType(String value) {
        this.cctvCameraType = value;
    }

    /**
     * Gets the value of the cctvCameraPanLeftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraPanLeftLimit() {
        return cctvCameraPanLeftLimit;
    }

    /**
     * Sets the value of the cctvCameraPanLeftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraPanLeftLimit(Integer value) {
        this.cctvCameraPanLeftLimit = value;
    }

    /**
     * Gets the value of the cctvCameraPanRightLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraPanRightLimit() {
        return cctvCameraPanRightLimit;
    }

    /**
     * Sets the value of the cctvCameraPanRightLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraPanRightLimit(Integer value) {
        this.cctvCameraPanRightLimit = value;
    }

    /**
     * Gets the value of the cctvCameraTiltUpLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraTiltUpLimit() {
        return cctvCameraTiltUpLimit;
    }

    /**
     * Sets the value of the cctvCameraTiltUpLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraTiltUpLimit(Integer value) {
        this.cctvCameraTiltUpLimit = value;
    }

    /**
     * Gets the value of the cctvCameraTiltDownLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraTiltDownLimit() {
        return cctvCameraTiltDownLimit;
    }

    /**
     * Sets the value of the cctvCameraTiltDownLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraTiltDownLimit(Integer value) {
        this.cctvCameraTiltDownLimit = value;
    }

    /**
     * Gets the value of the cctvCameraZoomLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraZoomLimit() {
        return cctvCameraZoomLimit;
    }

    /**
     * Sets the value of the cctvCameraZoomLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraZoomLimit(Integer value) {
        this.cctvCameraZoomLimit = value;
    }

    /**
     * Gets the value of the cctvCameraFocusLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraFocusLimit() {
        return cctvCameraFocusLimit;
    }

    /**
     * Sets the value of the cctvCameraFocusLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraFocusLimit(Integer value) {
        this.cctvCameraFocusLimit = value;
    }

    /**
     * Gets the value of the cctvCameraIrisLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCctvCameraIrisLimit() {
        return cctvCameraIrisLimit;
    }

    /**
     * Sets the value of the cctvCameraIrisLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCctvCameraIrisLimit(Integer value) {
        this.cctvCameraIrisLimit = value;
    }

    /**
     * Gets the value of the cctvCameraEnvironmental property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraEnvironmental() {
        return cctvCameraEnvironmental;
    }

    /**
     * Sets the value of the cctvCameraEnvironmental property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraEnvironmental(String value) {
        this.cctvCameraEnvironmental = value;
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
     *       &lt;sequence maxOccurs="8"&gt;
     *         &lt;element name="cctv-image" type="{http://www.tmdd.org/303/messages}Cctv-image-supported"/&gt;
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
        "cctvImage"
    })
    public static class CctvImageList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "cctv-image", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> cctvImage;

        /**
         * Gets the value of the cctvImage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cctvImage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCctvImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCctvImage() {
            if (cctvImage == null) {
                cctvImage = new ArrayList<String>();
            }
            return this.cctvImage;
        }

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
     *       &lt;sequence maxOccurs="16"&gt;
     *         &lt;element name="cctv-requests-supported" type="{http://www.tmdd.org/303/messages}Cctv-request-command"/&gt;
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
        "cctvRequestsSupported"
    })
    public static class CctvRequestsSupportedList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "cctv-requests-supported", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected List<String> cctvRequestsSupported;

        /**
         * Gets the value of the cctvRequestsSupported property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cctvRequestsSupported property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCctvRequestsSupported().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCctvRequestsSupported() {
            if (cctvRequestsSupported == null) {
                cctvRequestsSupported = new ArrayList<String>();
            }
            return this.cctvRequestsSupported;
        }

    }

}
