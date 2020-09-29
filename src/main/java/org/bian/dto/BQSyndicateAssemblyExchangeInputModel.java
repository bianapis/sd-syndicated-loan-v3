package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyExchangeInputModel
 */
public class BQSyndicateAssemblyExchangeInputModel   {
  private String syndicatedLoanArrangementInstanceReference = null;

  private String syndicateAssemblyInstanceReference = null;

  private String syndicateAssemblyPreconditions = null;

  private String syndicateAssemblyFeatureSchedule = null;

  private String syndicatedLoanOrganization = null;

  private String syndicateAssemblyPostconditions = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceType = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceDescription = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct = null;

  private Object syndicateAssemblyExchangeActionTaskRecord = null;

  private CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest syndicateAssemblyExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Syndicate Assembly instance 
   * @return syndicateAssemblyInstanceReference
  **/

  public String getSyndicateAssemblyInstanceReference() {
    return syndicateAssemblyInstanceReference;
  }

  public void setSyndicateAssemblyInstanceReference(String syndicateAssemblyInstanceReference) {
    this.syndicateAssemblyInstanceReference = syndicateAssemblyInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return syndicateAssemblyExchangeActionTaskRecord
  **/

  public Object getSyndicateAssemblyExchangeActionTaskRecord() {
    return syndicateAssemblyExchangeActionTaskRecord;
  }

  public void setSyndicateAssemblyExchangeActionTaskRecord(Object syndicateAssemblyExchangeActionTaskRecord) {
    this.syndicateAssemblyExchangeActionTaskRecord = syndicateAssemblyExchangeActionTaskRecord;
  }


  /**
   * Get syndicateAssemblyExchangeActionRequest
   * @return syndicateAssemblyExchangeActionRequest
  **/

  public CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest getSyndicateAssemblyExchangeActionRequest() {
    return syndicateAssemblyExchangeActionRequest;
  }

  public void setSyndicateAssemblyExchangeActionRequest(CRSyndicatedLoanArrangementExchangeInputModelSyndicatedLoanArrangementExchangeActionRequest syndicateAssemblyExchangeActionRequest) {
    this.syndicateAssemblyExchangeActionRequest = syndicateAssemblyExchangeActionRequest;
  }


}

