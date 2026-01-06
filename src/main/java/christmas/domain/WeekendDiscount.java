package christmas.domain;

import java.time.LocalDate;
import java.util.List;

public class WeekendDiscount implements Discount{
    @Override
    public int calculateDiscount(int day, Orders orders){
        int amount=2023;
        if(!isWeekend(day)){
            return 0;
        }

        List<String> main=Menu.getMain();
        int count=0;
        for (String s : main) {
            count+=orders.getCategoryCount(s);
        }
        return count*amount;
    }

    @Override
    public String getDescription() {
        return "주말 할인: ";
    }

    //월1화2수3목4금5토6일7
    //금토
    private boolean isWeekend(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==5||date.getDayOfWeek().getValue()==6;
    }
}