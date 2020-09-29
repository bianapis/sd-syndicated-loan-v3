package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRequestOutputModel
 */
public class CRSyndicatedLoanArrangementRequestOutputModel   {
  private String syndicatedLoanArrangementParameterType = null;

  private String syndicatedLoanArrangementSelectedOption = null;

  private String syndicatedLoanArrangementSchedule = null;

  private String syndicatedLoanArrangementStatus = null;

  private String syndicatedLoanArrangementRequestActionTaskReference = null;

  private Object syndicatedLoanArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Syndicated Loan Arrangement instance request service call 
   * @return syndicatedLoanArrangementRequestActionTaskReference
  **/

  public String getSyndicatedLoanArrangementRequestActionTaskReference() {
    return syndicatedLoanArrangementRequestActionTaskReference;
  }

  public void setSyndicatedLoanArrangementRequestActionTaskReference(String syndicatedLoanArrangementRequestActionTaskReference) {
    this.syndicatedLoanArrangementRequestActionTaskReference = syndicatedLoanArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return syndicatedLoanArrangementRequestActionTaskRecord
  **/

  public Object getSyndicatedLoanArrangementRequestActionTaskRecord() {
    return syndicatedLoanArrangementRequestActionTaskRecord;
  }

  public void setSyndicatedLoanArrangementRequestActionTaskRecord(Object syndicatedLoanArrangementRequestActionTaskRecord) {
    this.syndicatedLoanArrangementRequestActionTaskRecord = syndicatedLoanArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

