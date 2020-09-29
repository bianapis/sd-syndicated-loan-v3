package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanActivateInputModel
 */
public class SDSyndicatedLoanActivateInputModel   {
  private Object syndicatedLoanActivationActionTaskRecord = null;

  private String syndicatedLoanCenterReference = null;

  private String syndicatedLoanServiceReference = null;

  private SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return syndicatedLoanCenterReference
  **/

  public String getSyndicatedLoanCenterReference() {
    return syndicatedLoanCenterReference;
  }

  public void setSyndicatedLoanCenterReference(String syndicatedLoanCenterReference) {
    this.syndicatedLoanCenterReference = syndicatedLoanCenterReference;
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

  public SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord getSyndicatedLoanServiceConfigurationRecord() {
    return syndicatedLoanServiceConfigurationRecord;
  }

  public void setSyndicatedLoanServiceConfigurationRecord(SDSyndicatedLoanActivateInputModelSyndicatedLoanServiceConfigurationRecord syndicatedLoanServiceConfigurationRecord) {
    this.syndicatedLoanServiceConfigurationRecord = syndicatedLoanServiceConfigurationRecord;
  }


}

