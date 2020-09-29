package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOriginationUpdateOutputModel
 */
public class BQOriginationUpdateOutputModel   {
  private String originationPreconditions = null;

  private String originationFeatureSchedule = null;

  private String syndicatedLoanOrigination = null;

  private String originationPostconditions = null;

  private String originationSyndicatedLoanOriginationServiceType = null;

  private String originationSyndicatedLoanOriginationServiceDescription = null;

  private String originationSyndicatedLoanOriginationServiceInputsandOuputs = null;

  private String originationSyndicatedLoanOriginationServiceWorkProduct = null;

  private String originationSyndicatedLoanOriginationServiceName = null;

  private String originationUpdateActionTaskReference = null;

  private Object originationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return originationPreconditions
  **/

  public String getOriginationPreconditions() {
    return originationPreconditions;
  }

  public void setOriginationPreconditions(String originationPreconditions) {
    this.originationPreconditions = originationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return originationFeatureSchedule
  **/

  public String getOriginationFeatureSchedule() {
    return originationFeatureSchedule;
  }

  public void setOriginationFeatureSchedule(String originationFeatureSchedule) {
    this.originationFeatureSchedule = originationFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Syndicated Loan Arrangement specific Business Service 
   * @return syndicatedLoanOrigination
  **/

  public String getSyndicatedLoanOrigination() {
    return syndicatedLoanOrigination;
  }

  public void setSyndicatedLoanOrigination(String syndicatedLoanOrigination) {
    this.syndicatedLoanOrigination = syndicatedLoanOrigination;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return originationPostconditions
  **/

  public String getOriginationPostconditions() {
    return originationPostconditions;
  }

  public void setOriginationPostconditions(String originationPostconditions) {
    this.originationPostconditions = originationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return originationSyndicatedLoanOriginationServiceType
  **/

  public String getOriginationSyndicatedLoanOriginationServiceType() {
    return originationSyndicatedLoanOriginationServiceType;
  }

  public void setOriginationSyndicatedLoanOriginationServiceType(String originationSyndicatedLoanOriginationServiceType) {
    this.originationSyndicatedLoanOriginationServiceType = originationSyndicatedLoanOriginationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return originationSyndicatedLoanOriginationServiceDescription
  **/

  public String getOriginationSyndicatedLoanOriginationServiceDescription() {
    return originationSyndicatedLoanOriginationServiceDescription;
  }

  public void setOriginationSyndicatedLoanOriginationServiceDescription(String originationSyndicatedLoanOriginationServiceDescription) {
    this.originationSyndicatedLoanOriginationServiceDescription = originationSyndicatedLoanOriginationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return originationSyndicatedLoanOriginationServiceInputsandOuputs
  **/

  public String getOriginationSyndicatedLoanOriginationServiceInputsandOuputs() {
    return originationSyndicatedLoanOriginationServiceInputsandOuputs;
  }

  public void setOriginationSyndicatedLoanOriginationServiceInputsandOuputs(String originationSyndicatedLoanOriginationServiceInputsandOuputs) {
    this.originationSyndicatedLoanOriginationServiceInputsandOuputs = originationSyndicatedLoanOriginationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return originationSyndicatedLoanOriginationServiceWorkProduct
  **/

  public String getOriginationSyndicatedLoanOriginationServiceWorkProduct() {
    return originationSyndicatedLoanOriginationServiceWorkProduct;
  }

  public void setOriginationSyndicatedLoanOriginationServiceWorkProduct(String originationSyndicatedLoanOriginationServiceWorkProduct) {
    this.originationSyndicatedLoanOriginationServiceWorkProduct = originationSyndicatedLoanOriginationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return originationSyndicatedLoanOriginationServiceName
  **/

  public String getOriginationSyndicatedLoanOriginationServiceName() {
    return originationSyndicatedLoanOriginationServiceName;
  }

  public void setOriginationSyndicatedLoanOriginationServiceName(String originationSyndicatedLoanOriginationServiceName) {
    this.originationSyndicatedLoanOriginationServiceName = originationSyndicatedLoanOriginationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return originationUpdateActionTaskReference
  **/

  public String getOriginationUpdateActionTaskReference() {
    return originationUpdateActionTaskReference;
  }

  public void setOriginationUpdateActionTaskReference(String originationUpdateActionTaskReference) {
    this.originationUpdateActionTaskReference = originationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return originationUpdateActionTaskRecord
  **/

  public Object getOriginationUpdateActionTaskRecord() {
    return originationUpdateActionTaskRecord;
  }

  public void setOriginationUpdateActionTaskRecord(Object originationUpdateActionTaskRecord) {
    this.originationUpdateActionTaskRecord = originationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

