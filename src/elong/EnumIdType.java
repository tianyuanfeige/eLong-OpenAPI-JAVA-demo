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
 * <p>Java class for EnumIdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumIdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IdentityCard"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="OfficerCertificate"/>
 *     &lt;enumeration value="PoliceID"/>
 *     &lt;enumeration value="ReentryPermit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumIdType")
@XmlEnum
public enum EnumIdType {

    @XmlEnumValue("IdentityCard")
    IdentityCard("IdentityCard"),
    @XmlEnumValue("Passport")
    Passport("Passport"),
    @XmlEnumValue("Other")
    Other("Other"),
    @XmlEnumValue("OfficerCertificate")
    OfficerCertificate("OfficerCertificate"),
    @XmlEnumValue("PoliceID")
    PoliceID("PoliceID"),
    @XmlEnumValue("ReentryPermit")
    ReentryPermit("ReentryPermit");
    private final String value;

    EnumIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumIdType fromValue(String v) {
        for (EnumIdType c: EnumIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
