package christmas.domain;

public interface Discount {
    int calculateDiscount(int day, Orders orders);

    String getDescription();
}
