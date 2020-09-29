package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementInitiateOutputModel
 */
public class CRSyndicatedLoanArrangementInitiateOutputModel   {
  private String syndicatedLoanArrangementInstanceReference = null;

  private String syndicatedLoanArrangementInitiateActionReference = null;

  private Object syndicatedLoanArrangementInitiateActionRecord = null;

  private String syndicatedLoanArrangementInstanceStatus = null;

  private String syndicatedLoanArrangementParameterType = null;

  private String syndicatedLoanArrangementSelectedOption = null;

  private String syndicatedLoanArrangementSchedule = null;

  private String syndicatedLoanArrangementStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Syndicated Loan Arrangement instance 
   * @return syndicatedLoanArrangementInstanceReference
  **/

  public String getSyndicatedLoanArrangementInstanceReference() {
    return syndicatedLoanArrangementInstanceReference;
  }

  public void setSyndicatedLoanArrangementInstanceReference(String syndicatedLoanArrangementInstanceReference) {
    this.syndicatedLoanArrangementInstanceReference = syndicatedLoanArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return syndicatedLoanArrangementInitiateActionReference
  **/

  public String getSyndicatedLoanArrangementInitiateActionReference() {
    return syndicatedLoanArrangementInitiateActionReference;
  }

  public void setSyndicatedLoanArrangementInitiateActionReference(String syndicatedLoanArrangementInitiateActionReference) {
    this.syndicatedLoanArrangementInitiateActionReference = syndicatedLoanArrangementInitiateActionReference;
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


}

