package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord
 */
public class CRSyndicatedLoanArrangementRetrieveInputModelSyndicatedLoanArrangementInstanceReportRecord   {
  private String syndicatedLoanArrangementInstanceReportReference = null;

  private String syndicatedLoanArrangementInstanceReportType = null;

  private String syndicatedLoanArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return syndicatedLoanArrangementInstanceReportReference
  **/

  public String getSyndicatedLoanArrangementInstanceReportReference() {
    return syndicatedLoanArrangementInstanceReportReference;
  }

  public void setSyndicatedLoanArrangementInstanceReportReference(String syndicatedLoanArrangementInstanceReportReference) {
    this.syndicatedLoanArrangementInstanceReportReference = syndicatedLoanArrangementInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return syndicatedLoanArrangementInstanceReportParameters
  **/

  public String getSyndicatedLoanArrangementInstanceReportParameters() {
    return syndicatedLoanArrangementInstanceReportParameters;
  }

  public void setSyndicatedLoanArrangementInstanceReportParameters(String syndicatedLoanArrangementInstanceReportParameters) {
    this.syndicatedLoanArrangementInstanceReportParameters = syndicatedLoanArrangementInstanceReportParameters;
  }


}

