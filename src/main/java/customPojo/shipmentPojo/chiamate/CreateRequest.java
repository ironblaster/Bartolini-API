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
