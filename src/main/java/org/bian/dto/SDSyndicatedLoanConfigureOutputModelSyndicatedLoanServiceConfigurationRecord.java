package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement;
import org.bian.dto.SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup;
import org.bian.dto.SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord
 */
public class SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord   {
  private String syndicatedLoanServiceConfigurationSettingDescription = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription syndicatedLoanServiceSubscription = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement syndicatedLoanServiceAgreement = null;

  private String syndicatedLoanServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return syndicatedLoanServiceConfigurationSettingDescription
  **/

  public String getSyndicatedLoanServiceConfigurationSettingDescription() {
    return syndicatedLoanServiceConfigurationSettingDescription;
  }

  public void setSyndicatedLoanServiceConfigurationSettingDescription(String syndicatedLoanServiceConfigurationSettingDescription) {
    this.syndicatedLoanServiceConfigurationSettingDescription = syndicatedLoanServiceConfigurationSettingDescription;
  }


  /**
   * Get syndicatedLoanServiceConfigurationSetup
   * @return syndicatedLoanServiceConfigurationSetup
  **/

  public SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup getSyndicatedLoanServiceConfigurationSetup() {
    return syndicatedLoanServiceConfigurationSetup;
  }

  public void setSyndicatedLoanServiceConfigurationSetup(SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup) {
    this.syndicatedLoanServiceConfigurationSetup = syndicatedLoanServiceConfigurationSetup;
  }


  /**
   * Get syndicatedLoanServiceSubscription
   * @return syndicatedLoanServiceSubscription
  **/

  public SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription getSyndicatedLoanServiceSubscription() {
    return syndicatedLoanServiceSubscription;
  }

  public void setSyndicatedLoanServiceSubscription(SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription syndicatedLoanServiceSubscription) {
    this.syndicatedLoanServiceSubscription = syndicatedLoanServiceSubscription;
  }


  /**
   * Get syndicatedLoanServiceAgreement
   * @return syndicatedLoanServiceAgreement
  **/

  public SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement getSyndicatedLoanServiceAgreement() {
    return syndicatedLoanServiceAgreement;
  }

  public void setSyndicatedLoanServiceAgreement(SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement syndicatedLoanServiceAgreement) {
    this.syndicatedLoanServiceAgreement = syndicatedLoanServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return syndicatedLoanServiceStatus
  **/

  public String getSyndicatedLoanServiceStatus() {
    return syndicatedLoanServiceStatus;
  }

  public void setSyndicatedLoanServiceStatus(String syndicatedLoanServiceStatus) {
    this.syndicatedLoanServiceStatus = syndicatedLoanServiceStatus;
  }


}

