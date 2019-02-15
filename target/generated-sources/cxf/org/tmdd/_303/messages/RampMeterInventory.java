
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RampMeter&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RampMeterInventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterInventory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-inventory-header" type="{http://www.tmdd.org/303/messages}DeviceInventoryHeader"/&gt;
 *         &lt;element name="metered-inventory-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="24" minOccurs="0"&gt;
 *                   &lt;element name="metered-lane" type="{http://www.tmdd.org/303/messages}RampMeterInventoryDetails"/&gt;
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
@XmlType(name = "RampMeterInventory", propOrder = {
    "deviceInventoryHeader",
    "meteredInventoryList",
    "any"
})
public class RampMeterInventory
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-inventory-header", required = true)
    protected DeviceInventoryHeader deviceInventoryHeader;
    @XmlElement(name = "metered-inventory-list", required = true)
    protected RampMeterInventory.MeteredInventoryList meteredInventoryList;
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
     * Gets the value of the meteredInventoryList property.
     * 
     * @return
     *     possible object is
     *     {@link RampMeterInventory.MeteredInventoryList }
     *     
     */
    public RampMeterInventory.MeteredInventoryList getMeteredInventoryList() {
        return meteredInventoryList;
    }

    /**
     * Sets the value of the meteredInventoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RampMeterInventory.MeteredInventoryList }
     *     
     */
    public void setMeteredInventoryList(RampMeterInventory.MeteredInventoryList value) {
        this.meteredInventoryList = value;
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
     *       &lt;sequence maxOccurs="24" minOccurs="0"&gt;
     *         &lt;element name="metered-lane" type="{http://www.tmdd.org/303/messages}RampMeterInventoryDetails"/&gt;
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
        "meteredLane"
    })
    public static class MeteredInventoryList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "metered-lane")
        protected List<RampMeterInventoryDetails> meteredLane;

        /**
         * Gets the value of the meteredLane property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meteredLane property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeteredLane().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RampMeterInventoryDetails }
         * 
         * 
         */
        public List<RampMeterInventoryDetails> getMeteredLane() {
            if (meteredLane == null) {
                meteredLane = new ArrayList<RampMeterInventoryDetails>();
            }
            return this.meteredLane;
        }

    }

}
