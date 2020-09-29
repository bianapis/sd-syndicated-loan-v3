/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SyndicatedLoanApiService {

	SDSyndicatedLoanActivateOutputModel activate(SDSyndicatedLoanActivateInputModel request);
	
	SDSyndicatedLoanConfigureOutputModel configure(String sdReferenceId, SDSyndicatedLoanConfigureInputModel request);
	
	CRSyndicatedLoanArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementControlInputModel request);
	
	BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request);
	
	BQOriginationExchangeOutputModel exchangeOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationExchangeInputModel request);
	
	BQStructuringExchangeOutputModel exchangeStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringExchangeInputModel request);
	
	BQSyndicateAssemblyExchangeOutputModel exchangeSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyExchangeInputModel request);
	
	CRSyndicatedLoanArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementExchangeInputModel request);
	
	CRSyndicatedLoanArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementExecuteInputModel request);
	
	SDSyndicatedLoanFeedbackOutputModel feedback(String sdReferenceId, SDSyndicatedLoanFeedbackInputModel request);
	
	CRSyndicatedLoanArrangementInitiateOutputModel initiate(String sdReferenceId, CRSyndicatedLoanArrangementInitiateInputModel request);
	
	BQStructuringInitiateOutputModel initiateStructuring(String sdReferenceId, String crReferenceId, BQStructuringInitiateInputModel request);
	
	BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request);
	
	BQOriginationRequestOutputModel requestOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationRequestInputModel request);
	
	BQStructuringRequestOutputModel requestStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringRequestInputModel request);
	
	BQSyndicateAssemblyRequestOutputModel requestSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyRequestInputModel request);
	
	CRSyndicatedLoanArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementRequestInputModel request);
	
	SDSyndicatedLoanRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSyndicatedLoanArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOriginationRetrieveOutputModel retrieveOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQStructuringRetrieveOutputModel retrieveStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSyndicateAssemblyRetrieveOutputModel retrieveSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRSyndicatedLoanArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementUpdateInputModel request);
	
	BQFulfillmentUpdateOutputModel updateFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentUpdateInputModel request);
	
	BQOriginationUpdateOutputModel updateOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationUpdateInputModel request);
	
	BQStructuringUpdateOutputModel updateStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringUpdateInputModel request);
	
	BQSyndicateAssemblyUpdateOutputModel updateSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyUpdateInputModel request);
	
}
