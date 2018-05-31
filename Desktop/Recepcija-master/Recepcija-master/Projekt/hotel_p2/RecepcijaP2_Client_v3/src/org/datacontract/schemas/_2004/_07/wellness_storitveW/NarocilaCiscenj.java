/**
 * NarocilaCiscenj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.wellness_storitveW;

public class NarocilaCiscenj  implements java.io.Serializable {
    private java.lang.String datumCas;

    private java.lang.Integer id;

    private java.lang.Integer id_Narocila;

    private java.lang.Integer id_prostora;

    private java.lang.String opis;

    public NarocilaCiscenj() {
    }

    public NarocilaCiscenj(
           java.lang.String datumCas,
           java.lang.Integer id,
           java.lang.Integer id_Narocila,
           java.lang.Integer id_prostora,
           java.lang.String opis) {
           this.datumCas = datumCas;
           this.id = id;
           this.id_Narocila = id_Narocila;
           this.id_prostora = id_prostora;
           this.opis = opis;
    }


    /**
     * Gets the datumCas value for this NarocilaCiscenj.
     * 
     * @return datumCas
     */
    public java.lang.String getDatumCas() {
        return datumCas;
    }


    /**
     * Sets the datumCas value for this NarocilaCiscenj.
     * 
     * @param datumCas
     */
    public void setDatumCas(java.lang.String datumCas) {
        this.datumCas = datumCas;
    }


    /**
     * Gets the id value for this NarocilaCiscenj.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this NarocilaCiscenj.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the id_Narocila value for this NarocilaCiscenj.
     * 
     * @return id_Narocila
     */
    public java.lang.Integer getId_Narocila() {
        return id_Narocila;
    }


    /**
     * Sets the id_Narocila value for this NarocilaCiscenj.
     * 
     * @param id_Narocila
     */
    public void setId_Narocila(java.lang.Integer id_Narocila) {
        this.id_Narocila = id_Narocila;
    }


    /**
     * Gets the id_prostora value for this NarocilaCiscenj.
     * 
     * @return id_prostora
     */
    public java.lang.Integer getId_prostora() {
        return id_prostora;
    }


    /**
     * Sets the id_prostora value for this NarocilaCiscenj.
     * 
     * @param id_prostora
     */
    public void setId_prostora(java.lang.Integer id_prostora) {
        this.id_prostora = id_prostora;
    }


    /**
     * Gets the opis value for this NarocilaCiscenj.
     * 
     * @return opis
     */
    public java.lang.String getOpis() {
        return opis;
    }


    /**
     * Sets the opis value for this NarocilaCiscenj.
     * 
     * @param opis
     */
    public void setOpis(java.lang.String opis) {
        this.opis = opis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NarocilaCiscenj)) return false;
        NarocilaCiscenj other = (NarocilaCiscenj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datumCas==null && other.getDatumCas()==null) || 
             (this.datumCas!=null &&
              this.datumCas.equals(other.getDatumCas()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.id_Narocila==null && other.getId_Narocila()==null) || 
             (this.id_Narocila!=null &&
              this.id_Narocila.equals(other.getId_Narocila()))) &&
            ((this.id_prostora==null && other.getId_prostora()==null) || 
             (this.id_prostora!=null &&
              this.id_prostora.equals(other.getId_prostora()))) &&
            ((this.opis==null && other.getOpis()==null) || 
             (this.opis!=null &&
              this.opis.equals(other.getOpis())));
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
        if (getDatumCas() != null) {
            _hashCode += getDatumCas().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getId_Narocila() != null) {
            _hashCode += getId_Narocila().hashCode();
        }
        if (getId_prostora() != null) {
            _hashCode += getId_prostora().hashCode();
        }
        if (getOpis() != null) {
            _hashCode += getOpis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NarocilaCiscenj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "NarocilaCiscenj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datumCas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "DatumCas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_Narocila");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Id_Narocila"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_prostora");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Id_prostora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/wellness_storitve", "Opis"));
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
