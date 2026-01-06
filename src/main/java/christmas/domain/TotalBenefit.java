package christmas.domain;

public class TotalBenefit {
    private final int totalPrice;
    private final int totalDiscount;
    private final Order gift;

    public TotalBenefit(int totalPrice, int totalDiscount){
        this.totalPrice=totalPrice;
        this.totalDiscount=totalDiscount;
        this.gift=isTarget();
    }

    public Order isTarget(){
        if(totalPrice<120000){
            return null;
        }
        return new Order(Menu.CHAM.getName(), 1, Menu.CHAM.getPrice());
    }

    public int totalBenefitAmount(){
        return totalDiscount+gift.getPrice();
    }

    public int getTotalDiscount(){
        return totalDiscount;
    }
}
