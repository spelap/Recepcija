/**
 * Rezervacija.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.wellness_storitve;

public class Rezervacija  implements java.io.Serializable {
    private java.util.Calendar datumUraDo;

    private java.lang.String emso;

    private java.lang.Integer ID;

    private java.lang.String status;

    public Rezervacija() {
    }

    public Rezervacija(
           java.util.Calendar datumUraDo,
           java.lang.String emso,
           java.lang.Integer ID,
           java.lang.String status) {
           this.datumUraDo = datumUraDo;
           this.emso = emso;
           this.ID = ID;
           this.status = status;
    }


    /**
     * Gets the datumUraDo value for this Rezervacija.
     * 
     * @return datumUraDo
     */
    public java.util.Calendar getDatumUraDo() {
        return datumUraDo;
    }


    /**
     * Sets the datumUraDo value for this Rezervacija.
     * 
     * @param datumUraDo
     */
    public void setDatumUraDo(java.util.Calendar datumUraDo) {
        this.datumUraDo = datumUraDo;
    }


    /**
     * Gets the emso value for this Rezervacija.
     * 
     * @return emso
     */
    public java.lang.String getEmso() {
        return emso;
    }


    /**
     * Sets the emso value for this Rezervacija.
     * 
     * @param emso
     */
    public void setEmso(java.lang.String emso) {
        this.emso = emso;
    }


    /**
     * Gets the ID value for this Rezervacija.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Rezervacija.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the status value for this Rezervacija.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Rezervacija.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rezervacija)) return false;
        Rezervacija other = (Rezervacija) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datumUraDo==null && other.getDatumUraDo()==null) || 
             (this.datumUraDo!=null &&
              this.datumUraDo.equals(other.getDatumUraDo()))) &&
            ((this.emso==null && other.getEmso()==null) || 
             (this.emso!=null &&
              this.emso.equals(other.getEmso()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getDatumUraDo() != null) {
            _hashCode += getDatumUraDo().hashCode();
        }
        if (getEmso() != null) {
            _hashCode += getEmso().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rezervacija.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Rezervacija"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datumUraDo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "DatumUraDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Emso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Status"));
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
