/**
 * VrniRezervacijeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class VrniRezervacijeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija[] vrniRezervacijeResult;

    public VrniRezervacijeResponse() {
    }

    public VrniRezervacijeResponse(
           org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija[] vrniRezervacijeResult) {
           this.vrniRezervacijeResult = vrniRezervacijeResult;
    }


    /**
     * Gets the vrniRezervacijeResult value for this VrniRezervacijeResponse.
     * 
     * @return vrniRezervacijeResult
     */
    public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija[] getVrniRezervacijeResult() {
        return vrniRezervacijeResult;
    }


    /**
     * Sets the vrniRezervacijeResult value for this VrniRezervacijeResponse.
     * 
     * @param vrniRezervacijeResult
     */
    public void setVrniRezervacijeResult(org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija[] vrniRezervacijeResult) {
        this.vrniRezervacijeResult = vrniRezervacijeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VrniRezervacijeResponse)) return false;
        VrniRezervacijeResponse other = (VrniRezervacijeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vrniRezervacijeResult==null && other.getVrniRezervacijeResult()==null) || 
             (this.vrniRezervacijeResult!=null &&
              java.util.Arrays.equals(this.vrniRezervacijeResult, other.getVrniRezervacijeResult())));
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
        if (getVrniRezervacijeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVrniRezervacijeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVrniRezervacijeResult(), i);
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
        new org.apache.axis.description.TypeDesc(VrniRezervacijeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">vrniRezervacijeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrniRezervacijeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vrniRezervacijeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Rezervacija"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Rezervacija"));
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
