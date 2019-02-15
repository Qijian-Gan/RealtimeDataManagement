
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Event&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for FullEventUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullEventUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="message-header" type="{http://www.tmdd.org/303/messages}MessageHeader"/&gt;
 *         &lt;element name="event-reference" type="{http://www.tmdd.org/303/messages}EventReference" minOccurs="0"/&gt;
 *         &lt;element name="project-references" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="project-reference" type="{http://www.tmdd.org/303/messages}ProjectReference" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-indicators" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="event-indicator" type="{http://www.tmdd.org/303/messages}EventIndicator" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="other-references" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="other-reference" type="{http://www.tmdd.org/303/messages}OtherReference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-headline" type="{http://www.tmdd.org/303/messages}EventHeadline" minOccurs="0"/&gt;
 *         &lt;element name="event-element-details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="64"&gt;
 *                   &lt;element name="event-element-detail" type="{http://www.tmdd.org/303/messages}EventElementDetail"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="event-comments" type="{http://www.tmdd.org/303/messages}EventComments" minOccurs="0"/&gt;
 *         &lt;element name="full-report-texts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="100"&gt;
 *                   &lt;element name="full-report-text" type="{http://www.tmdd.org/303/messages}FullReportText"/&gt;
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
@XmlType(name = "FullEventUpdate", propOrder = {
    "restrictions",
    "messageHeader",
    "eventReference",
    "projectReferences",
    "eventIndicators",
    "otherReferences",
    "eventHeadline",
    "eventElementDetails",
    "eventComments",
    "fullReportTexts",
    "any"
})
public class FullEventUpdate
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "message-header", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "event-reference")
    protected EventReference eventReference;
    @XmlElement(name = "project-references")
    protected FullEventUpdate.ProjectReferences projectReferences;
    @XmlElement(name = "event-indicators")
    protected FullEventUpdate.EventIndicators eventIndicators;
    @XmlElement(name = "other-references")
    protected FullEventUpdate.OtherReferences otherReferences;
    @XmlElement(name = "event-headline")
    protected EventHeadline eventHeadline;
    @XmlElement(name = "event-element-details")
    protected FullEventUpdate.EventElementDetails eventElementDetails;
    @XmlElement(name = "event-comments")
    protected EventComments eventComments;
    @XmlElement(name = "full-report-texts")
    protected FullEventUpdate.FullReportTexts fullReportTexts;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the eventReference property.
     * 
     * @return
     *     possible object is
     *     {@link EventReference }
     *     
     */
    public EventReference getEventReference() {
        return eventReference;
    }

    /**
     * Sets the value of the eventReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventReference }
     *     
     */
    public void setEventReference(EventReference value) {
        this.eventReference = value;
    }

    /**
     * Gets the value of the projectReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventUpdate.ProjectReferences }
     *     
     */
    public FullEventUpdate.ProjectReferences getProjectReferences() {
        return projectReferences;
    }

    /**
     * Sets the value of the projectReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventUpdate.ProjectReferences }
     *     
     */
    public void setProjectReferences(FullEventUpdate.ProjectReferences value) {
        this.projectReferences = value;
    }

    /**
     * Gets the value of the eventIndicators property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventUpdate.EventIndicators }
     *     
     */
    public FullEventUpdate.EventIndicators getEventIndicators() {
        return eventIndicators;
    }

    /**
     * Sets the value of the eventIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventUpdate.EventIndicators }
     *     
     */
    public void setEventIndicators(FullEventUpdate.EventIndicators value) {
        this.eventIndicators = value;
    }

    /**
     * Gets the value of the otherReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventUpdate.OtherReferences }
     *     
     */
    public FullEventUpdate.OtherReferences getOtherReferences() {
        return otherReferences;
    }

    /**
     * Sets the value of the otherReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventUpdate.OtherReferences }
     *     
     */
    public void setOtherReferences(FullEventUpdate.OtherReferences value) {
        this.otherReferences = value;
    }

    /**
     * Gets the value of the eventHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link EventHeadline }
     *     
     */
    public EventHeadline getEventHeadline() {
        return eventHeadline;
    }

    /**
     * Sets the value of the eventHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventHeadline }
     *     
     */
    public void setEventHeadline(EventHeadline value) {
        this.eventHeadline = value;
    }

    /**
     * Gets the value of the eventElementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventUpdate.EventElementDetails }
     *     
     */
    public FullEventUpdate.EventElementDetails getEventElementDetails() {
        return eventElementDetails;
    }

    /**
     * Sets the value of the eventElementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventUpdate.EventElementDetails }
     *     
     */
    public void setEventElementDetails(FullEventUpdate.EventElementDetails value) {
        this.eventElementDetails = value;
    }

    /**
     * Gets the value of the eventComments property.
     * 
     * @return
     *     possible object is
     *     {@link EventComments }
     *     
     */
    public EventComments getEventComments() {
        return eventComments;
    }

    /**
     * Sets the value of the eventComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventComments }
     *     
     */
    public void setEventComments(EventComments value) {
        this.eventComments = value;
    }

    /**
     * Gets the value of the fullReportTexts property.
     * 
     * @return
     *     possible object is
     *     {@link FullEventUpdate.FullReportTexts }
     *     
     */
    public FullEventUpdate.FullReportTexts getFullReportTexts() {
        return fullReportTexts;
    }

    /**
     * Sets the value of the fullReportTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullEventUpdate.FullReportTexts }
     *     
     */
    public void setFullReportTexts(FullEventUpdate.FullReportTexts value) {
        this.fullReportTexts = value;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="event-element-detail" type="{http://www.tmdd.org/303/messages}EventElementDetail"/&gt;
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
        "eventElementDetail"
    })
    public static class EventElementDetails
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-element-detail", required = true)
        protected List<EventElementDetail> eventElementDetail;

        /**
         * Gets the value of the eventElementDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventElementDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventElementDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventElementDetail }
         * 
         * 
         */
        public List<EventElementDetail> getEventElementDetail() {
            if (eventElementDetail == null) {
                eventElementDetail = new ArrayList<EventElementDetail>();
            }
            return this.eventElementDetail;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="event-indicator" type="{http://www.tmdd.org/303/messages}EventIndicator" minOccurs="0"/&gt;
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
        "eventIndicator"
    })
    public static class EventIndicators
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "event-indicator")
        protected List<EventIndicator> eventIndicator;

        /**
         * Gets the value of the eventIndicator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the eventIndicator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEventIndicator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EventIndicator }
         * 
         * 
         */
        public List<EventIndicator> getEventIndicator() {
            if (eventIndicator == null) {
                eventIndicator = new ArrayList<EventIndicator>();
            }
            return this.eventIndicator;
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
     *       &lt;sequence maxOccurs="100"&gt;
     *         &lt;element name="full-report-text" type="{http://www.tmdd.org/303/messages}FullReportText"/&gt;
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
        "fullReportText"
    })
    public static class FullReportTexts
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "full-report-text", required = true)
        protected List<FullReportText> fullReportText;

        /**
         * Gets the value of the fullReportText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fullReportText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFullReportText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FullReportText }
         * 
         * 
         */
        public List<FullReportText> getFullReportText() {
            if (fullReportText == null) {
                fullReportText = new ArrayList<FullReportText>();
            }
            return this.fullReportText;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="other-reference" type="{http://www.tmdd.org/303/messages}OtherReference"/&gt;
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
        "otherReference"
    })
    public static class OtherReferences
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "other-reference", required = true)
        protected List<OtherReference> otherReference;

        /**
         * Gets the value of the otherReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherReference }
         * 
         * 
         */
        public List<OtherReference> getOtherReference() {
            if (otherReference == null) {
                otherReference = new ArrayList<OtherReference>();
            }
            return this.otherReference;
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
     *       &lt;sequence maxOccurs="64"&gt;
     *         &lt;element name="project-reference" type="{http://www.tmdd.org/303/messages}ProjectReference" minOccurs="0"/&gt;
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
        "projectReference"
    })
    public static class ProjectReferences
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "project-reference")
        protected List<ProjectReference> projectReference;

        /**
         * Gets the value of the projectReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the projectReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProjectReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProjectReference }
         * 
         * 
         */
        public List<ProjectReference> getProjectReference() {
            if (projectReference == null) {
                projectReference = new ArrayList<ProjectReference>();
            }
            return this.projectReference;
        }

    }

}
