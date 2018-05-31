/**
 * Gost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Gost  extends service.Oseba  implements java.io.Serializable {
    private service.Racun racun;

    private java.lang.String rezevacijska_st;

    private service.Soba soba;

    private service.Soba st_sobe;

    private boolean trenutnoGost;

    public Gost() {
    }

    public Gost(
           java.lang.String dan_odhoda,
           java.lang.String dan_prihoda,
           java.lang.String datum_rojstva,
           int davcna_st,
           java.lang.String emso,
           java.lang.String ime,
           java.lang.String kakovost,
           boolean kosilo,
           java.lang.String kupon,
           java.lang.String priimek,
           int starost,
           boolean vecerja,
           boolean wellness,
           boolean zajtrk,
           service.Racun racun,
           java.lang.String rezevacijska_st,
           service.Soba soba,
           service.Soba st_sobe,
           boolean trenutnoGost) {
        super(
            dan_odhoda,
            dan_prihoda,
            datum_rojstva,
            davcna_st,
            emso,
            ime,
            kakovost,
            kosilo,
            kupon,
            priimek,
            starost,
            vecerja,
            wellness,
            zajtrk);
        this.racun = racun;
        this.rezevacijska_st = rezevacijska_st;
        this.soba = soba;
        this.st_sobe = st_sobe;
        this.trenutnoGost = trenutnoGost;
    }


    /**
     * Gets the racun value for this Gost.
     * 
     * @return racun
     */
    public service.Racun getRacun() {
        return racun;
    }


    /**
     * Sets the racun value for this Gost.
     * 
     * @param racun
     */
    public void setRacun(service.Racun racun) {
        this.racun = racun;
    }


    /**
     * Gets the rezevacijska_st value for this Gost.
     * 
     * @return rezevacijska_st
     */
    public java.lang.String getRezevacijska_st() {
        return rezevacijska_st;
    }


    /**
     * Sets the rezevacijska_st value for this Gost.
     * 
     * @param rezevacijska_st
     */
    public void setRezevacijska_st(java.lang.String rezevacijska_st) {
        this.rezevacijska_st = rezevacijska_st;
    }


    /**
     * Gets the soba value for this Gost.
     * 
     * @return soba
     */
    public service.Soba getSoba() {
        return soba;
    }


    /**
     * Sets the soba value for this Gost.
     * 
     * @param soba
     */
    public void setSoba(service.Soba soba) {
        this.soba = soba;
    }


    /**
     * Gets the st_sobe value for this Gost.
     * 
     * @return st_sobe
     */
    public service.Soba getSt_sobe() {
        return st_sobe;
    }


    /**
     * Sets the st_sobe value for this Gost.
     * 
     * @param st_sobe
     */
    public void setSt_sobe(service.Soba st_sobe) {
        this.st_sobe = st_sobe;
    }


    /**
     * Gets the trenutnoGost value for this Gost.
     * 
     * @return trenutnoGost
     */
    public boolean isTrenutnoGost() {
        return trenutnoGost;
    }


    /**
     * Sets the trenutnoGost value for this Gost.
     * 
     * @param trenutnoGost
     */
    public void setTrenutnoGost(boolean trenutnoGost) {
        this.trenutnoGost = trenutnoGost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gost)) return false;
        Gost other = (Gost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.racun==null && other.getRacun()==null) || 
             (this.racun!=null &&
              this.racun.equals(other.getRacun()))) &&
            ((this.rezevacijska_st==null && other.getRezevacijska_st()==null) || 
             (this.rezevacijska_st!=null &&
              this.rezevacijska_st.equals(other.getRezevacijska_st()))) &&
            ((this.soba==null && other.getSoba()==null) || 
             (this.soba!=null &&
              this.soba.equals(other.getSoba()))) &&
            ((this.st_sobe==null && other.getSt_sobe()==null) || 
             (this.st_sobe!=null &&
              this.st_sobe.equals(other.getSt_sobe()))) &&
            this.trenutnoGost == other.isTrenutnoGost();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRacun() != null) {
            _hashCode += getRacun().hashCode();
        }
        if (getRezevacijska_st() != null) {
            _hashCode += getRezevacijska_st().hashCode();
        }
        if (getSoba() != null) {
            _hashCode += getSoba().hashCode();
        }
        if (getSt_sobe() != null) {
            _hashCode += getSt_sobe().hashCode();
        }
        _hashCode += (isTrenutnoGost() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "gost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("racun");
        elemField.setXmlName(new javax.xml.namespace.QName("", "racun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "racun"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rezevacijska_st");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rezevacijska_st"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soba");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "soba"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("st_sobe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "st_sobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "soba"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trenutnoGost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trenutnoGost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
