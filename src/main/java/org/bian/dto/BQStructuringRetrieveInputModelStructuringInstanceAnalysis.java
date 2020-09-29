package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStructuringRetrieveInputModelStructuringInstanceAnalysis
 */
public class BQStructuringRetrieveInputModelStructuringInstanceAnalysis   {
  private String structuringInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return structuringInstanceAnalysisReference
  **/

  public String getStructuringInstanceAnalysisReference() {
    return structuringInstanceAnalysisReference;
  }

  public void setStructuringInstanceAnalysisReference(String structuringInstanceAnalysisReference) {
    this.structuringInstanceAnalysisReference = structuringInstanceAnalysisReference;
  }


}

