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
package customPojo.shipmentPojo.parsing;

public enum ServiceType {
	
		ServizioStandard("","Servizio Standard"),

		ServizioPriority("E","Servizio Priority"),

		ServizioMattina ("H","Servizio 10:30");
	
	
		private String toString;
		private String code;
		
		private ServiceType(String code,String significato) {
			this.toString=significato;
			this.code=code;
		}
		@Override
		public String toString() {
			return toString;
		}
		
		public String getCode() {
			return code;
		}
		
		
		
		public static ServiceType getService(String code) {
			if(code.isEmpty())
				return ServiceType.ServizioStandard;
			for (ServiceType c : ServiceType.values()) 
				if(c.getCode().equals(code))
					return c;
			
			return ServiceType.ServizioStandard;
			
		}
		
	

}
