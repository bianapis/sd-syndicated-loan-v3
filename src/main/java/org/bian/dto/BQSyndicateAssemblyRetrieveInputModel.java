package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis;
import org.bian.dto.BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveInputModel
 */
public class BQSyndicateAssemblyRetrieveInputModel   {
  private Object syndicateAssemblyRetrieveActionTaskRecord = null;

  private String syndicateAssemblyRetrieveActionRequest = null;

  private BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport syndicateAssemblyInstanceReport = null;

  private BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis syndicateAssemblyInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return syndicateAssemblyRetrieveActionTaskRecord
  **/

  public Object getSyndicateAssemblyRetrieveActionTaskRecord() {
    return syndicateAssemblyRetrieveActionTaskRecord;
  }

  public void setSyndicateAssemblyRetrieveActionTaskRecord(Object syndicateAssemblyRetrieveActionTaskRecord) {
    this.syndicateAssemblyRetrieveActionTaskRecord = syndicateAssemblyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return syndicateAssemblyRetrieveActionRequest
  **/

  public String getSyndicateAssemblyRetrieveActionRequest() {
    return syndicateAssemblyRetrieveActionRequest;
  }

  public void setSyndicateAssemblyRetrieveActionRequest(String syndicateAssemblyRetrieveActionRequest) {
    this.syndicateAssemblyRetrieveActionRequest = syndicateAssemblyRetrieveActionRequest;
  }


  /**
   * Get syndicateAssemblyInstanceReport
   * @return syndicateAssemblyInstanceReport
  **/

  public BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport getSyndicateAssemblyInstanceReport() {
    return syndicateAssemblyInstanceReport;
  }

  public void setSyndicateAssemblyInstanceReport(BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport syndicateAssemblyInstanceReport) {
    this.syndicateAssemblyInstanceReport = syndicateAssemblyInstanceReport;
  }


  /**
   * Get syndicateAssemblyInstanceAnalysis
   * @return syndicateAssemblyInstanceAnalysis
  **/

  public BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis getSyndicateAssemblyInstanceAnalysis() {
    return syndicateAssemblyInstanceAnalysis;
  }

  public void setSyndicateAssemblyInstanceAnalysis(BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis syndicateAssemblyInstanceAnalysis) {
    this.syndicateAssemblyInstanceAnalysis = syndicateAssemblyInstanceAnalysis;
  }


}

