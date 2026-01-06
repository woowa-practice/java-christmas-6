package christmas;

import christmas.domain.TotalBenefit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 총혜택금액테스트 {
    private final int totalPrice=140000;
    private final int totalDiscount=35000;
    private TotalBenefit totalBenefit=new TotalBenefit(totalPrice, totalDiscount);

    @Test
    void 총혜택금액테스트(){
        Assertions.assertThat(25000).isEqualTo(totalBenefit.isTarget());
        Assertions.assertThat(60000).isEqualTo(totalBenefit.totalBenefitAmount());
    }
}
