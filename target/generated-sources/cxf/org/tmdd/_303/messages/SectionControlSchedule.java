
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/objectClass&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SectionControlSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionControlSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="restrictions" type="{http://www.tmdd.org/303/messages}Restrictions" minOccurs="0"/&gt;
 *         &lt;element name="organization-information" type="{http://www.tmdd.org/303/messages}OrganizationInformation"/&gt;
 *         &lt;element name="section-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *         &lt;element name="time-base-schedule-number" type="{http://www.ntcip.org/c2f-object-references}TimeBaseScheduleNumber"/&gt;
 *         &lt;element name="time-base-schedule-month" type="{http://www.ntcip.org/c2f-object-references}TimeBaseScheduleMonth"/&gt;
 *         &lt;element name="time-base-schedule-day" type="{http://www.ntcip.org/c2f-object-references}TimeBaseScheduleDay"/&gt;
 *         &lt;element name="time-base-schedule-date" type="{http://www.ntcip.org/c2f-object-references}TimeBaseScheduleDate"/&gt;
 *         &lt;element name="time-base-schedule-day-plan" type="{http://www.ntcip.org/c2f-object-references}TimeBaseScheduleDayPlan"/&gt;
 *         &lt;element name="day-plan-hour" type="{http://www.ntcip.org/c2f-object-references}DayPlanHour"/&gt;
 *         &lt;element name="day-plan-minute" type="{http://www.ntcip.org/c2f-object-references}DayPlanMinute"/&gt;
 *         &lt;element name="last-update-time" type="{http://www.tmdd.org/303/messages}DateTimeZone"/&gt;
 *         &lt;element name="device-id-list"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="255"&gt;
 *                   &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="request-control-mode" type="{http://www.tmdd.org/303/messages}Intersection-signal-control-mode"/&gt;
 *         &lt;element name="timing-pattern-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
@XmlType(name = "SectionControlSchedule", propOrder = {
    "restrictions",
    "organizationInformation",
    "sectionId",
    "timeBaseScheduleNumber",
    "timeBaseScheduleMonth",
    "timeBaseScheduleDay",
    "timeBaseScheduleDate",
    "timeBaseScheduleDayPlan",
    "dayPlanHour",
    "dayPlanMinute",
    "lastUpdateTime",
    "deviceIdList",
    "requestControlMode",
    "timingPatternId",
    "any"
})
public class SectionControlSchedule
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    protected Restrictions restrictions;
    @XmlElement(name = "organization-information", required = true)
    protected OrganizationInformation organizationInformation;
    @XmlElement(name = "section-id", required = true)
    protected String sectionId;
    @XmlElement(name = "time-base-schedule-number")
    @XmlSchemaType(name = "unsignedShort")
    protected int timeBaseScheduleNumber;
    @XmlElement(name = "time-base-schedule-month")
    @XmlSchemaType(name = "unsignedShort")
    protected int timeBaseScheduleMonth;
    @XmlElement(name = "time-base-schedule-day")
    @XmlSchemaType(name = "unsignedByte")
    protected short timeBaseScheduleDay;
    @XmlElement(name = "time-base-schedule-date")
    @XmlSchemaType(name = "unsignedInt")
    protected long timeBaseScheduleDate;
    @XmlElement(name = "time-base-schedule-day-plan")
    @XmlSchemaType(name = "unsignedByte")
    protected short timeBaseScheduleDayPlan;
    @XmlElement(name = "day-plan-hour")
    @XmlSchemaType(name = "unsignedByte")
    protected short dayPlanHour;
    @XmlElement(name = "day-plan-minute")
    @XmlSchemaType(name = "unsignedByte")
    protected short dayPlanMinute;
    @XmlElement(name = "last-update-time", required = true)
    protected DateTimeZone lastUpdateTime;
    @XmlElement(name = "device-id-list", required = true)
    protected SectionControlSchedule.DeviceIdList deviceIdList;
    @XmlElement(name = "request-control-mode", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String requestControlMode;
    @XmlElement(name = "timing-pattern-id", required = true)
    protected String timingPatternId;
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
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionId(String value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the timeBaseScheduleNumber property.
     * 
     */
    public int getTimeBaseScheduleNumber() {
        return timeBaseScheduleNumber;
    }

    /**
     * Sets the value of the timeBaseScheduleNumber property.
     * 
     */
    public void setTimeBaseScheduleNumber(int value) {
        this.timeBaseScheduleNumber = value;
    }

    /**
     * Gets the value of the timeBaseScheduleMonth property.
     * 
     */
    public int getTimeBaseScheduleMonth() {
        return timeBaseScheduleMonth;
    }

    /**
     * Sets the value of the timeBaseScheduleMonth property.
     * 
     */
    public void setTimeBaseScheduleMonth(int value) {
        this.timeBaseScheduleMonth = value;
    }

    /**
     * Gets the value of the timeBaseScheduleDay property.
     * 
     */
    public short getTimeBaseScheduleDay() {
        return timeBaseScheduleDay;
    }

    /**
     * Sets the value of the timeBaseScheduleDay property.
     * 
     */
    public void setTimeBaseScheduleDay(short value) {
        this.timeBaseScheduleDay = value;
    }

    /**
     * Gets the value of the timeBaseScheduleDate property.
     * 
     */
    public long getTimeBaseScheduleDate() {
        return timeBaseScheduleDate;
    }

    /**
     * Sets the value of the timeBaseScheduleDate property.
     * 
     */
    public void setTimeBaseScheduleDate(long value) {
        this.timeBaseScheduleDate = value;
    }

    /**
     * Gets the value of the timeBaseScheduleDayPlan property.
     * 
     */
    public short getTimeBaseScheduleDayPlan() {
        return timeBaseScheduleDayPlan;
    }

    /**
     * Sets the value of the timeBaseScheduleDayPlan property.
     * 
     */
    public void setTimeBaseScheduleDayPlan(short value) {
        this.timeBaseScheduleDayPlan = value;
    }

    /**
     * Gets the value of the dayPlanHour property.
     * 
     */
    public short getDayPlanHour() {
        return dayPlanHour;
    }

    /**
     * Sets the value of the dayPlanHour property.
     * 
     */
    public void setDayPlanHour(short value) {
        this.dayPlanHour = value;
    }

    /**
     * Gets the value of the dayPlanMinute property.
     * 
     */
    public short getDayPlanMinute() {
        return dayPlanMinute;
    }

    /**
     * Sets the value of the dayPlanMinute property.
     * 
     */
    public void setDayPlanMinute(short value) {
        this.dayPlanMinute = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeZone }
     *     
     */
    public DateTimeZone getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeZone }
     *     
     */
    public void setLastUpdateTime(DateTimeZone value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the deviceIdList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionControlSchedule.DeviceIdList }
     *     
     */
    public SectionControlSchedule.DeviceIdList getDeviceIdList() {
        return deviceIdList;
    }

    /**
     * Sets the value of the deviceIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionControlSchedule.DeviceIdList }
     *     
     */
    public void setDeviceIdList(SectionControlSchedule.DeviceIdList value) {
        this.deviceIdList = value;
    }

    /**
     * Gets the value of the requestControlMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestControlMode() {
        return requestControlMode;
    }

    /**
     * Sets the value of the requestControlMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestControlMode(String value) {
        this.requestControlMode = value;
    }

    /**
     * Gets the value of the timingPatternId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimingPatternId() {
        return timingPatternId;
    }

    /**
     * Sets the value of the timingPatternId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimingPatternId(String value) {
        this.timingPatternId = value;
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
     *       &lt;sequence maxOccurs="255"&gt;
     *         &lt;element name="device-id" type="{http://www.tmdd.org/303/messages}Organization-resource-identifier"/&gt;
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
        "deviceId"
    })
    public static class DeviceIdList
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(name = "device-id", required = true)
        protected List<String> deviceId;

        /**
         * Gets the value of the deviceId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the deviceId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeviceId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDeviceId() {
            if (deviceId == null) {
                deviceId = new ArrayList<String>();
            }
            return this.deviceId;
        }

    }

}
