package customPojo.shipmentPojo.risposte;

import java.io.Serializable;

import customPojo.shipmentPojo.common.CreateResponse;

public class CreateResult implements Serializable{
	
	
	CreateResponse createResponse;

	public CreateResponse getCreateResponse() {
		return createResponse;
	}

	public void setCreateResponse(CreateResponse createResponse) {
		this.createResponse = createResponse;
	}

	@Override
	public String toString() {
		return "CreateResult [createResponse=" + createResponse + "]";
	}
	
	
	
	

}
