package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveOutputModel
 */
public class SDSyndicatedLoanRetrieveOutputModel   {
  private String syndicatedLoanRetrieveActionTaskReference = null;

  private Object syndicatedLoanRetrieveActionTaskRecord = null;

  private String syndicatedLoanRetrieveActionResponse = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord syndicatedLoanRetrieveActionRecord = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService syndicatedLoanOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return syndicatedLoanRetrieveActionTaskReference
  **/

  public String getSyndicatedLoanRetrieveActionTaskReference() {
    return syndicatedLoanRetrieveActionTaskReference;
  }

  public void setSyndicatedLoanRetrieveActionTaskReference(String syndicatedLoanRetrieveActionTaskReference) {
    this.syndicatedLoanRetrieveActionTaskReference = syndicatedLoanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return syndicatedLoanRetrieveActionResponse
  **/

  public String getSyndicatedLoanRetrieveActionResponse() {
    return syndicatedLoanRetrieveActionResponse;
  }

  public void setSyndicatedLoanRetrieveActionResponse(String syndicatedLoanRetrieveActionResponse) {
    this.syndicatedLoanRetrieveActionResponse = syndicatedLoanRetrieveActionResponse;
  }


  /**
   * Get syndicatedLoanRetrieveActionRecord
   * @return syndicatedLoanRetrieveActionRecord
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord getSyndicatedLoanRetrieveActionRecord() {
    return syndicatedLoanRetrieveActionRecord;
  }

  public void setSyndicatedLoanRetrieveActionRecord(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord syndicatedLoanRetrieveActionRecord) {
    this.syndicatedLoanRetrieveActionRecord = syndicatedLoanRetrieveActionRecord;
  }


  /**
   * Get syndicatedLoanOfferedService
   * @return syndicatedLoanOfferedService
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService getSyndicatedLoanOfferedService() {
    return syndicatedLoanOfferedService;
  }

  public void setSyndicatedLoanOfferedService(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedService syndicatedLoanOfferedService) {
    this.syndicatedLoanOfferedService = syndicatedLoanOfferedService;
  }


}

