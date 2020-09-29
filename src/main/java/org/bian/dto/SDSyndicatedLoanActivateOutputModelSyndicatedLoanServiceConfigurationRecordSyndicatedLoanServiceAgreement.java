package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement
 */
public class SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement   {
  private String syndicatedLoanServiceAgreementReference = null;

  private String syndicatedLoanServiceUserReference = null;

  private String syndicatedLoanServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return syndicatedLoanServiceAgreementReference
  **/

  public String getSyndicatedLoanServiceAgreementReference() {
    return syndicatedLoanServiceAgreementReference;
  }

  public void setSyndicatedLoanServiceAgreementReference(String syndicatedLoanServiceAgreementReference) {
    this.syndicatedLoanServiceAgreementReference = syndicatedLoanServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return syndicatedLoanServiceUserReference
  **/

  public String getSyndicatedLoanServiceUserReference() {
    return syndicatedLoanServiceUserReference;
  }

  public void setSyndicatedLoanServiceUserReference(String syndicatedLoanServiceUserReference) {
    this.syndicatedLoanServiceUserReference = syndicatedLoanServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return syndicatedLoanServiceAgreementTermsandConditions
  **/

  public String getSyndicatedLoanServiceAgreementTermsandConditions() {
    return syndicatedLoanServiceAgreementTermsandConditions;
  }

  public void setSyndicatedLoanServiceAgreementTermsandConditions(String syndicatedLoanServiceAgreementTermsandConditions) {
    this.syndicatedLoanServiceAgreementTermsandConditions = syndicatedLoanServiceAgreementTermsandConditions;
  }


}

