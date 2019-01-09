
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ess-station-status-header" type="{http://www.tmdd.org/303/messages}DeviceStatusHeader"/&gt;
 *         &lt;element name="ess-sensor-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64" minOccurs="0"&gt;
 *                   &lt;element name="ess-sensor" type="{http://www.tmdd.org/303/messages}ESSSensorStatusDetails"/&gt;
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
@XmlType(name = "ESSStatus", propOrder = {
    "essStationStatusHeader",
    "essSensorList",
    "any"
})
public class ESSStatus
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ess-station-status-header", required = true)
    protected DeviceStatusHeader essStationStatusHeader;
    @XmlElement(name = "ess-sensor-list", required = true)
    protected ESSStatus.EssSensorList essSensorList;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the essStationStatusHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public DeviceStatusHeader getEssStationStatusHeader() {
        return essStationStatusHeader;
    }

    /**
     * Sets the value of the essStationStatusHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceStatusHeader }
     *     
     */
    public void setEssStationStatusHeader(DeviceStatusHeader value) {
        this.essStationStatusHeader = value;
    }

    /**
     * Gets the value of the essSensorList property.
     * 
     * @return
     *     possible object is
     *     {@link ESSStatus.EssSensorList }
     *     
     */
    public ESSStatus.EssSensorList getEssSensorList() {
        return essSensorList;
    }

    /**
     * Sets the value of the essSensorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESSStatus.EssSensorList }
     *     
     */
    public void setEssSensorList(ESSStatus.EssSensorList value) {
        this.essSensorList = value;
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
     *       &lt;sequence maxOccurs="64" minOccurs="0"&gt;
     *         &lt;element name="ess-sensor" type="{http://www.tmdd.org/303/messages}ESSSensorStatusDetails"/&gt;
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
        "essSensor"
    })
    public static class EssSensorList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "ess-sensor")
        protected List<ESSSensorStatusDetails> essSensor;

        /**
         * Gets the value of the essSensor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the essSensor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEssSensor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ESSSensorStatusDetails }
         * 
         * 
         */
        public List<ESSSensorStatusDetails> getEssSensor() {
            if (essSensor == null) {
                essSensor = new ArrayList<ESSSensorStatusDetails>();
            }
            return this.essSensor;
        }

    }

}
