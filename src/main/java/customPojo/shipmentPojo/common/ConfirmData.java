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
