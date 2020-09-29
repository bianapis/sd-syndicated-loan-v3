package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanFeedbackInputModelSyndicatedLoanFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanFeedbackInputModel
 */
public class SDSyndicatedLoanFeedbackInputModel   {
  private Object syndicatedLoanFeedbackActionTaskRecord = null;

  private SDSyndicatedLoanFeedbackInputModelSyndicatedLoanFeedbackActionRecord syndicatedLoanFeedbackActionRecord = null;


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

  public SDSyndicatedLoanFeedbackInputModelSyndicatedLoanFeedbackActionRecord getSyndicatedLoanFeedbackActionRecord() {
    return syndicatedLoanFeedbackActionRecord;
  }

  public void setSyndicatedLoanFeedbackActionRecord(SDSyndicatedLoanFeedbackInputModelSyndicatedLoanFeedbackActionRecord syndicatedLoanFeedbackActionRecord) {
    this.syndicatedLoanFeedbackActionRecord = syndicatedLoanFeedbackActionRecord;
  }


}

