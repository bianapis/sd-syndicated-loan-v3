package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanConfigureInputModel
 */
public class SDSyndicatedLoanConfigureInputModel   {
  private Object syndicatedLoanConfigurationActionTaskRecord = null;

  private String syndicatedLoanServicingSessionReference = null;

  private String syndicatedLoanServiceReference = null;

  private SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return syndicatedLoanServiceReference
  **/

  public String getSyndicatedLoanServiceReference() {
    return syndicatedLoanServiceReference;
  }

  public void setSyndicatedLoanServiceReference(String syndicatedLoanServiceReference) {
    this.syndicatedLoanServiceReference = syndicatedLoanServiceReference;
  }


  /**
   * Get syndicatedLoanServiceConfigurationRecord
   * @return syndicatedLoanServiceConfigurationRecord
  **/

  public SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord getSyndicatedLoanServiceConfigurationRecord() {
    return syndicatedLoanServiceConfigurationRecord;
  }

  public void setSyndicatedLoanServiceConfigurationRecord(SDSyndicatedLoanConfigureInputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord) {
    this.syndicatedLoanServiceConfigurationRecord = syndicatedLoanServiceConfigurationRecord;
  }


}

