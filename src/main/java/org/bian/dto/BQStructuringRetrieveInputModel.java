package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQStructuringRetrieveInputModelStructuringInstanceAnalysis;
import org.bian.dto.BQStructuringRetrieveInputModelStructuringInstanceReport;

import javax.validation.Valid;
  
/**
 * BQStructuringRetrieveInputModel
 */
public class BQStructuringRetrieveInputModel   {
  private Object structuringRetrieveActionTaskRecord = null;

  private String structuringRetrieveActionRequest = null;

  private BQStructuringRetrieveInputModelStructuringInstanceReport structuringInstanceReport = null;

  private BQStructuringRetrieveInputModelStructuringInstanceAnalysis structuringInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return structuringRetrieveActionTaskRecord
  **/

  public Object getStructuringRetrieveActionTaskRecord() {
    return structuringRetrieveActionTaskRecord;
  }

  public void setStructuringRetrieveActionTaskRecord(Object structuringRetrieveActionTaskRecord) {
    this.structuringRetrieveActionTaskRecord = structuringRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return structuringRetrieveActionRequest
  **/

  public String getStructuringRetrieveActionRequest() {
    return structuringRetrieveActionRequest;
  }

  public void setStructuringRetrieveActionRequest(String structuringRetrieveActionRequest) {
    this.structuringRetrieveActionRequest = structuringRetrieveActionRequest;
  }


  /**
   * Get structuringInstanceReport
   * @return structuringInstanceReport
  **/

  public BQStructuringRetrieveInputModelStructuringInstanceReport getStructuringInstanceReport() {
    return structuringInstanceReport;
  }

  public void setStructuringInstanceReport(BQStructuringRetrieveInputModelStructuringInstanceReport structuringInstanceReport) {
    this.structuringInstanceReport = structuringInstanceReport;
  }


  /**
   * Get structuringInstanceAnalysis
   * @return structuringInstanceAnalysis
  **/

  public BQStructuringRetrieveInputModelStructuringInstanceAnalysis getStructuringInstanceAnalysis() {
    return structuringInstanceAnalysis;
  }

  public void setStructuringInstanceAnalysis(BQStructuringRetrieveInputModelStructuringInstanceAnalysis structuringInstanceAnalysis) {
    this.structuringInstanceAnalysis = structuringInstanceAnalysis;
  }


}

