/**
 * Narocilo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.CistilniServis_EntitiesC;

public class Narocilo  implements java.io.Serializable {
    private java.util.Calendar datum;

    private java.lang.Integer id;

    private java.lang.Integer idProstora;

    private java.lang.String opis;

    private java.lang.Boolean opravljeno;

    private java.lang.Boolean preklicano;

    public Narocilo() {
    }

    public Narocilo(
           java.util.Calendar datum,
           java.lang.Integer id,
           java.lang.Integer idProstora,
           java.lang.String opis,
           java.lang.Boolean opravljeno,
           java.lang.Boolean preklicano) {
           this.datum = datum;
           this.id = id;
           this.idProstora = idProstora;
           this.opis = opis;
           this.opravljeno = opravljeno;
           this.preklicano = preklicano;
    }


    /**
     * Gets the datum value for this Narocilo.
     * 
     * @return datum
     */
    public java.util.Calendar getDatum() {
        return datum;
    }


    /**
     * Sets the datum value for this Narocilo.
     * 
     * @param datum
     */
    public void setDatum(java.util.Calendar datum) {
        this.datum = datum;
    }


    /**
     * Gets the id value for this Narocilo.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Narocilo.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the idProstora value for this Narocilo.
     * 
     * @return idProstora
     */
    public java.lang.Integer getIdProstora() {
        return idProstora;
    }


    /**
     * Sets the idProstora value for this Narocilo.
     * 
     * @param idProstora
     */
    public void setIdProstora(java.lang.Integer idProstora) {
        this.idProstora = idProstora;
    }


    /**
     * Gets the opis value for this Narocilo.
     * 
     * @return opis
     */
    public java.lang.String getOpis() {
        return opis;
    }


    /**
     * Sets the opis value for this Narocilo.
     * 
     * @param opis
     */
    public void setOpis(java.lang.String opis) {
        this.opis = opis;
    }


    /**
     * Gets the opravljeno value for this Narocilo.
     * 
     * @return opravljeno
     */
    public java.lang.Boolean getOpravljeno() {
        return opravljeno;
    }


    /**
     * Sets the opravljeno value for this Narocilo.
     * 
     * @param opravljeno
     */
    public void setOpravljeno(java.lang.Boolean opravljeno) {
        this.opravljeno = opravljeno;
    }


    /**
     * Gets the preklicano value for this Narocilo.
     * 
     * @return preklicano
     */
    public java.lang.Boolean getPreklicano() {
        return preklicano;
    }


    /**
     * Sets the preklicano value for this Narocilo.
     * 
     * @param preklicano
     */
    public void setPreklicano(java.lang.Boolean preklicano) {
        this.preklicano = preklicano;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Narocilo)) return false;
        Narocilo other = (Narocilo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datum==null && other.getDatum()==null) || 
             (this.datum!=null &&
              this.datum.equals(other.getDatum()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.idProstora==null && other.getIdProstora()==null) || 
             (this.idProstora!=null &&
              this.idProstora.equals(other.getIdProstora()))) &&
            ((this.opis==null && other.getOpis()==null) || 
             (this.opis!=null &&
              this.opis.equals(other.getOpis()))) &&
            ((this.opravljeno==null && other.getOpravljeno()==null) || 
             (this.opravljeno!=null &&
              this.opravljeno.equals(other.getOpravljeno()))) &&
            ((this.preklicano==null && other.getPreklicano()==null) || 
             (this.preklicano!=null &&
              this.preklicano.equals(other.getPreklicano())));
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIdProstora() != null) {
            _hashCode += getIdProstora().hashCode();
        }
        if (getOpis() != null) {
            _hashCode += getOpis().hashCode();
        }
        if (getOpravljeno() != null) {
            _hashCode += getOpravljeno().hashCode();
        }
        if (getPreklicano() != null) {
            _hashCode += getPreklicano().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Narocilo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Narocilo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProstora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "IdProstora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Opis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opravljeno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Opravljeno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preklicano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/CistilniServis.Entities", "Preklicano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
