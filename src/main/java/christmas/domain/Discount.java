package christmas.domain;

import java.time.LocalDate;
import java.util.List;

public class Discount {
    private final int amount;
    private final String description;

    public Discount(int amount, String description){
        this.amount=amount;
        this.description=description;
    }

    public int getAmount() {
        return amount;
    }

    public String getFormattedAmount(int amount){
        return String.format("%,d", amount);
    }

    public String getDescription(){
        return description;
    }

    //디데이할인
    public int ddayAmount(int day){
        if(isDiscountRange(day)){
            return amount+(day-1)*100;
        }
        return 0;
    }

    //특별할인
    public int XAmount(int day){
        if(isXday(day)){
            return amount;
        }
        return 0;
    }

    //평일할인
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

    //주말할인
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

    private boolean isDiscountRange(int day){
        return day<26;
    }

    //월1화2수3목4금5토6일7
    //일, 크리스마스
    private boolean isXday(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==7 || day==25;
    }

    //월1화2수3목4금5토6일7
    //월화수목일
    private boolean isWeekDay(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()<5||date.getDayOfWeek().getValue()==7;
    }

    //월1화2수3목4금5토6일7
    //금토
    private boolean isWeekend(int day){
        LocalDate date=LocalDate.of(2023, 12, day);
        return date.getDayOfWeek().getValue()==5||date.getDayOfWeek().getValue()==6;
    }
}
