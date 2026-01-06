package christmas.domain;

public class TotalBenefit {
    private final int totalPrice;
    private final int totalDiscount;
    private int gift;

    public TotalBenefit(int totalPrice, int totalDiscount){
        this.totalPrice=totalPrice;
        this.totalDiscount=totalDiscount;
        this.gift=isTarget();
    }

    public int isTarget(){
        if(totalPrice<120000){
            return 0;
        }
        return 25000;
    }

    public int totalBenefitAmount(){
        return totalDiscount+gift;
    }

    public int getTotalDiscount(){
        return totalDiscount;
    }

    public int getGift(){
        return gift;
    }
}
