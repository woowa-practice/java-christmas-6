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
}
