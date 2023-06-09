//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.23 at 03:48:13 PM EEST 
//


package HW2.Candies.generatedCandies;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for candiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="candiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="price" type="{}priceType"/>
 *         &lt;element name="taste" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candiesType", propOrder = {
    "price",
    "taste",
    "quantity"
})
public class CandiesType {

    @XmlElement(required = true)
    protected PriceType price;
    @XmlElement(required = true)
    protected String taste;
    protected int quantity;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }


    /**
     * Gets the value of the taste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaste() {
        return taste;
    }

    /**
     * Sets the value of the taste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaste(String value) {
        this.taste = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    public void show(){
        System.out.println("CANDIES:\nPrice: " + price.value + " " + price.currency + "\nTaste: " + taste + "\nQuantity in package: " + quantity + "\n");
    }

}
