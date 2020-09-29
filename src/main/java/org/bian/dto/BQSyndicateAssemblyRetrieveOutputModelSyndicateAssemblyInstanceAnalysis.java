package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis
 */
public class BQSyndicateAssemblyRetrieveOutputModelSyndicateAssemblyInstanceAnalysis   {
  private Object syndicateAssemblyInstanceAnalysisRecord = null;

  private String syndicateAssemblyInstanceAnalysisReportType = null;

  private String syndicateAssemblyInstanceAnalysisParameters = null;

  private Object syndicateAssemblyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return syndicateAssemblyInstanceAnalysisRecord
  **/

  public Object getSyndicateAssemblyInstanceAnalysisRecord() {
    return syndicateAssemblyInstanceAnalysisRecord;
  }

  public void setSyndicateAssemblyInstanceAnalysisRecord(Object syndicateAssemblyInstanceAnalysisRecord) {
    this.syndicateAssemblyInstanceAnalysisRecord = syndicateAssemblyInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return syndicateAssemblyInstanceAnalysisReportType
  **/

  public String getSyndicateAssemblyInstanceAnalysisReportType() {
    return syndicateAssemblyInstanceAnalysisReportType;
  }

  public void setSyndicateAssemblyInstanceAnalysisReportType(String syndicateAssemblyInstanceAnalysisReportType) {
    this.syndicateAssemblyInstanceAnalysisReportType = syndicateAssemblyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return syndicateAssemblyInstanceAnalysisParameters
  **/

  public String getSyndicateAssemblyInstanceAnalysisParameters() {
    return syndicateAssemblyInstanceAnalysisParameters;
  }

  public void setSyndicateAssemblyInstanceAnalysisParameters(String syndicateAssemblyInstanceAnalysisParameters) {
    this.syndicateAssemblyInstanceAnalysisParameters = syndicateAssemblyInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return syndicateAssemblyInstanceAnalysisReport
  **/

  public Object getSyndicateAssemblyInstanceAnalysisReport() {
    return syndicateAssemblyInstanceAnalysisReport;
  }

  public void setSyndicateAssemblyInstanceAnalysisReport(Object syndicateAssemblyInstanceAnalysisReport) {
    this.syndicateAssemblyInstanceAnalysisReport = syndicateAssemblyInstanceAnalysisReport;
  }


}

