package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanConfigureOutputModel
 */
public class SDSyndicatedLoanConfigureOutputModel   {
  private String syndicatedLoanConfigurationActionTaskReference = null;

  private Object syndicatedLoanConfigurationActionTaskRecord = null;

  private SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord = null;

  private String syndicatedLoanServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return syndicatedLoanConfigurationActionTaskReference
  **/

  public String getSyndicatedLoanConfigurationActionTaskReference() {
    return syndicatedLoanConfigurationActionTaskReference;
  }

  public void setSyndicatedLoanConfigurationActionTaskReference(String syndicatedLoanConfigurationActionTaskReference) {
    this.syndicatedLoanConfigurationActionTaskReference = syndicatedLoanConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return syndicatedLoanConfigurationActionTaskRecord
  **/

  public Object getSyndicatedLoanConfigurationActionTaskRecord() {
    return syndicatedLoanConfigurationActionTaskRecord;
  }

  public void setSyndicatedLoanConfigurationActionTaskRecord(Object syndicatedLoanConfigurationActionTaskRecord) {
    this.syndicatedLoanConfigurationActionTaskRecord = syndicatedLoanConfigurationActionTaskRecord;
  }


  /**
   * Get syndicatedLoanServiceConfigurationRecord
   * @return syndicatedLoanServiceConfigurationRecord
  **/

  public SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord getSyndicatedLoanServiceConfigurationRecord() {
    return syndicatedLoanServiceConfigurationRecord;
  }

  public void setSyndicatedLoanServiceConfigurationRecord(SDSyndicatedLoanConfigureOutputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord) {
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

