
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
 * <p>Java class for RequestLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="area-locations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="area-location" type="{http://www.tmdd.org/303/messages}AreaLocation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="link-categories" type="{http://www.tmdd.org/303/messages}Event-link-categories"/&gt;
 *         &lt;element name="link-designator"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="link-designator-item" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestLocation", propOrder = {
    "areaLocations",
    "linkCategories",
    "linkDesignator",
    "any"
})
public class RequestLocation
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "area-locations")
    protected RequestLocation.AreaLocations areaLocations;
    @XmlElement(name = "link-categories")
    @XmlSchemaType(name = "anySimpleType")
    protected String linkCategories;
    @XmlElement(name = "link-designator")
    protected RequestLocation.LinkDesignator linkDesignator;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the areaLocations property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocation.AreaLocations }
     *     
     */
    public RequestLocation.AreaLocations getAreaLocations() {
        return areaLocations;
    }

    /**
     * Sets the value of the areaLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocation.AreaLocations }
     *     
     */
    public void setAreaLocations(RequestLocation.AreaLocations value) {
        this.areaLocations = value;
    }

    /**
     * Gets the value of the linkCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCategories() {
        return linkCategories;
    }

    /**
     * Sets the value of the linkCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCategories(String value) {
        this.linkCategories = value;
    }

    /**
     * Gets the value of the linkDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link RequestLocation.LinkDesignator }
     *     
     */
    public RequestLocation.LinkDesignator getLinkDesignator() {
        return linkDesignator;
    }

    /**
     * Sets the value of the linkDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestLocation.LinkDesignator }
     *     
     */
    public void setLinkDesignator(RequestLocation.LinkDesignator value) {
        this.linkDesignator = value;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="area-location" type="{http://www.tmdd.org/303/messages}AreaLocation"/&gt;
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
        "areaLocation"
    })
    public static class AreaLocations
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "area-location", required = true)
        protected List<AreaLocation> areaLocation;

        /**
         * Gets the value of the areaLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the areaLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAreaLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AreaLocation }
         * 
         * 
         */
        public List<AreaLocation> getAreaLocation() {
            if (areaLocation == null) {
                areaLocation = new ArrayList<AreaLocation>();
            }
            return this.areaLocation;
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
     *       &lt;sequence maxOccurs="20"&gt;
     *         &lt;element name="link-designator-item" type="{http://www.tmdd.org/303/messages}Link-route-designator"/&gt;
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
        "linkDesignatorItem"
    })
    public static class LinkDesignator
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "link-designator-item", required = true)
        protected List<String> linkDesignatorItem;

        /**
         * Gets the value of the linkDesignatorItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkDesignatorItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkDesignatorItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLinkDesignatorItem() {
            if (linkDesignatorItem == null) {
                linkDesignatorItem = new ArrayList<String>();
            }
            return this.linkDesignatorItem;
        }

    }

}
