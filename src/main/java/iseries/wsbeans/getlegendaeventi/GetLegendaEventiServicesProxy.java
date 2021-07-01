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
package iseries.wsbeans.getlegendaeventi;

public class GetLegendaEventiServicesProxy implements iseries.wsbeans.getlegendaeventi.GetLegendaEventiServices {
  private String _endpoint = null;
  private iseries.wsbeans.getlegendaeventi.GetLegendaEventiServices getLegendaEventiServices = null;
  
  public GetLegendaEventiServicesProxy() {
    _initGetLegendaEventiServicesProxy();
  }
  
  public GetLegendaEventiServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetLegendaEventiServicesProxy();
  }
  
  private void _initGetLegendaEventiServicesProxy() {
    try {
      getLegendaEventiServices = (new iseries.wsbeans.getlegendaeventi.GetLegendaEventiLocator()).getGetLegendaEventiServicesPort();
      if (getLegendaEventiServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getLegendaEventiServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getLegendaEventiServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getLegendaEventiServices != null)
      ((javax.xml.rpc.Stub)getLegendaEventiServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.getlegendaeventi.GetLegendaEventiServices getGetLegendaEventiServices() {
    if (getLegendaEventiServices == null)
      _initGetLegendaEventiServicesProxy();
    return getLegendaEventiServices;
  }
  
  public iseries.wsbeans.getlegendaeventi.GetlegendaeventiResult getlegendaeventi(iseries.wsbeans.getlegendaeventi.GetlegendaeventiInput arg0) throws java.rmi.RemoteException{
    if (getLegendaEventiServices == null)
      _initGetLegendaEventiServicesProxy();
    return getLegendaEventiServices.getlegendaeventi(arg0);
  }
  
  
}