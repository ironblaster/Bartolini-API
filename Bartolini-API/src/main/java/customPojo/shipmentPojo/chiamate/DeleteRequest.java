package customPojo.shipmentPojo.chiamate;

import java.io.Serializable;

import customPojo.shipmentPojo.common.Account;
import customPojo.shipmentPojo.common.DeleteData;

public class DeleteRequest implements Serializable{
	
	Account account;
	
	DeleteData deleteData;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public DeleteData getDeleteData() {
		return deleteData;
	}

	public void setDeleteData(DeleteData deleteData) {
		this.deleteData = deleteData;
	}

	@Override
	public String toString() {
		return "DeleteRequest [account=" + account + ", deleteData=" + deleteData + "]";
	}
	
	
	
	
	

}
