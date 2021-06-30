package customPojo.shipmentPojo.common;

import java.io.Serializable;

public class CreateResponse implements Serializable{
	
	
	String currentTimeUTC;
	
	ExecutionMessage executionMessage;
	
	String arrivalTerminal;
	
	String arrivalDepot;
	
	String deliveryZone;
	
	String parcelNumberFrom;
	
	String parcelNumberTo;
	
	double departureDepot;
	
	double seriesNumber;
	
	String serviceType;
	
	String consigneeCompanyName;
	
	String consigneeZIPCode;
	
	String consigneeCity;
	
	String consigneeProvinceAbbreviation;
	
	String consigneeCountryAbbreviationBRT;
	
	double numberOfParcels;
	
	double weightKG;
	
	double volumeM3;
	
	String alphanumericSenderReference;
	
	String senderCompanyName;
	
	String senderProvinceAbbreviation;
	
	
	Labels labels;
	
	
	String pudoId;


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


	public String getArrivalTerminal() {
		return arrivalTerminal;
	}


	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}


	public String getArrivalDepot() {
		return arrivalDepot;
	}


	public void setArrivalDepot(String arrivalDepot) {
		this.arrivalDepot = arrivalDepot;
	}


	public String getDeliveryZone() {
		return deliveryZone;
	}


	public void setDeliveryZone(String deliveryZone) {
		this.deliveryZone = deliveryZone;
	}


	public String getParcelNumberFrom() {
		return parcelNumberFrom;
	}


	public void setParcelNumberFrom(String parcelNumberFrom) {
		this.parcelNumberFrom = parcelNumberFrom;
	}


	public String getParcelNumberTo() {
		return parcelNumberTo;
	}


	public void setParcelNumberTo(String parcelNumberTo) {
		this.parcelNumberTo = parcelNumberTo;
	}


	public double getDepartureDepot() {
		return departureDepot;
	}


	public void setDepartureDepot(double departureDepot) {
		this.departureDepot = departureDepot;
	}


	public double getSeriesNumber() {
		return seriesNumber;
	}


	public void setSeriesNumber(double seriesNumber) {
		this.seriesNumber = seriesNumber;
	}


	public String getServiceType() {
		return serviceType;
	}


	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public String getConsigneeCompanyName() {
		return consigneeCompanyName;
	}


	public void setConsigneeCompanyName(String consigneeCompanyName) {
		this.consigneeCompanyName = consigneeCompanyName;
	}


	public String getConsigneeZIPCode() {
		return consigneeZIPCode;
	}


	public void setConsigneeZIPCode(String consigneeZIPCode) {
		this.consigneeZIPCode = consigneeZIPCode;
	}


	public String getConsigneeCity() {
		return consigneeCity;
	}


	public void setConsigneeCity(String consigneeCity) {
		this.consigneeCity = consigneeCity;
	}


	public String getConsigneeProvinceAbbreviation() {
		return consigneeProvinceAbbreviation;
	}


	public void setConsigneeProvinceAbbreviation(String consigneeProvinceAbbreviation) {
		this.consigneeProvinceAbbreviation = consigneeProvinceAbbreviation;
	}


	public String getConsigneeCountryAbbreviationBRT() {
		return consigneeCountryAbbreviationBRT;
	}


	public void setConsigneeCountryAbbreviationBRT(String consigneeCountryAbbreviationBRT) {
		this.consigneeCountryAbbreviationBRT = consigneeCountryAbbreviationBRT;
	}


	public double getNumberOfParcels() {
		return numberOfParcels;
	}


	public void setNumberOfParcels(double numberOfParcels) {
		this.numberOfParcels = numberOfParcels;
	}


	public double getWeightKG() {
		return weightKG;
	}


	public void setWeightKG(double weightKG) {
		this.weightKG = weightKG;
	}


	public double getVolumeM3() {
		return volumeM3;
	}


	public void setVolumeM3(double volumeM3) {
		this.volumeM3 = volumeM3;
	}


	public String getAlphanumericSenderReference() {
		return alphanumericSenderReference;
	}


	public void setAlphanumericSenderReference(String alphanumericSenderReference) {
		this.alphanumericSenderReference = alphanumericSenderReference;
	}


	public String getSenderCompanyName() {
		return senderCompanyName;
	}


	public void setSenderCompanyName(String senderCompanyName) {
		this.senderCompanyName = senderCompanyName;
	}


	public String getSenderProvinceAbbreviation() {
		return senderProvinceAbbreviation;
	}


	public void setSenderProvinceAbbreviation(String senderProvinceAbbreviation) {
		this.senderProvinceAbbreviation = senderProvinceAbbreviation;
	}


	public Labels getLabels() {
		return labels;
	}


	public void setLabels(Labels labels) {
		this.labels = labels;
	}


	public String getPudoId() {
		return pudoId;
	}


	public void setPudoId(String pudoId) {
		this.pudoId = pudoId;
	}


	@Override
	public String toString() {
		return "CreateResponse [currentTimeUTC=" + currentTimeUTC + ", executionMessage=" + executionMessage
				+ ", arrivalTerminal=" + arrivalTerminal + ", arrivalDepot=" + arrivalDepot + ", deliveryZone="
				+ deliveryZone + ", parcelNumberFrom=" + parcelNumberFrom + ", parcelNumberTo=" + parcelNumberTo
				+ ", departureDepot=" + departureDepot + ", seriesNumber=" + seriesNumber + ", serviceType="
				+ serviceType + ", consigneeCompanyName=" + consigneeCompanyName + ", consigneeZIPCode="
				+ consigneeZIPCode + ", consigneeCity=" + consigneeCity + ", consigneeProvinceAbbreviation="
				+ consigneeProvinceAbbreviation + ", consigneeCountryAbbreviationBRT=" + consigneeCountryAbbreviationBRT
				+ ", numberOfParcels=" + numberOfParcels + ", weightKG=" + weightKG + ", volumeM3=" + volumeM3
				+ ", alphanumericSenderReference=" + alphanumericSenderReference + ", senderCompanyName="
				+ senderCompanyName + ", senderProvinceAbbreviation=" + senderProvinceAbbreviation + ", labels="
				+ labels + ", pudoId=" + pudoId + "]";
	}
	
	
	
	
	

}
