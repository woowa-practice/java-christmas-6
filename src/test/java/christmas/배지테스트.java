package christmas;

import christmas.domain.Badge;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 배지테스트 {
    private Badge badge=new Badge();

    @Test
    void 배지테스트(){
        Assertions.assertThat("산타").isEqualTo(badge.giveBadge(20020));
        Assertions.assertThat("산타").isEqualTo(badge.giveBadge(20000));
        Assertions.assertThat("트리").isEqualTo(badge.giveBadge(19999));
        Assertions.assertThat("트리").isEqualTo(badge.giveBadge(10000));
        Assertions.assertThat("별").isEqualTo(badge.giveBadge(9999));
        Assertions.assertThat("별").isEqualTo(badge.giveBadge(5000));
        Assertions.assertThat("없음").isEqualTo(badge.giveBadge(4999));
        Assertions.assertThat("없음").isEqualTo(badge.giveBadge(4000));
    }
}
