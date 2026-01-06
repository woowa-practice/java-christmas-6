package christmas;

import christmas.domain.Menu;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class 메뉴테스트 {

    @Test
    void 메뉴테스트(){
        Assertions.assertThat(Menu.SOUP).isEqualTo(Menu.from("양송이수프"));
        Assertions.assertThat(Menu.SOUP.getPrice()).isEqualTo(Menu.from("양송이수프").getPrice());
    }
}
