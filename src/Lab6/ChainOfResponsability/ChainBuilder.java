package Lab6.ChainOfResponsability;

public class ChainBuilder {
    private AbstractAgent handler = null;

    public ChainBuilder() {

        AbstractAgent dataWasherAgent = new DataWasherAgent();
        AbstractAgent reportAgent = new ReportAgent();
        AbstractAgent validatorAgent = new ValidatorAgent();

        validatorAgent.nextAgent = dataWasherAgent;
        dataWasherAgent.nextAgent = reportAgent;

        handler = validatorAgent;
    }

    public AbstractAgent getHandler() {
        return handler;
    }


}
