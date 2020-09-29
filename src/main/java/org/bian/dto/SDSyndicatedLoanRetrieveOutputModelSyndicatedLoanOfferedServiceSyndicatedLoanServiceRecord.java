package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord
 */
public class SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecord   {
  private String syndicatedLoanServiceType = null;

  private String syndicatedLoanServiceVersion = null;

  private String syndicatedLoanServiceDescription = null;

  private SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines syndicatedLoanServicePoliciesandGuidelines = null;

  private String syndicatedLoanServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return syndicatedLoanServiceType
  **/

  public String getSyndicatedLoanServiceType() {
    return syndicatedLoanServiceType;
  }

  public void setSyndicatedLoanServiceType(String syndicatedLoanServiceType) {
    this.syndicatedLoanServiceType = syndicatedLoanServiceType;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return syndicatedLoanServiceDescription
  **/

  public String getSyndicatedLoanServiceDescription() {
    return syndicatedLoanServiceDescription;
  }

  public void setSyndicatedLoanServiceDescription(String syndicatedLoanServiceDescription) {
    this.syndicatedLoanServiceDescription = syndicatedLoanServiceDescription;
  }


  /**
   * Get syndicatedLoanServicePoliciesandGuidelines
   * @return syndicatedLoanServicePoliciesandGuidelines
  **/

  public SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines getSyndicatedLoanServicePoliciesandGuidelines() {
    return syndicatedLoanServicePoliciesandGuidelines;
  }

  public void setSyndicatedLoanServicePoliciesandGuidelines(SDSyndicatedLoanRetrieveOutputModelSyndicatedLoanOfferedServiceSyndicatedLoanServiceRecordSyndicatedLoanServicePoliciesandGuidelines syndicatedLoanServicePoliciesandGuidelines) {
    this.syndicatedLoanServicePoliciesandGuidelines = syndicatedLoanServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return syndicatedLoanServiceSchedule
  **/

  public String getSyndicatedLoanServiceSchedule() {
    return syndicatedLoanServiceSchedule;
  }

  public void setSyndicatedLoanServiceSchedule(String syndicatedLoanServiceSchedule) {
    this.syndicatedLoanServiceSchedule = syndicatedLoanServiceSchedule;
  }


}

