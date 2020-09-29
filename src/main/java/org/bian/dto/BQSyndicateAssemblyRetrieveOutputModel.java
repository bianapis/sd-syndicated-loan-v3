package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis;
import org.bian.dto.BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveOutputModel
 */
public class BQSyndicateAssemblyRetrieveOutputModel   {
  private String syndicateAssemblyPreconditions = null;

  private String syndicateAssemblyFeatureSchedule = null;

  private String syndicatedLoanOrganization = null;

  private String syndicateAssemblyPostconditions = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceType = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceDescription = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs = null;

  private String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct = null;

  private String syndicateAssemblyRetrieveActionTaskReference = null;

  private Object syndicateAssemblyRetrieveActionTaskRecord = null;

  private String syndicateAssemblyRetrieveActionResponse = null;

  private BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport syndicateAssemblyInstanceReport = null;

  private BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis syndicateAssemblyInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Syndicate Assembly instance retrieve service call 
   * @return syndicateAssemblyRetrieveActionTaskReference
  **/

  public String getSyndicateAssemblyRetrieveActionTaskReference() {
    return syndicateAssemblyRetrieveActionTaskReference;
  }

  public void setSyndicateAssemblyRetrieveActionTaskReference(String syndicateAssemblyRetrieveActionTaskReference) {
    this.syndicateAssemblyRetrieveActionTaskReference = syndicateAssemblyRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return syndicateAssemblyRetrieveActionTaskRecord
  **/

  public Object getSyndicateAssemblyRetrieveActionTaskRecord() {
    return syndicateAssemblyRetrieveActionTaskRecord;
  }

  public void setSyndicateAssemblyRetrieveActionTaskRecord(Object syndicateAssemblyRetrieveActionTaskRecord) {
    this.syndicateAssemblyRetrieveActionTaskRecord = syndicateAssemblyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return syndicateAssemblyRetrieveActionResponse
  **/

  public String getSyndicateAssemblyRetrieveActionResponse() {
    return syndicateAssemblyRetrieveActionResponse;
  }

  public void setSyndicateAssemblyRetrieveActionResponse(String syndicateAssemblyRetrieveActionResponse) {
    this.syndicateAssemblyRetrieveActionResponse = syndicateAssemblyRetrieveActionResponse;
  }


  /**
   * Get syndicateAssemblyInstanceReport
   * @return syndicateAssemblyInstanceReport
  **/

  public BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport getSyndicateAssemblyInstanceReport() {
    return syndicateAssemblyInstanceReport;
  }

  public void setSyndicateAssemblyInstanceReport(BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport syndicateAssemblyInstanceReport) {
    this.syndicateAssemblyInstanceReport = syndicateAssemblyInstanceReport;
  }


  /**
   * Get syndicateAssemblyInstanceAnalysis
   * @return syndicateAssemblyInstanceAnalysis
  **/

  public BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis getSyndicateAssemblyInstanceAnalysis() {
    return syndicateAssemblyInstanceAnalysis;
  }

  public void setSyndicateAssemblyInstanceAnalysis(BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis syndicateAssemblyInstanceAnalysis) {
    this.syndicateAssemblyInstanceAnalysis = syndicateAssemblyInstanceAnalysis;
  }


}

