package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService
 */
public class SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService   {
  private String syndicatedLoanServiceReference = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord syndicatedLoanServiceRecord = null;


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
   * Get syndicatedLoanServiceRecord
   * @return syndicatedLoanServiceRecord
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord getSyndicatedLoanServiceRecord() {
    return syndicatedLoanServiceRecord;
  }

  public void setSyndicatedLoanServiceRecord(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord syndicatedLoanServiceRecord) {
    this.syndicatedLoanServiceRecord = syndicatedLoanServiceRecord;
  }


}

