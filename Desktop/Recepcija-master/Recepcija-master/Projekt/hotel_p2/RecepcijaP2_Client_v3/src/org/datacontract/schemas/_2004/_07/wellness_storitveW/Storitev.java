/**
 * Storitev.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.wellness_storitveW;

public class Storitev  implements java.io.Serializable {
    private java.lang.Double cena;

    private java.lang.Integer ID;

    private java.lang.String nazivStoritve;

    private java.lang.Integer st_mest;

    private java.lang.Integer id_prostora;

    public Storitev() {
    }

    public Storitev(
           java.lang.Double cena,
           java.lang.Integer ID,
           java.lang.String nazivStoritve,
           java.lang.Integer st_mest,
           java.lang.Integer id_prostora) {
           this.cena = cena;
           this.ID = ID;
           this.nazivStoritve = nazivStoritve;
           this.st_mest = st_mest;
           this.id_prostora = id_prostora;
    }


    /**
     * Gets the cena value for this Storitev.
     * 
     * @return cena
     */
    public java.lang.Double getCena() {
        return cena;
    }


    /**
     * Sets the cena value for this Storitev.
     * 
     * @param cena
     */
    public void setCena(java.lang.Double cena) {
        this.cena = cena;
    }


    /**
     * Gets the ID value for this Storitev.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Storitev.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the nazivStoritve value for this Storitev.
     * 
     * @return nazivStoritve
     */
    public java.lang.String getNazivStoritve() {
        return nazivStoritve;
    }


    /**
     * Sets the nazivStoritve value for this Storitev.
     * 
     * @param nazivStoritve
     */
    public void setNazivStoritve(java.lang.String nazivStoritve) {
        this.nazivStoritve = nazivStoritve;
    }


    /**
     * Gets the st_mest value for this Storitev.
     * 
     * @return st_mest
     */
    public java.lang.Integer getSt_mest() {
        return st_mest;
    }


    /**
     * Sets the st_mest value for this Storitev.
     * 
     * @param st_mest
     */
    public void setSt_mest(java.lang.Integer st_mest) {
        this.st_mest = st_mest;
    }


    /**
     * Gets the id_prostora value for this Storitev.
     * 
     * @return id_prostora
     */
    public java.lang.Integer getId_prostora() {
        return id_prostora;
    }


    /**
     * Sets the id_prostora value for this Storitev.
     * 
     * @param id_prostora
     */
    public void setId_prostora(java.lang.Integer id_prostora) {
        this.id_prostora = id_prostora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Storitev)) return false;
        Storitev other = (Storitev) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cena==null && other.getCena()==null) || 
             (this.cena!=null &&
              this.cena.equals(other.getCena()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.nazivStoritve==null && other.getNazivStoritve()==null) || 
             (this.nazivStoritve!=null &&
              this.nazivStoritve.equals(other.getNazivStoritve()))) &&
            ((this.st_mest==null && other.getSt_mest()==null) || 
             (this.st_mest!=null &&
              this.st_mest.equals(other.getSt_mest()))) &&
            ((this.id_prostora==null && other.getId_prostora()==null) || 
             (this.id_prostora!=null &&
              this.id_prostora.equals(other.getId_prostora())));
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
        if (getCena() != null) {
            _hashCode += getCena().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getNazivStoritve() != null) {
            _hashCode += getNazivStoritve().hashCode();
        }
        if (getSt_mest() != null) {
            _hashCode += getSt_mest().hashCode();
        }
        if (getId_prostora() != null) {
            _hashCode += getId_prostora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Storitev.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Storitev"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cena");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Cena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nazivStoritve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NazivStoritve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("st_mest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "St_mest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_prostora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "id_prostora"));
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
