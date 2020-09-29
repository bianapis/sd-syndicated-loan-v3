package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis;
import org.bian.dto.CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveOutputModel
 */
public class CRSyndicatedLoanArrangementRetrieveOutputModel   {
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

  private String syndicatedLoanArrangementRetrieveActionTaskReference = null;

  private Object syndicatedLoanArrangementRetrieveActionTaskRecord = null;

  private String syndicatedLoanArrangementRetrieveActionResponse = null;

  private CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord syndicatedLoanArrangementInstanceReportRecord = null;

  private CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis syndicatedLoanArrangementInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Syndicated Loan Arrangement instance retrieve service call 
   * @return syndicatedLoanArrangementRetrieveActionTaskReference
  **/

  public String getSyndicatedLoanArrangementRetrieveActionTaskReference() {
    return syndicatedLoanArrangementRetrieveActionTaskReference;
  }

  public void setSyndicatedLoanArrangementRetrieveActionTaskReference(String syndicatedLoanArrangementRetrieveActionTaskReference) {
    this.syndicatedLoanArrangementRetrieveActionTaskReference = syndicatedLoanArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return syndicatedLoanArrangementRetrieveActionTaskRecord
  **/

  public Object getSyndicatedLoanArrangementRetrieveActionTaskRecord() {
    return syndicatedLoanArrangementRetrieveActionTaskRecord;
  }

  public void setSyndicatedLoanArrangementRetrieveActionTaskRecord(Object syndicatedLoanArrangementRetrieveActionTaskRecord) {
    this.syndicatedLoanArrangementRetrieveActionTaskRecord = syndicatedLoanArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return syndicatedLoanArrangementRetrieveActionResponse
  **/

  public String getSyndicatedLoanArrangementRetrieveActionResponse() {
    return syndicatedLoanArrangementRetrieveActionResponse;
  }

  public void setSyndicatedLoanArrangementRetrieveActionResponse(String syndicatedLoanArrangementRetrieveActionResponse) {
    this.syndicatedLoanArrangementRetrieveActionResponse = syndicatedLoanArrangementRetrieveActionResponse;
  }


  /**
   * Get syndicatedLoanArrangementInstanceReportRecord
   * @return syndicatedLoanArrangementInstanceReportRecord
  **/

  public CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord getSyndicatedLoanArrangementInstanceReportRecord() {
    return syndicatedLoanArrangementInstanceReportRecord;
  }

  public void setSyndicatedLoanArrangementInstanceReportRecord(CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord syndicatedLoanArrangementInstanceReportRecord) {
    this.syndicatedLoanArrangementInstanceReportRecord = syndicatedLoanArrangementInstanceReportRecord;
  }


  /**
   * Get syndicatedLoanArrangementInstanceAnalysis
   * @return syndicatedLoanArrangementInstanceAnalysis
  **/

  public CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis getSyndicatedLoanArrangementInstanceAnalysis() {
    return syndicatedLoanArrangementInstanceAnalysis;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysis(CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis syndicatedLoanArrangementInstanceAnalysis) {
    this.syndicatedLoanArrangementInstanceAnalysis = syndicatedLoanArrangementInstanceAnalysis;
  }


}

