/**
 * NarocenPrevoz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.P8_StoritvePrevozovP;

public class NarocenPrevoz  implements java.io.Serializable {
    private java.util.Calendar datumDo;

    private java.util.Calendar datumOd;

    private java.lang.String EMSOgosta;

    private java.lang.Integer IDNarocenPrevoz;

    private java.lang.Boolean izveden;

    private java.lang.String koncnaLokacija;

    private java.lang.Integer steviloLjudi;

    private java.lang.String zacetnaLokacija;

    public NarocenPrevoz() {
    }

    public NarocenPrevoz(
           java.util.Calendar datumDo,
           java.util.Calendar datumOd,
           java.lang.String EMSOgosta,
           java.lang.Integer IDNarocenPrevoz,
           java.lang.Boolean izveden,
           java.lang.String koncnaLokacija,
           java.lang.Integer steviloLjudi,
           java.lang.String zacetnaLokacija) {
           this.datumDo = datumDo;
           this.datumOd = datumOd;
           this.EMSOgosta = EMSOgosta;
           this.IDNarocenPrevoz = IDNarocenPrevoz;
           this.izveden = izveden;
           this.koncnaLokacija = koncnaLokacija;
           this.steviloLjudi = steviloLjudi;
           this.zacetnaLokacija = zacetnaLokacija;
    }


    /**
     * Gets the datumDo value for this NarocenPrevoz.
     * 
     * @return datumDo
     */
    public java.util.Calendar getDatumDo() {
        return datumDo;
    }


    /**
     * Sets the datumDo value for this NarocenPrevoz.
     * 
     * @param datumDo
     */
    public void setDatumDo(java.util.Calendar datumDo) {
        this.datumDo = datumDo;
    }


    /**
     * Gets the datumOd value for this NarocenPrevoz.
     * 
     * @return datumOd
     */
    public java.util.Calendar getDatumOd() {
        return datumOd;
    }


    /**
     * Sets the datumOd value for this NarocenPrevoz.
     * 
     * @param datumOd
     */
    public void setDatumOd(java.util.Calendar datumOd) {
        this.datumOd = datumOd;
    }


    /**
     * Gets the EMSOgosta value for this NarocenPrevoz.
     * 
     * @return EMSOgosta
     */
    public java.lang.String getEMSOgosta() {
        return EMSOgosta;
    }


    /**
     * Sets the EMSOgosta value for this NarocenPrevoz.
     * 
     * @param EMSOgosta
     */
    public void setEMSOgosta(java.lang.String EMSOgosta) {
        this.EMSOgosta = EMSOgosta;
    }


    /**
     * Gets the IDNarocenPrevoz value for this NarocenPrevoz.
     * 
     * @return IDNarocenPrevoz
     */
    public java.lang.Integer getIDNarocenPrevoz() {
        return IDNarocenPrevoz;
    }


    /**
     * Sets the IDNarocenPrevoz value for this NarocenPrevoz.
     * 
     * @param IDNarocenPrevoz
     */
    public void setIDNarocenPrevoz(java.lang.Integer IDNarocenPrevoz) {
        this.IDNarocenPrevoz = IDNarocenPrevoz;
    }


    /**
     * Gets the izveden value for this NarocenPrevoz.
     * 
     * @return izveden
     */
    public java.lang.Boolean getIzveden() {
        return izveden;
    }


    /**
     * Sets the izveden value for this NarocenPrevoz.
     * 
     * @param izveden
     */
    public void setIzveden(java.lang.Boolean izveden) {
        this.izveden = izveden;
    }


    /**
     * Gets the koncnaLokacija value for this NarocenPrevoz.
     * 
     * @return koncnaLokacija
     */
    public java.lang.String getKoncnaLokacija() {
        return koncnaLokacija;
    }


    /**
     * Sets the koncnaLokacija value for this NarocenPrevoz.
     * 
     * @param koncnaLokacija
     */
    public void setKoncnaLokacija(java.lang.String koncnaLokacija) {
        this.koncnaLokacija = koncnaLokacija;
    }


    /**
     * Gets the steviloLjudi value for this NarocenPrevoz.
     * 
     * @return steviloLjudi
     */
    public java.lang.Integer getSteviloLjudi() {
        return steviloLjudi;
    }


    /**
     * Sets the steviloLjudi value for this NarocenPrevoz.
     * 
     * @param steviloLjudi
     */
    public void setSteviloLjudi(java.lang.Integer steviloLjudi) {
        this.steviloLjudi = steviloLjudi;
    }


    /**
     * Gets the zacetnaLokacija value for this NarocenPrevoz.
     * 
     * @return zacetnaLokacija
     */
    public java.lang.String getZacetnaLokacija() {
        return zacetnaLokacija;
    }


    /**
     * Sets the zacetnaLokacija value for this NarocenPrevoz.
     * 
     * @param zacetnaLokacija
     */
    public void setZacetnaLokacija(java.lang.String zacetnaLokacija) {
        this.zacetnaLokacija = zacetnaLokacija;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NarocenPrevoz)) return false;
        NarocenPrevoz other = (NarocenPrevoz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datumDo==null && other.getDatumDo()==null) || 
             (this.datumDo!=null &&
              this.datumDo.equals(other.getDatumDo()))) &&
            ((this.datumOd==null && other.getDatumOd()==null) || 
             (this.datumOd!=null &&
              this.datumOd.equals(other.getDatumOd()))) &&
            ((this.EMSOgosta==null && other.getEMSOgosta()==null) || 
             (this.EMSOgosta!=null &&
              this.EMSOgosta.equals(other.getEMSOgosta()))) &&
            ((this.IDNarocenPrevoz==null && other.getIDNarocenPrevoz()==null) || 
             (this.IDNarocenPrevoz!=null &&
              this.IDNarocenPrevoz.equals(other.getIDNarocenPrevoz()))) &&
            ((this.izveden==null && other.getIzveden()==null) || 
             (this.izveden!=null &&
              this.izveden.equals(other.getIzveden()))) &&
            ((this.koncnaLokacija==null && other.getKoncnaLokacija()==null) || 
             (this.koncnaLokacija!=null &&
              this.koncnaLokacija.equals(other.getKoncnaLokacija()))) &&
            ((this.steviloLjudi==null && other.getSteviloLjudi()==null) || 
             (this.steviloLjudi!=null &&
              this.steviloLjudi.equals(other.getSteviloLjudi()))) &&
            ((this.zacetnaLokacija==null && other.getZacetnaLokacija()==null) || 
             (this.zacetnaLokacija!=null &&
              this.zacetnaLokacija.equals(other.getZacetnaLokacija())));
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
        if (getDatumDo() != null) {
            _hashCode += getDatumDo().hashCode();
        }
        if (getDatumOd() != null) {
            _hashCode += getDatumOd().hashCode();
        }
        if (getEMSOgosta() != null) {
            _hashCode += getEMSOgosta().hashCode();
        }
        if (getIDNarocenPrevoz() != null) {
            _hashCode += getIDNarocenPrevoz().hashCode();
        }
        if (getIzveden() != null) {
            _hashCode += getIzveden().hashCode();
        }
        if (getKoncnaLokacija() != null) {
            _hashCode += getKoncnaLokacija().hashCode();
        }
        if (getSteviloLjudi() != null) {
            _hashCode += getSteviloLjudi().hashCode();
        }
        if (getZacetnaLokacija() != null) {
            _hashCode += getZacetnaLokacija().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NarocenPrevoz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "NarocenPrevoz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datumDo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "DatumDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datumOd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "DatumOd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMSOgosta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "EMSOgosta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDNarocenPrevoz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "IDNarocenPrevoz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("izveden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "Izveden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("koncnaLokacija");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "KoncnaLokacija"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steviloLjudi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "SteviloLjudi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zacetnaLokacija");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/P8_StoritvePrevozov", "ZacetnaLokacija"));
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
