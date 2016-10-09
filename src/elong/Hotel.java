//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 10:10:23 AM CST 
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


/**
 * <p>Java class for Hotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CurrencyCode" type="{}EnumCurrencyCode"/>
 *         &lt;element name="Facilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PoiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookingRules" type="{}ArrayOfBookingRule" minOccurs="0"/>
 *         &lt;element name="GuaranteeRules" type="{}ArrayOfGuaranteeRule" minOccurs="0"/>
 *         &lt;element name="PrepayRules" type="{}ArrayOfPrepayRule" minOccurs="0"/>
 *         &lt;element name="ValueAdds" type="{}ArrayOfValueAdd" minOccurs="0"/>
 *         &lt;element name="DrrRules" type="{}ArrayOfDrrRule" minOccurs="0"/>
 *         &lt;element name="Rooms" type="{}ArrayOfRoom" minOccurs="0"/>
 *         &lt;element name="Detail" type="{}Detail" minOccurs="0"/>
 *         &lt;element name="Images" type="{}ArrayOfHotelImg" minOccurs="0"/>
 *         &lt;element name="Gifts" type="{}ArrayOfGift" minOccurs="0"/>
 *         &lt;element name="HAvailPolicys" type="{}ArrayOfHAvailPolicy" minOccurs="0"/>
 *         &lt;element name="Products" type="{}ArrayOfProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hotel", propOrder = {
    "hotelId",
    "lowRate",
    "currencyCode",
    "facilities",
    "distance",
    "poiName",
    "bookingRules",
    "guaranteeRules",
    "prepayRules",
    "valueAdds",
    "drrRules",
    "rooms",
    "detail",
    "images",
    "gifts",
    "hAvailPolicys",
    "products"
})
public class Hotel {

    @JSONField(name = "HotelId")
    protected String hotelId;
    @JSONField(name = "LowRate")
    protected BigDecimal lowRate;
    @JSONField(name = "CurrencyCode")
    @XmlSchemaType(name = "string")
    protected EnumCurrencyCode currencyCode;
    @JSONField(name = "Facilities")
    protected String facilities;
    @JSONField(name = "Distance")
    protected BigDecimal distance;
    @JSONField(name = "PoiName")
    protected String poiName;
    @JSONField(name = "BookingRules")
    protected List<BookingRule> bookingRules;
    @JSONField(name = "GuaranteeRules")
    protected List<GuaranteeRule> guaranteeRules;
    @JSONField(name = "PrepayRules")
    protected List<PrepayRule> prepayRules;
    @JSONField(name = "ValueAdds")
    protected List<ValueAdd> valueAdds;
    @JSONField(name = "DrrRules")
    protected List<DrrRule> drrRules;
    @JSONField(name = "Rooms")
    protected List<Room> rooms;
    @JSONField(name = "Detail")
    protected Detail detail;
    @JSONField(name = "Images")
    protected List<HotelImg> images;
    @JSONField(name = "Gifts")
    protected List<Gift> gifts;
    @JSONField(name = "HAvailPolicys")
    protected List<HAvailPolicy> hAvailPolicys;
    @JSONField(name = "Products")
    protected List<Product> products;

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the lowRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowRate() {
        return lowRate;
    }

    /**
     * Sets the value of the lowRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowRate(BigDecimal value) {
        this.lowRate = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public EnumCurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCurrencyCode }
     *     
     */
    public void setCurrencyCode(EnumCurrencyCode value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilities(String value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Gets the value of the poiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoiName() {
        return poiName;
    }

    /**
     * Sets the value of the poiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoiName(String value) {
        this.poiName = value;
    }

    /**
     * Gets the value of the bookingRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<BookingRule> }
     *     
     */
    public List<BookingRule> getBookingRules() {
        return bookingRules;
    }

    /**
     * Sets the value of the bookingRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<BookingRule> }
     *     
     */
    public void setBookingRules(List<BookingRule> value) {
        this.bookingRules = value;
    }

    /**
     * Gets the value of the guaranteeRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<GuaranteeRule> }
     *     
     */
    public List<GuaranteeRule> getGuaranteeRules() {
        return guaranteeRules;
    }

    /**
     * Sets the value of the guaranteeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<GuaranteeRule> }
     *     
     */
    public void setGuaranteeRules(List<GuaranteeRule> value) {
        this.guaranteeRules = value;
    }

    /**
     * Gets the value of the prepayRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<PrepayRule> }
     *     
     */
    public List<PrepayRule> getPrepayRules() {
        return prepayRules;
    }

    /**
     * Sets the value of the prepayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<PrepayRule> }
     *     
     */
    public void setPrepayRules(List<PrepayRule> value) {
        this.prepayRules = value;
    }

    /**
     * Gets the value of the valueAdds property.
     * 
     * @return
     *     possible object is
     *     {@link List<ValueAdd> }
     *     
     */
    public List<ValueAdd> getValueAdds() {
        return valueAdds;
    }

    /**
     * Sets the value of the valueAdds property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<ValueAdd> }
     *     
     */
    public void setValueAdds(List<ValueAdd> value) {
        this.valueAdds = value;
    }

    /**
     * Gets the value of the drrRules property.
     * 
     * @return
     *     possible object is
     *     {@link List<DrrRule> }
     *     
     */
    public List<DrrRule> getDrrRules() {
        return drrRules;
    }

    /**
     * Sets the value of the drrRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<DrrRule> }
     *     
     */
    public void setDrrRules(List<DrrRule> value) {
        this.drrRules = value;
    }

    /**
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link List<Room> }
     *     
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Room> }
     *     
     */
    public void setRooms(List<Room> value) {
        this.rooms = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Detail }
     *     
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detail }
     *     
     */
    public void setDetail(Detail value) {
        this.detail = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * @return
     *     possible object is
     *     {@link List<HotelImg> }
     *     
     */
    public List<HotelImg> getImages() {
        return images;
    }

    /**
     * Sets the value of the images property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HotelImg> }
     *     
     */
    public void setImages(List<HotelImg> value) {
        this.images = value;
    }

    /**
     * Gets the value of the gifts property.
     * 
     * @return
     *     possible object is
     *     {@link List<Gift> }
     *     
     */
    public List<Gift> getGifts() {
        return gifts;
    }

    /**
     * Sets the value of the gifts property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Gift> }
     *     
     */
    public void setGifts(List<Gift> value) {
        this.gifts = value;
    }

    /**
     * Gets the value of the hAvailPolicys property.
     * 
     * @return
     *     possible object is
     *     {@link List<HAvailPolicy> }
     *     
     */
    public List<HAvailPolicy> getHAvailPolicys() {
        return hAvailPolicys;
    }

    /**
     * Sets the value of the hAvailPolicys property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<HAvailPolicy> }
     *     
     */
    public void setHAvailPolicys(List<HAvailPolicy> value) {
        this.hAvailPolicys = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link List<Product> }
     *     
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Product> }
     *     
     */
    public void setProducts(List<Product> value) {
        this.products = value;
    }

}
