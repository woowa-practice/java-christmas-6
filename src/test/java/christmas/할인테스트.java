package christmas;

import christmas.domain.Discount;
import christmas.domain.Menu;
import christmas.domain.Order;
import christmas.domain.Orders;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class 할인테스트 {
    private final Discount DDAYdiscount=new Discount(1000, "디데이할인");
    private final Discount Xdiscount=new Discount(1000, "특별할인");
    private final Discount weekdaydiscount=new Discount(2023, "평일할인");
    private final Discount weekenddiscount=new Discount(2023, "주말할인");
    private final Order order1=new Order(Menu.BBQ, 2);
    private final Order order2=new Order(Menu.SEAPASTA, 3);
    private final Order order3=new Order(Menu.CAKE, 2);
    private final Order order4=new Order(Menu.ICECREAM, 3);
    private final Orders orders=new Orders(List.of(order1, order2, order3, order4));

    @Test
    @DisplayName("디데이할인테스트")
    void 디데이할인테스트(){
        Assertions.assertThat(1200).isEqualTo(DDAYdiscount.ddayAmount(3));
        Assertions.assertThat(0).isEqualTo(DDAYdiscount.ddayAmount(26));
    }

    @Test
    @DisplayName("특별할인테스트")
    void 특별할인테스트(){
        Assertions.assertThat(1000).isEqualTo(Xdiscount.XAmount(3));
        Assertions.assertThat(1000).isEqualTo(Xdiscount.XAmount(25));
        Assertions.assertThat(0).isEqualTo(Xdiscount.XAmount(27));
    }

    @Test
    @DisplayName("평일할인테스트")
    void 평일할인테스트(){
        Assertions.assertThat(10115).isEqualTo(weekdaydiscount.weekdayAmount(3, orders));
        Assertions.assertThat(10115).isEqualTo(weekdaydiscount.weekdayAmount(4, orders));
        Assertions.assertThat(0).isEqualTo(weekdaydiscount.weekdayAmount(8, orders));
    }

    @Test
    @DisplayName("주말할인테스트")
    void 주말할인테스트(){
        Assertions.assertThat(10115).isEqualTo(weekenddiscount.weekendAmount(1, orders));
        Assertions.assertThat(10115).isEqualTo(weekenddiscount.weekendAmount(2, orders));
        Assertions.assertThat(0).isEqualTo(weekenddiscount.weekendAmount(3, orders));
        Assertions.assertThat(0).isEqualTo(weekenddiscount.weekendAmount(7, orders));
    }
}
