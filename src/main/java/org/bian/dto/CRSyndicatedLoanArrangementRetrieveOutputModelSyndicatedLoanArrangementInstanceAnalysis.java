package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis
 */
public class CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceAnalysis   {
  private String syndicatedLoanArrangementInstanceAnalysisData = null;

  private String syndicatedLoanArrangementInstanceAnalysisReportType = null;

  private Object syndicatedLoanArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return syndicatedLoanArrangementInstanceAnalysisData
  **/

  public String getSyndicatedLoanArrangementInstanceAnalysisData() {
    return syndicatedLoanArrangementInstanceAnalysisData;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysisData(String syndicatedLoanArrangementInstanceAnalysisData) {
    this.syndicatedLoanArrangementInstanceAnalysisData = syndicatedLoanArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return syndicatedLoanArrangementInstanceAnalysisReportType
  **/

  public String getSyndicatedLoanArrangementInstanceAnalysisReportType() {
    return syndicatedLoanArrangementInstanceAnalysisReportType;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysisReportType(String syndicatedLoanArrangementInstanceAnalysisReportType) {
    this.syndicatedLoanArrangementInstanceAnalysisReportType = syndicatedLoanArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return syndicatedLoanArrangementInstanceAnalysisReport
  **/

  public Object getSyndicatedLoanArrangementInstanceAnalysisReport() {
    return syndicatedLoanArrangementInstanceAnalysisReport;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysisReport(Object syndicatedLoanArrangementInstanceAnalysisReport) {
    this.syndicatedLoanArrangementInstanceAnalysisReport = syndicatedLoanArrangementInstanceAnalysisReport;
  }


}

