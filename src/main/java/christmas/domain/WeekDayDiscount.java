package christmas.domain;

import java.time.LocalDate;
import java.util.List;

public class WeekDayDiscount {
    private int amount;

    public WeekDayDiscount(){
        this.amount=2023;
    }

    public int weekdayAmount(int day, Orders orders){
        if(!isWeekDay(day)){
            return 0;
        }

        List<String> dessert=Menu.getDessert();
        int count=0;
        for (String s : dessert) {
            count+=orders.getCategoryCount(s);
        }
        return count*amount;
    }

    //월1화2수3목4금5토6일7
    //월화수목일
    private boolean isWeekDay(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()<4||date.getDayOfWeek().getValue()==7;
    }
}
