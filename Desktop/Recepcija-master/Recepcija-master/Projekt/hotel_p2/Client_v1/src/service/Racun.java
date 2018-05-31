
package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for racun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="racun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datum_odprtja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_poravnave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="st_racuna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="storitve" type="{http://service/}storitev" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="znesek" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "racun", propOrder = {
    "datumOdprtja",
    "datumPoravnave",
    "stRacuna",
    "storitve",
    "znesek"
})
public class Racun {

    @XmlElement(name = "datum_odprtja")
    protected String datumOdprtja;
    @XmlElement(name = "datum_poravnave")
    protected String datumPoravnave;
    @XmlElement(name = "st_racuna")
    protected int stRacuna;
    @XmlElement(nillable = true)
    protected List<Storitev> storitve;
    protected BigDecimal znesek;

    /**
     * Gets the value of the datumOdprtja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumOdprtja() {
        return datumOdprtja;
    }

    /**
     * Sets the value of the datumOdprtja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumOdprtja(String value) {
        this.datumOdprtja = value;
    }

    /**
     * Gets the value of the datumPoravnave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumPoravnave() {
        return datumPoravnave;
    }

    /**
     * Sets the value of the datumPoravnave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumPoravnave(String value) {
        this.datumPoravnave = value;
    }

    /**
     * Gets the value of the stRacuna property.
     * 
     */
    public int getStRacuna() {
        return stRacuna;
    }

    /**
     * Sets the value of the stRacuna property.
     * 
     */
    public void setStRacuna(int value) {
        this.stRacuna = value;
    }

    /**
     * Gets the value of the storitve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storitve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoritve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Storitev }
     * 
     * 
     */
    public List<Storitev> getStoritve() {
        if (storitve == null) {
            storitve = new ArrayList<Storitev>();
        }
        return this.storitve;
    }

    /**
     * Gets the value of the znesek property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZnesek() {
        return znesek;
    }

    /**
     * Sets the value of the znesek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZnesek(BigDecimal value) {
        this.znesek = value;
    }

}
