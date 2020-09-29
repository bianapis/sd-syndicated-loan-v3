package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis;
import org.bian.dto.SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord
 */
public class SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecord   {
  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis syndicatedLoanActivityAnalysis = null;

  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis syndicatedLoanPerformanceAnalysis = null;

  private SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get syndicatedLoanActivityAnalysis
   * @return syndicatedLoanActivityAnalysis
  **/

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis getSyndicatedLoanActivityAnalysis() {
    return syndicatedLoanActivityAnalysis;
  }

  public void setSyndicatedLoanActivityAnalysis(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanActivityAnalysis syndicatedLoanActivityAnalysis) {
    this.syndicatedLoanActivityAnalysis = syndicatedLoanActivityAnalysis;
  }


  /**
   * Get syndicatedLoanPerformanceAnalysis
   * @return syndicatedLoanPerformanceAnalysis
  **/

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis getSyndicatedLoanPerformanceAnalysis() {
    return syndicatedLoanPerformanceAnalysis;
  }

  public void setSyndicatedLoanPerformanceAnalysis(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordSyndicatedLoanPerformanceAnalysis syndicatedLoanPerformanceAnalysis) {
    this.syndicatedLoanPerformanceAnalysis = syndicatedLoanPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDSyndicatedLoanRetrieveInputModelSyndicatedLoanRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

