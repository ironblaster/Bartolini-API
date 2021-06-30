package customPojo.shipmentPojo.common;

import java.io.Serializable;

public class DeleteResponse implements Serializable{
	
	String currentTimeUTC;
	
	ExecutionMessage executionMessage;

	public String getCurrentTimeUTC() {
		return currentTimeUTC;
	}

	public void setCurrentTimeUTC(String currentTimeUTC) {
		this.currentTimeUTC = currentTimeUTC;
	}

	public ExecutionMessage getExecutionMessage() {
		return executionMessage;
	}

	public void setExecutionMessage(ExecutionMessage executionMessage) {
		this.executionMessage = executionMessage;
	}

	@Override
	public String toString() {
		return "DeleteResponse [currentTimeUTC=" + currentTimeUTC + ", executionMessage=" + executionMessage + "]";
	}
	
	
	
	

}
