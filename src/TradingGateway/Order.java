package TradingGateway;

public class Order {
    private String symbol;
    private int quantity;
    private String orderType;
    private double price;
    private String orderStatus;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderType() {
        return orderType;
    }
/*

    Stock symbol (which stock a client wants to buy or sell)
2) Quantity of shares
3) Order type (buy or sell or cancel)
4) Price
5) Order status (fully filled, partially filled, not filled, canceled)
     */

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", orderType='" + orderType + '\'' +
                ", price=" + price +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }


}
