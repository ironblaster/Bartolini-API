package customPojo.shipmentPojo.risposte;

import customPojo.shipmentPojo.common.CreateResponse;

public class CreateResult {
	
	
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
