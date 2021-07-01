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

public class Dest implements Serializable{
	
	String cap;
	String indirizzo;
	String localita;
	String ragioneSociale;
	String referenteConsegna;
	String siglaNazione;
	String siglaProvincia;
	String telefonoReferente;
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getLocalita() {
		return localita;
	}
	public void setLocalita(String localita) {
		this.localita = localita;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public String getReferenteConsegna() {
		return referenteConsegna;
	}
	public void setReferenteConsegna(String referenteConsegna) {
		this.referenteConsegna = referenteConsegna;
	}
	public String getSiglaNazione() {
		return siglaNazione;
	}
	public void setSiglaNazione(String siglaNazione) {
		this.siglaNazione = siglaNazione;
	}
	public String getSiglaProvincia() {
		return siglaProvincia;
	}
	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}
	public String getTelefonoReferente() {
		return telefonoReferente;
	}
	public void setTelefonoReferente(String telefonoReferente) {
		this.telefonoReferente = telefonoReferente;
	}
	
	

}
