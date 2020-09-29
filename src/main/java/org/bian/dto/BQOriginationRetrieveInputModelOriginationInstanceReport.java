package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOriginationRetrieveInputModelOriginationInstanceReport
 */
public class BQOriginationRetrieveInputModelOriginationInstanceReport   {
  private String originationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return originationInstanceReportReference
  **/

  public String getOriginationInstanceReportReference() {
    return originationInstanceReportReference;
  }

  public void setOriginationInstanceReportReference(String originationInstanceReportReference) {
    this.originationInstanceReportReference = originationInstanceReportReference;
  }


}

