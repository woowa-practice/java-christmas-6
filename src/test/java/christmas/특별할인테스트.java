package christmas;

import christmas.domain.XDiscount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 특별할인테스트 {
    private XDiscount xDiscount=new XDiscount();

    @Test
    void 특별할인테스트(){
        Assertions.assertThat(1000).isEqualTo(xDiscount.XAmount(3));
        Assertions.assertThat(1000).isEqualTo(xDiscount.XAmount(25));
        Assertions.assertThat(0).isEqualTo(xDiscount.XAmount(27));
    }
}
