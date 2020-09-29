package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis
 */
public class CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceAnalysis   {
  private String syndicatedLoanArrangementInstanceAnalysisReference = null;

  private String syndicatedLoanArrangementInstanceAnalysisReportType = null;

  private String syndicatedLoanArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return syndicatedLoanArrangementInstanceAnalysisReference
  **/

  public String getSyndicatedLoanArrangementInstanceAnalysisReference() {
    return syndicatedLoanArrangementInstanceAnalysisReference;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysisReference(String syndicatedLoanArrangementInstanceAnalysisReference) {
    this.syndicatedLoanArrangementInstanceAnalysisReference = syndicatedLoanArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return syndicatedLoanArrangementInstanceAnalysisParameters
  **/

  public String getSyndicatedLoanArrangementInstanceAnalysisParameters() {
    return syndicatedLoanArrangementInstanceAnalysisParameters;
  }

  public void setSyndicatedLoanArrangementInstanceAnalysisParameters(String syndicatedLoanArrangementInstanceAnalysisParameters) {
    this.syndicatedLoanArrangementInstanceAnalysisParameters = syndicatedLoanArrangementInstanceAnalysisParameters;
  }


}

