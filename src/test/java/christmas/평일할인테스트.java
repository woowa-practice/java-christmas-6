package christmas;

import christmas.domain.Order;
import christmas.domain.Orders;
import christmas.domain.WeekDayDiscount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 평일할인테스트 {
    private final WeekDayDiscount weekDayDiscount=new WeekDayDiscount();
    private final Order order1=new Order("양송이수프", 1);
    private final Order order2=new Order("타파스", 1);
    private final Order order3=new Order("초코케이크", 2);
    private final Order order4=new Order("아이스크림", 3);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    @Test
    void 평일할인테스트(){
        Assertions.assertThat(10115).isEqualTo(weekDayDiscount.weekdayAmount(3, orders));
        Assertions.assertThat(10115).isEqualTo(weekDayDiscount.weekdayAmount(4, orders));
        Assertions.assertThat(0).isEqualTo(weekDayDiscount.weekdayAmount(8, orders));
    }
}
