/**
 * PrekliciCiscenjeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriCistilnica;

public class PrekliciCiscenjeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo prekliciCiscenjeResult;

    public PrekliciCiscenjeResponse() {
    }

    public PrekliciCiscenjeResponse(
           org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo prekliciCiscenjeResult) {
           this.prekliciCiscenjeResult = prekliciCiscenjeResult;
    }


    /**
     * Gets the prekliciCiscenjeResult value for this PrekliciCiscenjeResponse.
     * 
     * @return prekliciCiscenjeResult
     */
    public org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo getPrekliciCiscenjeResult() {
        return prekliciCiscenjeResult;
    }


    /**
     * Sets the prekliciCiscenjeResult value for this PrekliciCiscenjeResponse.
     * 
     * @param prekliciCiscenjeResult
     */
    public void setPrekliciCiscenjeResult(org.datacontract.schemas._2004._07.CistilniServis_Entities.Narocilo prekliciCiscenjeResult) {
        this.prekliciCiscenjeResult = prekliciCiscenjeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrekliciCiscenjeResponse)) return false;
        PrekliciCiscenjeResponse other = (PrekliciCiscenjeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prekliciCiscenjeResult==null && other.getPrekliciCiscenjeResult()==null) || 
             (this.prekliciCiscenjeResult!=null &&
              this.prekliciCiscenjeResult.equals(other.getPrekliciCiscenjeResult())));
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
        if (getPrekliciCiscenjeResult() != null) {
            _hashCode += getPrekliciCiscenjeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrekliciCiscenjeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PrekliciCiscenjeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prekliciCiscenjeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrekliciCiscenjeResult"));
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
