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
 * <p>Java class for EnumGuestTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumGuestTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="OtherForeign"/>
 *     &lt;enumeration value="HongKong"/>
 *     &lt;enumeration value="Japanese"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumGuestTypeCode")
@XmlEnum
public enum EnumGuestTypeCode {

    @XmlEnumValue("All")
    All("All"),
    @XmlEnumValue("Chinese")
    Chinese("Chinese"),
    @XmlEnumValue("OtherForeign")
    OtherForeign("OtherForeign"),
    @XmlEnumValue("HongKong")
    HongKong("HongKong"),
    @XmlEnumValue("Japanese")
    Japanese("Japanese");
    private final String value;

    EnumGuestTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumGuestTypeCode fromValue(String v) {
        for (EnumGuestTypeCode c: EnumGuestTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
