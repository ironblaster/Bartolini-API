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
package it.bartolini.easysped.ws;

public class EasySpedDEWSProxy implements it.bartolini.easysped.ws.EasySpedDEWS {
  private String _endpoint = null;
  private it.bartolini.easysped.ws.EasySpedDEWS easySpedDEWS = null;
  
  public EasySpedDEWSProxy() {
    _initEasySpedDEWSProxy();
  }
  
  public EasySpedDEWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initEasySpedDEWSProxy();
  }
  
  private void _initEasySpedDEWSProxy() {
    try {
      easySpedDEWS = (new org.tempuri.EasySpedWSServiceImplLocator()).geteasyspedde_endpoint();
      if (easySpedDEWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)easySpedDEWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)easySpedDEWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (easySpedDEWS != null)
      ((javax.xml.rpc.Stub)easySpedDEWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public it.bartolini.easysped.ws.EasySpedDEWS getEasySpedDEWS() {
    if (easySpedDEWS == null)
      _initEasySpedDEWSProxy();
    return easySpedDEWS;
  }
  
  public org.datacontract.schemas._2004._07.Bartolini_EasySped_DAL.DestinationAddressOut calculateBRTSort(org.datacontract.schemas._2004._07.Bartolini_EasySped_DAL.DestinationAddress address) throws java.rmi.RemoteException{
    if (easySpedDEWS == null)
      _initEasySpedDEWSProxy();
    return easySpedDEWS.calculateBRTSort(address);
  }
  
  public java.lang.String getLabelForZebraPrinter(org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrint[] labels, java.lang.Integer x, java.lang.Integer y) throws java.rmi.RemoteException{
    if (easySpedDEWS == null)
      _initEasySpedDEWSProxy();
    return easySpedDEWS.getLabelForZebraPrinter(labels, x, y);
  }
  
  public byte[] getLabelPDF(org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.LabelToPrint[] labels, java.lang.Boolean dialogToPrint, java.lang.Integer fakeLabels, org.datacontract.schemas._2004._07.Bartolini_EasySped_Printlabel.PrinterManagerPDFLabelFormat pdfLabelFormat, java.lang.Float marginLeft, java.lang.Float marginRight, java.lang.Float marginTop, java.lang.Float marginBottom, java.lang.Boolean rotate180) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Bartolini_EasySped_ws.EasySpedFault{
    if (easySpedDEWS == null)
      _initEasySpedDEWSProxy();
    return easySpedDEWS.getLabelPDF(labels, dialogToPrint, fakeLabels, pdfLabelFormat, marginLeft, marginRight, marginTop, marginBottom, rotate180);
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (easySpedDEWS == null)
      _initEasySpedDEWSProxy();
    return easySpedDEWS.sayHello(name);
  }
  
  
}