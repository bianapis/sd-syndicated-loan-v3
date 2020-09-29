package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveInputModel
 */
public class SDSyndicatedLoanRetrieveInputModel   {
  private Object syndicatedLoanRetrieveActionTaskRecord = null;

  private String syndicatedLoanRetrieveActionRequest = null;

  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord syndicatedLoanRetrieveActionRecord = null;

  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService syndicatedLoanOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return syndicatedLoanRetrieveActionTaskRecord
  **/

  public Object getSyndicatedLoanRetrieveActionTaskRecord() {
    return syndicatedLoanRetrieveActionTaskRecord;
  }

  public void setSyndicatedLoanRetrieveActionTaskRecord(Object syndicatedLoanRetrieveActionTaskRecord) {
    this.syndicatedLoanRetrieveActionTaskRecord = syndicatedLoanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return syndicatedLoanRetrieveActionRequest
  **/

  public String getSyndicatedLoanRetrieveActionRequest() {
    return syndicatedLoanRetrieveActionRequest;
  }

  public void setSyndicatedLoanRetrieveActionRequest(String syndicatedLoanRetrieveActionRequest) {
    this.syndicatedLoanRetrieveActionRequest = syndicatedLoanRetrieveActionRequest;
  }


  /**
   * Get syndicatedLoanRetrieveActionRecord
   * @return syndicatedLoanRetrieveActionRecord
  **/

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord getSyndicatedLoanRetrieveActionRecord() {
    return syndicatedLoanRetrieveActionRecord;
  }

  public void setSyndicatedLoanRetrieveActionRecord(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord syndicatedLoanRetrieveActionRecord) {
    this.syndicatedLoanRetrieveActionRecord = syndicatedLoanRetrieveActionRecord;
  }


  /**
   * Get syndicatedLoanOfferedService
   * @return syndicatedLoanOfferedService
  **/

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService getSyndicatedLoanOfferedService() {
    return syndicatedLoanOfferedService;
  }

  public void setSyndicatedLoanOfferedService(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedService syndicatedLoanOfferedService) {
    this.syndicatedLoanOfferedService = syndicatedLoanOfferedService;
  }


}

