package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport
 */
public class BQSyndicateAssemblyRetrieveInputModelSyndicateAssemblyInstanceReport   {
  private String syndicateAssemblyInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return syndicateAssemblyInstanceReportReference
  **/

  public String getSyndicateAssemblyInstanceReportReference() {
    return syndicateAssemblyInstanceReportReference;
  }

  public void setSyndicateAssemblyInstanceReportReference(String syndicateAssemblyInstanceReportReference) {
    this.syndicateAssemblyInstanceReportReference = syndicateAssemblyInstanceReportReference;
  }


}

