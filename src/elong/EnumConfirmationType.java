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
 * <p>Java class for EnumConfirmationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumConfirmationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoNeed"/>
 *     &lt;enumeration value="SMS_cn"/>
 *     &lt;enumeration value="SMS_en"/>
 *     &lt;enumeration value="Email_cn"/>
 *     &lt;enumeration value="Email_en"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="Fax"/>
 *     &lt;enumeration value="Fax_big5"/>
 *     &lt;enumeration value="SMS_cn_big5"/>
 *     &lt;enumeration value="Email_cn_big5"/>
 *     &lt;enumeration value="NotAllowedConfirm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumConfirmationType")
@XmlEnum
public enum EnumConfirmationType {

    @XmlEnumValue("NoNeed")
    NoNeed("NoNeed"),
    @XmlEnumValue("SMS_cn")
    SMS_cn("SMS_cn"),
    @XmlEnumValue("SMS_en")
    SMS_en("SMS_en"),
    @XmlEnumValue("Email_cn")
    Email_cn("Email_cn"),
    @XmlEnumValue("Email_en")
    Email_en("Email_en"),
    @XmlEnumValue("Phone")
    Phone("Phone"),
    @XmlEnumValue("Fax")
    Fax("Fax"),
    @XmlEnumValue("Fax_big5")
    Fax_big5("Fax_big5"),
    @XmlEnumValue("SMS_cn_big5")
    SMS_cn_big5("SMS_cn_big5"),
    @XmlEnumValue("Email_cn_big5")
    Email_cn_big5("Email_cn_big5"),
    @XmlEnumValue("NotAllowedConfirm")
    NotAllowedConfirm("NotAllowedConfirm");
    private final String value;

    EnumConfirmationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumConfirmationType fromValue(String v) {
        for (EnumConfirmationType c: EnumConfirmationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
