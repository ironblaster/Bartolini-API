package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Merc implements Serializable{
	
	int colli;
	String naturaMerce;
	float pesoKG;
	float volumeM3;
	
	
	public int getColli() {
		return colli;
	}
	public void setColli(int colli) {
		this.colli = colli;
	}
	public String getNaturaMerce() {
		return naturaMerce;
	}
	public void setNaturaMerce(String naturaMerce) {
		this.naturaMerce = naturaMerce;
	}
	public float getPesoKG() {
		return pesoKG;
	}
	public void setPesoKG(float pesoKG) {
		this.pesoKG = pesoKG;
	}
	public float getVolumeM3() {
		return volumeM3;
	}
	public void setVolumeM3(float volumeM3) {
		this.volumeM3 = volumeM3;
	}
	
	

}
