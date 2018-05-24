package TradingGateway;

public interface TradingCommand {

    Order execute();

    void undo();

}
