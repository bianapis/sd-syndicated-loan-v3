package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanFeedbackOutputModelSyndicatedLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanFeedbackOutputModel
 */
public class SDSyndicatedLoanFeedbackOutputModel   {
  private String syndicatedLoanFeedbackActionTaskReference = null;

  private Object syndicatedLoanFeedbackActionTaskRecord = null;

  private SDSyndicatedLoanFeedbackOutputModelSyndicatedLoanFeedbackActionRecord syndicatedLoanFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return syndicatedLoanFeedbackActionTaskReference
  **/

  public String getSyndicatedLoanFeedbackActionTaskReference() {
    return syndicatedLoanFeedbackActionTaskReference;
  }

  public void setSyndicatedLoanFeedbackActionTaskReference(String syndicatedLoanFeedbackActionTaskReference) {
    this.syndicatedLoanFeedbackActionTaskReference = syndicatedLoanFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return syndicatedLoanFeedbackActionTaskRecord
  **/

  public Object getSyndicatedLoanFeedbackActionTaskRecord() {
    return syndicatedLoanFeedbackActionTaskRecord;
  }

  public void setSyndicatedLoanFeedbackActionTaskRecord(Object syndicatedLoanFeedbackActionTaskRecord) {
    this.syndicatedLoanFeedbackActionTaskRecord = syndicatedLoanFeedbackActionTaskRecord;
  }


  /**
   * Get syndicatedLoanFeedbackActionRecord
   * @return syndicatedLoanFeedbackActionRecord
  **/

  public SDSyndicatedLoanFeedbackOutputModelSyndicatedLoanFeedbackActionRecord getSyndicatedLoanFeedbackActionRecord() {
    return syndicatedLoanFeedbackActionRecord;
  }

  public void setSyndicatedLoanFeedbackActionRecord(SDSyndicatedLoanFeedbackOutputModelSyndicatedLoanFeedbackActionRecord syndicatedLoanFeedbackActionRecord) {
    this.syndicatedLoanFeedbackActionRecord = syndicatedLoanFeedbackActionRecord;
  }


}

