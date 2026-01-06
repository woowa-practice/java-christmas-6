package christmas.domain;

import java.time.LocalDate;
import java.util.List;

public class WeekdayDiscount implements Discount {
    @Override
    public int calculateDiscount(int day, Orders orders) {
        int amount = 2023;
        if (!isWeekDay(day)) {
            return 0;
        }

        List<String> dessert = Menu.getDessert();
        int count = 0;
        for (String s : dessert) {
            count += orders.getCategoryCount(s);
        }
        return count * amount;
    }

    @Override
    public String getDescription() {
        return "평일 할인: ";
    }

    //월1화2수3목4금5토6일7
    //월화수목일
    private boolean isWeekDay(int day) {
        LocalDate date = LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue() < 5 || date.getDayOfWeek().getValue() == 7;
    }
}