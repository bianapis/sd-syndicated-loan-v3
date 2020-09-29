package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementExchangeOutputModel
 */
public class CRSyndicatedLoanArrangementExchangeOutputModel   {
  private String syndicatedLoanArrangementParameterType = null;

  private String syndicatedLoanArrangementSelectedOption = null;

  private String syndicatedLoanArrangementSchedule = null;

  private String syndicatedLoanArrangementStatus = null;

  private String syndicatedLoanArrangementExchangeActionTaskReference = null;

  private Object syndicatedLoanArrangementExchangeActionTaskRecord = null;

  private String syndicatedLoanArrangementExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Syndicated Loan Arrangement instance exchange service call 
   * @return syndicatedLoanArrangementExchangeActionTaskReference
  **/

  public String getSyndicatedLoanArrangementExchangeActionTaskReference() {
    return syndicatedLoanArrangementExchangeActionTaskReference;
  }

  public void setSyndicatedLoanArrangementExchangeActionTaskReference(String syndicatedLoanArrangementExchangeActionTaskReference) {
    this.syndicatedLoanArrangementExchangeActionTaskReference = syndicatedLoanArrangementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return syndicatedLoanArrangementExchangeActionTaskRecord
  **/

  public Object getSyndicatedLoanArrangementExchangeActionTaskRecord() {
    return syndicatedLoanArrangementExchangeActionTaskRecord;
  }

  public void setSyndicatedLoanArrangementExchangeActionTaskRecord(Object syndicatedLoanArrangementExchangeActionTaskRecord) {
    this.syndicatedLoanArrangementExchangeActionTaskRecord = syndicatedLoanArrangementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return syndicatedLoanArrangementExchangeActionResponse
  **/

  public String getSyndicatedLoanArrangementExchangeActionResponse() {
    return syndicatedLoanArrangementExchangeActionResponse;
  }

  public void setSyndicatedLoanArrangementExchangeActionResponse(String syndicatedLoanArrangementExchangeActionResponse) {
    this.syndicatedLoanArrangementExchangeActionResponse = syndicatedLoanArrangementExchangeActionResponse;
  }


}

