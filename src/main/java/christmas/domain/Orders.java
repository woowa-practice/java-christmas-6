package christmas.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orders {
    private final List<Order> orders;

    public Orders(List<Order> orders){
        this.orders=new ArrayList<>(orders);
    }

    public List<Order> getOrders(){
        return Collections.unmodifiableList(orders);
    }

    public int getCategoryCount(String menu){
        int count=0;
        for (Order order : orders) {
            count+=order.orderCount(menu);
        }
        return count;
    }
}
