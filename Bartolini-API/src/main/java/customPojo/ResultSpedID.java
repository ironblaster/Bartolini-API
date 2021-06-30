package customPojo;

import java.io.Serializable;

public class ResultSpedID implements Serializable{
	
	int esito;
	long IDspedizione;
	int Versione;
	public int getEsito() {
		return esito;
	}
	public void setEsito(int esito) {
		this.esito = esito;
	}
	public long getIDspedizione() {
		return IDspedizione;
	}
	public void setIDspedizione(long iDspedizione) {
		IDspedizione = iDspedizione;
	}
	public int getVersione() {
		return Versione;
	}
	public void setVersione(int versione) {
		Versione = versione;
	}
	
	
	

}
