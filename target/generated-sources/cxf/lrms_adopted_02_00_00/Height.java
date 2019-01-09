
package lrms_adopted_02_00_00;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Height complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Height"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="altitude" type="{http://www.LRMS-Adopted-02-00-00}Distance"/&gt;
 *           &lt;element name="verticalDatum" type="{http://www.LRMS-Adopted-02-00-00}VerticalDatum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="verticalLevel" type="{http://www.LRMS-Adopted-02-00-00}VerticalLevel"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Height", propOrder = {
    "altitude",
    "verticalDatum",
    "verticalLevel"
})
public class Height
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Distance altitude;
    @XmlSchemaType(name = "anySimpleType")
    protected String verticalDatum;
    protected Byte verticalLevel;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    public Distance getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    public void setAltitude(Distance value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the verticalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerticalDatum() {
        return verticalDatum;
    }

    /**
     * Sets the value of the verticalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerticalDatum(String value) {
        this.verticalDatum = value;
    }

    /**
     * Gets the value of the verticalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getVerticalLevel() {
        return verticalLevel;
    }

    /**
     * Sets the value of the verticalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setVerticalLevel(Byte value) {
        this.verticalLevel = value;
    }

}
