package TradingGateway;

import java.util.Stack;

public class OrderSystemManager {

    public static void main(String[] args) {

        Stack<TradingCommand> commandsExecuted = new Stack<>();


        Order order = new Order();
        order.setQuantity(5);
        order.setPrice(500);
        order.setSymbol("Mango");
        order.setOrderType("buy");
        order.setOrderStatus("not filled");

        TradingCommand currentCommand = new BuyOrderCommand(order);
        commandsExecuted.push(currentCommand);

        order = currentCommand.execute();

        //order.setOrderStatus("");
        order.setOrderType("sell");

        currentCommand = new SellOrderCommand(order);
        commandsExecuted.push(currentCommand);

        order = currentCommand.execute();

        order.setOrderType("cancel");
        order.setOrderStatus("fully filled");

        currentCommand = new CancelOrderCommand(order);
        commandsExecuted.push(currentCommand);

        currentCommand.execute();


        commandsExecuted.pop().undo();
        commandsExecuted.pop().undo();
        commandsExecuted.pop().undo();


    }
}
