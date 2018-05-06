package Lab6.ChainOfResponsability;


import Lab6.ChainOfResponsability.model.CallRecord;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAgent {
    protected static List<CallRecord> discardedRequests = new ArrayList<CallRecord>();
    protected AbstractAgent nextAgent;

    public abstract void handleRequest(List<CallRecord> callRecords);


}
