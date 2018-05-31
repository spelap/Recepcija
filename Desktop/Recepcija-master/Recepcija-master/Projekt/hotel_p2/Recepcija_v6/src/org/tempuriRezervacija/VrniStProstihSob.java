/**
 * VrniStProstihSob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class VrniStProstihSob  implements java.io.Serializable {
    private java.lang.String terminOd;

    private java.lang.String terminDo;

    private java.lang.Integer tipSobe;

    public VrniStProstihSob() {
    }

    public VrniStProstihSob(
           java.lang.String terminOd,
           java.lang.String terminDo,
           java.lang.Integer tipSobe) {
           this.terminOd = terminOd;
           this.terminDo = terminDo;
           this.tipSobe = tipSobe;
    }


    /**
     * Gets the terminOd value for this VrniStProstihSob.
     * 
     * @return terminOd
     */
    public java.lang.String getTerminOd() {
        return terminOd;
    }


    /**
     * Sets the terminOd value for this VrniStProstihSob.
     * 
     * @param terminOd
     */
    public void setTerminOd(java.lang.String terminOd) {
        this.terminOd = terminOd;
    }


    /**
     * Gets the terminDo value for this VrniStProstihSob.
     * 
     * @return terminDo
     */
    public java.lang.String getTerminDo() {
        return terminDo;
    }


    /**
     * Sets the terminDo value for this VrniStProstihSob.
     * 
     * @param terminDo
     */
    public void setTerminDo(java.lang.String terminDo) {
        this.terminDo = terminDo;
    }


    /**
     * Gets the tipSobe value for this VrniStProstihSob.
     * 
     * @return tipSobe
     */
    public java.lang.Integer getTipSobe() {
        return tipSobe;
    }


    /**
     * Sets the tipSobe value for this VrniStProstihSob.
     * 
     * @param tipSobe
     */
    public void setTipSobe(java.lang.Integer tipSobe) {
        this.tipSobe = tipSobe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VrniStProstihSob)) return false;
        VrniStProstihSob other = (VrniStProstihSob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.terminOd==null && other.getTerminOd()==null) || 
             (this.terminOd!=null &&
              this.terminOd.equals(other.getTerminOd()))) &&
            ((this.terminDo==null && other.getTerminDo()==null) || 
             (this.terminDo!=null &&
              this.terminDo.equals(other.getTerminDo()))) &&
            ((this.tipSobe==null && other.getTipSobe()==null) || 
             (this.tipSobe!=null &&
              this.tipSobe.equals(other.getTipSobe())));
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
        if (getTerminOd() != null) {
            _hashCode += getTerminOd().hashCode();
        }
        if (getTerminDo() != null) {
            _hashCode += getTerminDo().hashCode();
        }
        if (getTipSobe() != null) {
            _hashCode += getTipSobe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VrniStProstihSob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">vrniStProstihSob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminOd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "terminOd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminDo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "terminDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipSobe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tipSobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
