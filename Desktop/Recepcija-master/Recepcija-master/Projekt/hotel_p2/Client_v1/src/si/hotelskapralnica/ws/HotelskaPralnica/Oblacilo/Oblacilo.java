/**
 * Oblacilo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package si.hotelskapralnica.ws.HotelskaPralnica.Oblacilo;

public class Oblacilo  implements java.io.Serializable {
    private double maxCena;

    private java.lang.String tipOblacila;

    private int velikostOblacila;

    public Oblacilo() {
    }

    public Oblacilo(
           double maxCena,
           java.lang.String tipOblacila,
           int velikostOblacila) {
           this.maxCena = maxCena;
           this.tipOblacila = tipOblacila;
           this.velikostOblacila = velikostOblacila;
    }


    /**
     * Gets the maxCena value for this Oblacilo.
     * 
     * @return maxCena
     */
    public double getMaxCena() {
        return maxCena;
    }


    /**
     * Sets the maxCena value for this Oblacilo.
     * 
     * @param maxCena
     */
    public void setMaxCena(double maxCena) {
        this.maxCena = maxCena;
    }


    /**
     * Gets the tipOblacila value for this Oblacilo.
     * 
     * @return tipOblacila
     */
    public java.lang.String getTipOblacila() {
        return tipOblacila;
    }


    /**
     * Sets the tipOblacila value for this Oblacilo.
     * 
     * @param tipOblacila
     */
    public void setTipOblacila(java.lang.String tipOblacila) {
        this.tipOblacila = tipOblacila;
    }


    /**
     * Gets the velikostOblacila value for this Oblacilo.
     * 
     * @return velikostOblacila
     */
    public int getVelikostOblacila() {
        return velikostOblacila;
    }


    /**
     * Sets the velikostOblacila value for this Oblacilo.
     * 
     * @param velikostOblacila
     */
    public void setVelikostOblacila(int velikostOblacila) {
        this.velikostOblacila = velikostOblacila;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Oblacilo)) return false;
        Oblacilo other = (Oblacilo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.maxCena == other.getMaxCena() &&
            ((this.tipOblacila==null && other.getTipOblacila()==null) || 
             (this.tipOblacila!=null &&
              this.tipOblacila.equals(other.getTipOblacila()))) &&
            this.velikostOblacila == other.getVelikostOblacila();
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
        _hashCode += new Double(getMaxCena()).hashCode();
        if (getTipOblacila() != null) {
            _hashCode += getTipOblacila().hashCode();
        }
        _hashCode += getVelikostOblacila();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Oblacilo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://HotelskaPralnica.ws.hotelskapralnica.si/Oblacilo", "Oblacilo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCena");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCena"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipOblacila");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipOblacila"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("velikostOblacila");
        elemField.setXmlName(new javax.xml.namespace.QName("", "velikostOblacila"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
