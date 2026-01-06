package christmas;

import christmas.util.Parser;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class 파서테스트 {
    private final String s="티본스테이크-1,바비큐립-1,초코케이크-2,제로콜라-1";
    private final List<String> name=new ArrayList<>();
    private final List<Integer> count=new ArrayList<>();

    @Test
    void 파서테스트(){
        Parser.parse(s, name, count);

        Assertions.assertThat(4).isEqualTo(name.size());
        Assertions.assertThat(4).isEqualTo(count.size());
    }
}
