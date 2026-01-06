package christmas.view;

import christmas.domain.*;
import christmas.service.DiscountService;

import java.util.Map;

public class OutputView {

    public void welcome(){
        System.out.println("안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.");
    }

    public void outputPreview(){
        System.out.println("12월 26일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
    }

    public void outputOrder(Orders orders){
        System.out.println("<주문 메뉴>");
        for (Order order : orders.getOrders()) {
            System.out.println(order.getName()+" "+order.getCount()+"개");
        }
        System.out.println();
        System.out.println("<할인 전 총주문 금액>");
        System.out.println(orders.getTotalAmount(orders.totalAmount())+"원");
        System.out.println();
    }

    public void outputGift(TotalBenefit totalBenefit){
        System.out.println("<증정 메뉴>");
        System.out.println(totalBenefit.giftInfo());
        System.out.println();
    }
    
    public void outputBenefitInfo(Map<String, Integer> discountInfo, TotalBenefit totalBenefit){
        System.out.println("<혜택 내역>");
        for (String s : discountInfo.keySet()) {
            System.out.println(s+"-"+String.format("%,d",discountInfo.get(s)));
        }
        System.out.println("증정 이벤트: -"+String.format("%,d", totalBenefit.getGift().getPrice())+"원");
        System.out.println();
    }

    public void outputDiscountInfo(TotalBenefit totalBenefit){
        System.out.println("<총혜택 금액>");
        System.out.println("-"+totalBenefit.getTotalBenefitAmount(totalBenefit.totalBenefitAmount())+"원");
        System.out.println();
        System.out.println("<할인 후 예상 결제 금액>");
        System.out.println(totalBenefit.getDiscountApplyPrice(totalBenefit.discountApplyPrice())+"원");
        System.out.println();
    }

    public void outputBadge(Badge badge, TotalBenefit totalBenefit){
        System.out.println("<12월 이벤트 배지>");
        System.out.println(badge.giveBadge(totalBenefit.totalBenefitAmount()));
    }

}
