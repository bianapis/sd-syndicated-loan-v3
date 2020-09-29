package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOriginationRetrieveOutputModelOriginationInstanceAnalysis
 */
public class BQOriginationRetrieveOutputModelOriginationInstanceAnalysis   {
  private Object originationInstanceAnalysisRecord = null;

  private String originationInstanceAnalysisReportType = null;

  private String originationInstanceAnalysisParameters = null;

  private Object originationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return originationInstanceAnalysisRecord
  **/

  public Object getOriginationInstanceAnalysisRecord() {
    return originationInstanceAnalysisRecord;
  }

  public void setOriginationInstanceAnalysisRecord(Object originationInstanceAnalysisRecord) {
    this.originationInstanceAnalysisRecord = originationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return originationInstanceAnalysisReportType
  **/

  public String getOriginationInstanceAnalysisReportType() {
    return originationInstanceAnalysisReportType;
  }

  public void setOriginationInstanceAnalysisReportType(String originationInstanceAnalysisReportType) {
    this.originationInstanceAnalysisReportType = originationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return originationInstanceAnalysisParameters
  **/

  public String getOriginationInstanceAnalysisParameters() {
    return originationInstanceAnalysisParameters;
  }

  public void setOriginationInstanceAnalysisParameters(String originationInstanceAnalysisParameters) {
    this.originationInstanceAnalysisParameters = originationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return originationInstanceAnalysisReport
  **/

  public Object getOriginationInstanceAnalysisReport() {
    return originationInstanceAnalysisReport;
  }

  public void setOriginationInstanceAnalysisReport(Object originationInstanceAnalysisReport) {
    this.originationInstanceAnalysisReport = originationInstanceAnalysisReport;
  }


}

