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
 * GetidspedizionebyrmaResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyrma;

public class GetidspedizionebyrmaResult  implements java.io.Serializable {
    private int ESITO;

    private long SPEDIZIONE_ID;

    private int VERSIONE;

    public GetidspedizionebyrmaResult() {
    }

    public GetidspedizionebyrmaResult(
           int ESITO,
           long SPEDIZIONE_ID,
           int VERSIONE) {
           this.ESITO = ESITO;
           this.SPEDIZIONE_ID = SPEDIZIONE_ID;
           this.VERSIONE = VERSIONE;
    }


    /**
     * Gets the ESITO value for this GetidspedizionebyrmaResult.
     * 
     * @return ESITO
     */
    public int getESITO() {
        return ESITO;
    }


    /**
     * Sets the ESITO value for this GetidspedizionebyrmaResult.
     * 
     * @param ESITO
     */
    public void setESITO(int ESITO) {
        this.ESITO = ESITO;
    }


    /**
     * Gets the SPEDIZIONE_ID value for this GetidspedizionebyrmaResult.
     * 
     * @return SPEDIZIONE_ID
     */
    public long getSPEDIZIONE_ID() {
        return SPEDIZIONE_ID;
    }


    /**
     * Sets the SPEDIZIONE_ID value for this GetidspedizionebyrmaResult.
     * 
     * @param SPEDIZIONE_ID
     */
    public void setSPEDIZIONE_ID(long SPEDIZIONE_ID) {
        this.SPEDIZIONE_ID = SPEDIZIONE_ID;
    }


    /**
     * Gets the VERSIONE value for this GetidspedizionebyrmaResult.
     * 
     * @return VERSIONE
     */
    public int getVERSIONE() {
        return VERSIONE;
    }


    /**
     * Sets the VERSIONE value for this GetidspedizionebyrmaResult.
     * 
     * @param VERSIONE
     */
    public void setVERSIONE(int VERSIONE) {
        this.VERSIONE = VERSIONE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetidspedizionebyrmaResult)) return false;
        GetidspedizionebyrmaResult other = (GetidspedizionebyrmaResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ESITO == other.getESITO() &&
            this.SPEDIZIONE_ID == other.getSPEDIZIONE_ID() &&
            this.VERSIONE == other.getVERSIONE();
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
        _hashCode += getESITO();
        _hashCode += new Long(getSPEDIZIONE_ID()).hashCode();
        _hashCode += getVERSIONE();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetidspedizionebyrmaResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://getidspedizionebyrma.wsbeans.iseries/", "getidspedizionebyrmaResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESITO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESITO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPEDIZIONE_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SPEDIZIONE_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSIONE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VERSIONE"));
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
