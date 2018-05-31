/**
 * SpremeniRezervacijo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuriRezervacija;

public class SpremeniRezervacijo  implements java.io.Serializable {
    private java.lang.String stRezervacije;

    private java.lang.String terminOd;

    private java.lang.String terminDo;

    private java.lang.Integer tipSobe;

    private java.lang.String stopnjaUdobja;

    private java.lang.Boolean zajtrk;

    private java.lang.Boolean kosilo;

    private java.lang.Boolean vecerja;

    private java.lang.Boolean wellness;

    private org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba nosilec;

    private java.lang.Integer steviloOtrok;

    private java.lang.Integer steviloOdraslih;

    private java.lang.String stevilkaKupona;

    private java.lang.String opomba;

    public SpremeniRezervacijo() {
    }

    public SpremeniRezervacijo(
           java.lang.String stRezervacije,
           java.lang.String terminOd,
           java.lang.String terminDo,
           java.lang.Integer tipSobe,
           java.lang.String stopnjaUdobja,
           java.lang.Boolean zajtrk,
           java.lang.Boolean kosilo,
           java.lang.Boolean vecerja,
           java.lang.Boolean wellness,
           org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba nosilec,
           java.lang.Integer steviloOtrok,
           java.lang.Integer steviloOdraslih,
           java.lang.String stevilkaKupona,
           java.lang.String opomba) {
           this.stRezervacije = stRezervacije;
           this.terminOd = terminOd;
           this.terminDo = terminDo;
           this.tipSobe = tipSobe;
           this.stopnjaUdobja = stopnjaUdobja;
           this.zajtrk = zajtrk;
           this.kosilo = kosilo;
           this.vecerja = vecerja;
           this.wellness = wellness;
           this.nosilec = nosilec;
           this.steviloOtrok = steviloOtrok;
           this.steviloOdraslih = steviloOdraslih;
           this.stevilkaKupona = stevilkaKupona;
           this.opomba = opomba;
    }


    /**
     * Gets the stRezervacije value for this SpremeniRezervacijo.
     * 
     * @return stRezervacije
     */
    public java.lang.String getStRezervacije() {
        return stRezervacije;
    }


    /**
     * Sets the stRezervacije value for this SpremeniRezervacijo.
     * 
     * @param stRezervacije
     */
    public void setStRezervacije(java.lang.String stRezervacije) {
        this.stRezervacije = stRezervacije;
    }


    /**
     * Gets the terminOd value for this SpremeniRezervacijo.
     * 
     * @return terminOd
     */
    public java.lang.String getTerminOd() {
        return terminOd;
    }


    /**
     * Sets the terminOd value for this SpremeniRezervacijo.
     * 
     * @param terminOd
     */
    public void setTerminOd(java.lang.String terminOd) {
        this.terminOd = terminOd;
    }


    /**
     * Gets the terminDo value for this SpremeniRezervacijo.
     * 
     * @return terminDo
     */
    public java.lang.String getTerminDo() {
        return terminDo;
    }


    /**
     * Sets the terminDo value for this SpremeniRezervacijo.
     * 
     * @param terminDo
     */
    public void setTerminDo(java.lang.String terminDo) {
        this.terminDo = terminDo;
    }


    /**
     * Gets the tipSobe value for this SpremeniRezervacijo.
     * 
     * @return tipSobe
     */
    public java.lang.Integer getTipSobe() {
        return tipSobe;
    }


    /**
     * Sets the tipSobe value for this SpremeniRezervacijo.
     * 
     * @param tipSobe
     */
    public void setTipSobe(java.lang.Integer tipSobe) {
        this.tipSobe = tipSobe;
    }


    /**
     * Gets the stopnjaUdobja value for this SpremeniRezervacijo.
     * 
     * @return stopnjaUdobja
     */
    public java.lang.String getStopnjaUdobja() {
        return stopnjaUdobja;
    }


    /**
     * Sets the stopnjaUdobja value for this SpremeniRezervacijo.
     * 
     * @param stopnjaUdobja
     */
    public void setStopnjaUdobja(java.lang.String stopnjaUdobja) {
        this.stopnjaUdobja = stopnjaUdobja;
    }


    /**
     * Gets the zajtrk value for this SpremeniRezervacijo.
     * 
     * @return zajtrk
     */
    public java.lang.Boolean getZajtrk() {
        return zajtrk;
    }


    /**
     * Sets the zajtrk value for this SpremeniRezervacijo.
     * 
     * @param zajtrk
     */
    public void setZajtrk(java.lang.Boolean zajtrk) {
        this.zajtrk = zajtrk;
    }


    /**
     * Gets the kosilo value for this SpremeniRezervacijo.
     * 
     * @return kosilo
     */
    public java.lang.Boolean getKosilo() {
        return kosilo;
    }


    /**
     * Sets the kosilo value for this SpremeniRezervacijo.
     * 
     * @param kosilo
     */
    public void setKosilo(java.lang.Boolean kosilo) {
        this.kosilo = kosilo;
    }


    /**
     * Gets the vecerja value for this SpremeniRezervacijo.
     * 
     * @return vecerja
     */
    public java.lang.Boolean getVecerja() {
        return vecerja;
    }


    /**
     * Sets the vecerja value for this SpremeniRezervacijo.
     * 
     * @param vecerja
     */
    public void setVecerja(java.lang.Boolean vecerja) {
        this.vecerja = vecerja;
    }


    /**
     * Gets the wellness value for this SpremeniRezervacijo.
     * 
     * @return wellness
     */
    public java.lang.Boolean getWellness() {
        return wellness;
    }


    /**
     * Sets the wellness value for this SpremeniRezervacijo.
     * 
     * @param wellness
     */
    public void setWellness(java.lang.Boolean wellness) {
        this.wellness = wellness;
    }


    /**
     * Gets the nosilec value for this SpremeniRezervacijo.
     * 
     * @return nosilec
     */
    public org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba getNosilec() {
        return nosilec;
    }


    /**
     * Sets the nosilec value for this SpremeniRezervacijo.
     * 
     * @param nosilec
     */
    public void setNosilec(org.datacontract.schemas._2004._07.Hotel_P1_RezervacijaSob.Oseba nosilec) {
        this.nosilec = nosilec;
    }


    /**
     * Gets the steviloOtrok value for this SpremeniRezervacijo.
     * 
     * @return steviloOtrok
     */
    public java.lang.Integer getSteviloOtrok() {
        return steviloOtrok;
    }


    /**
     * Sets the steviloOtrok value for this SpremeniRezervacijo.
     * 
     * @param steviloOtrok
     */
    public void setSteviloOtrok(java.lang.Integer steviloOtrok) {
        this.steviloOtrok = steviloOtrok;
    }


    /**
     * Gets the steviloOdraslih value for this SpremeniRezervacijo.
     * 
     * @return steviloOdraslih
     */
    public java.lang.Integer getSteviloOdraslih() {
        return steviloOdraslih;
    }


    /**
     * Sets the steviloOdraslih value for this SpremeniRezervacijo.
     * 
     * @param steviloOdraslih
     */
    public void setSteviloOdraslih(java.lang.Integer steviloOdraslih) {
        this.steviloOdraslih = steviloOdraslih;
    }


    /**
     * Gets the stevilkaKupona value for this SpremeniRezervacijo.
     * 
     * @return stevilkaKupona
     */
    public java.lang.String getStevilkaKupona() {
        return stevilkaKupona;
    }


    /**
     * Sets the stevilkaKupona value for this SpremeniRezervacijo.
     * 
     * @param stevilkaKupona
     */
    public void setStevilkaKupona(java.lang.String stevilkaKupona) {
        this.stevilkaKupona = stevilkaKupona;
    }


    /**
     * Gets the opomba value for this SpremeniRezervacijo.
     * 
     * @return opomba
     */
    public java.lang.String getOpomba() {
        return opomba;
    }


    /**
     * Sets the opomba value for this SpremeniRezervacijo.
     * 
     * @param opomba
     */
    public void setOpomba(java.lang.String opomba) {
        this.opomba = opomba;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SpremeniRezervacijo)) return false;
        SpremeniRezervacijo other = (SpremeniRezervacijo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stRezervacije==null && other.getStRezervacije()==null) || 
             (this.stRezervacije!=null &&
              this.stRezervacije.equals(other.getStRezervacije()))) &&
            ((this.terminOd==null && other.getTerminOd()==null) || 
             (this.terminOd!=null &&
              this.terminOd.equals(other.getTerminOd()))) &&
            ((this.terminDo==null && other.getTerminDo()==null) || 
             (this.terminDo!=null &&
              this.terminDo.equals(other.getTerminDo()))) &&
            ((this.tipSobe==null && other.getTipSobe()==null) || 
             (this.tipSobe!=null &&
              this.tipSobe.equals(other.getTipSobe()))) &&
            ((this.stopnjaUdobja==null && other.getStopnjaUdobja()==null) || 
             (this.stopnjaUdobja!=null &&
              this.stopnjaUdobja.equals(other.getStopnjaUdobja()))) &&
            ((this.zajtrk==null && other.getZajtrk()==null) || 
             (this.zajtrk!=null &&
              this.zajtrk.equals(other.getZajtrk()))) &&
            ((this.kosilo==null && other.getKosilo()==null) || 
             (this.kosilo!=null &&
              this.kosilo.equals(other.getKosilo()))) &&
            ((this.vecerja==null && other.getVecerja()==null) || 
             (this.vecerja!=null &&
              this.vecerja.equals(other.getVecerja()))) &&
            ((this.wellness==null && other.getWellness()==null) || 
             (this.wellness!=null &&
              this.wellness.equals(other.getWellness()))) &&
            ((this.nosilec==null && other.getNosilec()==null) || 
             (this.nosilec!=null &&
              this.nosilec.equals(other.getNosilec()))) &&
            ((this.steviloOtrok==null && other.getSteviloOtrok()==null) || 
             (this.steviloOtrok!=null &&
              this.steviloOtrok.equals(other.getSteviloOtrok()))) &&
            ((this.steviloOdraslih==null && other.getSteviloOdraslih()==null) || 
             (this.steviloOdraslih!=null &&
              this.steviloOdraslih.equals(other.getSteviloOdraslih()))) &&
            ((this.stevilkaKupona==null && other.getStevilkaKupona()==null) || 
             (this.stevilkaKupona!=null &&
              this.stevilkaKupona.equals(other.getStevilkaKupona()))) &&
            ((this.opomba==null && other.getOpomba()==null) || 
             (this.opomba!=null &&
              this.opomba.equals(other.getOpomba())));
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
        if (getStRezervacije() != null) {
            _hashCode += getStRezervacije().hashCode();
        }
        if (getTerminOd() != null) {
            _hashCode += getTerminOd().hashCode();
        }
        if (getTerminDo() != null) {
            _hashCode += getTerminDo().hashCode();
        }
        if (getTipSobe() != null) {
            _hashCode += getTipSobe().hashCode();
        }
        if (getStopnjaUdobja() != null) {
            _hashCode += getStopnjaUdobja().hashCode();
        }
        if (getZajtrk() != null) {
            _hashCode += getZajtrk().hashCode();
        }
        if (getKosilo() != null) {
            _hashCode += getKosilo().hashCode();
        }
        if (getVecerja() != null) {
            _hashCode += getVecerja().hashCode();
        }
        if (getWellness() != null) {
            _hashCode += getWellness().hashCode();
        }
        if (getNosilec() != null) {
            _hashCode += getNosilec().hashCode();
        }
        if (getSteviloOtrok() != null) {
            _hashCode += getSteviloOtrok().hashCode();
        }
        if (getSteviloOdraslih() != null) {
            _hashCode += getSteviloOdraslih().hashCode();
        }
        if (getStevilkaKupona() != null) {
            _hashCode += getStevilkaKupona().hashCode();
        }
        if (getOpomba() != null) {
            _hashCode += getOpomba().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SpremeniRezervacijo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">spremeniRezervacijo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stRezervacije");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stRezervacije"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminOd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "terminOd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminDo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "terminDo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipSobe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tipSobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopnjaUdobja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stopnjaUdobja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zajtrk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zajtrk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kosilo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "kosilo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vecerja");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "vecerja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wellness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "wellness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nosilec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "nosilec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Hotel_P1_RezervacijaSob", "Oseba"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steviloOtrok");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "steviloOtrok"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("steviloOdraslih");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "steviloOdraslih"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stevilkaKupona");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "stevilkaKupona"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opomba");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "opomba"));
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
