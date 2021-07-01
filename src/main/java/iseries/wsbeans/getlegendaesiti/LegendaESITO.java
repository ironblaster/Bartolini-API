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
 * LegendaESITO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getlegendaesiti;

public class LegendaESITO  implements java.io.Serializable {
    private int ID;

    private java.lang.String TESTO1;

    private java.lang.String TESTO2;

    public LegendaESITO() {
    }

    public LegendaESITO(
           int ID,
           java.lang.String TESTO1,
           java.lang.String TESTO2) {
           this.ID = ID;
           this.TESTO1 = TESTO1;
           this.TESTO2 = TESTO2;
    }


    /**
     * Gets the ID value for this LegendaESITO.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this LegendaESITO.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the TESTO1 value for this LegendaESITO.
     * 
     * @return TESTO1
     */
    public java.lang.String getTESTO1() {
        return TESTO1;
    }


    /**
     * Sets the TESTO1 value for this LegendaESITO.
     * 
     * @param TESTO1
     */
    public void setTESTO1(java.lang.String TESTO1) {
        this.TESTO1 = TESTO1;
    }


    /**
     * Gets the TESTO2 value for this LegendaESITO.
     * 
     * @return TESTO2
     */
    public java.lang.String getTESTO2() {
        return TESTO2;
    }


    /**
     * Sets the TESTO2 value for this LegendaESITO.
     * 
     * @param TESTO2
     */
    public void setTESTO2(java.lang.String TESTO2) {
        this.TESTO2 = TESTO2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LegendaESITO)) return false;
        LegendaESITO other = (LegendaESITO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            ((this.TESTO1==null && other.getTESTO1()==null) || 
             (this.TESTO1!=null &&
              this.TESTO1.equals(other.getTESTO1()))) &&
            ((this.TESTO2==null && other.getTESTO2()==null) || 
             (this.TESTO2!=null &&
              this.TESTO2.equals(other.getTESTO2())));
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
        _hashCode += getID();
        if (getTESTO1() != null) {
            _hashCode += getTESTO1().hashCode();
        }
        if (getTESTO2() != null) {
            _hashCode += getTESTO2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LegendaESITO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getlegendaesiti.wsbeans.iseries", "legendaESITO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TESTO1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TESTO1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TESTO2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TESTO2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
