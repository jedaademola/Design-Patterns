package TradingGateway;

public class BuyOrderCommand implements TradingCommand {

    OrderReciever r = new OrderReciever();
    Order currentOrder = null;

    BuyOrderCommand(Order order) {
        this.currentOrder = new Order();

        this.currentOrder = order;
    }

    @Override
    public Order execute() {
        return r.buy(currentOrder);
    }

    @Override
    public void undo() {
        r.print(currentOrder);
    }
}
