package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport
 */
public class BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceReport   {
  private Object syndicateAssemblyInstanceReportRecord = null;

  private String syndicateAssemblyInstanceReportType = null;

  private String syndicateAssemblyInstanceReportParameters = null;

  private Object syndicateAssemblyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return syndicateAssemblyInstanceReportRecord
  **/

  public Object getSyndicateAssemblyInstanceReportRecord() {
    return syndicateAssemblyInstanceReportRecord;
  }

  public void setSyndicateAssemblyInstanceReportRecord(Object syndicateAssemblyInstanceReportRecord) {
    this.syndicateAssemblyInstanceReportRecord = syndicateAssemblyInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return syndicateAssemblyInstanceReportType
  **/

  public String getSyndicateAssemblyInstanceReportType() {
    return syndicateAssemblyInstanceReportType;
  }

  public void setSyndicateAssemblyInstanceReportType(String syndicateAssemblyInstanceReportType) {
    this.syndicateAssemblyInstanceReportType = syndicateAssemblyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return syndicateAssemblyInstanceReportParameters
  **/

  public String getSyndicateAssemblyInstanceReportParameters() {
    return syndicateAssemblyInstanceReportParameters;
  }

  public void setSyndicateAssemblyInstanceReportParameters(String syndicateAssemblyInstanceReportParameters) {
    this.syndicateAssemblyInstanceReportParameters = syndicateAssemblyInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return syndicateAssemblyInstanceReport
  **/

  public Object getSyndicateAssemblyInstanceReport() {
    return syndicateAssemblyInstanceReport;
  }

  public void setSyndicateAssemblyInstanceReport(Object syndicateAssemblyInstanceReport) {
    this.syndicateAssemblyInstanceReport = syndicateAssemblyInstanceReport;
  }


}

