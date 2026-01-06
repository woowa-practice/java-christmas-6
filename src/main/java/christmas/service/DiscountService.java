package christmas.service;

import christmas.domain.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiscountService {
    private final List<Discount> discounts;

    public DiscountService(){
        this.discounts=List.of(new DdayDiscount(), new XDiscount(), new WeekdayDiscount(), new WeekendDiscount());
    }

    public Map<String, Integer> calculateDiscount(int day, Orders orders){
        Map<String, Integer> discountInfo=new HashMap<>();

        for (Discount discount : discounts) {
            if(discount.calculateDiscount(day, orders)>0){
                discountInfo.put(discount.getDescription(), discount.calculateDiscount(day, orders));
            }
        }

        return discountInfo;
    }

    public int totalDiscount(int day, Orders orders){
        int amount=0;
        for (Discount discount : discounts) {
            if(discount.calculateDiscount(day, orders)>0){
                amount+=discount.calculateDiscount(day, orders);
            }
        }
        return amount;
    }
}
