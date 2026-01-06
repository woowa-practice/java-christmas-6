package christmas.domain;

import java.time.LocalDate;
import java.util.List;

public class WeekendDiscount {
    private int amount;

    public WeekendDiscount(){
        this.amount=2023;
    }

    public int weekendAmount(int day, Orders orders){
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



    //월1화2수3목4금5토6일7
    //금토
    private boolean isWeekend(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==5||date.getDayOfWeek().getValue()==6;
    }
}
