
package lrms_local_02_00_00;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GridProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yourName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridProfile", propOrder = {
    "yourName"
})
public class GridProfile
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected String yourName;

    /**
     * Gets the value of the yourName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYourName() {
        return yourName;
    }

    /**
     * Sets the value of the yourName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYourName(String value) {
        this.yourName = value;
    }

}
