package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementInitiateInputModel
 */
public class CRSyndicatedLoanArrangementInitiateInputModel   {
  private String syndicatedLoanServicingSessionReference = null;

  private Object syndicatedLoanArrangementInitiateActionRecord = null;

  private String syndicatedLoanArrangementInstanceStatus = null;

  private String syndicatedLoanArrangementParameterType = null;

  private String syndicatedLoanArrangementSelectedOption = null;

  private String syndicatedLoanArrangementType = null;

  private String syndicatedLoanArrangementReference = null;

  private String syndicatedLoanArrangementSchedule = null;

  private String syndicatedLoanArrangementStatus = null;

  private String syndicatedLoanArrangementCurrency = null;

  private String syndicatedLoanArrangementRegulationReference = null;

  private String syndicatedLoanArrangementRegulationType = null;

  private String syndicatedLoanArrangementJurisdiction = null;

  private String syndicatedLoanArrangementBookingLocation = null;

  private String syndicatedLoanArrangementAccountType = null;

  private String syndicatedLoanArrangementAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return syndicatedLoanServicingSessionReference
  **/

  public String getSyndicatedLoanServicingSessionReference() {
    return syndicatedLoanServicingSessionReference;
  }

  public void setSyndicatedLoanServicingSessionReference(String syndicatedLoanServicingSessionReference) {
    this.syndicatedLoanServicingSessionReference = syndicatedLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return syndicatedLoanArrangementInitiateActionRecord
  **/

  public Object getSyndicatedLoanArrangementInitiateActionRecord() {
    return syndicatedLoanArrangementInitiateActionRecord;
  }

  public void setSyndicatedLoanArrangementInitiateActionRecord(Object syndicatedLoanArrangementInitiateActionRecord) {
    this.syndicatedLoanArrangementInitiateActionRecord = syndicatedLoanArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Syndicated Loan Arrangement instance (e.g. initialised, pending, active) 
   * @return syndicatedLoanArrangementInstanceStatus
  **/

  public String getSyndicatedLoanArrangementInstanceStatus() {
    return syndicatedLoanArrangementInstanceStatus;
  }

  public void setSyndicatedLoanArrangementInstanceStatus(String syndicatedLoanArrangementInstanceStatus) {
    this.syndicatedLoanArrangementInstanceStatus = syndicatedLoanArrangementInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementParameterType
  **/

  public String getSyndicatedLoanArrangementParameterType() {
    return syndicatedLoanArrangementParameterType;
  }

  public void setSyndicatedLoanArrangementParameterType(String syndicatedLoanArrangementParameterType) {
    this.syndicatedLoanArrangementParameterType = syndicatedLoanArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementSelectedOption
  **/

  public String getSyndicatedLoanArrangementSelectedOption() {
    return syndicatedLoanArrangementSelectedOption;
  }

  public void setSyndicatedLoanArrangementSelectedOption(String syndicatedLoanArrangementSelectedOption) {
    this.syndicatedLoanArrangementSelectedOption = syndicatedLoanArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementType
  **/

  public String getSyndicatedLoanArrangementType() {
    return syndicatedLoanArrangementType;
  }

  public void setSyndicatedLoanArrangementType(String syndicatedLoanArrangementType) {
    this.syndicatedLoanArrangementType = syndicatedLoanArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementReference
  **/

  public String getSyndicatedLoanArrangementReference() {
    return syndicatedLoanArrangementReference;
  }

  public void setSyndicatedLoanArrangementReference(String syndicatedLoanArrangementReference) {
    this.syndicatedLoanArrangementReference = syndicatedLoanArrangementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementSchedule
  **/

  public String getSyndicatedLoanArrangementSchedule() {
    return syndicatedLoanArrangementSchedule;
  }

  public void setSyndicatedLoanArrangementSchedule(String syndicatedLoanArrangementSchedule) {
    this.syndicatedLoanArrangementSchedule = syndicatedLoanArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementStatus
  **/

  public String getSyndicatedLoanArrangementStatus() {
    return syndicatedLoanArrangementStatus;
  }

  public void setSyndicatedLoanArrangementStatus(String syndicatedLoanArrangementStatus) {
    this.syndicatedLoanArrangementStatus = syndicatedLoanArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementCurrency
  **/

  public String getSyndicatedLoanArrangementCurrency() {
    return syndicatedLoanArrangementCurrency;
  }

  public void setSyndicatedLoanArrangementCurrency(String syndicatedLoanArrangementCurrency) {
    this.syndicatedLoanArrangementCurrency = syndicatedLoanArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementRegulationReference
  **/

  public String getSyndicatedLoanArrangementRegulationReference() {
    return syndicatedLoanArrangementRegulationReference;
  }

  public void setSyndicatedLoanArrangementRegulationReference(String syndicatedLoanArrangementRegulationReference) {
    this.syndicatedLoanArrangementRegulationReference = syndicatedLoanArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementRegulationType
  **/

  public String getSyndicatedLoanArrangementRegulationType() {
    return syndicatedLoanArrangementRegulationType;
  }

  public void setSyndicatedLoanArrangementRegulationType(String syndicatedLoanArrangementRegulationType) {
    this.syndicatedLoanArrangementRegulationType = syndicatedLoanArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Syndicated Loan Arrangement in case of legal dispute. 
   * @return syndicatedLoanArrangementJurisdiction
  **/

  public String getSyndicatedLoanArrangementJurisdiction() {
    return syndicatedLoanArrangementJurisdiction;
  }

  public void setSyndicatedLoanArrangementJurisdiction(String syndicatedLoanArrangementJurisdiction) {
    this.syndicatedLoanArrangementJurisdiction = syndicatedLoanArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Syndicated Loan Arrangement, are entered. 
   * @return syndicatedLoanArrangementBookingLocation
  **/

  public String getSyndicatedLoanArrangementBookingLocation() {
    return syndicatedLoanArrangementBookingLocation;
  }

  public void setSyndicatedLoanArrangementBookingLocation(String syndicatedLoanArrangementBookingLocation) {
    this.syndicatedLoanArrangementBookingLocation = syndicatedLoanArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementAccountType
  **/

  public String getSyndicatedLoanArrangementAccountType() {
    return syndicatedLoanArrangementAccountType;
  }

  public void setSyndicatedLoanArrangementAccountType(String syndicatedLoanArrangementAccountType) {
    this.syndicatedLoanArrangementAccountType = syndicatedLoanArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Syndicated Loan Arrangement 
   * @return syndicatedLoanArrangementAccountReference
  **/

  public String getSyndicatedLoanArrangementAccountReference() {
    return syndicatedLoanArrangementAccountReference;
  }

  public void setSyndicatedLoanArrangementAccountReference(String syndicatedLoanArrangementAccountReference) {
    this.syndicatedLoanArrangementAccountReference = syndicatedLoanArrangementAccountReference;
  }


}

