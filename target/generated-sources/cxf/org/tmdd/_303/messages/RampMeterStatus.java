
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RampMeter&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RampMeterStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampMeterStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="device-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="metered-status-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="24" minOccurs="0"&gt;
 *                   &lt;element name="metered-lane" type="{http://www.tmdd.org/303/messages}RampMeterLaneStatusDetails"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mainline-flow-rate" type="{http://www.ntcip.org/c2f-object-references}RmcAverageFlowRate" minOccurs="0"/&gt;
 *         &lt;element name="mainline-vehicle-occupancy" type="{http://www.ntcip.org/c2f-object-references}RmcAverageOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="mainline-vehicle-speed" type="{http://www.ntcip.org/c2f-object-references}RmcAverageSpeed" minOccurs="0"/&gt;
 *         &lt;element name="operation-alteration-authorization" type="{http://www.tmdd.org/303/messages}Binary-unknown-flag" minOccurs="0"/&gt;
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
@XmlType(name = "RampMeterStatus", propOrder = {
    "deviceStatusHeader",
    "meteredStatusList",
    "mainlineFlowRate",
    "mainlineVehicleOccupancy",
    "mainlineVehicleSpeed",
    "operationAlterationAuthorization",
    "any"
})
public class RampMeterStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "device-status-header", required = true)
    protected DeviceStatusHeader deviceStatusHeader;
    @XmlElement(name = "metered-status-list", required = true)
    protected RampMeterStatus.MeteredStatusList meteredStatusList;
    @XmlElement(name = "mainline-flow-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer mainlineFlowRate;
    @XmlElement(name = "mainline-vehicle-occupancy")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer mainlineVehicleOccupancy;
    @XmlElement(name = "mainline-vehicle-speed")
    @XmlSchemaType(name = "unsignedByte")
    protected Short mainlineVehicleSpeed;
    @XmlElement(name = "operation-alteration-authorization")
    @XmlSchemaType(name = "anySimpleType")
    protected String operationAlterationAuthorization;
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
     * Gets the value of the meteredStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link RampMeterStatus.MeteredStatusList }
     *     
     */
    public RampMeterStatus.MeteredStatusList getMeteredStatusList() {
        return meteredStatusList;
    }

    /**
     * Sets the value of the meteredStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RampMeterStatus.MeteredStatusList }
     *     
     */
    public void setMeteredStatusList(RampMeterStatus.MeteredStatusList value) {
        this.meteredStatusList = value;
    }

    /**
     * Gets the value of the mainlineFlowRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainlineFlowRate() {
        return mainlineFlowRate;
    }

    /**
     * Sets the value of the mainlineFlowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainlineFlowRate(Integer value) {
        this.mainlineFlowRate = value;
    }

    /**
     * Gets the value of the mainlineVehicleOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMainlineVehicleOccupancy() {
        return mainlineVehicleOccupancy;
    }

    /**
     * Sets the value of the mainlineVehicleOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMainlineVehicleOccupancy(Integer value) {
        this.mainlineVehicleOccupancy = value;
    }

    /**
     * Gets the value of the mainlineVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMainlineVehicleSpeed() {
        return mainlineVehicleSpeed;
    }

    /**
     * Sets the value of the mainlineVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMainlineVehicleSpeed(Short value) {
        this.mainlineVehicleSpeed = value;
    }

    /**
     * Gets the value of the operationAlterationAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationAlterationAuthorization() {
        return operationAlterationAuthorization;
    }

    /**
     * Sets the value of the operationAlterationAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationAlterationAuthorization(String value) {
        this.operationAlterationAuthorization = value;
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
     *         &lt;element name="metered-lane" type="{http://www.tmdd.org/303/messages}RampMeterLaneStatusDetails"/&gt;
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
    public static class MeteredStatusList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "metered-lane")
        protected List<RampMeterLaneStatusDetails> meteredLane;

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
         * {@link RampMeterLaneStatusDetails }
         * 
         * 
         */
        public List<RampMeterLaneStatusDetails> getMeteredLane() {
            if (meteredLane == null) {
                meteredLane = new ArrayList<RampMeterLaneStatusDetails>();
            }
            return this.meteredLane;
        }

    }

}
