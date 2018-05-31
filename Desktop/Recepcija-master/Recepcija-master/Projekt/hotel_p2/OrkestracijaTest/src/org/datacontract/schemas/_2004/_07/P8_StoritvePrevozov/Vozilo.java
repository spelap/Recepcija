/**
 * Vozilo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.P8_StoritvePrevozov;

public class Vozilo  implements java.io.Serializable {
    private java.lang.Integer IDVozilo;

    private java.lang.Integer kapaciteta;

    private java.lang.String model;

    private java.lang.String tipVozila;

    private java.lang.String znamka;

    public Vozilo() {
    }

    public Vozilo(
           java.lang.Integer IDVozilo,
           java.lang.Integer kapaciteta,
           java.lang.String model,
           java.lang.String tipVozila,
           java.lang.String znamka) {
           this.IDVozilo = IDVozilo;
           this.kapaciteta = kapaciteta;
           this.model = model;
           this.tipVozila = tipVozila;
           this.znamka = znamka;
    }


    /**
     * Gets the IDVozilo value for this Vozilo.
     * 
     * @return IDVozilo
     */
    public java.lang.Integer getIDVozilo() {
        return IDVozilo;
    }


    /**
     * Sets the IDVozilo value for this Vozilo.
     * 
     * @param IDVozilo
     */
    public void setIDVozilo(java.lang.Integer IDVozilo) {
        this.IDVozilo = IDVozilo;
    }


    /**
     * Gets the kapaciteta value for this Vozilo.
     * 
     * @return kapaciteta
     */
    public java.lang.Integer getKapaciteta() {
        return kapaciteta;
    }


    /**
     * Sets the kapaciteta value for this Vozilo.
     * 
     * @param kapaciteta
     */
    public void setKapaciteta(java.lang.Integer kapaciteta) {
        this.kapaciteta = kapaciteta;
    }


    /**
     * Gets the model value for this Vozilo.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this Vozilo.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the tipVozila value for this Vozilo.
     * 
     * @return tipVozila
     */
    public java.lang.String getTipVozila() {
        return tipVozila;
    }


    /**
     * Sets the tipVozila value for this Vozilo.
     * 
     * @param tipVozila
     */
    public void setTipVozila(java.lang.String tipVozila) {
        this.tipVozila = tipVozila;
    }


    /**
     * Gets the znamka value for this Vozilo.
     * 
     * @return znamka
     */
    public java.lang.String getZnamka() {
        return znamka;
    }


    /**
     * Sets the znamka value for this Vozilo.
     * 
     * @param znamka
     */
    public void setZnamka(java.lang.String znamka) {
        this.znamka = znamka;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vozilo)) return false;
        Vozilo other = (Vozilo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDVozilo==null && other.getIDVozilo()==null) || 
             (this.IDVozilo!=null &&
              this.IDVozilo.equals(other.getIDVozilo()))) &&
            ((this.kapaciteta==null && other.getKapaciteta()==null) || 
             (this.kapaciteta!=null &&
              this.kapaciteta.equals(other.getKapaciteta()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.tipVozila==null && other.getTipVozila()==null) || 
             (this.tipVozila!=null &&
              this.tipVozila.equals(other.getTipVozila()))) &&
            ((this.znamka==null && other.getZnamka()==null) || 
             (this.znamka!=null &&
              this.znamka.equals(other.getZnamka())));
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
        if (getIDVozilo() != null) {
            _hashCode += getIDVozilo().hashCode();
        }
        if (getKapaciteta() != null) {
            _hashCode += getKapaciteta().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getTipVozila() != null) {
            _hashCode += getTipVozila().hashCode();
        }
        if (getZnamka() != null) {
            _hashCode += getZnamka().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vozilo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "Vozilo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDVozilo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "IDVozilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kapaciteta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "Kapaciteta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "Model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipVozila");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "TipVozila"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("znamka");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "Znamka"));
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
