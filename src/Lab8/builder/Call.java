package Lab8.builder;

import java.time.LocalDate;

public class Call {
    private String requestId;
    private Agent agent;

    public void callPop(Agent agent) {
        this.agent = agent;
        this.requestId = "" + LocalDate.now();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

}
