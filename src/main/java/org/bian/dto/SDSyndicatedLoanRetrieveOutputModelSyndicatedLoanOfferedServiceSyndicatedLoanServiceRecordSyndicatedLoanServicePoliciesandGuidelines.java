package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines
 */
public class SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines   {
  private String syndicatedLoanServiceEligibility = null;

  private String syndicatedLoanServiceIntendedUses = null;

  private String syndicatedLoanServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return syndicatedLoanServiceEligibility
  **/

  public String getSyndicatedLoanServiceEligibility() {
    return syndicatedLoanServiceEligibility;
  }

  public void setSyndicatedLoanServiceEligibility(String syndicatedLoanServiceEligibility) {
    this.syndicatedLoanServiceEligibility = syndicatedLoanServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return syndicatedLoanServiceIntendedUses
  **/

  public String getSyndicatedLoanServiceIntendedUses() {
    return syndicatedLoanServiceIntendedUses;
  }

  public void setSyndicatedLoanServiceIntendedUses(String syndicatedLoanServiceIntendedUses) {
    this.syndicatedLoanServiceIntendedUses = syndicatedLoanServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return syndicatedLoanServicePricingandTerms
  **/

  public String getSyndicatedLoanServicePricingandTerms() {
    return syndicatedLoanServicePricingandTerms;
  }

  public void setSyndicatedLoanServicePricingandTerms(String syndicatedLoanServicePricingandTerms) {
    this.syndicatedLoanServicePricingandTerms = syndicatedLoanServicePricingandTerms;
  }


}

