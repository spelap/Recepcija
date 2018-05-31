/**
 * Likanje.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws.HotelskaPralnica.Likanje;

public class Likanje  implements java.io.Serializable {
    private int idGost;

    private int idLikanja;

    private java.lang.String konecLikanja;

    private java.lang.String prevzemOblacil;

    public Likanje() {
    }

    public Likanje(
           int idGost,
           int idLikanja,
           java.lang.String konecLikanja,
           java.lang.String prevzemOblacil) {
           this.idGost = idGost;
           this.idLikanja = idLikanja;
           this.konecLikanja = konecLikanja;
           this.prevzemOblacil = prevzemOblacil;
    }


    /**
     * Gets the idGost value for this Likanje.
     * 
     * @return idGost
     */
    public int getIdGost() {
        return idGost;
    }


    /**
     * Sets the idGost value for this Likanje.
     * 
     * @param idGost
     */
    public void setIdGost(int idGost) {
        this.idGost = idGost;
    }


    /**
     * Gets the idLikanja value for this Likanje.
     * 
     * @return idLikanja
     */
    public int getIdLikanja() {
        return idLikanja;
    }


    /**
     * Sets the idLikanja value for this Likanje.
     * 
     * @param idLikanja
     */
    public void setIdLikanja(int idLikanja) {
        this.idLikanja = idLikanja;
    }


    /**
     * Gets the konecLikanja value for this Likanje.
     * 
     * @return konecLikanja
     */
    public java.lang.String getKonecLikanja() {
        return konecLikanja;
    }


    /**
     * Sets the konecLikanja value for this Likanje.
     * 
     * @param konecLikanja
     */
    public void setKonecLikanja(java.lang.String konecLikanja) {
        this.konecLikanja = konecLikanja;
    }


    /**
     * Gets the prevzemOblacil value for this Likanje.
     * 
     * @return prevzemOblacil
     */
    public java.lang.String getPrevzemOblacil() {
        return prevzemOblacil;
    }


    /**
     * Sets the prevzemOblacil value for this Likanje.
     * 
     * @param prevzemOblacil
     */
    public void setPrevzemOblacil(java.lang.String prevzemOblacil) {
        this.prevzemOblacil = prevzemOblacil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Likanje)) return false;
        Likanje other = (Likanje) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.idGost == other.getIdGost() &&
            this.idLikanja == other.getIdLikanja() &&
            ((this.konecLikanja==null && other.getKonecLikanja()==null) || 
             (this.konecLikanja!=null &&
              this.konecLikanja.equals(other.getKonecLikanja()))) &&
            ((this.prevzemOblacil==null && other.getPrevzemOblacil()==null) || 
             (this.prevzemOblacil!=null &&
              this.prevzemOblacil.equals(other.getPrevzemOblacil())));
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
        _hashCode += getIdGost();
        _hashCode += getIdLikanja();
        if (getKonecLikanja() != null) {
            _hashCode += getKonecLikanja().hashCode();
        }
        if (getPrevzemOblacil() != null) {
            _hashCode += getPrevzemOblacil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Likanje.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Likanje", "Likanje"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idGost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idGost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLikanja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idLikanja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("konecLikanja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "konecLikanja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevzemOblacil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prevzemOblacil"));
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
