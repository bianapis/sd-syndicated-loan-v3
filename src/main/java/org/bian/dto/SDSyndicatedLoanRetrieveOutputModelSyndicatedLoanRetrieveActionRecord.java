package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord
 */
public class SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecord   {
  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis syndicatedLoanActivityAnalysis = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis syndicatedLoanPerformanceAnalysis = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get syndicatedLoanActivityAnalysis
   * @return syndicatedLoanActivityAnalysis
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis getSyndicatedLoanActivityAnalysis() {
    return syndicatedLoanActivityAnalysis;
  }

  public void setSyndicatedLoanActivityAnalysis(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis syndicatedLoanActivityAnalysis) {
    this.syndicatedLoanActivityAnalysis = syndicatedLoanActivityAnalysis;
  }


  /**
   * Get syndicatedLoanPerformanceAnalysis
   * @return syndicatedLoanPerformanceAnalysis
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis getSyndicatedLoanPerformanceAnalysis() {
    return syndicatedLoanPerformanceAnalysis;
  }

  public void setSyndicatedLoanPerformanceAnalysis(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis syndicatedLoanPerformanceAnalysis) {
    this.syndicatedLoanPerformanceAnalysis = syndicatedLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

