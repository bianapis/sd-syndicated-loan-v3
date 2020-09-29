package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOriginationRetrieveOutputModelOriginationInstanceReport
 */
public class BQOriginationRetrieveOutputModelOriginationInstanceReport   {
  private Object originationInstanceReportRecord = null;

  private String originationInstanceReportType = null;

  private String originationInstanceReportParameters = null;

  private Object originationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return originationInstanceReportRecord
  **/

  public Object getOriginationInstanceReportRecord() {
    return originationInstanceReportRecord;
  }

  public void setOriginationInstanceReportRecord(Object originationInstanceReportRecord) {
    this.originationInstanceReportRecord = originationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return originationInstanceReportType
  **/

  public String getOriginationInstanceReportType() {
    return originationInstanceReportType;
  }

  public void setOriginationInstanceReportType(String originationInstanceReportType) {
    this.originationInstanceReportType = originationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return originationInstanceReportParameters
  **/

  public String getOriginationInstanceReportParameters() {
    return originationInstanceReportParameters;
  }

  public void setOriginationInstanceReportParameters(String originationInstanceReportParameters) {
    this.originationInstanceReportParameters = originationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return originationInstanceReport
  **/

  public Object getOriginationInstanceReport() {
    return originationInstanceReport;
  }

  public void setOriginationInstanceReport(Object originationInstanceReport) {
    this.originationInstanceReport = originationInstanceReport;
  }


}

