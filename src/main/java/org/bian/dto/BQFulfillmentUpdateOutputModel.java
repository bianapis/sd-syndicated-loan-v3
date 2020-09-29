package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQFulfillmentUpdateOutputModel
 */
public class BQFulfillmentUpdateOutputModel   {
  private String fulfillmentPreconditions = null;

  private String fulfillmentFeatureSchedule = null;

  private String fiduciaryArrangementFulfillment = null;

  private String fulfillmentPostconditions = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceType = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceDescription = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct = null;

  private String fulfillmentFiduciaryArrangementFulfillmentServiceName = null;

  private String fulfillmentUpdateActionTaskReference = null;

  private Object fulfillmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return fulfillmentPreconditions
  **/

  public String getFulfillmentPreconditions() {
    return fulfillmentPreconditions;
  }

  public void setFulfillmentPreconditions(String fulfillmentPreconditions) {
    this.fulfillmentPreconditions = fulfillmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return fulfillmentFeatureSchedule
  **/

  public String getFulfillmentFeatureSchedule() {
    return fulfillmentFeatureSchedule;
  }

  public void setFulfillmentFeatureSchedule(String fulfillmentFeatureSchedule) {
    this.fulfillmentFeatureSchedule = fulfillmentFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Syndicated Loan Arrangement specific Business Service 
   * @return fiduciaryArrangementFulfillment
  **/

  public String getFiduciaryArrangementFulfillment() {
    return fiduciaryArrangementFulfillment;
  }

  public void setFiduciaryArrangementFulfillment(String fiduciaryArrangementFulfillment) {
    this.fiduciaryArrangementFulfillment = fiduciaryArrangementFulfillment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return fulfillmentPostconditions
  **/

  public String getFulfillmentPostconditions() {
    return fulfillmentPostconditions;
  }

  public void setFulfillmentPostconditions(String fulfillmentPostconditions) {
    this.fulfillmentPostconditions = fulfillmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceType
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceType() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceType;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceType(String fulfillmentFiduciaryArrangementFulfillmentServiceType) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceType = fulfillmentFiduciaryArrangementFulfillmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceDescription
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceDescription() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceDescription(String fulfillmentFiduciaryArrangementFulfillmentServiceDescription) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceDescription = fulfillmentFiduciaryArrangementFulfillmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs(String fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs = fulfillmentFiduciaryArrangementFulfillmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct(String fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct = fulfillmentFiduciaryArrangementFulfillmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return fulfillmentFiduciaryArrangementFulfillmentServiceName
  **/

  public String getFulfillmentFiduciaryArrangementFulfillmentServiceName() {
    return fulfillmentFiduciaryArrangementFulfillmentServiceName;
  }

  public void setFulfillmentFiduciaryArrangementFulfillmentServiceName(String fulfillmentFiduciaryArrangementFulfillmentServiceName) {
    this.fulfillmentFiduciaryArrangementFulfillmentServiceName = fulfillmentFiduciaryArrangementFulfillmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return fulfillmentUpdateActionTaskReference
  **/

  public String getFulfillmentUpdateActionTaskReference() {
    return fulfillmentUpdateActionTaskReference;
  }

  public void setFulfillmentUpdateActionTaskReference(String fulfillmentUpdateActionTaskReference) {
    this.fulfillmentUpdateActionTaskReference = fulfillmentUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return fulfillmentUpdateActionTaskRecord
  **/

  public Object getFulfillmentUpdateActionTaskRecord() {
    return fulfillmentUpdateActionTaskRecord;
  }

  public void setFulfillmentUpdateActionTaskRecord(Object fulfillmentUpdateActionTaskRecord) {
    this.fulfillmentUpdateActionTaskRecord = fulfillmentUpdateActionTaskRecord;
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

