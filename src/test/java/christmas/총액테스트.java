package christmas;

import christmas.domain.Menu;
import christmas.domain.Order;
import christmas.domain.Orders;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 총액테스트 {
    private final Order order1=new Order(Menu.SOUP, 1);
    private final Order order2=new Order(Menu.TAPAS, 1);
    private final Order order3=new Order(Menu.BBQ, 2);
    private final Order order4=new Order(Menu.SEAPASTA, 3);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    @Test
    void 총액테스트(){
        System.out.println(Menu.from("양송이수프"));
        Assertions.assertThat(224500).isEqualTo(orders.totalAmount());
    }
}
