//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.19 at 11:15:54 AM CST 
//


package elong;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumPromotionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumPromotionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Coupon"/>
 *     &lt;enumeration value="Point"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="Gift"/>
 *     &lt;enumeration value="ReturnMoney"/>
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="S2"/>
 *     &lt;enumeration value="ImmediateDiscount"/>
 *     &lt;enumeration value="CashAccount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumPromotionType")
@XmlEnum
public enum EnumPromotionType {

    @XmlEnumValue("Coupon")
    Coupon("Coupon"),
    @XmlEnumValue("Point")
    Point("Point"),
    @XmlEnumValue("Discount")
    Discount("Discount"),
    @XmlEnumValue("Gift")
    Gift("Gift"),
    @XmlEnumValue("ReturnMoney")
    ReturnMoney("ReturnMoney"),
    @XmlEnumValue("S1")
    S1("S1"),
    @XmlEnumValue("S2")
    S2("S2"),
    @XmlEnumValue("ImmediateDiscount")
    ImmediateDiscount("ImmediateDiscount"),
    @XmlEnumValue("CashAccount")
    CashAccount("CashAccount");
    private final String value;

    EnumPromotionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumPromotionType fromValue(String v) {
        for (EnumPromotionType c: EnumPromotionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
