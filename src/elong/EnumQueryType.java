//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.11 at 05:34:10 PM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumQueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumQueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Intelligent"/>
 *     &lt;enumeration value="HotelName"/>
 *     &lt;enumeration value="LocationName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumQueryType")
@XmlEnum
public enum EnumQueryType {

    @XmlEnumValue("Intelligent")
    Intelligent("Intelligent"),
    @XmlEnumValue("HotelName")
    HotelName("HotelName"),
    @XmlEnumValue("LocationName")
    LocationName("LocationName");
    private final String value;

    EnumQueryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumQueryType fromValue(String v) {
        for (EnumQueryType c: EnumQueryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
