/**
 * NarociCiscenjeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriPralnica;

public class NarociCiscenjeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo narociCiscenjeResult;

    public NarociCiscenjeResponse() {
    }

    public NarociCiscenjeResponse(
           org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo narociCiscenjeResult) {
           this.narociCiscenjeResult = narociCiscenjeResult;
    }


    /**
     * Gets the narociCiscenjeResult value for this NarociCiscenjeResponse.
     * 
     * @return narociCiscenjeResult
     */
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo getNarociCiscenjeResult() {
        return narociCiscenjeResult;
    }


    /**
     * Sets the narociCiscenjeResult value for this NarociCiscenjeResponse.
     * 
     * @param narociCiscenjeResult
     */
    public void setNarociCiscenjeResult(org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo narociCiscenjeResult) {
        this.narociCiscenjeResult = narociCiscenjeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NarociCiscenjeResponse)) return false;
        NarociCiscenjeResponse other = (NarociCiscenjeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.narociCiscenjeResult==null && other.getNarociCiscenjeResult()==null) || 
             (this.narociCiscenjeResult!=null &&
              this.narociCiscenjeResult.equals(other.getNarociCiscenjeResult())));
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
        if (getNarociCiscenjeResult() != null) {
            _hashCode += getNarociCiscenjeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NarociCiscenjeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">NarociCiscenjeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("narociCiscenjeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NarociCiscenjeResult"));
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
