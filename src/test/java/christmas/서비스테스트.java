package christmas;

import christmas.domain.*;
import christmas.service.DiscountService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 서비스테스트 {
    private final DdayDiscount ddayDiscount=new DdayDiscount();
    private final XDiscount xDiscount=new XDiscount();
    private final WeekdayDiscount weekdayDiscount=new WeekdayDiscount();
    private final WeekendDiscount weekendDiscount=new WeekendDiscount();
    private final DiscountService discountService=new DiscountService();
    private final Order order1=new Order(Menu.BBQ, 2);
    private final Order order2=new Order(Menu.SEAPASTA, 3);
    private final Order order3=new Order(Menu.CAKE, 2);
    private final Order order4=new Order(Menu.ICECREAM, 3);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    //일요일
    //디데이할인 1200
    //평일할인 디저트 5개
    //특별할인 1000

    @Test
    void 서비스테스트(){
        System.out.println(discountService.calculateDiscount(3, orders));
        Assertions.assertThat(12315).isEqualTo(discountService.totalDiscount(3, orders));
    }
}
