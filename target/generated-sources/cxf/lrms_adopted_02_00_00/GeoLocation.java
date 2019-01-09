
package lrms_adopted_02_00_00;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.LRMS-Adopted-02-00-00}Latitude"/&gt;
 *         &lt;element name="longitude" type="{http://www.LRMS-Adopted-02-00-00}Longitude"/&gt;
 *         &lt;element name="horizontalDatum" type="{http://www.LRMS-Adopted-02-00-00}HorizontalDatum" minOccurs="0"/&gt;
 *         &lt;element name="height" type="{http://www.LRMS-Adopted-02-00-00}Height" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoLocation", propOrder = {
    "latitude",
    "longitude",
    "horizontalDatum",
    "height"
})
public class GeoLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected int latitude;
    protected int longitude;
    @XmlSchemaType(name = "anySimpleType")
    protected String horizontalDatum;
    protected Height height;

    /**
     * Gets the value of the latitude property.
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the horizontalDatum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorizontalDatum() {
        return horizontalDatum;
    }

    /**
     * Sets the value of the horizontalDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorizontalDatum(String value) {
        this.horizontalDatum = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Height }
     *     
     */
    public Height getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Height }
     *     
     */
    public void setHeight(Height value) {
        this.height = value;
    }

}
