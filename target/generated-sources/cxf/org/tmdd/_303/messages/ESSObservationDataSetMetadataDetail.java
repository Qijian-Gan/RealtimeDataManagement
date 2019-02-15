
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
 * <p>Java class for ESSObservationDataSetMetadataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESSObservationDataSetMetadataDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ess-data-set-file-name" type="{http://www.tmdd.org/303/messages}Ess-data-set-file-name"/&gt;
 *         &lt;element name="ess-data-set-file-directory-path" type="{http://www.tmdd.org/303/messages}Ess-data-set-file-path"/&gt;
 *         &lt;element name="ess-data-set-file-access-protocol" type="{http://www.tmdd.org/303/messages}Ess-data-set-file-access-protocol"/&gt;
 *         &lt;element name="ess-data-set-file-access-address" type="{http://www.tmdd.org/303/messages}Ess-data-set-file-host"/&gt;
 *         &lt;element name="ess-data-set-file-access-port-address" type="{http://www.tmdd.org/303/messages}Ess-data-set-file-access-protocol-port-address"/&gt;
 *         &lt;element name="ess-observation-collection-frequency" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes"/&gt;
 *         &lt;element name="ess-observation-collection-offset" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes"/&gt;
 *         &lt;element name="ess-host-server-offset-minutes" type="{http://www.tmdd.org/303/messages}Ess-time-span-minutes"/&gt;
 *         &lt;element name="ess-host-server-time-zone" type="{http://www.tmdd.org/303/messages}Ess-observation-time-zone"/&gt;
 *         &lt;element name="ess-host-server-daylight-savings-in-effect-flag" type="{http://www.tmdd.org/303/messages}Binary-flag"/&gt;
 *         &lt;element name="user-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier" minOccurs="0"/&gt;
 *         &lt;element name="password" type="{http://www.tmdd.org/303/messages}Security-password" minOccurs="0"/&gt;
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
@XmlType(name = "ESSObservationDataSetMetadataDetail", propOrder = {
    "essDataSetFileName",
    "essDataSetFileDirectoryPath",
    "essDataSetFileAccessProtocol",
    "essDataSetFileAccessAddress",
    "essDataSetFileAccessPortAddress",
    "essObservationCollectionFrequency",
    "essObservationCollectionOffset",
    "essHostServerOffsetMinutes",
    "essHostServerTimeZone",
    "essHostServerDaylightSavingsInEffectFlag",
    "userId",
    "password",
    "any"
})
public class ESSObservationDataSetMetadataDetail
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "ess-data-set-file-name", required = true)
    protected String essDataSetFileName;
    @XmlElement(name = "ess-data-set-file-directory-path", required = true)
    protected String essDataSetFileDirectoryPath;
    @XmlElement(name = "ess-data-set-file-access-protocol", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String essDataSetFileAccessProtocol;
    @XmlElement(name = "ess-data-set-file-access-address", required = true)
    protected String essDataSetFileAccessAddress;
    @XmlElement(name = "ess-data-set-file-access-port-address")
    protected int essDataSetFileAccessPortAddress;
    @XmlElement(name = "ess-observation-collection-frequency")
    @XmlSchemaType(name = "unsignedInt")
    protected long essObservationCollectionFrequency;
    @XmlElement(name = "ess-observation-collection-offset")
    @XmlSchemaType(name = "unsignedInt")
    protected long essObservationCollectionOffset;
    @XmlElement(name = "ess-host-server-offset-minutes")
    @XmlSchemaType(name = "unsignedInt")
    protected long essHostServerOffsetMinutes;
    @XmlElement(name = "ess-host-server-time-zone")
    protected byte essHostServerTimeZone;
    @XmlElement(name = "ess-host-server-daylight-savings-in-effect-flag", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String essHostServerDaylightSavingsInEffectFlag;
    @XmlElement(name = "user-id")
    protected String userId;
    protected String password;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the essDataSetFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssDataSetFileName() {
        return essDataSetFileName;
    }

    /**
     * Sets the value of the essDataSetFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssDataSetFileName(String value) {
        this.essDataSetFileName = value;
    }

    /**
     * Gets the value of the essDataSetFileDirectoryPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssDataSetFileDirectoryPath() {
        return essDataSetFileDirectoryPath;
    }

    /**
     * Sets the value of the essDataSetFileDirectoryPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssDataSetFileDirectoryPath(String value) {
        this.essDataSetFileDirectoryPath = value;
    }

    /**
     * Gets the value of the essDataSetFileAccessProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssDataSetFileAccessProtocol() {
        return essDataSetFileAccessProtocol;
    }

    /**
     * Sets the value of the essDataSetFileAccessProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssDataSetFileAccessProtocol(String value) {
        this.essDataSetFileAccessProtocol = value;
    }

    /**
     * Gets the value of the essDataSetFileAccessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssDataSetFileAccessAddress() {
        return essDataSetFileAccessAddress;
    }

    /**
     * Sets the value of the essDataSetFileAccessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssDataSetFileAccessAddress(String value) {
        this.essDataSetFileAccessAddress = value;
    }

    /**
     * Gets the value of the essDataSetFileAccessPortAddress property.
     * 
     */
    public int getEssDataSetFileAccessPortAddress() {
        return essDataSetFileAccessPortAddress;
    }

    /**
     * Sets the value of the essDataSetFileAccessPortAddress property.
     * 
     */
    public void setEssDataSetFileAccessPortAddress(int value) {
        this.essDataSetFileAccessPortAddress = value;
    }

    /**
     * Gets the value of the essObservationCollectionFrequency property.
     * 
     */
    public long getEssObservationCollectionFrequency() {
        return essObservationCollectionFrequency;
    }

    /**
     * Sets the value of the essObservationCollectionFrequency property.
     * 
     */
    public void setEssObservationCollectionFrequency(long value) {
        this.essObservationCollectionFrequency = value;
    }

    /**
     * Gets the value of the essObservationCollectionOffset property.
     * 
     */
    public long getEssObservationCollectionOffset() {
        return essObservationCollectionOffset;
    }

    /**
     * Sets the value of the essObservationCollectionOffset property.
     * 
     */
    public void setEssObservationCollectionOffset(long value) {
        this.essObservationCollectionOffset = value;
    }

    /**
     * Gets the value of the essHostServerOffsetMinutes property.
     * 
     */
    public long getEssHostServerOffsetMinutes() {
        return essHostServerOffsetMinutes;
    }

    /**
     * Sets the value of the essHostServerOffsetMinutes property.
     * 
     */
    public void setEssHostServerOffsetMinutes(long value) {
        this.essHostServerOffsetMinutes = value;
    }

    /**
     * Gets the value of the essHostServerTimeZone property.
     * 
     */
    public byte getEssHostServerTimeZone() {
        return essHostServerTimeZone;
    }

    /**
     * Sets the value of the essHostServerTimeZone property.
     * 
     */
    public void setEssHostServerTimeZone(byte value) {
        this.essHostServerTimeZone = value;
    }

    /**
     * Gets the value of the essHostServerDaylightSavingsInEffectFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssHostServerDaylightSavingsInEffectFlag() {
        return essHostServerDaylightSavingsInEffectFlag;
    }

    /**
     * Sets the value of the essHostServerDaylightSavingsInEffectFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssHostServerDaylightSavingsInEffectFlag(String value) {
        this.essHostServerDaylightSavingsInEffectFlag = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
