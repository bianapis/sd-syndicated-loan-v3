package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStructuringRetrieveOutputModelStructuringInstanceAnalysis
 */
public class BQStructuringRetrieveOutputModelStructuringInstanceAnalysis   {
  private Object structuringInstanceAnalysisRecord = null;

  private String structuringInstanceAnalysisReportType = null;

  private String structuringInstanceAnalysisParameters = null;

  private Object structuringInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return structuringInstanceAnalysisRecord
  **/

  public Object getStructuringInstanceAnalysisRecord() {
    return structuringInstanceAnalysisRecord;
  }

  public void setStructuringInstanceAnalysisRecord(Object structuringInstanceAnalysisRecord) {
    this.structuringInstanceAnalysisRecord = structuringInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return structuringInstanceAnalysisReportType
  **/

  public String getStructuringInstanceAnalysisReportType() {
    return structuringInstanceAnalysisReportType;
  }

  public void setStructuringInstanceAnalysisReportType(String structuringInstanceAnalysisReportType) {
    this.structuringInstanceAnalysisReportType = structuringInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return structuringInstanceAnalysisParameters
  **/

  public String getStructuringInstanceAnalysisParameters() {
    return structuringInstanceAnalysisParameters;
  }

  public void setStructuringInstanceAnalysisParameters(String structuringInstanceAnalysisParameters) {
    this.structuringInstanceAnalysisParameters = structuringInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return structuringInstanceAnalysisReport
  **/

  public Object getStructuringInstanceAnalysisReport() {
    return structuringInstanceAnalysisReport;
  }

  public void setStructuringInstanceAnalysisReport(Object structuringInstanceAnalysisReport) {
    this.structuringInstanceAnalysisReport = structuringInstanceAnalysisReport;
  }


}

