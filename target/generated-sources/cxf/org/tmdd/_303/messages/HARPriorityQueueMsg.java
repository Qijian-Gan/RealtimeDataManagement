
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
 *         &lt;element name="har-priority-queue-item" type="{http://www.tmdd.org/303/messages}HARPriorityQueue"/&gt;
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
    "harPriorityQueueItem"
})
@XmlRootElement(name = "hARPriorityQueueMsg")
public class HARPriorityQueueMsg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "har-priority-queue-item", required = true)
    protected List<HARPriorityQueue> harPriorityQueueItem;

    /**
     * Gets the value of the harPriorityQueueItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harPriorityQueueItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarPriorityQueueItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HARPriorityQueue }
     * 
     * 
     */
    public List<HARPriorityQueue> getHarPriorityQueueItem() {
        if (harPriorityQueueItem == null) {
            harPriorityQueueItem = new ArrayList<HARPriorityQueue>();
        }
        return this.harPriorityQueueItem;
    }

}
