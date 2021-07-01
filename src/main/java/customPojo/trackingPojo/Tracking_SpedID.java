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
package customPojo.trackingPojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import customPojo.trackingPojo.bolla.Bolla;

public class Tracking_SpedID implements Serializable {

	int contatore_eventi;
	int contatore_note;
	int esito;
	String risposta_timestamp;
	int versione;
	Collection<String> note=new ArrayList<String>();
	Collection<Tracking_Event> eventi = new ArrayList<Tracking_Event>();
	Bolla bolla = new Bolla();
	
	
	
	

	public Bolla getBolla() {
		return bolla;
	}
	public void setBolla(Bolla bolla) {
		this.bolla = bolla;
	}
	public int getContatore_eventi() {
		return contatore_eventi;
	}
	public void setContatore_eventi(int contatore_eventi) {
		this.contatore_eventi = contatore_eventi;
	}
	public int getContatore_note() {
		return contatore_note;
	}
	public void setContatore_note(int contatore_note) {
		this.contatore_note = contatore_note;
	}
	public int getEsito() {
		return esito;
	}
	public void setEsito(int esito) {
		this.esito = esito;
	}
	public String getRisposta_timestamp() {
		return risposta_timestamp;
	}
	public void setRisposta_timestamp(String risposta_timestamp) {
		this.risposta_timestamp = risposta_timestamp;
	}
	public int getVersione() {
		return versione;
	}
	public void setVersione(int versione) {
		this.versione = versione;
	}
	public Collection<String> getNote() {
		return note;
	}
	public void setNote(Collection<String> note) {
		this.note = note;
	}
	public Collection<Tracking_Event> getEventi() {
		return eventi;
	}
	public void setEventi(Collection<Tracking_Event> eventi) {
		this.eventi = eventi;
	}

	
}
