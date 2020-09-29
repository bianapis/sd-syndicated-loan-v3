package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription
 */
public class SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription   {
  private String syndicatedLoanServiceSubscriberReference = null;

  private String syndicatedLoanServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return syndicatedLoanServiceSubscriberReference
  **/

  public String getSyndicatedLoanServiceSubscriberReference() {
    return syndicatedLoanServiceSubscriberReference;
  }

  public void setSyndicatedLoanServiceSubscriberReference(String syndicatedLoanServiceSubscriberReference) {
    this.syndicatedLoanServiceSubscriberReference = syndicatedLoanServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return syndicatedLoanServiceSubscriberAccessProfile
  **/

  public String getSyndicatedLoanServiceSubscriberAccessProfile() {
    return syndicatedLoanServiceSubscriberAccessProfile;
  }

  public void setSyndicatedLoanServiceSubscriberAccessProfile(String syndicatedLoanServiceSubscriberAccessProfile) {
    this.syndicatedLoanServiceSubscriberAccessProfile = syndicatedLoanServiceSubscriberAccessProfile;
  }


}

