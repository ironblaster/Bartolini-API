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
