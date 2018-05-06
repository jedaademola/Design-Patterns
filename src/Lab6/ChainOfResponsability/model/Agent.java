package Lab6.ChainOfResponsability.model;

public class Agent {
    private String agentId;
    private Address workLocation;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Address getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(Address workLocation) {
        this.workLocation = workLocation;
    }


}
