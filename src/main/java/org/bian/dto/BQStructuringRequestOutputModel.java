package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStructuringRequestOutputModel
 */
public class BQStructuringRequestOutputModel   {
  private String structuringPreconditions = null;

  private String structuringFeatureSchedule = null;

  private String syndicatedLoanArrangement = null;

  private String structuringPostconditions = null;

  private String structuringSyndicatedLoanArrangementServiceType = null;

  private String structuringSyndicatedLoanArrangementServiceDescription = null;

  private String structuringSyndicatedLoanArrangementServiceInputsandOuputs = null;

  private String structuringSyndicatedLoanArrangementServiceWorkProduct = null;

  private String structuringSyndicatedLoanArrangementServiceName = null;

  private String structuringRequestActionTaskReference = null;

  private Object structuringRequestActionTaskRecord = null;

  private String structuringRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return structuringPreconditions
  **/

  public String getStructuringPreconditions() {
    return structuringPreconditions;
  }

  public void setStructuringPreconditions(String structuringPreconditions) {
    this.structuringPreconditions = structuringPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return structuringFeatureSchedule
  **/

  public String getStructuringFeatureSchedule() {
    return structuringFeatureSchedule;
  }

  public void setStructuringFeatureSchedule(String structuringFeatureSchedule) {
    this.structuringFeatureSchedule = structuringFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Syndicated Loan Arrangement specific Business Service 
   * @return syndicatedLoanArrangement
  **/

  public String getSyndicatedLoanArrangement() {
    return syndicatedLoanArrangement;
  }

  public void setSyndicatedLoanArrangement(String syndicatedLoanArrangement) {
    this.syndicatedLoanArrangement = syndicatedLoanArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return structuringPostconditions
  **/

  public String getStructuringPostconditions() {
    return structuringPostconditions;
  }

  public void setStructuringPostconditions(String structuringPostconditions) {
    this.structuringPostconditions = structuringPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return structuringSyndicatedLoanArrangementServiceType
  **/

  public String getStructuringSyndicatedLoanArrangementServiceType() {
    return structuringSyndicatedLoanArrangementServiceType;
  }

  public void setStructuringSyndicatedLoanArrangementServiceType(String structuringSyndicatedLoanArrangementServiceType) {
    this.structuringSyndicatedLoanArrangementServiceType = structuringSyndicatedLoanArrangementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return structuringSyndicatedLoanArrangementServiceDescription
  **/

  public String getStructuringSyndicatedLoanArrangementServiceDescription() {
    return structuringSyndicatedLoanArrangementServiceDescription;
  }

  public void setStructuringSyndicatedLoanArrangementServiceDescription(String structuringSyndicatedLoanArrangementServiceDescription) {
    this.structuringSyndicatedLoanArrangementServiceDescription = structuringSyndicatedLoanArrangementServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return structuringSyndicatedLoanArrangementServiceInputsandOuputs
  **/

  public String getStructuringSyndicatedLoanArrangementServiceInputsandOuputs() {
    return structuringSyndicatedLoanArrangementServiceInputsandOuputs;
  }

  public void setStructuringSyndicatedLoanArrangementServiceInputsandOuputs(String structuringSyndicatedLoanArrangementServiceInputsandOuputs) {
    this.structuringSyndicatedLoanArrangementServiceInputsandOuputs = structuringSyndicatedLoanArrangementServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return structuringSyndicatedLoanArrangementServiceWorkProduct
  **/

  public String getStructuringSyndicatedLoanArrangementServiceWorkProduct() {
    return structuringSyndicatedLoanArrangementServiceWorkProduct;
  }

  public void setStructuringSyndicatedLoanArrangementServiceWorkProduct(String structuringSyndicatedLoanArrangementServiceWorkProduct) {
    this.structuringSyndicatedLoanArrangementServiceWorkProduct = structuringSyndicatedLoanArrangementServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return structuringSyndicatedLoanArrangementServiceName
  **/

  public String getStructuringSyndicatedLoanArrangementServiceName() {
    return structuringSyndicatedLoanArrangementServiceName;
  }

  public void setStructuringSyndicatedLoanArrangementServiceName(String structuringSyndicatedLoanArrangementServiceName) {
    this.structuringSyndicatedLoanArrangementServiceName = structuringSyndicatedLoanArrangementServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Structuring instance request service call 
   * @return structuringRequestActionTaskReference
  **/

  public String getStructuringRequestActionTaskReference() {
    return structuringRequestActionTaskReference;
  }

  public void setStructuringRequestActionTaskReference(String structuringRequestActionTaskReference) {
    this.structuringRequestActionTaskReference = structuringRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return structuringRequestActionTaskRecord
  **/

  public Object getStructuringRequestActionTaskRecord() {
    return structuringRequestActionTaskRecord;
  }

  public void setStructuringRequestActionTaskRecord(Object structuringRequestActionTaskRecord) {
    this.structuringRequestActionTaskRecord = structuringRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Structuring service request record 
   * @return structuringRequestRecordReference
  **/

  public String getStructuringRequestRecordReference() {
    return structuringRequestRecordReference;
  }

  public void setStructuringRequestRecordReference(String structuringRequestRecordReference) {
    this.structuringRequestRecordReference = structuringRequestRecordReference;
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

