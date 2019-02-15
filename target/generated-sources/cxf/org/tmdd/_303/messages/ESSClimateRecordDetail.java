
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;ESS&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ESSClimateRecordDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSClimateRecordDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="climate-observation-month" type="{http://www.tmdd.org/303/messages}Ess-observation-month"/&gt;
 *         &lt;element name="climate-observation-month-min-value" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number"/&gt;
 *         &lt;element name="climate-month-max-value" type="{http://www.tmdd.org/303/messages}Ess-observation-value-range-number"/&gt;
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
@XmlType(name = "ESSClimateRecordDetail", propOrder = {
    "climateObservationMonth",
    "climateObservationMonthMinValue",
    "climateMonthMaxValue",
    "any"
})
public class ESSClimateRecordDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "climate-observation-month", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String climateObservationMonth;
    @XmlElement(name = "climate-observation-month-min-value")
    protected int climateObservationMonthMinValue;
    @XmlElement(name = "climate-month-max-value")
    protected int climateMonthMaxValue;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the climateObservationMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClimateObservationMonth() {
        return climateObservationMonth;
    }

    /**
     * Sets the value of the climateObservationMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClimateObservationMonth(String value) {
        this.climateObservationMonth = value;
    }

    /**
     * Gets the value of the climateObservationMonthMinValue property.
     * 
     */
    public int getClimateObservationMonthMinValue() {
        return climateObservationMonthMinValue;
    }

    /**
     * Sets the value of the climateObservationMonthMinValue property.
     * 
     */
    public void setClimateObservationMonthMinValue(int value) {
        this.climateObservationMonthMinValue = value;
    }

    /**
     * Gets the value of the climateMonthMaxValue property.
     * 
     */
    public int getClimateMonthMaxValue() {
        return climateMonthMaxValue;
    }

    /**
     * Sets the value of the climateMonthMaxValue property.
     * 
     */
    public void setClimateMonthMaxValue(int value) {
        this.climateMonthMaxValue = value;
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

}
