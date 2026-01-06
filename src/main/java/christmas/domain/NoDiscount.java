package christmas.domain;

public class NoDiscount implements Discount {
    @Override
    public int calculateDiscount(int day, Orders orders) {
        return 0;
    }

    @Override
    public String getDescription() {
        return "없음";
    }
}
