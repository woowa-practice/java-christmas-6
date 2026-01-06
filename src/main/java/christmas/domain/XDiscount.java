package christmas.domain;

import java.time.LocalDate;

public class XDiscount {
    private final int amount;

    public XDiscount(){
        this.amount=1000;
    }

    public int XAmount(int day){
        if(isXday(day)){
            return amount;
        }
        return 0;
    }

    //월1화2수3목4금5토6일7
    //일, 크리스마스
    private boolean isXday(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==7 || day==25;
    }
}
