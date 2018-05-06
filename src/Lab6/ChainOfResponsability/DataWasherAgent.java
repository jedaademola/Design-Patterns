package Lab6.ChainOfResponsability;

import Lab6.ChainOfResponsability.model.CallRecord;

import java.util.List;


public class DataWasherAgent extends AbstractAgent {

    @Override
    public void handleRequest(List<CallRecord> callRecords) {

        for (CallRecord callRecord : callRecords) {

            callRecord.setASalesLead(Boolean.TRUE);


        }

        if (this.nextAgent != null) {
            this.nextAgent.handleRequest(callRecords);
        }

    }

}
