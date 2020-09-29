package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord
 */
public class SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord   {
  private String syndicatedLoanServiceConfigurationSettingReference = null;

  private String syndicatedLoanServiceConfigurationSettingType = null;

  private SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return syndicatedLoanServiceConfigurationSettingReference
  **/

  public String getSyndicatedLoanServiceConfigurationSettingReference() {
    return syndicatedLoanServiceConfigurationSettingReference;
  }

  public void setSyndicatedLoanServiceConfigurationSettingReference(String syndicatedLoanServiceConfigurationSettingReference) {
    this.syndicatedLoanServiceConfigurationSettingReference = syndicatedLoanServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return syndicatedLoanServiceConfigurationSettingType
  **/

  public String getSyndicatedLoanServiceConfigurationSettingType() {
    return syndicatedLoanServiceConfigurationSettingType;
  }

  public void setSyndicatedLoanServiceConfigurationSettingType(String syndicatedLoanServiceConfigurationSettingType) {
    this.syndicatedLoanServiceConfigurationSettingType = syndicatedLoanServiceConfigurationSettingType;
  }


  /**
   * Get syndicatedLoanServiceConfigurationSetup
   * @return syndicatedLoanServiceConfigurationSetup
  **/

  public SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup getSyndicatedLoanServiceConfigurationSetup() {
    return syndicatedLoanServiceConfigurationSetup;
  }

  public void setSyndicatedLoanServiceConfigurationSetup(SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup) {
    this.syndicatedLoanServiceConfigurationSetup = syndicatedLoanServiceConfigurationSetup;
  }


}

