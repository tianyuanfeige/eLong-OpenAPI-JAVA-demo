//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 05:34:10 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IncrInventoryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncrInventoryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inventories" type="{}ArrayOfIncrInventory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrInventoryResult", propOrder = {
    "inventories"
})
public class IncrInventoryResult {

    @JSONField(name = "Inventories")
    protected List<IncrInventory> inventories;

    /**
     * Gets the value of the inventories property.
     * 
     * @return
     *     possible object is
     *     {@link List<IncrInventory> }
     *     
     */
    public List<IncrInventory> getInventories() {
        return inventories;
    }

    /**
     * Sets the value of the inventories property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<IncrInventory> }
     *     
     */
    public void setInventories(List<IncrInventory> value) {
        this.inventories = value;
    }

}
