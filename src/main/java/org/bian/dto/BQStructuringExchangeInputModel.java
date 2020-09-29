package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQStructuringExchangeInputModel
 */
public class BQStructuringExchangeInputModel   {
  private String syndicatedLoanArrangementInstanceReference = null;

  private String structuringInstanceReference = null;

  private String structuringPreconditions = null;

  private String structuringFeatureSchedule = null;

  private String syndicatedLoanArrangement = null;

  private String structuringPostconditions = null;

  private String structuringSyndicatedLoanArrangementServiceType = null;

  private String structuringSyndicatedLoanArrangementServiceDescription = null;

  private String structuringSyndicatedLoanArrangementServiceInputsandOuputs = null;

  private String structuringSyndicatedLoanArrangementServiceWorkProduct = null;

  private String structuringSyndicatedLoanArrangementServiceName = null;

  private Object structuringExchangeActionTaskRecord = null;

  private CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest structuringExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Syndicated Loan Arrangement instance 
   * @return syndicatedLoanArrangementInstanceReference
  **/

  public String getSyndicatedLoanArrangementInstanceReference() {
    return syndicatedLoanArrangementInstanceReference;
  }

  public void setSyndicatedLoanArrangementInstanceReference(String syndicatedLoanArrangementInstanceReference) {
    this.syndicatedLoanArrangementInstanceReference = syndicatedLoanArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Structuring instance 
   * @return structuringInstanceReference
  **/

  public String getStructuringInstanceReference() {
    return structuringInstanceReference;
  }

  public void setStructuringInstanceReference(String structuringInstanceReference) {
    this.structuringInstanceReference = structuringInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return structuringExchangeActionTaskRecord
  **/

  public Object getStructuringExchangeActionTaskRecord() {
    return structuringExchangeActionTaskRecord;
  }

  public void setStructuringExchangeActionTaskRecord(Object structuringExchangeActionTaskRecord) {
    this.structuringExchangeActionTaskRecord = structuringExchangeActionTaskRecord;
  }


  /**
   * Get structuringExchangeActionRequest
   * @return structuringExchangeActionRequest
  **/

  public CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest getStructuringExchangeActionRequest() {
    return structuringExchangeActionRequest;
  }

  public void setStructuringExchangeActionRequest(CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest structuringExchangeActionRequest) {
    this.structuringExchangeActionRequest = structuringExchangeActionRequest;
  }


}

