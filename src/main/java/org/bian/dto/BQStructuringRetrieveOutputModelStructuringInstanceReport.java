package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStructuringRetrieveOutputModelStructuringInstanceReport
 */
public class BQStructuringRetrieveOutputModelStructuringInstanceReport   {
  private Object structuringInstanceReportRecord = null;

  private String structuringInstanceReportType = null;

  private String structuringInstanceReportParameters = null;

  private Object structuringInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return structuringInstanceReportRecord
  **/

  public Object getStructuringInstanceReportRecord() {
    return structuringInstanceReportRecord;
  }

  public void setStructuringInstanceReportRecord(Object structuringInstanceReportRecord) {
    this.structuringInstanceReportRecord = structuringInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return structuringInstanceReportType
  **/

  public String getStructuringInstanceReportType() {
    return structuringInstanceReportType;
  }

  public void setStructuringInstanceReportType(String structuringInstanceReportType) {
    this.structuringInstanceReportType = structuringInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return structuringInstanceReportParameters
  **/

  public String getStructuringInstanceReportParameters() {
    return structuringInstanceReportParameters;
  }

  public void setStructuringInstanceReportParameters(String structuringInstanceReportParameters) {
    this.structuringInstanceReportParameters = structuringInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return structuringInstanceReport
  **/

  public Object getStructuringInstanceReport() {
    return structuringInstanceReport;
  }

  public void setStructuringInstanceReport(Object structuringInstanceReport) {
    this.structuringInstanceReport = structuringInstanceReport;
  }


}

