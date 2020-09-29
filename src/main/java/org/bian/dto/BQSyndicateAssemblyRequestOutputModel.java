package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRequestOutputModel
 */
public class BQSyndicateAssemblyRequestOutputModel   {
  private String syndicateAssemblyPreconditions = null;

  private String syndicateAssemblyFeatureSchedule = null;

  private String syndicatedLoanOrganization = null;

  private String syndicateAssemblyPostconditions = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceType = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceDescription = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct = null;

  private String syndicateAssemblyRequestActionTaskReference = null;

  private Object syndicateAssemblyRequestActionTaskRecord = null;

  private String syndicateAssemblyRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return syndicateAssemblyPreconditions
  **/

  public String getSyndicateAssemblyPreconditions() {
    return syndicateAssemblyPreconditions;
  }

  public void setSyndicateAssemblyPreconditions(String syndicateAssemblyPreconditions) {
    this.syndicateAssemblyPreconditions = syndicateAssemblyPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return syndicateAssemblyFeatureSchedule
  **/

  public String getSyndicateAssemblyFeatureSchedule() {
    return syndicateAssemblyFeatureSchedule;
  }

  public void setSyndicateAssemblyFeatureSchedule(String syndicateAssemblyFeatureSchedule) {
    this.syndicateAssemblyFeatureSchedule = syndicateAssemblyFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Syndicated Loan Arrangement specific Business Service 
   * @return syndicatedLoanOrganization
  **/

  public String getSyndicatedLoanOrganization() {
    return syndicatedLoanOrganization;
  }

  public void setSyndicatedLoanOrganization(String syndicatedLoanOrganization) {
    this.syndicatedLoanOrganization = syndicatedLoanOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return syndicateAssemblyPostconditions
  **/

  public String getSyndicateAssemblyPostconditions() {
    return syndicateAssemblyPostconditions;
  }

  public void setSyndicateAssemblyPostconditions(String syndicateAssemblyPostconditions) {
    this.syndicateAssemblyPostconditions = syndicateAssemblyPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return syndicateAssemblySyndicatedLoanOrganizationServiceType
  **/

  public String getSyndicateAssemblySyndicatedLoanOrganizationServiceType() {
    return syndicateAssemblySyndicatedLoanOrganizationServiceType;
  }

  public void setSyndicateAssemblySyndicatedLoanOrganizationServiceType(String syndicateAssemblySyndicatedLoanOrganizationServiceType) {
    this.syndicateAssemblySyndicatedLoanOrganizationServiceType = syndicateAssemblySyndicatedLoanOrganizationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return syndicateAssemblySyndicatedLoanOrganizationServiceDescription
  **/

  public String getSyndicateAssemblySyndicatedLoanOrganizationServiceDescription() {
    return syndicateAssemblySyndicatedLoanOrganizationServiceDescription;
  }

  public void setSyndicateAssemblySyndicatedLoanOrganizationServiceDescription(String syndicateAssemblySyndicatedLoanOrganizationServiceDescription) {
    this.syndicateAssemblySyndicatedLoanOrganizationServiceDescription = syndicateAssemblySyndicatedLoanOrganizationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs
  **/

  public String getSyndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs() {
    return syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs;
  }

  public void setSyndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs(String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs) {
    this.syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs = syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct
  **/

  public String getSyndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct() {
    return syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct;
  }

  public void setSyndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct(String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct) {
    this.syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct = syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Syndicate Assembly instance request service call 
   * @return syndicateAssemblyRequestActionTaskReference
  **/

  public String getSyndicateAssemblyRequestActionTaskReference() {
    return syndicateAssemblyRequestActionTaskReference;
  }

  public void setSyndicateAssemblyRequestActionTaskReference(String syndicateAssemblyRequestActionTaskReference) {
    this.syndicateAssemblyRequestActionTaskReference = syndicateAssemblyRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return syndicateAssemblyRequestActionTaskRecord
  **/

  public Object getSyndicateAssemblyRequestActionTaskRecord() {
    return syndicateAssemblyRequestActionTaskRecord;
  }

  public void setSyndicateAssemblyRequestActionTaskRecord(Object syndicateAssemblyRequestActionTaskRecord) {
    this.syndicateAssemblyRequestActionTaskRecord = syndicateAssemblyRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Syndicate Assembly service request record 
   * @return syndicateAssemblyRequestRecordReference
  **/

  public String getSyndicateAssemblyRequestRecordReference() {
    return syndicateAssemblyRequestRecordReference;
  }

  public void setSyndicateAssemblyRequestRecordReference(String syndicateAssemblyRequestRecordReference) {
    this.syndicateAssemblyRequestRecordReference = syndicateAssemblyRequestRecordReference;
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

