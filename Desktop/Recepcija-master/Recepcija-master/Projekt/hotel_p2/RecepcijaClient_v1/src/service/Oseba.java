/**
 * Oseba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Oseba  implements java.io.Serializable {
    private java.util.Calendar datum_rojstva;

    private int davcna_st;

    private java.lang.String emso;

    private java.lang.String ime;

    private java.lang.String priimek;

    private int starost;

    public Oseba() {
    }

    public Oseba(
           java.util.Calendar datum_rojstva,
           int davcna_st,
           java.lang.String emso,
           java.lang.String ime,
           java.lang.String priimek,
           int starost) {
           this.datum_rojstva = datum_rojstva;
           this.davcna_st = davcna_st;
           this.emso = emso;
           this.ime = ime;
           this.priimek = priimek;
           this.starost = starost;
    }


    /**
     * Gets the datum_rojstva value for this Oseba.
     * 
     * @return datum_rojstva
     */
    public java.util.Calendar getDatum_rojstva() {
        return datum_rojstva;
    }


    /**
     * Sets the datum_rojstva value for this Oseba.
     * 
     * @param datum_rojstva
     */
    public void setDatum_rojstva(java.util.Calendar datum_rojstva) {
        this.datum_rojstva = datum_rojstva;
    }


    /**
     * Gets the davcna_st value for this Oseba.
     * 
     * @return davcna_st
     */
    public int getDavcna_st() {
        return davcna_st;
    }


    /**
     * Sets the davcna_st value for this Oseba.
     * 
     * @param davcna_st
     */
    public void setDavcna_st(int davcna_st) {
        this.davcna_st = davcna_st;
    }


    /**
     * Gets the emso value for this Oseba.
     * 
     * @return emso
     */
    public java.lang.String getEmso() {
        return emso;
    }


    /**
     * Sets the emso value for this Oseba.
     * 
     * @param emso
     */
    public void setEmso(java.lang.String emso) {
        this.emso = emso;
    }


    /**
     * Gets the ime value for this Oseba.
     * 
     * @return ime
     */
    public java.lang.String getIme() {
        return ime;
    }


    /**
     * Sets the ime value for this Oseba.
     * 
     * @param ime
     */
    public void setIme(java.lang.String ime) {
        this.ime = ime;
    }


    /**
     * Gets the priimek value for this Oseba.
     * 
     * @return priimek
     */
    public java.lang.String getPriimek() {
        return priimek;
    }


    /**
     * Sets the priimek value for this Oseba.
     * 
     * @param priimek
     */
    public void setPriimek(java.lang.String priimek) {
        this.priimek = priimek;
    }


    /**
     * Gets the starost value for this Oseba.
     * 
     * @return starost
     */
    public int getStarost() {
        return starost;
    }


    /**
     * Sets the starost value for this Oseba.
     * 
     * @param starost
     */
    public void setStarost(int starost) {
        this.starost = starost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Oseba)) return false;
        Oseba other = (Oseba) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum_rojstva==null && other.getDatum_rojstva()==null) || 
             (this.datum_rojstva!=null &&
              this.datum_rojstva.equals(other.getDatum_rojstva()))) &&
            this.davcna_st == other.getDavcna_st() &&
            ((this.emso==null && other.getEmso()==null) || 
             (this.emso!=null &&
              this.emso.equals(other.getEmso()))) &&
            ((this.ime==null && other.getIme()==null) || 
             (this.ime!=null &&
              this.ime.equals(other.getIme()))) &&
            ((this.priimek==null && other.getPriimek()==null) || 
             (this.priimek!=null &&
              this.priimek.equals(other.getPriimek()))) &&
            this.starost == other.getStarost();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDatum_rojstva() != null) {
            _hashCode += getDatum_rojstva().hashCode();
        }
        _hashCode += getDavcna_st();
        if (getEmso() != null) {
            _hashCode += getEmso().hashCode();
        }
        if (getIme() != null) {
            _hashCode += getIme().hashCode();
        }
        if (getPriimek() != null) {
            _hashCode += getPriimek().hashCode();
        }
        _hashCode += getStarost();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Oseba.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "oseba"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum_rojstva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum_rojstva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("davcna_st");
        elemField.setXmlName(new javax.xml.namespace.QName("", "davcna_st"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priimek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priimek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
