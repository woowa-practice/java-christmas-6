package christmas.domain;

import java.time.LocalDate;

public class XDiscount implements Discount{
    @Override
    public int calculateDiscount(int day, Orders orders){
        int amount=1000;
        if(isXday(day)){
            return amount;
        }
        return 0;
    }

    @Override
    public String getDescription(){
        return "특별 할인: ";
    }

    //월1화2수3목4금5토6일7
    //일, 크리스마스
    private boolean isXday(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==7 || day==25;
    }
}