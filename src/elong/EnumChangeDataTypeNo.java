//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:12:06 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumChangeDataTypeNo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumChangeDataTypeNo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inventory2010"/>
 *     &lt;enumeration value="Price3010"/>
 *     &lt;enumeration value="RackRate3011"/>
 *     &lt;enumeration value="Reservation4010"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumChangeDataTypeNo")
@XmlEnum
public enum EnumChangeDataTypeNo {

    @XmlEnumValue("Inventory2010")
    Inventory2010("Inventory2010"),
    @XmlEnumValue("Price3010")
    Price3010("Price3010"),
    @XmlEnumValue("RackRate3011")
    RackRate3011("RackRate3011"),
    @XmlEnumValue("Reservation4010")
    Reservation4010("Reservation4010");
    private final String value;

    EnumChangeDataTypeNo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumChangeDataTypeNo fromValue(String v) {
        for (EnumChangeDataTypeNo c: EnumChangeDataTypeNo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
