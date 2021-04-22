package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Assic implements Serializable{

	String assicurazioneDivisa;
	double ImportoAssicurazione;
	public String getAssicurazioneDivisa() {
		return assicurazioneDivisa;
	}
	public void setAssicurazioneDivisa(String assicurazioneDivisa) {
		this.assicurazioneDivisa = assicurazioneDivisa;
	}
	public double getImportoAssicurazione() {
		return ImportoAssicurazione;
	}
	public void setImportoAssicurazione(double importoAssicurazione) {
		ImportoAssicurazione = importoAssicurazione;
	}
	
	
}
