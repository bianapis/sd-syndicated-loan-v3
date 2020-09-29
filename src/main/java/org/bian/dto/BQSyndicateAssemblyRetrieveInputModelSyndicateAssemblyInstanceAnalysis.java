package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis
 */
public class BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceAnalysis   {
  private String syndicateAssemblyInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return syndicateAssemblyInstanceAnalysisReference
  **/

  public String getSyndicateAssemblyInstanceAnalysisReference() {
    return syndicateAssemblyInstanceAnalysisReference;
  }

  public void setSyndicateAssemblyInstanceAnalysisReference(String syndicateAssemblyInstanceAnalysisReference) {
    this.syndicateAssemblyInstanceAnalysisReference = syndicateAssemblyInstanceAnalysisReference;
  }


}

