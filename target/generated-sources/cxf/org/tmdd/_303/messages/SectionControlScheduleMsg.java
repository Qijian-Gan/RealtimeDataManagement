
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Section&lt;/objectClass&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;requirement xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;REQ1346&lt;/requirement&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SectionControlScheduleMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionControlScheduleMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="1024"&gt;
 *         &lt;element name="section-control-schedule-item" type="{http://www.tmdd.org/303/messages}SectionControlSchedule"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionControlScheduleMsg", propOrder = {
    "sectionControlScheduleItem"
})
public class SectionControlScheduleMsg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "section-control-schedule-item", required = true)
    protected List<SectionControlSchedule> sectionControlScheduleItem;

    /**
     * Gets the value of the sectionControlScheduleItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionControlScheduleItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionControlScheduleItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SectionControlSchedule }
     * 
     * 
     */
    public List<SectionControlSchedule> getSectionControlScheduleItem() {
        if (sectionControlScheduleItem == null) {
            sectionControlScheduleItem = new ArrayList<SectionControlSchedule>();
        }
        return this.sectionControlScheduleItem;
    }

}
