
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for oseba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oseba">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dan_odhoda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dan_prihoda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datum_rojstva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="davcna_st" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="emso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kakovost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kosilo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="priimek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="starost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vecerja" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wellness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zajtrk" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oseba", propOrder = {
    "danOdhoda",
    "danPrihoda",
    "datumRojstva",
    "davcnaSt",
    "emso",
    "ime",
    "kakovost",
    "kosilo",
    "priimek",
    "starost",
    "vecerja",
    "wellness",
    "zajtrk"
})
@XmlSeeAlso({
    Gost.class
})
public class Oseba {

    @XmlElement(name = "dan_odhoda")
    protected String danOdhoda;
    @XmlElement(name = "dan_prihoda")
    protected String danPrihoda;
    @XmlElement(name = "datum_rojstva")
    protected String datumRojstva;
    @XmlElement(name = "davcna_st")
    protected int davcnaSt;
    protected String emso;
    protected String ime;
    protected String kakovost;
    protected boolean kosilo;
    protected String priimek;
    protected int starost;
    protected boolean vecerja;
    protected boolean wellness;
    protected boolean zajtrk;

    /**
     * Gets the value of the danOdhoda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanOdhoda() {
        return danOdhoda;
    }

    /**
     * Sets the value of the danOdhoda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanOdhoda(String value) {
        this.danOdhoda = value;
    }

    /**
     * Gets the value of the danPrihoda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDanPrihoda() {
        return danPrihoda;
    }

    /**
     * Sets the value of the danPrihoda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDanPrihoda(String value) {
        this.danPrihoda = value;
    }

    /**
     * Gets the value of the datumRojstva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumRojstva() {
        return datumRojstva;
    }

    /**
     * Sets the value of the datumRojstva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumRojstva(String value) {
        this.datumRojstva = value;
    }

    /**
     * Gets the value of the davcnaSt property.
     * 
     */
    public int getDavcnaSt() {
        return davcnaSt;
    }

    /**
     * Sets the value of the davcnaSt property.
     * 
     */
    public void setDavcnaSt(int value) {
        this.davcnaSt = value;
    }

    /**
     * Gets the value of the emso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmso() {
        return emso;
    }

    /**
     * Sets the value of the emso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmso(String value) {
        this.emso = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the kakovost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKakovost() {
        return kakovost;
    }

    /**
     * Sets the value of the kakovost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKakovost(String value) {
        this.kakovost = value;
    }

    /**
     * Gets the value of the kosilo property.
     * 
     */
    public boolean isKosilo() {
        return kosilo;
    }

    /**
     * Sets the value of the kosilo property.
     * 
     */
    public void setKosilo(boolean value) {
        this.kosilo = value;
    }

    /**
     * Gets the value of the priimek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriimek() {
        return priimek;
    }

    /**
     * Sets the value of the priimek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriimek(String value) {
        this.priimek = value;
    }

    /**
     * Gets the value of the starost property.
     * 
     */
    public int getStarost() {
        return starost;
    }

    /**
     * Sets the value of the starost property.
     * 
     */
    public void setStarost(int value) {
        this.starost = value;
    }

    /**
     * Gets the value of the vecerja property.
     * 
     */
    public boolean isVecerja() {
        return vecerja;
    }

    /**
     * Sets the value of the vecerja property.
     * 
     */
    public void setVecerja(boolean value) {
        this.vecerja = value;
    }

    /**
     * Gets the value of the wellness property.
     * 
     */
    public boolean isWellness() {
        return wellness;
    }

    /**
     * Sets the value of the wellness property.
     * 
     */
    public void setWellness(boolean value) {
        this.wellness = value;
    }

    /**
     * Gets the value of the zajtrk property.
     * 
     */
    public boolean isZajtrk() {
        return zajtrk;
    }

    /**
     * Sets the value of the zajtrk property.
     * 
     */
    public void setZajtrk(boolean value) {
        this.zajtrk = value;
    }

}
