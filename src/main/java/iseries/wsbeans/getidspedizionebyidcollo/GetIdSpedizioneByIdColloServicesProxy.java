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
package iseries.wsbeans.getidspedizionebyidcollo;

public class GetIdSpedizioneByIdColloServicesProxy implements iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices {
  private String _endpoint = null;
  private iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices getIdSpedizioneByIdColloServices = null;
  
  public GetIdSpedizioneByIdColloServicesProxy() {
    _initGetIdSpedizioneByIdColloServicesProxy();
  }
  
  public GetIdSpedizioneByIdColloServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetIdSpedizioneByIdColloServicesProxy();
  }
  
  private void _initGetIdSpedizioneByIdColloServicesProxy() {
    try {
      getIdSpedizioneByIdColloServices = (new iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloLocator()).getGetIdSpedizioneByIdColloServicesPort();
      if (getIdSpedizioneByIdColloServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getIdSpedizioneByIdColloServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getIdSpedizioneByIdColloServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getIdSpedizioneByIdColloServices != null)
      ((javax.xml.rpc.Stub)getIdSpedizioneByIdColloServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public iseries.wsbeans.getidspedizionebyidcollo.GetIdSpedizioneByIdColloServices getGetIdSpedizioneByIdColloServices() {
    if (getIdSpedizioneByIdColloServices == null)
      _initGetIdSpedizioneByIdColloServicesProxy();
    return getIdSpedizioneByIdColloServices;
  }
  
  public iseries.wsbeans.getidspedizionebyidcollo.GetidspedizionebyidcolloResult getidspedizionebyidcollo(iseries.wsbeans.getidspedizionebyidcollo.GetidspedizionebyidcolloInput arg0) throws java.rmi.RemoteException{
    if (getIdSpedizioneByIdColloServices == null)
      _initGetIdSpedizioneByIdColloServicesProxy();
    return getIdSpedizioneByIdColloServices.getidspedizionebyidcollo(arg0);
  }
  
  
}