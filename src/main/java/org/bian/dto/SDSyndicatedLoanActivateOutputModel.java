package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateOutputModel
 */
public class SDSyndicatedLoanActivateOutputModel   {
  private String syndicatedLoanActivationActionTaskReference = null;

  private Object syndicatedLoanActivationActionTaskRecord = null;

  private String syndicatedLoanServicingSessionReference = null;

  private Object syndicatedLoanServicingSessionRecord = null;

  private SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord = null;

  private String syndicatedLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return syndicatedLoanActivationActionTaskReference
  **/

  public String getSyndicatedLoanActivationActionTaskReference() {
    return syndicatedLoanActivationActionTaskReference;
  }

  public void setSyndicatedLoanActivationActionTaskReference(String syndicatedLoanActivationActionTaskReference) {
    this.syndicatedLoanActivationActionTaskReference = syndicatedLoanActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return syndicatedLoanActivationActionTaskRecord
  **/

  public Object getSyndicatedLoanActivationActionTaskRecord() {
    return syndicatedLoanActivationActionTaskRecord;
  }

  public void setSyndicatedLoanActivationActionTaskRecord(Object syndicatedLoanActivationActionTaskRecord) {
    this.syndicatedLoanActivationActionTaskRecord = syndicatedLoanActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return syndicatedLoanServicingSessionReference
  **/

  public String getSyndicatedLoanServicingSessionReference() {
    return syndicatedLoanServicingSessionReference;
  }

  public void setSyndicatedLoanServicingSessionReference(String syndicatedLoanServicingSessionReference) {
    this.syndicatedLoanServicingSessionReference = syndicatedLoanServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return syndicatedLoanServicingSessionRecord
  **/

  public Object getSyndicatedLoanServicingSessionRecord() {
    return syndicatedLoanServicingSessionRecord;
  }

  public void setSyndicatedLoanServicingSessionRecord(Object syndicatedLoanServicingSessionRecord) {
    this.syndicatedLoanServicingSessionRecord = syndicatedLoanServicingSessionRecord;
  }


  /**
   * Get syndicatedLoanServiceConfigurationRecord
   * @return syndicatedLoanServiceConfigurationRecord
  **/

  public SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord getSyndicatedLoanServiceConfigurationRecord() {
    return syndicatedLoanServiceConfigurationRecord;
  }

  public void setSyndicatedLoanServiceConfigurationRecord(SDSyndicatedLoanActivateOutputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord) {
    this.syndicatedLoanServiceConfigurationRecord = syndicatedLoanServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return syndicatedLoanServicingSessionStatus
  **/

  public String getSyndicatedLoanServicingSessionStatus() {
    return syndicatedLoanServicingSessionStatus;
  }

  public void setSyndicatedLoanServicingSessionStatus(String syndicatedLoanServicingSessionStatus) {
    this.syndicatedLoanServicingSessionStatus = syndicatedLoanServicingSessionStatus;
  }


}

