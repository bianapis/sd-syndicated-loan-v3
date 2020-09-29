package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord
 */
public class SDSyndicatedLoanRetrieveInputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord   {
  private String syndicatedLoanServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return syndicatedLoanServiceVersion
  **/

  public String getSyndicatedLoanServiceVersion() {
    return syndicatedLoanServiceVersion;
  }

  public void setSyndicatedLoanServiceVersion(String syndicatedLoanServiceVersion) {
    this.syndicatedLoanServiceVersion = syndicatedLoanServiceVersion;
  }


}

