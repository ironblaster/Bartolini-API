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
