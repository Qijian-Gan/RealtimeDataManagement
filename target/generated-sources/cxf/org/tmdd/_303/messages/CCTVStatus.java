
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
 * <p>Java class for CCTVStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTVStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="cctv-error" type="{http://www.tmdd.org/303/messages}Device-error" minOccurs="0"/&gt;
 *         &lt;element name="cctv-image-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="8"&gt;
 *                   &lt;element name="cctv-image" type="{http://www.tmdd.org/303/messages}Cctv-image-supported" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cctv-position-preset" type="{http://www.ntcip.org/c2f-object-references}PresetGotoPosition" minOccurs="0"/&gt;
 *         &lt;element name="cctv-position-pan" type="{http://www.ntcip.org/c2f-object-references}PositionPan" minOccurs="0"/&gt;
 *         &lt;element name="cctv-position-tilt" type="{http://www.ntcip.org/c2f-object-references}PositionTilt" minOccurs="0"/&gt;
 *         &lt;element name="cctv-position-zoom-lens" type="{http://www.ntcip.org/c2f-object-references}PositionZoomLens" minOccurs="0"/&gt;
 *         &lt;element name="cctv-position-iris-lens" type="{http://www.ntcip.org/c2f-object-references}PositionIrisLens" minOccurs="0"/&gt;
 *         &lt;element name="cctv-position-focus-lens" type="{http://www.ntcip.org/c2f-object-references}PositionFocusLens" minOccurs="0"/&gt;
 *         &lt;element name="cctv-environmental-status" type="{http://www.ntcip.org/c2f-object-references}SystemCameraFeatureStatus" minOccurs="0"/&gt;
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
@XmlType(name = "CCTVStatus", propOrder = {
    "deviceStatusHeader",
    "cctvError",
    "cctvImageList",
    "cctvPositionPreset",
    "cctvPositionPan",
    "cctvPositionTilt",
    "cctvPositionZoomLens",
    "cctvPositionIrisLens",
    "cctvPositionFocusLens",
    "cctvEnvironmentalStatus",
    "any"
})
public class CCTVStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "cctv-error")
    @XmlSchemaType(name = "anySimpleType")
    protected String cctvError;
    @XmlElement(name = "cctv-image-list")
    protected CCTVStatus.CctvImageList cctvImageList;
    @XmlElement(name = "cctv-position-preset")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cctvPositionPreset;
    @XmlElement(name = "cctv-position-pan")
    protected String cctvPositionPan;
    @XmlElement(name = "cctv-position-tilt")
    protected String cctvPositionTilt;
    @XmlElement(name = "cctv-position-zoom-lens")
    protected String cctvPositionZoomLens;
    @XmlElement(name = "cctv-position-iris-lens")
    protected String cctvPositionIrisLens;
    @XmlElement(name = "cctv-position-focus-lens")
    protected String cctvPositionFocusLens;
    @XmlElement(name = "cctv-environmental-status")
    protected String cctvEnvironmentalStatus;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDeviceStatusHeader() {
        return deviceStatusHeader;
    }

    /**
     * Sets the value of the deviceStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDeviceStatusHeader(DeviceStatusHeader value) {
        this.deviceStatusHeader = value;
    }

    /**
     * Gets the value of the cctvError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvError() {
        return cctvError;
    }

    /**
     * Sets the value of the cctvError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvError(String value) {
        this.cctvError = value;
    }

    /**
     * Gets the value of the cctvImageList property.
     * 
     * @return
     *     possible object is
     *     {@link CCTVStatus.CctvImageList }
     *     
     */
    public CCTVStatus.CctvImageList getCctvImageList() {
        return cctvImageList;
    }

    /**
     * Sets the value of the cctvImageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCTVStatus.CctvImageList }
     *     
     */
    public void setCctvImageList(CCTVStatus.CctvImageList value) {
        this.cctvImageList = value;
    }

    /**
     * Gets the value of the cctvPositionPreset property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCctvPositionPreset() {
        return cctvPositionPreset;
    }

    /**
     * Sets the value of the cctvPositionPreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCctvPositionPreset(Short value) {
        this.cctvPositionPreset = value;
    }

    /**
     * Gets the value of the cctvPositionPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvPositionPan() {
        return cctvPositionPan;
    }

    /**
     * Sets the value of the cctvPositionPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvPositionPan(String value) {
        this.cctvPositionPan = value;
    }

    /**
     * Gets the value of the cctvPositionTilt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvPositionTilt() {
        return cctvPositionTilt;
    }

    /**
     * Sets the value of the cctvPositionTilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvPositionTilt(String value) {
        this.cctvPositionTilt = value;
    }

    /**
     * Gets the value of the cctvPositionZoomLens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvPositionZoomLens() {
        return cctvPositionZoomLens;
    }

    /**
     * Sets the value of the cctvPositionZoomLens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvPositionZoomLens(String value) {
        this.cctvPositionZoomLens = value;
    }

    /**
     * Gets the value of the cctvPositionIrisLens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvPositionIrisLens() {
        return cctvPositionIrisLens;
    }

    /**
     * Sets the value of the cctvPositionIrisLens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvPositionIrisLens(String value) {
        this.cctvPositionIrisLens = value;
    }

    /**
     * Gets the value of the cctvPositionFocusLens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvPositionFocusLens() {
        return cctvPositionFocusLens;
    }

    /**
     * Sets the value of the cctvPositionFocusLens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvPositionFocusLens(String value) {
        this.cctvPositionFocusLens = value;
    }

    /**
     * Gets the value of the cctvEnvironmentalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvEnvironmentalStatus() {
        return cctvEnvironmentalStatus;
    }

    /**
     * Sets the value of the cctvEnvironmentalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvEnvironmentalStatus(String value) {
        this.cctvEnvironmentalStatus = value;
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
     *         &lt;element name="cctv-image" type="{http://www.tmdd.org/303/messages}Cctv-image-supported" minOccurs="0"/&gt;
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
        @XmlElement(name = "cctv-image")
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

}
