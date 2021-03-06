/*******************************************************************************
 * Copyright 2021  Ironblaster
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
/**
 * GetlegendaesitiInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getlegendaesiti;

public class GetlegendaesitiInput  implements java.io.Serializable {
    private java.lang.String LINGUA_ISO639_ALPHA2;

    private int ULTIMO_ID_RICEVUTO;

    public GetlegendaesitiInput() {
    }

    public GetlegendaesitiInput(
           java.lang.String LINGUA_ISO639_ALPHA2,
           int ULTIMO_ID_RICEVUTO) {
           this.LINGUA_ISO639_ALPHA2 = LINGUA_ISO639_ALPHA2;
           this.ULTIMO_ID_RICEVUTO = ULTIMO_ID_RICEVUTO;
    }


    /**
     * Gets the LINGUA_ISO639_ALPHA2 value for this GetlegendaesitiInput.
     * 
     * @return LINGUA_ISO639_ALPHA2
     */
    public java.lang.String getLINGUA_ISO639_ALPHA2() {
        return LINGUA_ISO639_ALPHA2;
    }


    /**
     * Sets the LINGUA_ISO639_ALPHA2 value for this GetlegendaesitiInput.
     * 
     * @param LINGUA_ISO639_ALPHA2
     */
    public void setLINGUA_ISO639_ALPHA2(java.lang.String LINGUA_ISO639_ALPHA2) {
        this.LINGUA_ISO639_ALPHA2 = LINGUA_ISO639_ALPHA2;
    }


    /**
     * Gets the ULTIMO_ID_RICEVUTO value for this GetlegendaesitiInput.
     * 
     * @return ULTIMO_ID_RICEVUTO
     */
    public int getULTIMO_ID_RICEVUTO() {
        return ULTIMO_ID_RICEVUTO;
    }


    /**
     * Sets the ULTIMO_ID_RICEVUTO value for this GetlegendaesitiInput.
     * 
     * @param ULTIMO_ID_RICEVUTO
     */
    public void setULTIMO_ID_RICEVUTO(int ULTIMO_ID_RICEVUTO) {
        this.ULTIMO_ID_RICEVUTO = ULTIMO_ID_RICEVUTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetlegendaesitiInput)) return false;
        GetlegendaesitiInput other = (GetlegendaesitiInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.LINGUA_ISO639_ALPHA2==null && other.getLINGUA_ISO639_ALPHA2()==null) || 
             (this.LINGUA_ISO639_ALPHA2!=null &&
              this.LINGUA_ISO639_ALPHA2.equals(other.getLINGUA_ISO639_ALPHA2()))) &&
            this.ULTIMO_ID_RICEVUTO == other.getULTIMO_ID_RICEVUTO();
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
        if (getLINGUA_ISO639_ALPHA2() != null) {
            _hashCode += getLINGUA_ISO639_ALPHA2().hashCode();
        }
        _hashCode += getULTIMO_ID_RICEVUTO();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetlegendaesitiInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "getlegendaesitiInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LINGUA_ISO639_ALPHA2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LINGUA_ISO639_ALPHA2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULTIMO_ID_RICEVUTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ULTIMO_ID_RICEVUTO"));
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
