
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AlternateRouteDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlternateRouteDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternate-route-type" type="{http://www.tmdd.org/303/messages}Event-alternate-route-type"/&gt;
 *         &lt;element name="destination" type="{http://www.tmdd.org/303/messages}LandmarkLocation" minOccurs="0"/&gt;
 *         &lt;element name="location-on-alternate-route" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="location-on-alternate-route-item" type="{http://www.tmdd.org/303/messages}LinkLocation"/&gt;
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
@XmlType(name = "AlternateRouteDetail", propOrder = {
    "alternateRouteType",
    "destination",
    "locationOnAlternateRoute",
    "any"
})
public class AlternateRouteDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "alternate-route-type", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String alternateRouteType;
    protected LandmarkLocation destination;
    @XmlElement(name = "location-on-alternate-route")
    protected AlternateRouteDetail.LocationOnAlternateRoute locationOnAlternateRoute;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the alternateRouteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateRouteType() {
        return alternateRouteType;
    }

    /**
     * Sets the value of the alternateRouteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateRouteType(String value) {
        this.alternateRouteType = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link LandmarkLocation }
     *     
     */
    public LandmarkLocation getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandmarkLocation }
     *     
     */
    public void setDestination(LandmarkLocation value) {
        this.destination = value;
    }

    /**
     * Gets the value of the locationOnAlternateRoute property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateRouteDetail.LocationOnAlternateRoute }
     *     
     */
    public AlternateRouteDetail.LocationOnAlternateRoute getLocationOnAlternateRoute() {
        return locationOnAlternateRoute;
    }

    /**
     * Sets the value of the locationOnAlternateRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRouteDetail.LocationOnAlternateRoute }
     *     
     */
    public void setLocationOnAlternateRoute(AlternateRouteDetail.LocationOnAlternateRoute value) {
        this.locationOnAlternateRoute = value;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="location-on-alternate-route-item" type="{http://www.tmdd.org/303/messages}LinkLocation"/&gt;
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
        "locationOnAlternateRouteItem"
    })
    public static class LocationOnAlternateRoute
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "location-on-alternate-route-item", required = true)
        protected List<LinkLocation> locationOnAlternateRouteItem;

        /**
         * Gets the value of the locationOnAlternateRouteItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locationOnAlternateRouteItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocationOnAlternateRouteItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkLocation }
         * 
         * 
         */
        public List<LinkLocation> getLocationOnAlternateRouteItem() {
            if (locationOnAlternateRouteItem == null) {
                locationOnAlternateRouteItem = new ArrayList<LinkLocation>();
            }
            return this.locationOnAlternateRouteItem;
        }

    }

}
