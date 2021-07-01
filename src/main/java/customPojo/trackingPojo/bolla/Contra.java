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
package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Contra implements Serializable{
	
	String contrassegnoDivisa;
	double contrassegnoImporto;
	String contrassegnoIncasso;
	String contrassegnoParticolarita;
	public String getContrassegnoDivisa() {
		return contrassegnoDivisa;
	}
	public void setContrassegnoDivisa(String contrassegnoDivisa) {
		this.contrassegnoDivisa = contrassegnoDivisa;
	}
	public double getContrassegnoImporto() {
		return contrassegnoImporto;
	}
	public void setContrassegnoImporto(double contrassegnoImporto) {
		this.contrassegnoImporto = contrassegnoImporto;
	}
	public String getContrassegnoIncasso() {
		return contrassegnoIncasso;
	}
	public void setContrassegnoIncasso(String contrassegnoIncasso) {
		this.contrassegnoIncasso = contrassegnoIncasso;
	}
	public String getContrassegnoParticolarita() {
		return contrassegnoParticolarita;
	}
	public void setContrassegnoParticolarita(String contrassegnoParticolarita) {
		this.contrassegnoParticolarita = contrassegnoParticolarita;
	}
	
	
	
}
