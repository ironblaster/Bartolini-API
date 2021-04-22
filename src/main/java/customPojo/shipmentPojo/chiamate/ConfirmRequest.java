package customPojo.shipmentPojo.chiamate;

import java.io.Serializable;

import customPojo.shipmentPojo.common.Account;
import customPojo.shipmentPojo.common.ConfirmData;
import customPojo.shipmentPojo.common.CreateData;

public class ConfirmRequest implements Serializable{
	
	Account account;
	
	ConfirmData confirmData;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ConfirmData getConfirmData() {
		return confirmData;
	}

	public void setConfirmData(ConfirmData confirmData) {
		this.confirmData = confirmData;
	}

	@Override
	public String toString() {
		return "ConfirmRequest [account=" + account + ", confirmData=" + confirmData + "]";
	}
	
	
	
	
	
	
	

}
