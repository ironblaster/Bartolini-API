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
 * GetIdSpedizioneByIdColloLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package iseries.wsbeans.getidspedizionebyidcollo;

public class GetIdSpedizioneByIdColloLocator extends org.apache.axis.client.Service implements iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdCollo {

    public GetIdSpedizioneByIdColloLocator() {
    }


    public GetIdSpedizioneByIdColloLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetIdSpedizioneByIdColloLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetIdSpedizioneByIdColloServicesPort
    private java.lang.String GetIdSpedizioneByIdColloServicesPort_address = "http://wsr.brt.it:10041/web/GetIdSpedizioneByIdColloService/GetIdSpedizioneByIdCollo";

    public java.lang.String getGetIdSpedizioneByIdColloServicesPortAddress() {
        return GetIdSpedizioneByIdColloServicesPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetIdSpedizioneByIdColloServicesPortWSDDServiceName = "GetIdSpedizioneByIdColloServicesPort";

    public java.lang.String getGetIdSpedizioneByIdColloServicesPortWSDDServiceName() {
        return GetIdSpedizioneByIdColloServicesPortWSDDServiceName;
    }

    public void setGetIdSpedizioneByIdColloServicesPortWSDDServiceName(java.lang.String name) {
        GetIdSpedizioneByIdColloServicesPortWSDDServiceName = name;
    }

    public iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices getGetIdSpedizioneByIdColloServicesPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetIdSpedizioneByIdColloServicesPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetIdSpedizioneByIdColloServicesPort(endpoint);
    }

    public iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices getGetIdSpedizioneByIdColloServicesPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServicesPortBindingStub(portAddress, this);
            _stub.setPortName(getGetIdSpedizioneByIdColloServicesPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetIdSpedizioneByIdColloServicesPortEndpointAddress(java.lang.String address) {
        GetIdSpedizioneByIdColloServicesPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices.class.isAssignableFrom(serviceEndpointInterface)) {
                iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServicesPortBindingStub _stub = new iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServicesPortBindingStub(new java.net.URL(GetIdSpedizioneByIdColloServicesPort_address), this);
                _stub.setPortName(getGetIdSpedizioneByIdColloServicesPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetIdSpedizioneByIdColloServicesPort".equals(inputPortName)) {
            return getGetIdSpedizioneByIdColloServicesPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getidspedizionebyidcollo.wsbeans.iseries/", "GetIdSpedizioneByIdCollo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getidspedizionebyidcollo.wsbeans.iseries/", "GetIdSpedizioneByIdColloServicesPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetIdSpedizioneByIdColloServicesPort".equals(portName)) {
            setGetIdSpedizioneByIdColloServicesPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
