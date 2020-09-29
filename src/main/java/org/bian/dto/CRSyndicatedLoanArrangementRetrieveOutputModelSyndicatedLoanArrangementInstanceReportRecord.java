package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord
 */
public class CRSyndicatedLoanArrangementRetrieveOutputModelSyndicatedLoanArrangementInstanceReportRecord   {
  private String syndicatedLoanArrangementInstanceReportData = null;

  private String syndicatedLoanArrangementInstanceReportType = null;

  private Object syndicatedLoanArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return syndicatedLoanArrangementInstanceReportData
  **/

  public String getSyndicatedLoanArrangementInstanceReportData() {
    return syndicatedLoanArrangementInstanceReportData;
  }

  public void setSyndicatedLoanArrangementInstanceReportData(String syndicatedLoanArrangementInstanceReportData) {
    this.syndicatedLoanArrangementInstanceReportData = syndicatedLoanArrangementInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return syndicatedLoanArrangementInstanceReportType
  **/

  public String getSyndicatedLoanArrangementInstanceReportType() {
    return syndicatedLoanArrangementInstanceReportType;
  }

  public void setSyndicatedLoanArrangementInstanceReportType(String syndicatedLoanArrangementInstanceReportType) {
    this.syndicatedLoanArrangementInstanceReportType = syndicatedLoanArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return syndicatedLoanArrangementInstanceReport
  **/

  public Object getSyndicatedLoanArrangementInstanceReport() {
    return syndicatedLoanArrangementInstanceReport;
  }

  public void setSyndicatedLoanArrangementInstanceReport(Object syndicatedLoanArrangementInstanceReport) {
    this.syndicatedLoanArrangementInstanceReport = syndicatedLoanArrangementInstanceReport;
  }


}

