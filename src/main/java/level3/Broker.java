package level3;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void executeOrders() {
        orders.forEach(Order::execute);
        orders.clear();
    }
}
