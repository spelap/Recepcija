/**
 * Storitev.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Storitev  implements java.io.Serializable {
    private java.lang.String datum;

    private java.lang.String naziv;

    private java.math.BigDecimal znesek;

    public Storitev() {
    }

    public Storitev(
           java.lang.String datum,
           java.lang.String naziv,
           java.math.BigDecimal znesek) {
           this.datum = datum;
           this.naziv = naziv;
           this.znesek = znesek;
    }


    /**
     * Gets the datum value for this Storitev.
     * 
     * @return datum
     */
    public java.lang.String getDatum() {
        return datum;
    }


    /**
     * Sets the datum value for this Storitev.
     * 
     * @param datum
     */
    public void setDatum(java.lang.String datum) {
        this.datum = datum;
    }


    /**
     * Gets the naziv value for this Storitev.
     * 
     * @return naziv
     */
    public java.lang.String getNaziv() {
        return naziv;
    }


    /**
     * Sets the naziv value for this Storitev.
     * 
     * @param naziv
     */
    public void setNaziv(java.lang.String naziv) {
        this.naziv = naziv;
    }


    /**
     * Gets the znesek value for this Storitev.
     * 
     * @return znesek
     */
    public java.math.BigDecimal getZnesek() {
        return znesek;
    }


    /**
     * Sets the znesek value for this Storitev.
     * 
     * @param znesek
     */
    public void setZnesek(java.math.BigDecimal znesek) {
        this.znesek = znesek;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Storitev)) return false;
        Storitev other = (Storitev) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum==null && other.getDatum()==null) || 
             (this.datum!=null &&
              this.datum.equals(other.getDatum()))) &&
            ((this.naziv==null && other.getNaziv()==null) || 
             (this.naziv!=null &&
              this.naziv.equals(other.getNaziv()))) &&
            ((this.znesek==null && other.getZnesek()==null) || 
             (this.znesek!=null &&
              this.znesek.equals(other.getZnesek())));
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getNaziv() != null) {
            _hashCode += getNaziv().hashCode();
        }
        if (getZnesek() != null) {
            _hashCode += getZnesek().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Storitev.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "storitev"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naziv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naziv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("znesek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "znesek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
