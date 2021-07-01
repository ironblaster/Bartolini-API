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
package iseries.wsbeans.getlegendaesiti;

public class GetLegendaEsitiServicesProxy implements iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices {
  private String _endpoint = null;
  private iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices getLegendaEsitiServices = null;
  
  public GetLegendaEsitiServicesProxy() {
    _initGetLegendaEsitiServicesProxy();
  }
  
  public GetLegendaEsitiServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetLegendaEsitiServicesProxy();
  }
  
  private void _initGetLegendaEsitiServicesProxy() {
    try {
      getLegendaEsitiServices = (new iseries.wsbeans.getlegendaesiti.GetLegendaEsitiLocator()).getGetLegendaEsitiServicesPort();
      if (getLegendaEsitiServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getLegendaEsitiServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getLegendaEsitiServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getLegendaEsitiServices != null)
      ((javax.xml.rpc.Stub)getLegendaEsitiServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.getlegendaesiti.GetLegendaEsitiServices getGetLegendaEsitiServices() {
    if (getLegendaEsitiServices == null)
      _initGetLegendaEsitiServicesProxy();
    return getLegendaEsitiServices;
  }
  
  public iseries.wsbeans.getlegendaesiti.GetlegendaesitiResult getlegendaesiti(iseries.wsbeans.getlegendaesiti.GetlegendaesitiInput arg0) throws java.rmi.RemoteException{
    if (getLegendaEsitiServices == null)
      _initGetLegendaEsitiServicesProxy();
    return getLegendaEsitiServices.getlegendaesiti(arg0);
  }
  
  
}