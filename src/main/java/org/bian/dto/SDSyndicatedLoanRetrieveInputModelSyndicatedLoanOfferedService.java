package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService
 */
public class SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService   {
  private String syndicatedLoanServiceReference = null;

  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord syndicatedLoanServiceRecord = null;


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

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord getSyndicatedLoanServiceRecord() {
    return syndicatedLoanServiceRecord;
  }

  public void setSyndicatedLoanServiceRecord(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord syndicatedLoanServiceRecord) {
    this.syndicatedLoanServiceRecord = syndicatedLoanServiceRecord;
  }


}

