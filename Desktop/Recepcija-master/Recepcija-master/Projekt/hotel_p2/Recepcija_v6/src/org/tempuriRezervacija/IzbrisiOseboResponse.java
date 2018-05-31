/**
 * IzbrisiOseboResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class IzbrisiOseboResponse  implements java.io.Serializable {
    private java.lang.String izbrisiOseboResult;

    public IzbrisiOseboResponse() {
    }

    public IzbrisiOseboResponse(
           java.lang.String izbrisiOseboResult) {
           this.izbrisiOseboResult = izbrisiOseboResult;
    }


    /**
     * Gets the izbrisiOseboResult value for this IzbrisiOseboResponse.
     * 
     * @return izbrisiOseboResult
     */
    public java.lang.String getIzbrisiOseboResult() {
        return izbrisiOseboResult;
    }


    /**
     * Sets the izbrisiOseboResult value for this IzbrisiOseboResponse.
     * 
     * @param izbrisiOseboResult
     */
    public void setIzbrisiOseboResult(java.lang.String izbrisiOseboResult) {
        this.izbrisiOseboResult = izbrisiOseboResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IzbrisiOseboResponse)) return false;
        IzbrisiOseboResponse other = (IzbrisiOseboResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.izbrisiOseboResult==null && other.getIzbrisiOseboResult()==null) || 
             (this.izbrisiOseboResult!=null &&
              this.izbrisiOseboResult.equals(other.getIzbrisiOseboResult())));
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
        if (getIzbrisiOseboResult() != null) {
            _hashCode += getIzbrisiOseboResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IzbrisiOseboResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">izbrisiOseboResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("izbrisiOseboResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "izbrisiOseboResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
