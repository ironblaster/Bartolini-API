package customPojo.shipmentPojo.common;

import java.io.Serializable;
import jakarta.validation.constraints.Positive;

public class ConfirmData implements Serializable {
	
	@Positive
	long senderCustomerCode;
	
	@Positive
	long numericSenderReference;
	
	String alphanumericSenderReference;

	public long getSenderCustomerCode() {
		return senderCustomerCode;
	}

	public void setSenderCustomerCode(long senderCustomerCode) {
		this.senderCustomerCode = senderCustomerCode;
	}

	public long getNumericSenderReference() {
		return numericSenderReference;
	}

	public void setNumericSenderReference(long numericSenderReference) {
		this.numericSenderReference = numericSenderReference;
	}

	
	
	public String getAlphanumericSenderReference() {
		return alphanumericSenderReference;
	}

	
	public void setAlphanumericSenderReference(String alphanumericSenderReference) {
		this.alphanumericSenderReference = alphanumericSenderReference;
	}
	
	
	
	@Override
	public String toString() {
		
		return "ConfirmData [senderCustomerCode=" + senderCustomerCode + ", numericSenderReference="
				+ numericSenderReference + ", alphanumericSenderReference=" + alphanumericSenderReference + "]";
	}
	
	
	
	
	

}
