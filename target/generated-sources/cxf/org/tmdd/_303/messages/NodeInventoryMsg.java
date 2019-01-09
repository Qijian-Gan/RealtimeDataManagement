
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;objectClass xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Node&lt;/objectClass&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;requirement xmlns="http://www.tmdd.org/303/messages" xmlns:c2c="http://www.ntcip.org/c2c-message-administration" xmlns:itis="http://www.ITIS-Adopted-03-00-02" xmlns:lrms="http://www.LRMS-Adopted-02-00-00" xmlns:ntcip="http://www.ntcip.org/c2f-object-references" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;REQ1084&lt;/requirement&gt;
 * </pre>
 * 
 * 
 * <p>Java class for NodeInventoryMsg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NodeInventoryMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="10240"&gt;
 *         &lt;element name="node-inventory-item" type="{http://www.tmdd.org/303/messages}NodeInventory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeInventoryMsg", propOrder = {
    "nodeInventoryItem"
})
public class NodeInventoryMsg
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "node-inventory-item", required = true)
    protected List<NodeInventory> nodeInventoryItem;

    /**
     * Gets the value of the nodeInventoryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeInventoryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeInventoryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeInventory }
     * 
     * 
     */
    public List<NodeInventory> getNodeInventoryItem() {
        if (nodeInventoryItem == null) {
            nodeInventoryItem = new ArrayList<NodeInventory>();
        }
        return this.nodeInventoryItem;
    }

}
