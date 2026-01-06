package christmas;

import christmas.domain.Order;
import christmas.domain.Orders;
import christmas.domain.WeekendDiscount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 주말할인테스트 {
    private final WeekendDiscount weekendDiscount=new WeekendDiscount();
    private final Order order1=new Order("양송이수프", 1);
    private final Order order2=new Order("타파스", 1);
    private final Order order3=new Order("바비큐립", 2);
    private final Order order4=new Order("해산물파스타", 3);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    @Test
    void 주말할인테스트(){
        Assertions.assertThat(10115).isEqualTo(weekendDiscount.weekendAmount(1, orders));
        Assertions.assertThat(10115).isEqualTo(weekendDiscount.weekendAmount(2, orders));
        Assertions.assertThat(0).isEqualTo(weekendDiscount.weekendAmount(3, orders));
        Assertions.assertThat(0).isEqualTo(weekendDiscount.weekendAmount(7, orders));
    }
}
