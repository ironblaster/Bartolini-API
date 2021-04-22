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
