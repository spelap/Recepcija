/**
 * DelovniCas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws.HotelskaPralnica.DelovniCas;

public class DelovniCas  implements java.io.Serializable {
    private java.lang.String danVTednu;

    private java.lang.String konec;

    private java.lang.String zacetek;

    public DelovniCas() {
    }

    public DelovniCas(
           java.lang.String danVTednu,
           java.lang.String konec,
           java.lang.String zacetek) {
           this.danVTednu = danVTednu;
           this.konec = konec;
           this.zacetek = zacetek;
    }


    /**
     * Gets the danVTednu value for this DelovniCas.
     * 
     * @return danVTednu
     */
    public java.lang.String getDanVTednu() {
        return danVTednu;
    }


    /**
     * Sets the danVTednu value for this DelovniCas.
     * 
     * @param danVTednu
     */
    public void setDanVTednu(java.lang.String danVTednu) {
        this.danVTednu = danVTednu;
    }


    /**
     * Gets the konec value for this DelovniCas.
     * 
     * @return konec
     */
    public java.lang.String getKonec() {
        return konec;
    }


    /**
     * Sets the konec value for this DelovniCas.
     * 
     * @param konec
     */
    public void setKonec(java.lang.String konec) {
        this.konec = konec;
    }


    /**
     * Gets the zacetek value for this DelovniCas.
     * 
     * @return zacetek
     */
    public java.lang.String getZacetek() {
        return zacetek;
    }


    /**
     * Sets the zacetek value for this DelovniCas.
     * 
     * @param zacetek
     */
    public void setZacetek(java.lang.String zacetek) {
        this.zacetek = zacetek;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelovniCas)) return false;
        DelovniCas other = (DelovniCas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.danVTednu==null && other.getDanVTednu()==null) || 
             (this.danVTednu!=null &&
              this.danVTednu.equals(other.getDanVTednu()))) &&
            ((this.konec==null && other.getKonec()==null) || 
             (this.konec!=null &&
              this.konec.equals(other.getKonec()))) &&
            ((this.zacetek==null && other.getZacetek()==null) || 
             (this.zacetek!=null &&
              this.zacetek.equals(other.getZacetek())));
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
        if (getDanVTednu() != null) {
            _hashCode += getDanVTednu().hashCode();
        }
        if (getKonec() != null) {
            _hashCode += getKonec().hashCode();
        }
        if (getZacetek() != null) {
            _hashCode += getZacetek().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelovniCas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/DelovniCas", "DelovniCas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("danVTednu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "danVTednu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("konec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zacetek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zacetek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
