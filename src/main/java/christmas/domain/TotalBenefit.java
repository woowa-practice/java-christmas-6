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
            return new Order("없음", 0,0);
        }
        return new Order(Menu.CHAM.getName(), 1, Menu.CHAM.getPrice());
    }

    //총 혜택 금액
    public int totalBenefitAmount(){
        return totalDiscount+gift.getPrice();
    }

    //할인 후 예상 결제 금액
    public int applyDiscountPrice(){
        return totalPrice-totalDiscount;
    }

    public int getTotalDiscount(){
        return totalDiscount;
    }
}
