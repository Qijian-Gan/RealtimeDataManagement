
package org.tmdd._303.messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="10240"&gt;
 *         &lt;element name="dms-font-table-item" type="{http://www.tmdd.org/303/messages}DMSFontTable"/&gt;
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
    "dmsFontTableItem"
})
@XmlRootElement(name = "dMSFontTableMsg")
public class DMSFontTableMsg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "dms-font-table-item", required = true)
    protected List<DMSFontTable> dmsFontTableItem;

    /**
     * Gets the value of the dmsFontTableItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dmsFontTableItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDmsFontTableItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DMSFontTable }
     * 
     * 
     */
    public List<DMSFontTable> getDmsFontTableItem() {
        if (dmsFontTableItem == null) {
            dmsFontTableItem = new ArrayList<DMSFontTable>();
        }
        return this.dmsFontTableItem;
    }

}
