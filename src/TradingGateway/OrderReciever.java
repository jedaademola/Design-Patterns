package TradingGateway;

public class OrderReciever {

    Order currentOrder = null;

    public OrderReciever() {
        this.currentOrder = new Order();
    }

    public OrderReciever(Order order) {
        this.currentOrder = order;
    }

    public Order buy(Order order) {
        //buy or sell or cancel
        if (order.getOrderStatus().equals("not filled") && !order.getOrderStatus().equals("canceled")
                && order.getOrderType().equals("buy")) {
            currentOrder.setOrderStatus("not filled");
            currentOrder.setOrderType(order.getOrderType());

            currentOrder.setPrice(order.getPrice());
            currentOrder.setSymbol(order.getSymbol());
            currentOrder.setQuantity(order.getQuantity());
        }

        return currentOrder;
    }

    public Order sell(Order order) {

        if (order.getOrderStatus().equals("not filled") && !order.getOrderStatus().equals("canceled")
                && order.getOrderType().equals("sell")) {

            currentOrder.setPrice(order.getPrice());
            currentOrder.setSymbol(order.getSymbol());
            currentOrder.setOrderStatus("fully filled");
            currentOrder.setOrderType(order.getOrderType());

            currentOrder.setQuantity(order.getQuantity());
        }

        return currentOrder;
    }

    public Order cancel(Order order) {

        if (order.getOrderStatus().equals("not filled") && order.getOrderType().equals("cancel")) {
            currentOrder.setOrderStatus("canceled)");
            currentOrder.setOrderType(order.getOrderType());

            currentOrder.setPrice(order.getPrice());
            currentOrder.setSymbol(order.getSymbol());
            currentOrder.setQuantity(order.getQuantity());
        }

        return currentOrder;
    }


    public void print(Order order) {

        if (order == null) {
            System.out.println("deleted order");
            return;
        }
        System.out.println(order.toString());

    }
}
