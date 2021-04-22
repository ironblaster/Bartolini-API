package customPojo.trackingPojo.bolla;

import java.io.Serializable;

public class Bolla implements Serializable{
	
	Assic assicurazione= new Assic();
	Contra contrassegno=new Contra();
	DatiCons datiConsegna=new DatiCons();
	DatiSped datiSpedizione= new DatiSped();
	Dest destinatario= new Dest();
	Merc merce=new Merc();
	Mitt mittente= new Mitt();
	Rif riferimenti= new Rif();
	
	
	public Assic getAssicurazione() {
		return assicurazione;
	}
	public void setAssicurazione(Assic assicurazione) {
		this.assicurazione = assicurazione;
	}
	public Contra getContrassegno() {
		return contrassegno;
	}
	public void setContrassegno(Contra contrassegno) {
		this.contrassegno = contrassegno;
	}
	public DatiCons getDatiConsegna() {
		return datiConsegna;
	}
	public void setDatiConsegna(DatiCons datiConsegna) {
		this.datiConsegna = datiConsegna;
	}
	public DatiSped getDatiSpedizione() {
		return datiSpedizione;
	}
	public void setDatiSpedizione(DatiSped datiSpedizione) {
		this.datiSpedizione = datiSpedizione;
	}
	public Dest getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Dest destinatario) {
		this.destinatario = destinatario;
	}
	public Merc getMerce() {
		return merce;
	}
	public void setMerce(Merc merce) {
		this.merce = merce;
	}
	public Mitt getMittente() {
		return mittente;
	}
	public void setMittente(Mitt mittente) {
		this.mittente = mittente;
	}
	public Rif getRiferimenti() {
		return riferimenti;
	}
	public void setRiferimenti(Rif riferimenti) {
		this.riferimenti = riferimenti;
	}
	
	
}
