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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelCredits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelCredits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HCredits" type="{}ArrayOfHCredit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelCredits", propOrder = {
    "hCredits"
})
public class HotelCredits {

    @JSONField(name = "HCredits")
    protected List<HCredit> hCredits;

    /**
     * Gets the value of the hCredits property.
     * 
     * @return
     *     possible object is
     *     {@link List<HCredit> }
     *     
     */
    public List<HCredit> getHCredits() {
        return hCredits;
    }

    /**
     * Sets the value of the hCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HCredit> }
     *     
     */
    public void setHCredits(List<HCredit> value) {
        this.hCredits = value;
    }

}
