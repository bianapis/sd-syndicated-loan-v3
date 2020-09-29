package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup
 */
public class SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup   {
  private String syndicatedLoanServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return syndicatedLoanServiceConfigurationParameter
  **/

  public String getSyndicatedLoanServiceConfigurationParameter() {
    return syndicatedLoanServiceConfigurationParameter;
  }

  public void setSyndicatedLoanServiceConfigurationParameter(String syndicatedLoanServiceConfigurationParameter) {
    this.syndicatedLoanServiceConfigurationParameter = syndicatedLoanServiceConfigurationParameter;
  }


}

