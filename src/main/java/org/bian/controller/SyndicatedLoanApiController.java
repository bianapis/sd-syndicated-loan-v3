/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class SyndicatedLoanApiController {

	@Autowired
	SyndicatedLoanApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDSyndicatedLoanActivateOutputModel> activate(@RequestBody BianRequest<SDSyndicatedLoanActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDSyndicatedLoanConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSyndicatedLoanConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRSyndicatedLoanArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Exchange
	public BianResponse<BQFulfillmentExchangeOutputModel> exchangeFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("origination")
	@Fulfill.Exchange
	public BianResponse<BQOriginationExchangeOutputModel> exchangeOrigination(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOriginationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeOrigination(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("structuring")
	@Fulfill.Exchange
	public BianResponse<BQStructuringExchangeOutputModel> exchangeStructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStructuringExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeStructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("syndicateassembly")
	@Fulfill.Exchange
	public BianResponse<BQSyndicateAssemblyExchangeOutputModel> exchangeSyndicateassembly(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSyndicateAssemblyExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSyndicateassembly(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Exchange
	public BianResponse<CRSyndicatedLoanArrangementExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Execute
	public BianResponse<CRSyndicatedLoanArrangementExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDSyndicatedLoanFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDSyndicatedLoanFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRSyndicatedLoanArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("structuring")
	@Fulfill.Initiate
	public BianResponse<BQStructuringInitiateOutputModel> initiateStructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQStructuringInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateStructuring(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Request
	public BianResponse<BQFulfillmentRequestOutputModel> requestFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("origination")
	@Fulfill.Request
	public BianResponse<BQOriginationRequestOutputModel> requestOrigination(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOriginationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestOrigination(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("structuring")
	@Fulfill.Request
	public BianResponse<BQStructuringRequestOutputModel> requestStructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStructuringRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestStructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("syndicateassembly")
	@Fulfill.Request
	public BianResponse<BQSyndicateAssemblyRequestOutputModel> requestSyndicateassembly(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSyndicateAssemblyRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSyndicateassembly(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Request
	public BianResponse<CRSyndicatedLoanArrangementRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDSyndicatedLoanRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRSyndicatedLoanArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("fulfillment")
	@Fulfill.Retrieve
	public BianResponse<BQFulfillmentRetrieveOutputModel> retrieveFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveFulfillment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("origination")
	@Fulfill.Retrieve
	public BianResponse<BQOriginationRetrieveOutputModel> retrieveOrigination(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrigination(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("structuring")
	@Fulfill.Retrieve
	public BianResponse<BQStructuringRetrieveOutputModel> retrieveStructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStructuring(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("syndicateassembly")
	@Fulfill.Retrieve
	public BianResponse<BQSyndicateAssemblyRetrieveOutputModel> retrieveSyndicateassembly(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSyndicateassembly(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRSyndicatedLoanArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRSyndicatedLoanArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("fulfillment")
	@Fulfill.Update
	public BianResponse<BQFulfillmentUpdateOutputModel> updateFulfillment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQFulfillmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateFulfillment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("origination")
	@Fulfill.Update
	public BianResponse<BQOriginationUpdateOutputModel> updateOrigination(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOriginationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOrigination(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("structuring")
	@Fulfill.Update
	public BianResponse<BQStructuringUpdateOutputModel> updateStructuring(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStructuringUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateStructuring(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("syndicateassembly")
	@Fulfill.Update
	public BianResponse<BQSyndicateAssemblyUpdateOutputModel> updateSyndicateassembly(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSyndicateAssemblyUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSyndicateassembly(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
