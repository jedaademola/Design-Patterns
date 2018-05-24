package TradingGateway;

public class SellOrderCommand implements TradingCommand {

    OrderReciever r = new OrderReciever();
    Order currentOrder = null;

    SellOrderCommand(Order order) {
        this.currentOrder = new Order();
        this.currentOrder = order;
    }

    @Override
    public Order execute() {
        return r.sell(currentOrder);
    }

    @Override
    public void undo() {
        r.print(currentOrder);
    }
}
