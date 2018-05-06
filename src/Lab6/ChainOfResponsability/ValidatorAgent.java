package Lab6.ChainOfResponsability;

import Lab6.ChainOfResponsability.model.CallRecord;
import Lab6.EmailUtil;

import java.util.ArrayList;
import java.util.List;


public class ValidatorAgent extends AbstractAgent {

    @Override
    public void handleRequest(List<CallRecord> callRecords) {
        List<CallRecord> validRecords = new ArrayList<CallRecord>();

        for (CallRecord callRecord : callRecords) {
            if (callRecord.getCustomer().getLastName() == null
                    || !EmailUtil.validate(callRecord.getCustomer().getEmail())
                    || callRecord.getCustomer().getAddress() == null) {

                discardedRequests.add(callRecord);

            } else {

                callRecord.setValid(Boolean.TRUE);
                validRecords.add(callRecord);

            }

        }

        if (this.nextAgent != null) {
            nextAgent.handleRequest(validRecords);
        }

    }

}
