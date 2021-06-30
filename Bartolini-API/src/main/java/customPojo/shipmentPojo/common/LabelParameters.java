package customPojo.shipmentPojo.common;

import java.io.Serializable;

import jakarta.validation.constraints.Size;

public class LabelParameters implements Serializable{
	
	@Size(max = 3)
	String outputType;
	
	String offsetX;
	
	String offsetY;
	
	@Size(max = 1)
	String isBorderRequired;
	
	@Size(max = 1)
	String isLogoRequired;
	
	@Size(max = 1)
	String isBarcodeControlRowRequired;

	
	@Override
	public String toString() {
		return String.format("labelParameters [outputType=%s, offsetX=%s, offsetY=%s, isBorderRequired=%s,isLogoRequired=%s,isBarcodeControlRowRequired=%s]",
				outputType, offsetX, offsetY, isBorderRequired,isLogoRequired,isBarcodeControlRowRequired);
	}
	
	
	
	public String getOutputType() {
		return outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
	}

	public String getOffsetX() {
		return offsetX;
	}

	public void setOffsetX(String offsetX) {
		this.offsetX = offsetX;
	}

	public String getOffsetY() {
		return offsetY;
	}

	public void setOffsetY(String offsetY) {
		this.offsetY = offsetY;
	}

	public String getIsBorderRequired() {
		return isBorderRequired;
	}

	public void setIsBorderRequired(String isBorderRequired) {
		this.isBorderRequired = isBorderRequired;
	}

	public String getIsLogoRequired() {
		return isLogoRequired;
	}

	public void setIsLogoRequired(String isLogoRequired) {
		this.isLogoRequired = isLogoRequired;
	}

	public String getIsBarcodeControlRowRequired() {
		return isBarcodeControlRowRequired;
	}

	public void setIsBarcodeControlRowRequired(String isBarcodeControlRowRequired) {
		this.isBarcodeControlRowRequired = isBarcodeControlRowRequired;
	}
	

	

}
