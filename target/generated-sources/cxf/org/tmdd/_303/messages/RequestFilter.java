
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
 * <p>Java class for RequestFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category" type="{http://www.tmdd.org/303/messages}Event-category" minOccurs="0"/&gt;
 *         &lt;element name="priority-level" type="{http://www.tmdd.org/303/messages}Event-description-priority-level" minOccurs="0"/&gt;
 *         &lt;element name="confidence-level" type="{http://www.tmdd.org/303/messages}Event-description-confidence-level" minOccurs="0"/&gt;
 *         &lt;element name="access-level" type="{http://www.tmdd.org/303/messages}Event-access-level" minOccurs="0"/&gt;
 *         &lt;element name="action-request-flag" type="{http://www.tmdd.org/303/messages}Event-action-request-flag" minOccurs="0"/&gt;
 *         &lt;element name="severity" type="{http://www.tmdd.org/303/messages}Event-severity" minOccurs="0"/&gt;
 *         &lt;element name="hazmat-code" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="hazmat-code-item" type="{http://www.tmdd.org/303/messages}Event-hazmat-code"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="placard-code" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="10"&gt;
 *                   &lt;element name="placard-code-item" type="{http://www.tmdd.org/303/messages}Event-placard-code"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organizations-requested" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="20"&gt;
 *                   &lt;element name="organizations-requested-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="headline" type="{http://www.tmdd.org/303/messages}EventType" minOccurs="0"/&gt;
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
@XmlType(name = "RequestFilter", propOrder = {
    "category",
    "priorityLevel",
    "confidenceLevel",
    "accessLevel",
    "actionRequestFlag",
    "severity",
    "hazmatCode",
    "placardCode",
    "organizationsRequested",
    "headline",
    "any"
})
public class RequestFilter
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlSchemaType(name = "anySimpleType")
    protected String category;
    @XmlElement(name = "priority-level")
    @XmlSchemaType(name = "unsignedByte")
    protected Short priorityLevel;
    @XmlElement(name = "confidence-level")
    @XmlSchemaType(name = "anySimpleType")
    protected String confidenceLevel;
    @XmlElement(name = "access-level")
    @XmlSchemaType(name = "anySimpleType")
    protected String accessLevel;
    @XmlElement(name = "action-request-flag")
    @XmlSchemaType(name = "anySimpleType")
    protected String actionRequestFlag;
    @XmlSchemaType(name = "anySimpleType")
    protected String severity;
    @XmlElement(name = "hazmat-code")
    protected RequestFilter.HazmatCode hazmatCode;
    @XmlElement(name = "placard-code")
    protected RequestFilter.PlacardCode placardCode;
    @XmlElement(name = "organizations-requested")
    protected RequestFilter.OrganizationsRequested organizationsRequested;
    protected EventType headline;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the priorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * Sets the value of the priorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPriorityLevel(Short value) {
        this.priorityLevel = value;
    }

    /**
     * Gets the value of the confidenceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Sets the value of the confidenceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidenceLevel(String value) {
        this.confidenceLevel = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the actionRequestFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestFlag() {
        return actionRequestFlag;
    }

    /**
     * Sets the value of the actionRequestFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestFlag(String value) {
        this.actionRequestFlag = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeverity(String value) {
        this.severity = value;
    }

    /**
     * Gets the value of the hazmatCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFilter.HazmatCode }
     *     
     */
    public RequestFilter.HazmatCode getHazmatCode() {
        return hazmatCode;
    }

    /**
     * Sets the value of the hazmatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFilter.HazmatCode }
     *     
     */
    public void setHazmatCode(RequestFilter.HazmatCode value) {
        this.hazmatCode = value;
    }

    /**
     * Gets the value of the placardCode property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFilter.PlacardCode }
     *     
     */
    public RequestFilter.PlacardCode getPlacardCode() {
        return placardCode;
    }

    /**
     * Sets the value of the placardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFilter.PlacardCode }
     *     
     */
    public void setPlacardCode(RequestFilter.PlacardCode value) {
        this.placardCode = value;
    }

    /**
     * Gets the value of the organizationsRequested property.
     * 
     * @return
     *     possible object is
     *     {@link RequestFilter.OrganizationsRequested }
     *     
     */
    public RequestFilter.OrganizationsRequested getOrganizationsRequested() {
        return organizationsRequested;
    }

    /**
     * Sets the value of the organizationsRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestFilter.OrganizationsRequested }
     *     
     */
    public void setOrganizationsRequested(RequestFilter.OrganizationsRequested value) {
        this.organizationsRequested = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setHeadline(EventType value) {
        this.headline = value;
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
     *         &lt;element name="hazmat-code-item" type="{http://www.tmdd.org/303/messages}Event-hazmat-code"/&gt;
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
        "hazmatCodeItem"
    })
    public static class HazmatCode
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "hazmat-code-item", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> hazmatCodeItem;

        /**
         * Gets the value of the hazmatCodeItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hazmatCodeItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHazmatCodeItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getHazmatCodeItem() {
            if (hazmatCodeItem == null) {
                hazmatCodeItem = new ArrayList<Long>();
            }
            return this.hazmatCodeItem;
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
     *         &lt;element name="organizations-requested-item" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
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
        "organizationsRequestedItem"
    })
    public static class OrganizationsRequested
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "organizations-requested-item", required = true)
        protected List<OrganizationInformation> organizationsRequestedItem;

        /**
         * Gets the value of the organizationsRequestedItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organizationsRequestedItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganizationsRequestedItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrganizationInformation }
         * 
         * 
         */
        public List<OrganizationInformation> getOrganizationsRequestedItem() {
            if (organizationsRequestedItem == null) {
                organizationsRequestedItem = new ArrayList<OrganizationInformation>();
            }
            return this.organizationsRequestedItem;
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
     *       &lt;sequence maxOccurs="10"&gt;
     *         &lt;element name="placard-code-item" type="{http://www.tmdd.org/303/messages}Event-placard-code"/&gt;
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
        "placardCodeItem"
    })
    public static class PlacardCode
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "placard-code-item", type = Long.class)
        @XmlSchemaType(name = "unsignedInt")
        protected List<Long> placardCodeItem;

        /**
         * Gets the value of the placardCodeItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the placardCodeItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlacardCodeItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Long }
         * 
         * 
         */
        public List<Long> getPlacardCodeItem() {
            if (placardCodeItem == null) {
                placardCodeItem = new ArrayList<Long>();
            }
            return this.placardCodeItem;
        }

    }

}
