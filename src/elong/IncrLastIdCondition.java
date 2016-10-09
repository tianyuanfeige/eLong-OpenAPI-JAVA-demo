//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 09:48:52 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for IncrLastIdCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncrLastIdCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IncrType" type="{}EnumIncrType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrLastIdCondition", propOrder = {
    "lastTime",
    "incrType"
})
public class IncrLastIdCondition {

    @JSONField(name = "LastTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date lastTime;
    @JSONField(name = "IncrType")
    @XmlSchemaType(name = "string")
    protected EnumIncrType incrType;

    /**
     * Gets the value of the lastTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getLastTime() {
        return lastTime;
    }

    /**
     * Sets the value of the lastTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setLastTime(java.util.Date value) {
        this.lastTime = value;
    }

    /**
     * Gets the value of the incrType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumIncrType }
     *     
     */
    public EnumIncrType getIncrType() {
        return incrType;
    }

    /**
     * Sets the value of the incrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumIncrType }
     *     
     */
    public void setIncrType(EnumIncrType value) {
        this.incrType = value;
    }

}
