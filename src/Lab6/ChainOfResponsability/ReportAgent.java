package Lab6.ChainOfResponsability;

import Lab6.ChainOfResponsability.model.CallRecord;

import java.util.List;


public class ReportAgent extends AbstractAgent {

    @Override
    public void handleRequest(List<CallRecord> callRecords) {

        for (CallRecord callRecord : callRecords) {
            System.out.println(callRecord);
        }

        if (this.nextAgent != null) {
            this.nextAgent.handleRequest(callRecords);
        }

    }

}
