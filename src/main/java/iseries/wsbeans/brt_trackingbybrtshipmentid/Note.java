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
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.brt_trackingbybrtshipmentid;

public class Note  implements java.io.Serializable {
    private iseries.wsbeans.brt_trackingbybrtshipmentid.Nota NOTA;

    public Note() {
    }

    public Note(
           iseries.wsbeans.brt_trackingbybrtshipmentid.Nota NOTA) {
           this.NOTA = NOTA;
    }


    /**
     * Gets the NOTA value for this Note.
     * 
     * @return NOTA
     */
    public iseries.wsbeans.brt_trackingbybrtshipmentid.Nota getNOTA() {
        return NOTA;
    }


    /**
     * Sets the NOTA value for this Note.
     * 
     * @param NOTA
     */
    public void setNOTA(iseries.wsbeans.brt_trackingbybrtshipmentid.Nota NOTA) {
        this.NOTA = NOTA;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Note)) return false;
        Note other = (Note) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NOTA==null && other.getNOTA()==null) || 
             (this.NOTA!=null &&
              this.NOTA.equals(other.getNOTA())));
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
        if (getNOTA() != null) {
            _hashCode += getNOTA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Note.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "note"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NOTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NOTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://brt_trackingbybrtshipmentid.wsbeans.iseries/", "nota"));
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
