package christmas.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orders {
    private final List<Order> orders;

    public Orders(List<Order> orders) {
        this.orders = new ArrayList<>(orders);
    }

    public List<Order> getOrders() {
        return Collections.unmodifiableList(orders);
    }

    public int getCategoryCount(String menu) {
        int count = 0;
        for (Order order : orders) {
            count += order.orderCount(menu);
        }
        return count;
    }

    public String getTotalAmount(int totalAmount) {
        return String.format("%,d", totalAmount);
    }

    //메뉴 가격*주문 수량
    public int totalAmount() {
        int amount = 0;
        for (Order order : orders) {
            amount += order.orderPrice();
//            amount+=Menu.from(order.getName()).getPrice()*order.getCount();
        }
        return amount;
    }
}
