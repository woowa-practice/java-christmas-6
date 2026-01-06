package christmas.domain;

public class TotalBenefit {
    private final int totalPrice;
    private final int totalDiscount;
    private final Order gift;

    public TotalBenefit(int totalPrice, int totalDiscount) {
        this.totalPrice = totalPrice;
        this.totalDiscount = totalDiscount;
        this.gift = isTarget();
    }

    public Order isTarget() {
        if (totalPrice < 120000) {
            return new Order(Menu.NOPE, 0);
        }
        return new Order(Menu.CHAM, 1);
    }

    //총 혜택 금액
    public int totalBenefitAmount() {
        return totalDiscount + gift.getPrice();
    }

    public String getTotalBenefitAmount(int amount) {
        return String.format("%,d", amount);
    }

    //할인 후 예상 결제 금액
    public int discountApplyPrice() {
        return totalPrice - totalDiscount;
    }

    public String getDiscountApplyPrice(int price) {
        return String.format("%,d", price);
    }

    public String giftInfo() {
        if (gift.getName() == "없음") return gift.getName();
        return gift.getName() + " " + gift.getCount() + "개";
    }

    public Order getGift() {
        return gift;
    }
}
