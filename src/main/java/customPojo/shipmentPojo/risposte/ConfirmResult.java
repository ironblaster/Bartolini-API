package customPojo.shipmentPojo.risposte;

import java.io.Serializable;

import customPojo.shipmentPojo.common.ConfirmResponse;

public class ConfirmResult implements Serializable{
	
	ConfirmResponse confirmResponse;

	public ConfirmResponse getConfirmResponse() {
		return confirmResponse;
	}

	public void setConfirmResponse(ConfirmResponse confirmResponse) {
		this.confirmResponse = confirmResponse;
	}

	@Override
	public String toString() {
		return "ConfirmResult [confirmResponse=" + confirmResponse + "]";
	}
	
	
	

}
