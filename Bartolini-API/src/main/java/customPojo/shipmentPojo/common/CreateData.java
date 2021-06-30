package customPojo.shipmentPojo.common;

import java.io.Serializable;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class CreateData implements Serializable{

	@Size(max = 1)
	String network;
	
	@Positive
	@Max(value = 999)
	int departureDepot;
	
	@Positive
	@Max(value = 9999999)
	long senderCustomerCode;
	
	@Size(max = 3)
	@NotEmpty
	String deliveryFreightTypeCode;
	
	@NotEmpty
	@Size(max = 70)
	String consigneeCompanyName;
	
	@NotEmpty
	@Size(max = 35)
	String consigneeAddress;
	
	@NotEmpty
	@Size(max = 9)
	String consigneeZIPCode;
	
	@NotEmpty
	@Size(max = 35)
	String consigneeCity;
	
	@Size(max = 2)
	String consigneeProvinceAbbreviation;
	
	@NotEmpty
	@Size(max = 2)
	String consigneeCountryAbbreviationISOAlpha2;
	
	@Size(max = 3)
	String consigneeClosingShift1_DayOfTheWeek;
	
	@Size(max = 2)
	String consigneeClosingShift1_PeriodOfTheDay;
	
	@Size(max = 3)
	String consigneeClosingShift2_DayOfTheWeek;
	
	@Size(max = 2)
	String consigneeClosingShift2_PeriodOfTheDay;
	
	@Size(max = 35)
	String consigneeContactName;
	
	@Size(max = 16)
	String consigneeTelephone;
	
	@Email
	@Size(max = 70)
	String consigneeEMail;
	
	@Size(max = 16)
	String consigneeMobilePhoneNumber;
	
	@Size(max = 1)
	String isAlertRequired;
	
	@Size(max = 16)
	String consigneeVATNumber;
	
	@Size(max = 2)
	String consigneeVATNumberCountryISOAlpha2;
	
	@Size(max = 16)
	String consigneeItalianFiscalCode;
	
	@Size(max = 3)
	String pricingConditionCode;
	
	@Size(max = 1)
	String serviceType;
	
	@DecimalMax(value = "9999999.99")
	double insuranceAmount;
	
	@Size(max = 3)
	String insuranceAmountCurrency;
	
	@Size(max = 15)
	String senderParcelType;
	
	@Max(30)
	@Positive
	int numberOfParcels;
	
	@DecimalMax(value = "99999.9")
	@Positive
	double weightKG;
	
	@DecimalMax(value = "99.999")
	double volumeM3;
	
	@DecimalMax(value = "9999999.999")
	double quantityToBeInvoiced;
	
	@DecimalMax(value = "9999999.99")
	double cashOnDelivery;
	
	@Size(max = 1)
	@NotEmpty
	String isCODMandatory;
	
	@Size(max = 2)
	String codPaymentType;
	
	@Size(max = 3)
	String codCurrency;
	
	@Max(value = 999999999999999L)
	@Positive
	long numericSenderReference;
	
	@Size(max = 15)
	String alphanumericSenderReference;
	
	@Size(max = 70)
	String notes;
	
	@Size(max = 2)
	String parcelsHandlingCode;
	
	@Size(max = 10)
	String deliveryDateRequired;
	
	@Size(max = 1)
	String deliveryType;
	
	@DecimalMax(value = "9999999.99")
	double declaredParcelValue;
	
	@Size(max = 3)
	String declaredParcelValueCurrency;
	
	@Size(max = 2)
	String particularitiesDeliveryManagementCode;
	
	@Size(max = 2)
	String particularitiesHoldOnStockManagementCode;
	
	@Size(max = 2)
	String variousParticularitiesManagementCode;
	
	@Size(max = 1)
	String particularDelivery1;
	
	@Size(max = 1)
	String particularDelivery2;
	
	@Size(max = 4)
	String palletType1;
	
	@Max(99)
	int palletType1Number;
	
	@Size(max = 4)
	String palletType2;
	
	@Max(99)
	int palletType2Number;
	
	@Size(max = 25)
	String originalSenderCompanyName;
	
	@Size(max = 9)
	String originalSenderZIPCode;
	
	@Size(max = 2)
	String originalSenderCountryAbbreviationISOAlpha2;
	
	@Size(max = 35)
	String cmrCode;
	
	@Size(max = 70)
	String neighborNameMandatoryAuthorization;
	
	@Size(max = 15)
	String pinCodeMandatoryAuthorization;
	
	@Size(max = 33)
	String packingListPDFName;
	
	@Size(max = 1)
	String packingListPDFFlagPrint;
	
	@Size(max = 1)
	String packingListPDFFlagEmail;
	
	String pudoId;

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public int getDepartureDepot() {
		return departureDepot;
	}

	public void setDepartureDepot(int departureDepot) {
		this.departureDepot = departureDepot;
	}

	public long getSenderCustomerCode() {
		return senderCustomerCode;
	}

	public void setSenderCustomerCode(long senderCustomerCode) {
		this.senderCustomerCode = senderCustomerCode;
	}

	public String getDeliveryFreightTypeCode() {
		return deliveryFreightTypeCode;
	}

	public void setDeliveryFreightTypeCode(String deliveryFreightTypeCode) {
		this.deliveryFreightTypeCode = deliveryFreightTypeCode;
	}

	public String getConsigneeCompanyName() {
		return consigneeCompanyName;
	}

	public void setConsigneeCompanyName(String consigneeCompanyName) {
		this.consigneeCompanyName = consigneeCompanyName;
	}

	public String getConsigneeAddress() {
		return consigneeAddress;
	}

	public void setConsigneeAddress(String consigneeAddress) {
		this.consigneeAddress = consigneeAddress;
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

	public String getConsigneeCountryAbbreviationISOAlpha2() {
		return consigneeCountryAbbreviationISOAlpha2;
	}

	public void setConsigneeCountryAbbreviationISOAlpha2(String consigneeCountryAbbreviationISOAlpha2) {
		this.consigneeCountryAbbreviationISOAlpha2 = consigneeCountryAbbreviationISOAlpha2;
	}

	public String getConsigneeClosingShift1_DayOfTheWeek() {
		return consigneeClosingShift1_DayOfTheWeek;
	}

	public void setConsigneeClosingShift1_DayOfTheWeek(String consigneeClosingShift1_DayOfTheWeek) {
		this.consigneeClosingShift1_DayOfTheWeek = consigneeClosingShift1_DayOfTheWeek;
	}

	public String getConsigneeClosingShift1_PeriodOfTheDay() {
		return consigneeClosingShift1_PeriodOfTheDay;
	}

	public void setConsigneeClosingShift1_PeriodOfTheDay(String consigneeClosingShift1_PeriodOfTheDay) {
		this.consigneeClosingShift1_PeriodOfTheDay = consigneeClosingShift1_PeriodOfTheDay;
	}

	public String getConsigneeClosingShift2_DayOfTheWeek() {
		return consigneeClosingShift2_DayOfTheWeek;
	}

	public void setConsigneeClosingShift2_DayOfTheWeek(String consigneeClosingShift2_DayOfTheWeek) {
		this.consigneeClosingShift2_DayOfTheWeek = consigneeClosingShift2_DayOfTheWeek;
	}

	public String getConsigneeClosingShift2_PeriodOfTheDay() {
		return consigneeClosingShift2_PeriodOfTheDay;
	}

	public void setConsigneeClosingShift2_PeriodOfTheDay(String consigneeClosingShift2_PeriodOfTheDay) {
		this.consigneeClosingShift2_PeriodOfTheDay = consigneeClosingShift2_PeriodOfTheDay;
	}

	public String getConsigneeContactName() {
		return consigneeContactName;
	}

	public void setConsigneeContactName(String consigneeContactName) {
		this.consigneeContactName = consigneeContactName;
	}

	public String getConsigneeTelephone() {
		return consigneeTelephone;
	}

	public void setConsigneeTelephone(String consigneeTelephone) {
		this.consigneeTelephone = consigneeTelephone;
	}

	public String getConsigneeEMail() {
		return consigneeEMail;
	}

	public void setConsigneeEMail(String consigneeEMail) {
		this.consigneeEMail = consigneeEMail;
	}

	public String getConsigneeMobilePhoneNumber() {
		return consigneeMobilePhoneNumber;
	}

	public void setConsigneeMobilePhoneNumber(String consigneeMobilePhoneNumber) {
		this.consigneeMobilePhoneNumber = consigneeMobilePhoneNumber;
	}

	public String getIsAlertRequired() {
		return isAlertRequired;
	}

	public void setIsAlertRequired(String isAlertRequired) {
		this.isAlertRequired = isAlertRequired;
	}

	public String getConsigneeVATNumber() {
		return consigneeVATNumber;
	}

	public void setConsigneeVATNumber(String consigneeVATNumber) {
		this.consigneeVATNumber = consigneeVATNumber;
	}

	public String getConsigneeVATNumberCountryISOAlpha2() {
		return consigneeVATNumberCountryISOAlpha2;
	}

	public void setConsigneeVATNumberCountryISOAlpha2(String consigneeVATNumberCountryISOAlpha2) {
		this.consigneeVATNumberCountryISOAlpha2 = consigneeVATNumberCountryISOAlpha2;
	}

	public String getConsigneeItalianFiscalCode() {
		return consigneeItalianFiscalCode;
	}

	public void setConsigneeItalianFiscalCode(String consigneeItalianFiscalCode) {
		this.consigneeItalianFiscalCode = consigneeItalianFiscalCode;
	}

	public String getPricingConditionCode() {
		return pricingConditionCode;
	}

	public void setPricingConditionCode(String pricingConditionCode) {
		this.pricingConditionCode = pricingConditionCode;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}


	public String getInsuranceAmountCurrency() {
		return insuranceAmountCurrency;
	}

	public void setInsuranceAmountCurrency(String insuranceAmountCurrency) {
		this.insuranceAmountCurrency = insuranceAmountCurrency;
	}

	public String getSenderParcelType() {
		return senderParcelType;
	}

	public void setSenderParcelType(String senderParcelType) {
		this.senderParcelType = senderParcelType;
	}

	public int getNumberOfParcels() {
		return numberOfParcels;
	}

	public void setNumberOfParcels(int numberOfParcels) {
		this.numberOfParcels = numberOfParcels;
	}

	public String getIsCODMandatory() {
		return isCODMandatory;
	}

	public void setIsCODMandatory(String isCODMandatory) {
		this.isCODMandatory = isCODMandatory;
	}

	public String getCodPaymentType() {
		return codPaymentType;
	}

	public void setCodPaymentType(String codPaymentType) {
		this.codPaymentType = codPaymentType;
	}

	public String getCodCurrency() {
		return codCurrency;
	}

	public void setCodCurrency(String codCurrency) {
		this.codCurrency = codCurrency;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getParcelsHandlingCode() {
		return parcelsHandlingCode;
	}

	public void setParcelsHandlingCode(String parcelsHandlingCode) {
		this.parcelsHandlingCode = parcelsHandlingCode;
	}

	public String getDeliveryDateRequired() {
		return deliveryDateRequired;
	}

	public void setDeliveryDateRequired(String deliveryDateRequired) {
		this.deliveryDateRequired = deliveryDateRequired;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDeclaredParcelValueCurrency() {
		return declaredParcelValueCurrency;
	}

	public void setDeclaredParcelValueCurrency(String declaredParcelValueCurrency) {
		this.declaredParcelValueCurrency = declaredParcelValueCurrency;
	}

	public String getParticularitiesDeliveryManagementCode() {
		return particularitiesDeliveryManagementCode;
	}

	public void setParticularitiesDeliveryManagementCode(String particularitiesDeliveryManagementCode) {
		this.particularitiesDeliveryManagementCode = particularitiesDeliveryManagementCode;
	}

	public String getParticularitiesHoldOnStockManagementCode() {
		return particularitiesHoldOnStockManagementCode;
	}

	public void setParticularitiesHoldOnStockManagementCode(String particularitiesHoldOnStockManagementCode) {
		this.particularitiesHoldOnStockManagementCode = particularitiesHoldOnStockManagementCode;
	}

	public String getVariousParticularitiesManagementCode() {
		return variousParticularitiesManagementCode;
	}

	public void setVariousParticularitiesManagementCode(String variousParticularitiesManagementCode) {
		this.variousParticularitiesManagementCode = variousParticularitiesManagementCode;
	}

	public String getParticularDelivery1() {
		return particularDelivery1;
	}

	public void setParticularDelivery1(String particularDelivery1) {
		this.particularDelivery1 = particularDelivery1;
	}

	public String getParticularDelivery2() {
		return particularDelivery2;
	}

	public void setParticularDelivery2(String particularDelivery2) {
		this.particularDelivery2 = particularDelivery2;
	}

	public String getPalletType1() {
		return palletType1;
	}

	public void setPalletType1(String palletType1) {
		this.palletType1 = palletType1;
	}

	public int getPalletType1Number() {
		return palletType1Number;
	}

	public void setPalletType1Number(int palletType1Number) {
		this.palletType1Number = palletType1Number;
	}

	public String getPalletType2() {
		return palletType2;
	}

	public void setPalletType2(String palletType2) {
		this.palletType2 = palletType2;
	}

	public int getPalletType2Number() {
		return palletType2Number;
	}

	public void setPalletType2Number(int palletType2Number) {
		this.palletType2Number = palletType2Number;
	}

	public String getOriginalSenderCompanyName() {
		return originalSenderCompanyName;
	}

	public void setOriginalSenderCompanyName(String originalSenderCompanyName) {
		this.originalSenderCompanyName = originalSenderCompanyName;
	}

	public String getOriginalSenderZIPCode() {
		return originalSenderZIPCode;
	}

	public void setOriginalSenderZIPCode(String originalSenderZIPCode) {
		this.originalSenderZIPCode = originalSenderZIPCode;
	}

	public String getOriginalSenderCountryAbbreviationISOAlpha2() {
		return originalSenderCountryAbbreviationISOAlpha2;
	}

	public void setOriginalSenderCountryAbbreviationISOAlpha2(String originalSenderCountryAbbreviationISOAlpha2) {
		this.originalSenderCountryAbbreviationISOAlpha2 = originalSenderCountryAbbreviationISOAlpha2;
	}

	public String getCmrCode() {
		return cmrCode;
	}

	public void setCmrCode(String cmrCode) {
		this.cmrCode = cmrCode;
	}

	public String getNeighborNameMandatoryAuthorization() {
		return neighborNameMandatoryAuthorization;
	}

	public void setNeighborNameMandatoryAuthorization(String neighborNameMandatoryAuthorization) {
		this.neighborNameMandatoryAuthorization = neighborNameMandatoryAuthorization;
	}

	public String getPinCodeMandatoryAuthorization() {
		return pinCodeMandatoryAuthorization;
	}

	public void setPinCodeMandatoryAuthorization(String pinCodeMandatoryAuthorization) {
		this.pinCodeMandatoryAuthorization = pinCodeMandatoryAuthorization;
	}

	public String getPackingListPDFName() {
		return packingListPDFName;
	}

	public void setPackingListPDFName(String packingListPDFName) {
		this.packingListPDFName = packingListPDFName;
	}

	public String getPackingListPDFFlagPrint() {
		return packingListPDFFlagPrint;
	}

	public void setPackingListPDFFlagPrint(String packingListPDFFlagPrint) {
		this.packingListPDFFlagPrint = packingListPDFFlagPrint;
	}

	public String getPackingListPDFFlagEmail() {
		return packingListPDFFlagEmail;
	}

	public void setPackingListPDFFlagEmail(String packingListPDFFlagEmail) {
		this.packingListPDFFlagEmail = packingListPDFFlagEmail;
	}

	public String getPudoId() {
		return pudoId;
	}

	public void setPudoId(String pudoId) {
		this.pudoId = pudoId;
	}
	
	public double getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
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

	public double getQuantityToBeInvoiced() {
		return quantityToBeInvoiced;
	}

	public void setQuantityToBeInvoiced(double quantityToBeInvoiced) {
		this.quantityToBeInvoiced = quantityToBeInvoiced;
	}

	public double getCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(double cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}

	public double getDeclaredParcelValue() {
		return declaredParcelValue;
	}

	public void setDeclaredParcelValue(double declaredParcelValue) {
		this.declaredParcelValue = declaredParcelValue;
	}
	
	

	@Override
	public String toString() {
		return "CreateData [network=" + network + ", departureDepot=" + departureDepot + ", senderCustomerCode="
				+ senderCustomerCode + ", deliveryFreightTypeCode=" + deliveryFreightTypeCode
				+ ", consigneeCompanyName=" + consigneeCompanyName + ", consigneeAddress=" + consigneeAddress
				+ ", consigneeZIPCode=" + consigneeZIPCode + ", consigneeCity=" + consigneeCity
				+ ", consigneeProvinceAbbreviation=" + consigneeProvinceAbbreviation
				+ ", consigneeCountryAbbreviationISOAlpha2=" + consigneeCountryAbbreviationISOAlpha2
				+ ", consigneeClosingShift1_DayOfTheWeek=" + consigneeClosingShift1_DayOfTheWeek
				+ ", consigneeClosingShift1_PeriodOfTheDay=" + consigneeClosingShift1_PeriodOfTheDay
				+ ", consigneeClosingShift2_DayOfTheWeek=" + consigneeClosingShift2_DayOfTheWeek
				+ ", consigneeClosingShift2_PeriodOfTheDay=" + consigneeClosingShift2_PeriodOfTheDay
				+ ", consigneeContactName=" + consigneeContactName + ", consigneeTelephone=" + consigneeTelephone
				+ ", consigneeEMail=" + consigneeEMail + ", consigneeMobilePhoneNumber=" + consigneeMobilePhoneNumber
				+ ", isAlertRequired=" + isAlertRequired + ", consigneeVATNumber=" + consigneeVATNumber
				+ ", consigneeVATNumberCountryISOAlpha2=" + consigneeVATNumberCountryISOAlpha2
				+ ", consigneeItalianFiscalCode=" + consigneeItalianFiscalCode + ", pricingConditionCode="
				+ pricingConditionCode + ", serviceType=" + serviceType + ", insuranceAmount=" + insuranceAmount
				+ ", insuranceAmountCurrency=" + insuranceAmountCurrency + ", senderParcelType=" + senderParcelType
				+ ", numberOfParcels=" + numberOfParcels + ", weightKG=" + weightKG + ", volumeM3=" + volumeM3
				+ ", quantityToBeInvoiced=" + quantityToBeInvoiced + ", cashOnDelivery=" + cashOnDelivery
				+ ", isCODMandatory=" + isCODMandatory + ", codPaymentType=" + codPaymentType + ", codCurrency="
				+ codCurrency + ", numericSenderReference=" + numericSenderReference + ", alphanumericSenderReference="
				+ alphanumericSenderReference + ", notes=" + notes + ", parcelsHandlingCode=" + parcelsHandlingCode
				+ ", deliveryDateRequired=" + deliveryDateRequired + ", deliveryType=" + deliveryType
				+ ", declaredParcelValue=" + declaredParcelValue + ", declaredParcelValueCurrency="
				+ declaredParcelValueCurrency + ", particularitiesDeliveryManagementCode="
				+ particularitiesDeliveryManagementCode + ", particularitiesHoldOnStockManagementCode="
				+ particularitiesHoldOnStockManagementCode + ", variousParticularitiesManagementCode="
				+ variousParticularitiesManagementCode + ", particularDelivery1=" + particularDelivery1
				+ ", particularDelivery2=" + particularDelivery2 + ", palletType1=" + palletType1
				+ ", palletType1Number=" + palletType1Number + ", palletType2=" + palletType2 + ", palletType2Number="
				+ palletType2Number + ", originalSenderCompanyName=" + originalSenderCompanyName
				+ ", originalSenderZIPCode=" + originalSenderZIPCode + ", originalSenderCountryAbbreviationISOAlpha2="
				+ originalSenderCountryAbbreviationISOAlpha2 + ", cmrCode=" + cmrCode
				+ ", neighborNameMandatoryAuthorization=" + neighborNameMandatoryAuthorization
				+ ", pinCodeMandatoryAuthorization=" + pinCodeMandatoryAuthorization + ", packingListPDFName="
				+ packingListPDFName + ", packingListPDFFlagPrint=" + packingListPDFFlagPrint
				+ ", packingListPDFFlagEmail=" + packingListPDFFlagEmail + ", pudoId=" + pudoId + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
