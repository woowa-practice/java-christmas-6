package christmas.domain;

public class DdayDiscount implements Discount {
    @Override
    public int calculateDiscount(int day, Orders orders){
        int amount=1000;
        if(isDiscountRange(day)){
            return amount+(day-1)*100;
        }
        return 0;
    }

    @Override
    public String getDescription(){
        return "크리스마스 디데이 할인: ";
    }

    private boolean isDiscountRange(int day){
        return day<26;
    }
}