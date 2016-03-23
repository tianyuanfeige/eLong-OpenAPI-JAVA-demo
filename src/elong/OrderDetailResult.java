//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.23 at 01:12:06 PM CST 
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
 * <p>Java class for OrderDetailResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderDetailResult">
 *   &lt;complexContent>
 *     &lt;extension base="{}OrderBase">
 *       &lt;sequence>
 *         &lt;element name="ElongCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{}Contact" minOccurs="0"/>
 *         &lt;element name="ExtendInfo" type="{}ExtendInfo" minOccurs="0"/>
 *         &lt;element name="NightlyRates" type="{}ArrayOfNightlyRate" minOccurs="0"/>
 *         &lt;element name="OrderRooms" type="{}ArrayOfOrderRoom" minOccurs="0"/>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShowStatus" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ConfirmPoint" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PenaltyToCustomer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PenaltyCurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="CancelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HasInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InvoiceMode" type="{}EnumInvoiceMode"/>
 *         &lt;element name="Invoice" type="{}InvoiceWithStatus" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{}CreditCardWithStatus" minOccurs="0"/>
 *         &lt;element name="GuaranteeRule" type="{}GuaranteeRule" minOccurs="0"/>
 *         &lt;element name="PrepayRule" type="{}PrepayRule" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RoomTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCancelable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Coupon" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDetailResult", propOrder = {
    "elongCardNo",
    "contact",
    "extendInfo",
    "nightlyRates",
    "orderRooms",
    "orderId",
    "status",
    "showStatus",
    "confirmPoint",
    "penaltyToCustomer",
    "penaltyCurrencyCode",
    "cancelTime",
    "hasInvoice",
    "invoiceMode",
    "invoice",
    "creditCard",
    "guaranteeRule",
    "prepayRule",
    "valueAdds",
    "hotelName",
    "roomTypeName",
    "ratePlanName",
    "isCancelable",
    "creationDate",
    "coupon"
})
public class OrderDetailResult
    extends OrderBase
{

    @JSONField(name = "ElongCardNo")
    protected String elongCardNo;
    @JSONField(name = "Contact")
    protected Contact contact;
    @JSONField(name = "ExtendInfo")
    protected ExtendInfo extendInfo;
    @JSONField(name = "NightlyRates")
    protected List<NightlyRate> nightlyRates;
    @JSONField(name = "OrderRooms")
    protected List<OrderRoom> orderRooms;
    @JSONField(name = "OrderId")
    protected long orderId;
    @JSONField(name = "Status")
    protected String status;
    @JSONField(name = "ShowStatus", type = Long.class)
    protected Long showStatus;
    @JSONField(name = "ConfirmPoint")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date confirmPoint;
    @JSONField(name = "PenaltyToCustomer")
    protected BigDecimal penaltyToCustomer;
    @JSONField(name = "PenaltyCurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode penaltyCurrencyCode;
    @JSONField(name = "CancelTime")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date cancelTime;
    @JSONField(name = "HasInvoice")
    protected boolean hasInvoice;
    @JSONField(name = "InvoiceMode")
    @XmlSchemaType(name = "string")
    protected EnumInvoiceMode invoiceMode;
    @JSONField(name = "Invoice")
    protected InvoiceWithStatus invoice;
    @JSONField(name = "CreditCard")
    protected CreditCardWithStatus creditCard;
    @JSONField(name = "GuaranteeRule")
    protected GuaranteeRule guaranteeRule;
    @JSONField(name = "PrepayRule")
    protected PrepayRule prepayRule;
    @JSONField(name = "ValueAdds")
    protected List<String> valueAdds;
    @JSONField(name = "HotelName")
    protected String hotelName;
    @JSONField(name = "RoomTypeName")
    protected String roomTypeName;
    @JSONField(name = "RatePlanName")
    protected String ratePlanName;
    @JSONField(name = "IsCancelable")
    protected Boolean isCancelable;
    @JSONField(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected java.util.Date creationDate;
    @JSONField(name = "Coupon")
    protected BigDecimal coupon;

    /**
     * Gets the value of the elongCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElongCardNo() {
        return elongCardNo;
    }

    /**
     * Sets the value of the elongCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElongCardNo(String value) {
        this.elongCardNo = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the extendInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendInfo }
     *     
     */
    public ExtendInfo getExtendInfo() {
        return extendInfo;
    }

    /**
     * Sets the value of the extendInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendInfo }
     *     
     */
    public void setExtendInfo(ExtendInfo value) {
        this.extendInfo = value;
    }

    /**
     * Gets the value of the nightlyRates property.
     * 
     * @return
     *     possible object is
     *     {@link List<NightlyRate> }
     *     
     */
    public List<NightlyRate> getNightlyRates() {
        return nightlyRates;
    }

    /**
     * Sets the value of the nightlyRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<NightlyRate> }
     *     
     */
    public void setNightlyRates(List<NightlyRate> value) {
        this.nightlyRates = value;
    }

    /**
     * Gets the value of the orderRooms property.
     * 
     * @return
     *     possible object is
     *     {@link List<OrderRoom> }
     *     
     */
    public List<OrderRoom> getOrderRooms() {
        return orderRooms;
    }

    /**
     * Sets the value of the orderRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<OrderRoom> }
     *     
     */
    public void setOrderRooms(List<OrderRoom> value) {
        this.orderRooms = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the showStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getShowStatus() {
        return showStatus;
    }

    /**
     * Sets the value of the showStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setShowStatus(Long value) {
        this.showStatus = value;
    }

    /**
     * Gets the value of the confirmPoint property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getConfirmPoint() {
        return confirmPoint;
    }

    /**
     * Sets the value of the confirmPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setConfirmPoint(java.util.Date value) {
        this.confirmPoint = value;
    }

    /**
     * Gets the value of the penaltyToCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyToCustomer() {
        return penaltyToCustomer;
    }

    /**
     * Sets the value of the penaltyToCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyToCustomer(BigDecimal value) {
        this.penaltyToCustomer = value;
    }

    /**
     * Gets the value of the penaltyCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getPenaltyCurrencyCode() {
        return penaltyCurrencyCode;
    }

    /**
     * Sets the value of the penaltyCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setPenaltyCurrencyCode(EnumCurrencyCode value) {
        this.penaltyCurrencyCode = value;
    }

    /**
     * Gets the value of the cancelTime property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getCancelTime() {
        return cancelTime;
    }

    /**
     * Sets the value of the cancelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setCancelTime(java.util.Date value) {
        this.cancelTime = value;
    }

    /**
     * Gets the value of the hasInvoice property.
     * 
     */
    public boolean isHasInvoice() {
        return hasInvoice;
    }

    /**
     * Sets the value of the hasInvoice property.
     * 
     */
    public void setHasInvoice(boolean value) {
        this.hasInvoice = value;
    }

    /**
     * Gets the value of the invoiceMode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public EnumInvoiceMode getInvoiceMode() {
        return invoiceMode;
    }

    /**
     * Sets the value of the invoiceMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumInvoiceMode }
     *     
     */
    public void setInvoiceMode(EnumInvoiceMode value) {
        this.invoiceMode = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceWithStatus }
     *     
     */
    public InvoiceWithStatus getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceWithStatus }
     *     
     */
    public void setInvoice(InvoiceWithStatus value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardWithStatus }
     *     
     */
    public CreditCardWithStatus getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardWithStatus }
     *     
     */
    public void setCreditCard(CreditCardWithStatus value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the guaranteeRule property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeRule }
     *     
     */
    public GuaranteeRule getGuaranteeRule() {
        return guaranteeRule;
    }

    /**
     * Sets the value of the guaranteeRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeRule }
     *     
     */
    public void setGuaranteeRule(GuaranteeRule value) {
        this.guaranteeRule = value;
    }

    /**
     * Gets the value of the prepayRule property.
     * 
     * @return
     *     possible object is
     *     {@link PrepayRule }
     *     
     */
    public PrepayRule getPrepayRule() {
        return prepayRule;
    }

    /**
     * Sets the value of the prepayRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepayRule }
     *     
     */
    public void setPrepayRule(PrepayRule value) {
        this.prepayRule = value;
    }

    /**
     * Gets the value of the valueAdds property.
     * 
     * @return
     *     possible object is
     *     {@link List<String> }
     *     
     */
    public List<String> getValueAdds() {
        return valueAdds;
    }

    /**
     * Sets the value of the valueAdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<String> }
     *     
     */
    public void setValueAdds(List<String> value) {
        this.valueAdds = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the roomTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeName() {
        return roomTypeName;
    }

    /**
     * Sets the value of the roomTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeName(String value) {
        this.roomTypeName = value;
    }

    /**
     * Gets the value of the ratePlanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanName() {
        return ratePlanName;
    }

    /**
     * Sets the value of the ratePlanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanName(String value) {
        this.ratePlanName = value;
    }

    /**
     * Gets the value of the isCancelable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCancelable() {
        return isCancelable;
    }

    /**
     * Sets the value of the isCancelable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelable(Boolean value) {
        this.isCancelable = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Date }
     *     
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Date }
     *     
     */
    public void setCreationDate(java.util.Date value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the coupon property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoupon() {
        return coupon;
    }

    /**
     * Sets the value of the coupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoupon(BigDecimal value) {
        this.coupon = value;
    }

}
