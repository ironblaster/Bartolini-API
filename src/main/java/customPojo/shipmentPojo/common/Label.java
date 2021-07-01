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
import java.util.Base64;

public class Label implements Serializable{
	
	int dataLength;
	
	String parcelID;
	
	String stream;

	public int getDataLength() {
		return dataLength;
	}

	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}

	public String getParcelID() {
		return parcelID;
	}

	public void setParcelID(String parcelID) {
		this.parcelID = parcelID;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	public byte[] getStreamToByteArray() {
		return Base64.getDecoder().decode(getStream());
	}
	
	public String getStreamParsedToString() {
		return new String(getStreamToByteArray());
	}

	@Override
	public String toString() {
		return "Label [dataLength=" + dataLength + ", parcelID=" + parcelID + ", stream=" + stream + "]";
	}
	
	

	
	
	
	
}
