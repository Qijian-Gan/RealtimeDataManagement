
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Detector&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DetectorStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetectorStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="detector-station-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader" minOccurs="0"/&gt;
 *         &lt;element name="detector-status-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="65535" minOccurs="0"&gt;
 *                   &lt;element name="detector" type="{http://www.tmdd.org/303/messages}DetectorStatusDetails"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "DetectorStatus", propOrder = {
    "detectorStationStatusHeader",
    "detectorStatusList",
    "any"
})
public class DetectorStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "detector-station-status-header")
    protected DeviceStatusHeader detectorStationStatusHeader;
    @XmlElement(name = "detector-status-list", required = true)
    protected DetectorStatus.DetectorStatusList detectorStatusList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the detectorStationStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getDetectorStationStatusHeader() {
        return detectorStationStatusHeader;
    }

    /**
     * Sets the value of the detectorStationStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setDetectorStationStatusHeader(DeviceStatusHeader value) {
        this.detectorStationStatusHeader = value;
    }

    /**
     * Gets the value of the detectorStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link DetectorStatus.DetectorStatusList }
     *     
     */
    public DetectorStatus.DetectorStatusList getDetectorStatusList() {
        return detectorStatusList;
    }

    /**
     * Sets the value of the detectorStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetectorStatus.DetectorStatusList }
     *     
     */
    public void setDetectorStatusList(DetectorStatus.DetectorStatusList value) {
        this.detectorStatusList = value;
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
     *       &lt;sequence maxOccurs="65535" minOccurs="0"&gt;
     *         &lt;element name="detector" type="{http://www.tmdd.org/303/messages}DetectorStatusDetails"/&gt;
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
        "detector"
    })
    public static class DetectorStatusList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        protected List<DetectorStatusDetails> detector;

        /**
         * Gets the value of the detector property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detector property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetector().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetectorStatusDetails }
         * 
         * 
         */
        public List<DetectorStatusDetails> getDetector() {
            if (detector == null) {
                detector = new ArrayList<DetectorStatusDetails>();
            }
            return this.detector;
        }

    }

}
