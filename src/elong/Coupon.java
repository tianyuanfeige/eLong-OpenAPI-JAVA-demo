//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 09:48:52 AM CST 
//


package elong;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * <p>Java class for Coupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coupon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectiveDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EffectiveDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CouponRedemptionUpperLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PromotionType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RoomTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coupon", propOrder = {
    "effectiveDateFrom",
    "effectiveDateTo",
    "couponRedemptionUpperLimit",
    "promotionType",
    "roomTypeID",
    "ratePlanID"
})
public class Coupon {

    @JSONField(name = "EffectiveDateFrom")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date effectiveDateFrom;
    @JSONField(name = "EffectiveDateTo")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date effectiveDateTo;
    @JSONField(name = "CouponRedemptionUpperLimit")
    protected BigDecimal couponRedemptionUpperLimit;
    @JSONField(name = "PromotionType")
    protected int promotionType;
    @JSONField(name = "RoomTypeID")
    protected String roomTypeID;
    @JSONField(name = "RatePlanID")
    protected int ratePlanID;

    /**
     * Gets the value of the effectiveDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEffectiveDateFrom() {
        return effectiveDateFrom;
    }

    /**
     * Sets the value of the effectiveDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEffectiveDateFrom(java.util.Date value) {
        this.effectiveDateFrom = value;
    }

    /**
     * Gets the value of the effectiveDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getEffectiveDateTo() {
        return effectiveDateTo;
    }

    /**
     * Sets the value of the effectiveDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setEffectiveDateTo(java.util.Date value) {
        this.effectiveDateTo = value;
    }

    /**
     * Gets the value of the couponRedemptionUpperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCouponRedemptionUpperLimit() {
        return couponRedemptionUpperLimit;
    }

    /**
     * Sets the value of the couponRedemptionUpperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCouponRedemptionUpperLimit(BigDecimal value) {
        this.couponRedemptionUpperLimit = value;
    }

    /**
     * Gets the value of the promotionType property.
     * 
     */
    public int getPromotionType() {
        return promotionType;
    }

    /**
     * Sets the value of the promotionType property.
     * 
     */
    public void setPromotionType(int value) {
        this.promotionType = value;
    }

    /**
     * Gets the value of the roomTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeID() {
        return roomTypeID;
    }

    /**
     * Sets the value of the roomTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeID(String value) {
        this.roomTypeID = value;
    }

    /**
     * Gets the value of the ratePlanID property.
     * 
     */
    public int getRatePlanID() {
        return ratePlanID;
    }

    /**
     * Sets the value of the ratePlanID property.
     * 
     */
    public void setRatePlanID(int value) {
        this.ratePlanID = value;
    }

}
