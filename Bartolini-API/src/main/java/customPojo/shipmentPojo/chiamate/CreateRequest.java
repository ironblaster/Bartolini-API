package customPojo.shipmentPojo.chiamate;

import java.io.Serializable;

import customPojo.shipmentPojo.common.Account;
import customPojo.shipmentPojo.common.CreateData;
import customPojo.shipmentPojo.common.LabelParameters;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 * Chiamata bartolini per creare una spedizione
 * Risponde con una createResult.
 * Il servizio esegue le seguenti operazioni:

	Calcolo instradamento.       
	Stampa l'etichetta segnacolli nel formato richiesto(opzionale)       
	Creazione spedizione   
 * 
 * @author ironblaster
 *
 */
public class CreateRequest implements Serializable{
	
	
	Account account;
	
	CreateData createData;
	
	@NotEmpty
	@Size(max = 1)
	String isLabelRequired;
	
	
	LabelParameters labelParameters;

	
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public CreateData getCreateData() {
		return createData;
	}

	public void setCreateData(CreateData createData) {
		this.createData = createData;
	}

	public String getIsLabelRequired() {
		return isLabelRequired;
	}

	public void setIsLabelRequired(String isLabelRequired) {
		this.isLabelRequired = isLabelRequired;
	}

	public LabelParameters getLabelParameters() {
		return labelParameters;
	}

	public void setLabelParameters(LabelParameters labelParameters) {
		this.labelParameters = labelParameters;
	}

	@Override
	public String toString() {
		return "BrtCreate [account=" + account + ", createData=" + createData + ", isLabelRequired=" + isLabelRequired
				+ ", labelParameters=" + labelParameters + "]";
	}
	
	
	

	
	

}
