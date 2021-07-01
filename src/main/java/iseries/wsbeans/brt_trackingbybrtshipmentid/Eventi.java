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
 * Eventi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Eventi  implements java.io.Serializable {
    private iseries.wsbeans.brt_trackingbybrtshipmentid.Evento EVENTO;

    public Eventi() {
    }

    public Eventi(
           iseries.wsbeans.brt_trackingbybrtshipmentid.Evento EVENTO) {
           this.EVENTO = EVENTO;
    }


    /**
     * Gets the EVENTO value for this Eventi.
     * 
     * @return EVENTO
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Evento getEVENTO() {
        return EVENTO;
    }


    /**
     * Sets the EVENTO value for this Eventi.
     * 
     * @param EVENTO
     */
    public void setEVENTO(iseries.wsbeans.brt_trackingbybrtshipmentid.Evento EVENTO) {
        this.EVENTO = EVENTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Eventi)) return false;
        Eventi other = (Eventi) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EVENTO==null && other.getEVENTO()==null) || 
             (this.EVENTO!=null &&
              this.EVENTO.equals(other.getEVENTO())));
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
        if (getEVENTO() != null) {
            _hashCode += getEVENTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Eventi.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "eventi"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EVENTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EVENTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "evento"));
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
