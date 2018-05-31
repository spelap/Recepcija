/**
 * Gost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Gost  extends service.Oseba  implements java.io.Serializable {
    private java.util.Calendar dan_odhoda;

    private java.util.Calendar dan_prihoda;

    private service.Racun racun;

    private int rezevacijska_st;

    private service.Soba st_sobe;

    public Gost() {
    }

    public Gost(
           java.util.Calendar datum_rojstva,
           int davcna_st,
           java.lang.String emso,
           java.lang.String ime,
           java.lang.String priimek,
           int starost,
           java.util.Calendar dan_odhoda,
           java.util.Calendar dan_prihoda,
           service.Racun racun,
           int rezevacijska_st,
           service.Soba st_sobe) {
        super(
            datum_rojstva,
            davcna_st,
            emso,
            ime,
            priimek,
            starost);
        this.dan_odhoda = dan_odhoda;
        this.dan_prihoda = dan_prihoda;
        this.racun = racun;
        this.rezevacijska_st = rezevacijska_st;
        this.st_sobe = st_sobe;
    }


    /**
     * Gets the dan_odhoda value for this Gost.
     * 
     * @return dan_odhoda
     */
    public java.util.Calendar getDan_odhoda() {
        return dan_odhoda;
    }


    /**
     * Sets the dan_odhoda value for this Gost.
     * 
     * @param dan_odhoda
     */
    public void setDan_odhoda(java.util.Calendar dan_odhoda) {
        this.dan_odhoda = dan_odhoda;
    }


    /**
     * Gets the dan_prihoda value for this Gost.
     * 
     * @return dan_prihoda
     */
    public java.util.Calendar getDan_prihoda() {
        return dan_prihoda;
    }


    /**
     * Sets the dan_prihoda value for this Gost.
     * 
     * @param dan_prihoda
     */
    public void setDan_prihoda(java.util.Calendar dan_prihoda) {
        this.dan_prihoda = dan_prihoda;
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
    public int getRezevacijska_st() {
        return rezevacijska_st;
    }


    /**
     * Sets the rezevacijska_st value for this Gost.
     * 
     * @param rezevacijska_st
     */
    public void setRezevacijska_st(int rezevacijska_st) {
        this.rezevacijska_st = rezevacijska_st;
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
            ((this.dan_odhoda==null && other.getDan_odhoda()==null) || 
             (this.dan_odhoda!=null &&
              this.dan_odhoda.equals(other.getDan_odhoda()))) &&
            ((this.dan_prihoda==null && other.getDan_prihoda()==null) || 
             (this.dan_prihoda!=null &&
              this.dan_prihoda.equals(other.getDan_prihoda()))) &&
            ((this.racun==null && other.getRacun()==null) || 
             (this.racun!=null &&
              this.racun.equals(other.getRacun()))) &&
            this.rezevacijska_st == other.getRezevacijska_st() &&
            ((this.st_sobe==null && other.getSt_sobe()==null) || 
             (this.st_sobe!=null &&
              this.st_sobe.equals(other.getSt_sobe())));
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
        if (getDan_odhoda() != null) {
            _hashCode += getDan_odhoda().hashCode();
        }
        if (getDan_prihoda() != null) {
            _hashCode += getDan_prihoda().hashCode();
        }
        if (getRacun() != null) {
            _hashCode += getRacun().hashCode();
        }
        _hashCode += getRezevacijska_st();
        if (getSt_sobe() != null) {
            _hashCode += getSt_sobe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "gost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dan_odhoda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dan_odhoda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dan_prihoda");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dan_prihoda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("racun");
        elemField.setXmlName(new javax.xml.namespace.QName("", "racun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "racun"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rezevacijska_st");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rezevacijska_st"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("st_sobe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "st_sobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service/", "soba"));
        elemField.setMinOccurs(0);
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
