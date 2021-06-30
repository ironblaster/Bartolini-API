package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Mitt implements Serializable{

	String cap;
	int codice;
	String indirizzo;
	String localita;
	String ragioneSociale;
	String siglaArea;
	
	
	
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
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
	public String getSiglaArea() {
		return siglaArea;
	}
	public void setSiglaArea(String siglaArea) {
		this.siglaArea = siglaArea;
	}
	
	
	
}
