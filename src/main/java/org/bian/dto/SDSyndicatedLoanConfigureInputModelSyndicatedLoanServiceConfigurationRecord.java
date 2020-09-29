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
 * SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord
 */
public class SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord   {
  private String syndicatedLoanServiceConfigurationSettingReference = null;

  private String syndicatedLoanServiceConfigurationSettingType = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceConfigurationSetup syndicatedLoanServiceConfigurationSetup = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceSubscription syndicatedLoanServiceSubscription = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecordSyndicatedLoanServiceAgreement syndicatedLoanServiceAgreement = null;


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


}

