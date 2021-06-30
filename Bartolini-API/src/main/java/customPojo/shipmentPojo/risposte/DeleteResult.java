package customPojo.shipmentPojo.risposte;

import java.io.Serializable;

import customPojo.shipmentPojo.common.DeleteResponse;
import customPojo.shipmentPojo.common.ExecutionMessage;

public class DeleteResult implements Serializable{
	
	
	DeleteResponse deleteResponse;

	public DeleteResponse getDeleteResponse() {
		return deleteResponse;
	}

	public void setDeleteResponse(DeleteResponse deleteResponse) {
		this.deleteResponse = deleteResponse;
	}

	@Override
	public String toString() {
		return "DeleteResult [deleteResponse=" + deleteResponse + "]";
	}
	
	
	
	
	
	

}
