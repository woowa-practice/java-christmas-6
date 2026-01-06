package christmas;

import christmas.domain.Order;
import christmas.domain.Orders;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 총액테스트 {
    private final Order order1=new Order("양송이수프", 1, 6000);
    private final Order order2=new Order("타파스", 1, 5500);
    private final Order order3=new Order("바비큐립", 2, 54000);
    private final Order order4=new Order("해산물파스타", 3, 35000);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    @Test
    void 총액테스트(){
        Assertions.assertThat(224500).isEqualTo(orders.totalAmount());
    }
}
