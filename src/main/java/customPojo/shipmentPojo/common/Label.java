package customPojo.shipmentPojo.common;

import java.io.Serializable;

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

	@Override
	public String toString() {
		return "Label [dataLength=" + dataLength + ", parcelID=" + parcelID + ", stream=" + stream + "]";
	}
	
	

	
	
	
	
}
