
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CCTV&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CCTVControlDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CCTVControlDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="cctv-position-preset" type="{http://www.ntcip.org/c2f-object-references}PresetGotoPosition"/&gt;
 *         &lt;element name="cctv-position-pan" type="{http://www.ntcip.org/c2f-object-references}PositionPan"/&gt;
 *         &lt;element name="cctv-position-tilt" type="{http://www.ntcip.org/c2f-object-references}PositionTilt"/&gt;
 *         &lt;element name="cctv-position-zoom-lens" type="{http://www.ntcip.org/c2f-object-references}PositionZoomLens"/&gt;
 *         &lt;element name="cctv-position-iris-lens" type="{http://www.ntcip.org/c2f-object-references}PositionIrisLens"/&gt;
 *         &lt;element name="cctv-position-focus-lens" type="{http://www.ntcip.org/c2f-object-references}PositionFocusLens"/&gt;
 *         &lt;element name="cctv-environment" type="{http://www.ntcip.org/c2f-object-references}SystemCameraFeatureControl"/&gt;
 *         &lt;element name="cctv-text" type="{http://www.tmdd.org/303/messages}Cctv-titling-text"/&gt;
 *         &lt;element name="cctv-lock" type="{http://www.tmdd.org/303/messages}Binary-flag"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCTVControlDetails", propOrder = {
    "cctvPositionPreset",
    "cctvPositionPan",
    "cctvPositionTilt",
    "cctvPositionZoomLens",
    "cctvPositionIrisLens",
    "cctvPositionFocusLens",
    "cctvEnvironment",
    "cctvText",
    "cctvLock"
})
public class CCTVControlDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
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
    @XmlElement(name = "cctv-environment")
    protected String cctvEnvironment;
    @XmlElement(name = "cctv-text")
    protected String cctvText;
    @XmlElement(name = "cctv-lock")
    @XmlSchemaType(name = "anySimpleType")
    protected String cctvLock;

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
     * Gets the value of the cctvEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvEnvironment() {
        return cctvEnvironment;
    }

    /**
     * Sets the value of the cctvEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvEnvironment(String value) {
        this.cctvEnvironment = value;
    }

    /**
     * Gets the value of the cctvText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvText() {
        return cctvText;
    }

    /**
     * Sets the value of the cctvText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvText(String value) {
        this.cctvText = value;
    }

    /**
     * Gets the value of the cctvLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvLock() {
        return cctvLock;
    }

    /**
     * Sets the value of the cctvLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvLock(String value) {
        this.cctvLock = value;
    }

}
