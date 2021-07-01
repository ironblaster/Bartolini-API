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

import javax.validation.constraints.Max;

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
