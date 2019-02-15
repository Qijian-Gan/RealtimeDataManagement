
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Device&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DeviceInformationRequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceInformationRequestFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10000"&gt;
 *                   &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="network-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="link-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="link" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="link-designator-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="link-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="linear-reference" type="{http://www.tmdd.org/303/messages}LinearReferenceRange" minOccurs="0"/&gt;
 *         &lt;element name="section-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10240"&gt;
 *                   &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pattern-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="256"&gt;
 *                   &lt;element name="pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="center-id-list" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="256"&gt;
 *                   &lt;element name="center-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "DeviceInformationRequestFilter", propOrder = {
    "deviceIdList",
    "networkIdList",
    "linkIdList",
    "linkDesignatorList",
    "linearReference",
    "sectionIdList",
    "patternIdList",
    "centerIdList",
    "any"
})
public class DeviceInformationRequestFilter
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-id-list")
    protected DeviceInformationRequestFilter.DeviceIdList deviceIdList;
    @XmlElement(name = "network-id-list")
    protected DeviceInformationRequestFilter.NetworkIdList networkIdList;
    @XmlElement(name = "link-id-list")
    protected DeviceInformationRequestFilter.LinkIdList linkIdList;
    @XmlElement(name = "link-designator-list")
    protected DeviceInformationRequestFilter.LinkDesignatorList linkDesignatorList;
    @XmlElement(name = "linear-reference")
    protected LinearReferenceRange linearReference;
    @XmlElement(name = "section-id-list")
    protected DeviceInformationRequestFilter.SectionIdList sectionIdList;
    @XmlElement(name = "pattern-id-list")
    protected DeviceInformationRequestFilter.PatternIdList patternIdList;
    @XmlElement(name = "center-id-list")
    protected DeviceInformationRequestFilter.CenterIdList centerIdList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the deviceIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.DeviceIdList }
     *     
     */
    public DeviceInformationRequestFilter.DeviceIdList getDeviceIdList() {
        return deviceIdList;
    }

    /**
     * Sets the value of the deviceIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.DeviceIdList }
     *     
     */
    public void setDeviceIdList(DeviceInformationRequestFilter.DeviceIdList value) {
        this.deviceIdList = value;
    }

    /**
     * Gets the value of the networkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.NetworkIdList }
     *     
     */
    public DeviceInformationRequestFilter.NetworkIdList getNetworkIdList() {
        return networkIdList;
    }

    /**
     * Sets the value of the networkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.NetworkIdList }
     *     
     */
    public void setNetworkIdList(DeviceInformationRequestFilter.NetworkIdList value) {
        this.networkIdList = value;
    }

    /**
     * Gets the value of the linkIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.LinkIdList }
     *     
     */
    public DeviceInformationRequestFilter.LinkIdList getLinkIdList() {
        return linkIdList;
    }

    /**
     * Sets the value of the linkIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.LinkIdList }
     *     
     */
    public void setLinkIdList(DeviceInformationRequestFilter.LinkIdList value) {
        this.linkIdList = value;
    }

    /**
     * Gets the value of the linkDesignatorList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.LinkDesignatorList }
     *     
     */
    public DeviceInformationRequestFilter.LinkDesignatorList getLinkDesignatorList() {
        return linkDesignatorList;
    }

    /**
     * Sets the value of the linkDesignatorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.LinkDesignatorList }
     *     
     */
    public void setLinkDesignatorList(DeviceInformationRequestFilter.LinkDesignatorList value) {
        this.linkDesignatorList = value;
    }

    /**
     * Gets the value of the linearReference property.
     * 
     * @return
     *     possible object is
     *     {@link LinearReferenceRange }
     *     
     */
    public LinearReferenceRange getLinearReference() {
        return linearReference;
    }

    /**
     * Sets the value of the linearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearReferenceRange }
     *     
     */
    public void setLinearReference(LinearReferenceRange value) {
        this.linearReference = value;
    }

    /**
     * Gets the value of the sectionIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.SectionIdList }
     *     
     */
    public DeviceInformationRequestFilter.SectionIdList getSectionIdList() {
        return sectionIdList;
    }

    /**
     * Sets the value of the sectionIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.SectionIdList }
     *     
     */
    public void setSectionIdList(DeviceInformationRequestFilter.SectionIdList value) {
        this.sectionIdList = value;
    }

    /**
     * Gets the value of the patternIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.PatternIdList }
     *     
     */
    public DeviceInformationRequestFilter.PatternIdList getPatternIdList() {
        return patternIdList;
    }

    /**
     * Sets the value of the patternIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.PatternIdList }
     *     
     */
    public void setPatternIdList(DeviceInformationRequestFilter.PatternIdList value) {
        this.patternIdList = value;
    }

    /**
     * Gets the value of the centerIdList property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInformationRequestFilter.CenterIdList }
     *     
     */
    public DeviceInformationRequestFilter.CenterIdList getCenterIdList() {
        return centerIdList;
    }

    /**
     * Sets the value of the centerIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInformationRequestFilter.CenterIdList }
     *     
     */
    public void setCenterIdList(DeviceInformationRequestFilter.CenterIdList value) {
        this.centerIdList = value;
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
     *       &lt;sequence maxOccurs="256"&gt;
     *         &lt;element name="center-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "centerId"
    })
    public static class CenterIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "center-id", required = true)
        protected List<String> centerId;

        /**
         * Gets the value of the centerId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the centerId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCenterId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCenterId() {
            if (centerId == null) {
                centerId = new ArrayList<String>();
            }
            return this.centerId;
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
     *       &lt;sequence maxOccurs="10000"&gt;
     *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "deviceId"
    })
    public static class DeviceIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "device-id", required = true)
        protected List<String> deviceId;

        /**
         * Gets the value of the deviceId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deviceId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeviceId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeviceId() {
            if (deviceId == null) {
                deviceId = new ArrayList<String>();
            }
            return this.deviceId;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="link-designator" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
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
        "linkDesignator"
    })
    public static class LinkDesignatorList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "link-designator", required = true)
        protected List<String> linkDesignator;

        /**
         * Gets the value of the linkDesignator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkDesignator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkDesignator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLinkDesignator() {
            if (linkDesignator == null) {
                linkDesignator = new ArrayList<String>();
            }
            return this.linkDesignator;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="link" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "link"
    })
    public static class LinkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected List<String> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLink() {
            if (link == null) {
                link = new ArrayList<String>();
            }
            return this.link;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="network-id" type="{http://www.tmdd.org/303/messages}Transportation-network-identifier"/&gt;
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
        "networkId"
    })
    public static class NetworkIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "network-id", required = true)
        protected List<String> networkId;

        /**
         * Gets the value of the networkId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the networkId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNetworkId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getNetworkId() {
            if (networkId == null) {
                networkId = new ArrayList<String>();
            }
            return this.networkId;
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
     *       &lt;sequence maxOccurs="256"&gt;
     *         &lt;element name="pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "patternId"
    })
    public static class PatternIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "pattern-id", required = true)
        protected List<String> patternId;

        /**
         * Gets the value of the patternId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the patternId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPatternId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPatternId() {
            if (patternId == null) {
                patternId = new ArrayList<String>();
            }
            return this.patternId;
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
     *       &lt;sequence maxOccurs="10240"&gt;
     *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "sectionId"
    })
    public static class SectionIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "section-id", required = true)
        protected List<String> sectionId;

        /**
         * Gets the value of the sectionId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSectionId() {
            if (sectionId == null) {
                sectionId = new ArrayList<String>();
            }
            return this.sectionId;
        }

    }

}
