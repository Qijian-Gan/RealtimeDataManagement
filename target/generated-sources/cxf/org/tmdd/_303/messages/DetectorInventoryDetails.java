
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Detector&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DetectorInventoryDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorInventoryDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detector-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="detector-type" type="{http://www.tmdd.org/303/messages}Detector-type"/&gt;
 *         &lt;element name="detection-lanes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="is-detector-speed-trap-flag" type="{http://www.tmdd.org/303/messages}Binary-flag" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin1" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin2" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin3" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin4" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin5" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="vehicle-classification-bin6" type="{http://www.tmdd.org/303/messages}Detector-bin-length" minOccurs="0"/&gt;
 *         &lt;element name="reporting-system" type="{http://www.tmdd.org/303/messages}Organization-resource-name" minOccurs="0"/&gt;
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
@XmlType(name = "DetectorInventoryDetails", propOrder = {
    "detectorInventoryHeader",
    "detectorType",
    "detectionLanes",
    "isDetectorSpeedTrapFlag",
    "vehicleClassificationBin1",
    "vehicleClassificationBin2",
    "vehicleClassificationBin3",
    "vehicleClassificationBin4",
    "vehicleClassificationBin5",
    "vehicleClassificationBin6",
    "reportingSystem",
    "any"
})
public class DetectorInventoryDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "detector-inventory-header", required = true)
    protected DeviceInventoryHeader detectorInventoryHeader;
    @XmlElement(name = "detector-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String detectorType;
    @XmlElement(name = "detection-lanes")
    protected DetectorInventoryDetails.DetectionLanes detectionLanes;
    @XmlElement(name = "is-detector-speed-trap-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String isDetectorSpeedTrapFlag;
    @XmlElement(name = "vehicle-classification-bin1")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin1;
    @XmlElement(name = "vehicle-classification-bin2")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin2;
    @XmlElement(name = "vehicle-classification-bin3")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin3;
    @XmlElement(name = "vehicle-classification-bin4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin4;
    @XmlElement(name = "vehicle-classification-bin5")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin5;
    @XmlElement(name = "vehicle-classification-bin6")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vehicleClassificationBin6;
    @XmlElement(name = "reporting-system")
    protected String reportingSystem;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the detectorInventoryHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public DeviceInventoryHeader getDetectorInventoryHeader() {
        return detectorInventoryHeader;
    }

    /**
     * Sets the value of the detectorInventoryHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInventoryHeader }
     *     
     */
    public void setDetectorInventoryHeader(DeviceInventoryHeader value) {
        this.detectorInventoryHeader = value;
    }

    /**
     * Gets the value of the detectorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectorType() {
        return detectorType;
    }

    /**
     * Sets the value of the detectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectorType(String value) {
        this.detectorType = value;
    }

    /**
     * Gets the value of the detectionLanes property.
     * 
     * @return
     *     possible object is
     *     {@link DetectorInventoryDetails.DetectionLanes }
     *     
     */
    public DetectorInventoryDetails.DetectionLanes getDetectionLanes() {
        return detectionLanes;
    }

    /**
     * Sets the value of the detectionLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectorInventoryDetails.DetectionLanes }
     *     
     */
    public void setDetectionLanes(DetectorInventoryDetails.DetectionLanes value) {
        this.detectionLanes = value;
    }

    /**
     * Gets the value of the isDetectorSpeedTrapFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDetectorSpeedTrapFlag() {
        return isDetectorSpeedTrapFlag;
    }

    /**
     * Sets the value of the isDetectorSpeedTrapFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDetectorSpeedTrapFlag(String value) {
        this.isDetectorSpeedTrapFlag = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin1() {
        return vehicleClassificationBin1;
    }

    /**
     * Sets the value of the vehicleClassificationBin1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin1(Long value) {
        this.vehicleClassificationBin1 = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin2() {
        return vehicleClassificationBin2;
    }

    /**
     * Sets the value of the vehicleClassificationBin2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin2(Long value) {
        this.vehicleClassificationBin2 = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin3() {
        return vehicleClassificationBin3;
    }

    /**
     * Sets the value of the vehicleClassificationBin3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin3(Long value) {
        this.vehicleClassificationBin3 = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin4() {
        return vehicleClassificationBin4;
    }

    /**
     * Sets the value of the vehicleClassificationBin4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin4(Long value) {
        this.vehicleClassificationBin4 = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin5() {
        return vehicleClassificationBin5;
    }

    /**
     * Sets the value of the vehicleClassificationBin5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin5(Long value) {
        this.vehicleClassificationBin5 = value;
    }

    /**
     * Gets the value of the vehicleClassificationBin6 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVehicleClassificationBin6() {
        return vehicleClassificationBin6;
    }

    /**
     * Sets the value of the vehicleClassificationBin6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVehicleClassificationBin6(Long value) {
        this.vehicleClassificationBin6 = value;
    }

    /**
     * Gets the value of the reportingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingSystem() {
        return reportingSystem;
    }

    /**
     * Sets the value of the reportingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingSystem(String value) {
        this.reportingSystem = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="lanes" type="{http://www.tmdd.org/303/messages}Link-lane-number"/&gt;
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
        "lanes"
    })
    public static class DetectionLanes
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(type = Short.class)
        @XmlSchemaType(name = "unsignedByte")
        protected List<Short> lanes;

        /**
         * Gets the value of the lanes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lanes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Short }
         * 
         * 
         */
        public List<Short> getLanes() {
            if (lanes == null) {
                lanes = new ArrayList<Short>();
            }
            return this.lanes;
        }

    }

}
