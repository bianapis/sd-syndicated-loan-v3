package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStructuringRetrieveInputModelStructuringInstanceReport
 */
public class BQStructuringRetrieveInputModelStructuringInstanceReport   {
  private String structuringInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return structuringInstanceReportReference
  **/

  public String getStructuringInstanceReportReference() {
    return structuringInstanceReportReference;
  }

  public void setStructuringInstanceReportReference(String structuringInstanceReportReference) {
    this.structuringInstanceReportReference = structuringInstanceReportReference;
  }


}

