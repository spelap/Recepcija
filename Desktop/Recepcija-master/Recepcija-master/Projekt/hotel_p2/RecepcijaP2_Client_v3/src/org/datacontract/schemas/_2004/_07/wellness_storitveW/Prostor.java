/**
 * Prostor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.wellness_storitveW;

public class Prostor  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String naziv;

    private java.lang.Integer stSobe;

    public Prostor() {
    }

    public Prostor(
           java.lang.Integer ID,
           java.lang.String naziv,
           java.lang.Integer stSobe) {
           this.ID = ID;
           this.naziv = naziv;
           this.stSobe = stSobe;
    }


    /**
     * Gets the ID value for this Prostor.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Prostor.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the naziv value for this Prostor.
     * 
     * @return naziv
     */
    public java.lang.String getNaziv() {
        return naziv;
    }


    /**
     * Sets the naziv value for this Prostor.
     * 
     * @param naziv
     */
    public void setNaziv(java.lang.String naziv) {
        this.naziv = naziv;
    }


    /**
     * Gets the stSobe value for this Prostor.
     * 
     * @return stSobe
     */
    public java.lang.Integer getStSobe() {
        return stSobe;
    }


    /**
     * Sets the stSobe value for this Prostor.
     * 
     * @param stSobe
     */
    public void setStSobe(java.lang.Integer stSobe) {
        this.stSobe = stSobe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Prostor)) return false;
        Prostor other = (Prostor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.naziv==null && other.getNaziv()==null) || 
             (this.naziv!=null &&
              this.naziv.equals(other.getNaziv()))) &&
            ((this.stSobe==null && other.getStSobe()==null) || 
             (this.stSobe!=null &&
              this.stSobe.equals(other.getStSobe())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getNaziv() != null) {
            _hashCode += getNaziv().hashCode();
        }
        if (getStSobe() != null) {
            _hashCode += getStSobe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Prostor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Prostor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naziv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Naziv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stSobe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "StSobe"));
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
