package christmas;

import christmas.domain.DDayDiscount;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 디데이할인테스트 {
    private final DDayDiscount dDayDiscount=new DDayDiscount();

    @Test
    void 디데이할인테스트(){
        Assertions.assertThat(1200).isEqualTo(dDayDiscount.ddayAmount(3));
        Assertions.assertThat(0).isEqualTo(dDayDiscount.ddayAmount(26));
    }
}
