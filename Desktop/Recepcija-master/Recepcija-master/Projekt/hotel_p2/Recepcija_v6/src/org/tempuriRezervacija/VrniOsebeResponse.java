/**
 * VrniOsebeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class VrniOsebeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba[] vrniOsebeResult;

    public VrniOsebeResponse() {
    }

    public VrniOsebeResponse(
           org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba[] vrniOsebeResult) {
           this.vrniOsebeResult = vrniOsebeResult;
    }


    /**
     * Gets the vrniOsebeResult value for this VrniOsebeResponse.
     * 
     * @return vrniOsebeResult
     */
    public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba[] getVrniOsebeResult() {
        return vrniOsebeResult;
    }


    /**
     * Sets the vrniOsebeResult value for this VrniOsebeResponse.
     * 
     * @param vrniOsebeResult
     */
    public void setVrniOsebeResult(org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba[] vrniOsebeResult) {
        this.vrniOsebeResult = vrniOsebeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VrniOsebeResponse)) return false;
        VrniOsebeResponse other = (VrniOsebeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vrniOsebeResult==null && other.getVrniOsebeResult()==null) || 
             (this.vrniOsebeResult!=null &&
              java.util.Arrays.equals(this.vrniOsebeResult, other.getVrniOsebeResult())));
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
        if (getVrniOsebeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVrniOsebeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVrniOsebeResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VrniOsebeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">vrniOsebeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrniOsebeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vrniOsebeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Oseba"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Oseba"));
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
