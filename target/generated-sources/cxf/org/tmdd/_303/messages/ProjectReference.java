
package org.tmdd._303.messages;

import java.io.Serializable;
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
 * <p>Java class for ProjectReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="project-reference" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="permit-reference" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="project-contacts" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="project-description" type="{http://www.tmdd.org/303/messages}Event-description-notes-and-comments"/&gt;
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
@XmlType(name = "ProjectReference", propOrder = {
    "projectReference",
    "permitReference",
    "projectContacts",
    "projectDescription",
    "any"
})
public class ProjectReference
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "project-reference")
    protected String projectReference;
    @XmlElement(name = "permit-reference")
    protected String permitReference;
    @XmlElement(name = "project-contacts")
    protected OrganizationInformation projectContacts;
    @XmlElement(name = "project-description")
    protected String projectDescription;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the projectReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectReference() {
        return projectReference;
    }

    /**
     * Sets the value of the projectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectReference(String value) {
        this.projectReference = value;
    }

    /**
     * Gets the value of the permitReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermitReference() {
        return permitReference;
    }

    /**
     * Sets the value of the permitReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitReference(String value) {
        this.permitReference = value;
    }

    /**
     * Gets the value of the projectContacts property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getProjectContacts() {
        return projectContacts;
    }

    /**
     * Sets the value of the projectContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setProjectContacts(OrganizationInformation value) {
        this.projectContacts = value;
    }

    /**
     * Gets the value of the projectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectDescription() {
        return projectDescription;
    }

    /**
     * Sets the value of the projectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectDescription(String value) {
        this.projectDescription = value;
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

}
