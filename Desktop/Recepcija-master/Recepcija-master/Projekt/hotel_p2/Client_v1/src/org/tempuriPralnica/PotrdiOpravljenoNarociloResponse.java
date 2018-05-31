/**
 * PotrdiOpravljenoNarociloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriPralnica;

public class PotrdiOpravljenoNarociloResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo potrdiOpravljenoNarociloResult;

    public PotrdiOpravljenoNarociloResponse() {
    }

    public PotrdiOpravljenoNarociloResponse(
           org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo potrdiOpravljenoNarociloResult) {
           this.potrdiOpravljenoNarociloResult = potrdiOpravljenoNarociloResult;
    }


    /**
     * Gets the potrdiOpravljenoNarociloResult value for this PotrdiOpravljenoNarociloResponse.
     * 
     * @return potrdiOpravljenoNarociloResult
     */
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo getPotrdiOpravljenoNarociloResult() {
        return potrdiOpravljenoNarociloResult;
    }


    /**
     * Sets the potrdiOpravljenoNarociloResult value for this PotrdiOpravljenoNarociloResponse.
     * 
     * @param potrdiOpravljenoNarociloResult
     */
    public void setPotrdiOpravljenoNarociloResult(org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo potrdiOpravljenoNarociloResult) {
        this.potrdiOpravljenoNarociloResult = potrdiOpravljenoNarociloResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PotrdiOpravljenoNarociloResponse)) return false;
        PotrdiOpravljenoNarociloResponse other = (PotrdiOpravljenoNarociloResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.potrdiOpravljenoNarociloResult==null && other.getPotrdiOpravljenoNarociloResult()==null) || 
             (this.potrdiOpravljenoNarociloResult!=null &&
              this.potrdiOpravljenoNarociloResult.equals(other.getPotrdiOpravljenoNarociloResult())));
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
        if (getPotrdiOpravljenoNarociloResult() != null) {
            _hashCode += getPotrdiOpravljenoNarociloResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PotrdiOpravljenoNarociloResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PotrdiOpravljenoNarociloResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("potrdiOpravljenoNarociloResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PotrdiOpravljenoNarociloResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
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
