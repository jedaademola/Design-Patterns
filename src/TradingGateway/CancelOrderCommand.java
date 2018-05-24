package TradingGateway;

public class CancelOrderCommand implements TradingCommand {

    OrderReciever r = new OrderReciever();
    Order currentOrder = null;

    CancelOrderCommand(Order order) {
        this.currentOrder = new Order();
        this.currentOrder = order;
    }

    @Override
    public Order execute() {
        return r.cancel(currentOrder);
    }

    @Override
    public void undo() {
        r.print(currentOrder);
    }
}