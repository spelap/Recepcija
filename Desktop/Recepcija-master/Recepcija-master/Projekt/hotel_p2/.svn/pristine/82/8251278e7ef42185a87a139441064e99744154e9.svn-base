/**
 * VrniRezervacijoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class VrniRezervacijoResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija vrniRezervacijoResult;

    public VrniRezervacijoResponse() {
    }

    public VrniRezervacijoResponse(
           org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija vrniRezervacijoResult) {
           this.vrniRezervacijoResult = vrniRezervacijoResult;
    }


    /**
     * Gets the vrniRezervacijoResult value for this VrniRezervacijoResponse.
     * 
     * @return vrniRezervacijoResult
     */
    public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija getVrniRezervacijoResult() {
        return vrniRezervacijoResult;
    }


    /**
     * Sets the vrniRezervacijoResult value for this VrniRezervacijoResponse.
     * 
     * @param vrniRezervacijoResult
     */
    public void setVrniRezervacijoResult(org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Rezervacija vrniRezervacijoResult) {
        this.vrniRezervacijoResult = vrniRezervacijoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VrniRezervacijoResponse)) return false;
        VrniRezervacijoResponse other = (VrniRezervacijoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vrniRezervacijoResult==null && other.getVrniRezervacijoResult()==null) || 
             (this.vrniRezervacijoResult!=null &&
              this.vrniRezervacijoResult.equals(other.getVrniRezervacijoResult())));
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
        if (getVrniRezervacijoResult() != null) {
            _hashCode += getVrniRezervacijoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VrniRezervacijoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">vrniRezervacijoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrniRezervacijoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vrniRezervacijoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Rezervacija"));
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
