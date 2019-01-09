
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;RampMeter&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RampControlDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RampControlDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meter-requested-plan" type="{http://www.ntcip.org/c2f-object-references}RmcManualPlan" minOccurs="0"/&gt;
 *         &lt;element name="meter-requested-rate" type="{http://www.ntcip.org/c2f-object-references}RmcManualRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RampControlDetails", propOrder = {
    "meterRequestedPlan",
    "meterRequestedRate"
})
public class RampControlDetails
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "meter-requested-plan")
    @XmlSchemaType(name = "unsignedByte")
    protected Short meterRequestedPlan;
    @XmlElement(name = "meter-requested-rate")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer meterRequestedRate;

    /**
     * Gets the value of the meterRequestedPlan property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMeterRequestedPlan() {
        return meterRequestedPlan;
    }

    /**
     * Sets the value of the meterRequestedPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMeterRequestedPlan(Short value) {
        this.meterRequestedPlan = value;
    }

    /**
     * Gets the value of the meterRequestedRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeterRequestedRate() {
        return meterRequestedRate;
    }

    /**
     * Sets the value of the meterRequestedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeterRequestedRate(Integer value) {
        this.meterRequestedRate = value;
    }

}
