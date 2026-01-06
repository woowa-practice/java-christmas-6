package christmas.domain;

public class DDayDiscount {
    private int amount;

    public DDayDiscount(){
        this.amount=1000;
    }

    public int ddayAmount(int day){
        if(isDiscountRange(day)){
            return amount+(day-1)*100;
        }
        return 0;
    }

    private boolean isDiscountRange(int day){
        return day<26;
    }
}
