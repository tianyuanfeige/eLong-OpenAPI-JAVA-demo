//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 10:10:23 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumIncrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumIncrType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inventory"/>
 *     &lt;enumeration value="Rate"/>
 *     &lt;enumeration value="Order"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumIncrType")
@XmlEnum
public enum EnumIncrType {

    @XmlEnumValue("Inventory")
    Inventory("Inventory"),
    @XmlEnumValue("Rate")
    Rate("Rate"),
    @XmlEnumValue("Order")
    Order("Order"),
    @XmlEnumValue("State")
    State("State"),
    @XmlEnumValue("Data")
    Data("Data");
    private final String value;

    EnumIncrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumIncrType fromValue(String v) {
        for (EnumIncrType c: EnumIncrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
