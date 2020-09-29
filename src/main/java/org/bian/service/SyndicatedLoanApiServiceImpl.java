/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SyndicatedLoanApiServiceImpl implements SyndicatedLoanApiService {

	public SDSyndicatedLoanActivateOutputModel activate(SDSyndicatedLoanActivateInputModel request){
		return JsonReader.read("activate-SDSyndicatedLoanActivateOutputModel.json",new TypeReference<SDSyndicatedLoanActivateOutputModel>(){});
	}
	
	public SDSyndicatedLoanConfigureOutputModel configure(String sdReferenceId, SDSyndicatedLoanConfigureInputModel request){
		return JsonReader.read("configure-SDSyndicatedLoanConfigureOutputModel.json",new TypeReference<SDSyndicatedLoanConfigureOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementControlInputModel request){
		return JsonReader.read("control-CRSyndicatedLoanArrangementControlOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementControlOutputModel>(){});
	}
	
	public BQFulfillmentExchangeOutputModel exchangeFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentExchangeInputModel request){
		return JsonReader.read("exchange-BQFulfillmentExchangeOutputModel.json",new TypeReference<BQFulfillmentExchangeOutputModel>(){});
	}
	
	public BQOriginationExchangeOutputModel exchangeOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationExchangeInputModel request){
		return JsonReader.read("exchange-BQOriginationExchangeOutputModel.json",new TypeReference<BQOriginationExchangeOutputModel>(){});
	}
	
	public BQStructuringExchangeOutputModel exchangeStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringExchangeInputModel request){
		return JsonReader.read("exchange-BQStructuringExchangeOutputModel.json",new TypeReference<BQStructuringExchangeOutputModel>(){});
	}
	
	public BQSyndicateAssemblyExchangeOutputModel exchangeSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyExchangeInputModel request){
		return JsonReader.read("exchange-BQSyndicateAssemblyExchangeOutputModel.json",new TypeReference<BQSyndicateAssemblyExchangeOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementExchangeInputModel request){
		return JsonReader.read("exchange-CRSyndicatedLoanArrangementExchangeOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementExchangeOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementExecuteInputModel request){
		return JsonReader.read("execute-CRSyndicatedLoanArrangementExecuteOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementExecuteOutputModel>(){});
	}
	
	public SDSyndicatedLoanFeedbackOutputModel feedback(String sdReferenceId, SDSyndicatedLoanFeedbackInputModel request){
		return JsonReader.read("feedback-SDSyndicatedLoanFeedbackOutputModel.json",new TypeReference<SDSyndicatedLoanFeedbackOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementInitiateOutputModel initiate(String sdReferenceId, CRSyndicatedLoanArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRSyndicatedLoanArrangementInitiateOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementInitiateOutputModel>(){});
	}
	
	public BQStructuringInitiateOutputModel initiateStructuring(String sdReferenceId, String crReferenceId, BQStructuringInitiateInputModel request){
		return JsonReader.read("initiate-BQStructuringInitiateOutputModel.json",new TypeReference<BQStructuringInitiateOutputModel>(){});
	}
	
	public BQFulfillmentRequestOutputModel requestFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentRequestInputModel request){
		return JsonReader.read("request-BQFulfillmentRequestOutputModel.json",new TypeReference<BQFulfillmentRequestOutputModel>(){});
	}
	
	public BQOriginationRequestOutputModel requestOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationRequestInputModel request){
		return JsonReader.read("request-BQOriginationRequestOutputModel.json",new TypeReference<BQOriginationRequestOutputModel>(){});
	}
	
	public BQStructuringRequestOutputModel requestStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringRequestInputModel request){
		return JsonReader.read("request-BQStructuringRequestOutputModel.json",new TypeReference<BQStructuringRequestOutputModel>(){});
	}
	
	public BQSyndicateAssemblyRequestOutputModel requestSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyRequestInputModel request){
		return JsonReader.read("request-BQSyndicateAssemblyRequestOutputModel.json",new TypeReference<BQSyndicateAssemblyRequestOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementRequestInputModel request){
		return JsonReader.read("request-CRSyndicatedLoanArrangementRequestOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementRequestOutputModel>(){});
	}
	
	public SDSyndicatedLoanRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSyndicatedLoanRetrieveOutputModel.json",new TypeReference<SDSyndicatedLoanRetrieveOutputModel>(){});
	}
	
	public CRSyndicatedLoanArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSyndicatedLoanArrangementRetrieveOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementRetrieveOutputModel>(){});
	}
	
	public BQFulfillmentRetrieveOutputModel retrieveFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQFulfillmentRetrieveOutputModel.json",new TypeReference<BQFulfillmentRetrieveOutputModel>(){});
	}
	
	public BQOriginationRetrieveOutputModel retrieveOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOriginationRetrieveOutputModel.json",new TypeReference<BQOriginationRetrieveOutputModel>(){});
	}
	
	public BQStructuringRetrieveOutputModel retrieveStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQStructuringRetrieveOutputModel.json",new TypeReference<BQStructuringRetrieveOutputModel>(){});
	}
	
	public BQSyndicateAssemblyRetrieveOutputModel retrieveSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSyndicateAssemblyRetrieveOutputModel.json",new TypeReference<BQSyndicateAssemblyRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRSyndicatedLoanArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSyndicatedLoanArrangementUpdateInputModel request){
		return JsonReader.read("update-CRSyndicatedLoanArrangementUpdateOutputModel.json",new TypeReference<CRSyndicatedLoanArrangementUpdateOutputModel>(){});
	}
	
	public BQFulfillmentUpdateOutputModel updateFulfillment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQFulfillmentUpdateInputModel request){
		return JsonReader.read("update-BQFulfillmentUpdateOutputModel.json",new TypeReference<BQFulfillmentUpdateOutputModel>(){});
	}
	
	public BQOriginationUpdateOutputModel updateOrigination(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOriginationUpdateInputModel request){
		return JsonReader.read("update-BQOriginationUpdateOutputModel.json",new TypeReference<BQOriginationUpdateOutputModel>(){});
	}
	
	public BQStructuringUpdateOutputModel updateStructuring(String sdReferenceId, String crReferenceId, String bqReferenceId, BQStructuringUpdateInputModel request){
		return JsonReader.read("update-BQStructuringUpdateOutputModel.json",new TypeReference<BQStructuringUpdateOutputModel>(){});
	}
	
	public BQSyndicateAssemblyUpdateOutputModel updateSyndicateassembly(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSyndicateAssemblyUpdateInputModel request){
		return JsonReader.read("update-BQSyndicateAssemblyUpdateOutputModel.json",new TypeReference<BQSyndicateAssemblyUpdateOutputModel>(){});
	}
	
}
