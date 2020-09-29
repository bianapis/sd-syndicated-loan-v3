package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOriginationRetrieveInputModelOriginationInstanceAnalysis;
import org.bian.dto.BQOriginationRetrieveInputModelOriginationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOriginationRetrieveInputModel
 */
public class BQOriginationRetrieveInputModel   {
  private Object originationRetrieveActionTaskRecord = null;

  private String originationRetrieveActionRequest = null;

  private BQOriginationRetrieveInputModelOriginationInstanceReport originationInstanceReport = null;

  private BQOriginationRetrieveInputModelOriginationInstanceAnalysis originationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return originationRetrieveActionTaskRecord
  **/

  public Object getOriginationRetrieveActionTaskRecord() {
    return originationRetrieveActionTaskRecord;
  }

  public void setOriginationRetrieveActionTaskRecord(Object originationRetrieveActionTaskRecord) {
    this.originationRetrieveActionTaskRecord = originationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return originationRetrieveActionRequest
  **/

  public String getOriginationRetrieveActionRequest() {
    return originationRetrieveActionRequest;
  }

  public void setOriginationRetrieveActionRequest(String originationRetrieveActionRequest) {
    this.originationRetrieveActionRequest = originationRetrieveActionRequest;
  }


  /**
   * Get originationInstanceReport
   * @return originationInstanceReport
  **/

  public BQOriginationRetrieveInputModelOriginationInstanceReport getOriginationInstanceReport() {
    return originationInstanceReport;
  }

  public void setOriginationInstanceReport(BQOriginationRetrieveInputModelOriginationInstanceReport originationInstanceReport) {
    this.originationInstanceReport = originationInstanceReport;
  }


  /**
   * Get originationInstanceAnalysis
   * @return originationInstanceAnalysis
  **/

  public BQOriginationRetrieveInputModelOriginationInstanceAnalysis getOriginationInstanceAnalysis() {
    return originationInstanceAnalysis;
  }

  public void setOriginationInstanceAnalysis(BQOriginationRetrieveInputModelOriginationInstanceAnalysis originationInstanceAnalysis) {
    this.originationInstanceAnalysis = originationInstanceAnalysis;
  }


}

