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
package iseries.wsbeans.getidspedizionebyrma;

public class GetIdSpedizioneByRMAServicesProxy implements iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices {
  private String _endpoint = null;
  private iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices getIdSpedizioneByRMAServices = null;
  
  public GetIdSpedizioneByRMAServicesProxy() {
    _initGetIdSpedizioneByRMAServicesProxy();
  }
  
  public GetIdSpedizioneByRMAServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetIdSpedizioneByRMAServicesProxy();
  }
  
  private void _initGetIdSpedizioneByRMAServicesProxy() {
    try {
      getIdSpedizioneByRMAServices = (new iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMALocator()).getGetIdSpedizioneByRMAServicesPort();
      if (getIdSpedizioneByRMAServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getIdSpedizioneByRMAServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getIdSpedizioneByRMAServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getIdSpedizioneByRMAServices != null)
      ((javax.xml.rpc.Stub)getIdSpedizioneByRMAServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.getidspedizionebyrma.GetIdSpedizioneByRMAServices getGetIdSpedizioneByRMAServices() {
    if (getIdSpedizioneByRMAServices == null)
      _initGetIdSpedizioneByRMAServicesProxy();
    return getIdSpedizioneByRMAServices;
  }
  
  public iseries.wsbeans.getidspedizionebyrma.GetidspedizionebyrmaResult getidspedizionebyrma(iseries.wsbeans.getidspedizionebyrma.GetidspedizionebyrmaInput arg0) throws java.rmi.RemoteException{
    if (getIdSpedizioneByRMAServices == null)
      _initGetIdSpedizioneByRMAServicesProxy();
    return getIdSpedizioneByRMAServices.getidspedizionebyrma(arg0);
  }
  
  
}