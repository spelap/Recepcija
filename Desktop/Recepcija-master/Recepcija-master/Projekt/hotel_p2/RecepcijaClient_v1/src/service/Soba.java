/**
 * Soba.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Soba  implements java.io.Serializable {
    private java.lang.String rang_kakovosti;

    private int st_postelj;

    private int st_sobe;

    private java.lang.String stanje_sobe;

    private boolean zasedena;

    public Soba() {
    }

    public Soba(
           java.lang.String rang_kakovosti,
           int st_postelj,
           int st_sobe,
           java.lang.String stanje_sobe,
           boolean zasedena) {
           this.rang_kakovosti = rang_kakovosti;
           this.st_postelj = st_postelj;
           this.st_sobe = st_sobe;
           this.stanje_sobe = stanje_sobe;
           this.zasedena = zasedena;
    }


    /**
     * Gets the rang_kakovosti value for this Soba.
     * 
     * @return rang_kakovosti
     */
    public java.lang.String getRang_kakovosti() {
        return rang_kakovosti;
    }


    /**
     * Sets the rang_kakovosti value for this Soba.
     * 
     * @param rang_kakovosti
     */
    public void setRang_kakovosti(java.lang.String rang_kakovosti) {
        this.rang_kakovosti = rang_kakovosti;
    }


    /**
     * Gets the st_postelj value for this Soba.
     * 
     * @return st_postelj
     */
    public int getSt_postelj() {
        return st_postelj;
    }


    /**
     * Sets the st_postelj value for this Soba.
     * 
     * @param st_postelj
     */
    public void setSt_postelj(int st_postelj) {
        this.st_postelj = st_postelj;
    }


    /**
     * Gets the st_sobe value for this Soba.
     * 
     * @return st_sobe
     */
    public int getSt_sobe() {
        return st_sobe;
    }


    /**
     * Sets the st_sobe value for this Soba.
     * 
     * @param st_sobe
     */
    public void setSt_sobe(int st_sobe) {
        this.st_sobe = st_sobe;
    }


    /**
     * Gets the stanje_sobe value for this Soba.
     * 
     * @return stanje_sobe
     */
    public java.lang.String getStanje_sobe() {
        return stanje_sobe;
    }


    /**
     * Sets the stanje_sobe value for this Soba.
     * 
     * @param stanje_sobe
     */
    public void setStanje_sobe(java.lang.String stanje_sobe) {
        this.stanje_sobe = stanje_sobe;
    }


    /**
     * Gets the zasedena value for this Soba.
     * 
     * @return zasedena
     */
    public boolean isZasedena() {
        return zasedena;
    }


    /**
     * Sets the zasedena value for this Soba.
     * 
     * @param zasedena
     */
    public void setZasedena(boolean zasedena) {
        this.zasedena = zasedena;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Soba)) return false;
        Soba other = (Soba) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rang_kakovosti==null && other.getRang_kakovosti()==null) || 
             (this.rang_kakovosti!=null &&
              this.rang_kakovosti.equals(other.getRang_kakovosti()))) &&
            this.st_postelj == other.getSt_postelj() &&
            this.st_sobe == other.getSt_sobe() &&
            ((this.stanje_sobe==null && other.getStanje_sobe()==null) || 
             (this.stanje_sobe!=null &&
              this.stanje_sobe.equals(other.getStanje_sobe()))) &&
            this.zasedena == other.isZasedena();
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
        if (getRang_kakovosti() != null) {
            _hashCode += getRang_kakovosti().hashCode();
        }
        _hashCode += getSt_postelj();
        _hashCode += getSt_sobe();
        if (getStanje_sobe() != null) {
            _hashCode += getStanje_sobe().hashCode();
        }
        _hashCode += (isZasedena() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Soba.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "soba"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rang_kakovosti");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rang_kakovosti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("st_postelj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "st_postelj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("st_sobe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "st_sobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stanje_sobe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stanje_sobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zasedena");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zasedena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
