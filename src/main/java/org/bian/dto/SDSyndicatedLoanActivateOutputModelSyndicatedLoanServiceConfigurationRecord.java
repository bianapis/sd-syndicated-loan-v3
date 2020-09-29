package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup;
import org.bian.dto.SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement;
import org.bian.dto.SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord
 */
public class SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord   {
  private String syndicatedLoanServiceConfigurationSettingReference = null;

  private String syndicatedLoanServiceConfigurationSettingDescription = null;

  private SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup = null;

  private SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription syndicatedLoanServiceSubscription = null;

  private SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement syndicatedLoanServiceAgreement = null;

  private String syndicatedLoanServiceStatus = null;


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

  public SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup getSyndicatedLoanServiceConfigurationSetup() {
    return syndicatedLoanServiceConfigurationSetup;
  }

  public void setSyndicatedLoanServiceConfigurationSetup(SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup) {
    this.syndicatedLoanServiceConfigurationSetup = syndicatedLoanServiceConfigurationSetup;
  }


  /**
   * Get syndicatedLoanServiceSubscription
   * @return syndicatedLoanServiceSubscription
  **/

  public SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription getSyndicatedLoanServiceSubscription() {
    return syndicatedLoanServiceSubscription;
  }

  public void setSyndicatedLoanServiceSubscription(SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription syndicatedLoanServiceSubscription) {
    this.syndicatedLoanServiceSubscription = syndicatedLoanServiceSubscription;
  }


  /**
   * Get syndicatedLoanServiceAgreement
   * @return syndicatedLoanServiceAgreement
  **/

  public SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement getSyndicatedLoanServiceAgreement() {
    return syndicatedLoanServiceAgreement;
  }

  public void setSyndicatedLoanServiceAgreement(SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement syndicatedLoanServiceAgreement) {
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

