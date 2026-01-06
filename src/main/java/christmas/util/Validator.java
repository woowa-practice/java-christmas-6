package christmas.util;

import christmas.domain.Menu;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static void validateDay(Integer input) {
        dayIsNull(input);
        invalidDate(input);
    }

    public static void validateMenu(String input) {
        menuIsNull(input);
        invalidOrderInput(input);
        List<String> menu = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        Parser.parse(input, menu, count);
        invalidOrderCount(count);
        duplicatedMenu(menu);
        onlyDrink(menu);
        tooManyOrder(count);
    }

    private static void dayIsNull(Integer input) {
        if (input == null) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    private static void invalidDate(Integer input) {
        if (input < 1 || input > 31) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }

    private static void menuIsNull(String input) {
        if (input == null) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    private static void invalidOrderInput(String input) {
        if (!input.contains("-")) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    private static void invalidOrderCount(List<Integer> count) {
        for (Integer i : count) {
            if (i < 1) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }
        }
    }

    private static void duplicatedMenu(List<String> menu) {
        if (menu.size() != menu.stream().distinct().count()) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    private static void onlyDrink(List<String> menu) {
        menu.removeIf(s -> s.equals(Menu.COKE.getName()) || s.equals(Menu.CHAM.getName()) || s.equals(Menu.WINE.getName()));
        if (menu.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }

    private static void tooManyOrder(List<Integer> count) {
        int tmp = 0;
        for (Integer i : count) {
            tmp += i;
        }
        if (tmp > 20) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요.");
        }
    }
}
