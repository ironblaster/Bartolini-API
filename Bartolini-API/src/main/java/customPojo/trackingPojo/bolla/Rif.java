package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Rif implements Serializable{

	String riferimentoMittenteAlfabetico;
	long riferimentoMittenteNumerico;
	String riferimentoPartnerEstero;
	
	
	
	public String getRiferimentoMittenteAlfabetico() {
		return riferimentoMittenteAlfabetico;
	}
	public void setRiferimentoMittenteAlfabetico(String riferimentoMittenteAlfabetico) {
		this.riferimentoMittenteAlfabetico = riferimentoMittenteAlfabetico;
	}
	public long getRiferimentoMittenteNumerico() {
		return riferimentoMittenteNumerico;
	}
	public void setRiferimentoMittenteNumerico(long riferimentoMittenteNumerico) {
		this.riferimentoMittenteNumerico = riferimentoMittenteNumerico;
	}
	public String getRiferimentoPartnerEstero() {
		return riferimentoPartnerEstero;
	}
	public void setRiferimentoPartnerEstero(String riferimentoPartnerEstero) {
		this.riferimentoPartnerEstero = riferimentoPartnerEstero;
	}
	
	
	
	
}
