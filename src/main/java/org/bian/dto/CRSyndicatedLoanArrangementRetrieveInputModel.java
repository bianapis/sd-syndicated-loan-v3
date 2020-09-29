package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis;
import org.bian.dto.CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveInputModel
 */
public class CRSyndicatedLoanArrangementRetrieveInputModel   {
  private Object syndicatedLoanArrangementRetrieveActionTaskRecord = null;

  private String syndicatedLoanArrangementRetrieveActionRequest = null;

  private CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord syndicatedLoanArrangementInstanceReportRecord = null;

  private CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis syndicatedLoanArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return syndicatedLoanArrangementRetrieveActionTaskRecord
  **/

  public Object getSyndicatedLoanArrangementRetrieveActionTaskRecord() {
    return syndicatedLoanArrangementRetrieveActionTaskRecord;
  }

  public void setSyndicatedLoanArrangementRetrieveActionTaskRecord(Object syndicatedLoanArrangementRetrieveActionTaskRecord) {
    this.syndicatedLoanArrangementRetrieveActionTaskRecord = syndicatedLoanArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return syndicatedLoanArrangementRetrieveActionRequest
  **/

  public String getSyndicatedLoanArrangementRetrieveActionRequest() {
    return syndicatedLoanArrangementRetrieveActionRequest;
  }

  public void setSyndicatedLoanArrangementRetrieveActionRequest(String syndicatedLoanArrangementRetrieveActionRequest) {
    this.syndicatedLoanArrangementRetrieveActionRequest = syndicatedLoanArrangementRetrieveActionRequest;
  }


  /**
   * Get syndicatedLoanArrangementInstanceReportRecord
   * @return syndicatedLoanArrangementInstanceReportRecord
  **/

  public CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord getSyndicatedLoanArrangementInstanceReportRecord() {
    return syndicatedLoanArrangementInstanceReportRecord;
  }

  public void setSyndicatedLoanArrangementInstanceReportRecord(CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord syndicatedLoanArrangementInstanceReportRecord) {
    this.syndicatedLoanArrangementInstanceReportRecord = syndicatedLoanArrangementInstanceReportRecord;
  }


  /**
   * Get syndicatedLoanArrangementInstanceAnalysis
   * @return syndicatedLoanArrangementInstanceAnalysis
  **/

  public CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis getSyndicatedLoanArrangementInstanceAnalysis() {
    return syndicatedLoanArrangementInstanceAnalysis;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysis(CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis syndicatedLoanArrangementInstanceAnalysis) {
    this.syndicatedLoanArrangementInstanceAnalysis = syndicatedLoanArrangementInstanceAnalysis;
  }


}

