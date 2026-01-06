package christmas.controller;

import christmas.domain.*;
import christmas.util.Parser;
import christmas.view.InputView;
import christmas.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class ChristmasController {
    private final InputView inputView;
    private final OutputView outputView;

    public ChristmasController(InputView inputView, OutputView outputView){
        this.inputView=inputView;
        this.outputView=outputView;
    }

    public void run(){
        //웰컴
        outputView.welcome();
        //날짜 입력
        int meetDay=inputView.inputMeetDay();
        //메뉴 입력
        String input=inputView.inputMenu();
        //주문 리스트 생성
        List<String> menus=new ArrayList<>();
        List<Integer> count=new ArrayList<>();
        Parser.parse(input, menus, count);
        List<Order> orderList=new ArrayList<>();
        for(int i=0; i<menus.size(); i++){
            Order order=new Order(Menu.from(menus.get(i)), count.get(i));
            orderList.add(order);
        }
        Orders orders=new Orders(orderList);
        //미리보기
        outputView.outputPreview();
        //주문메뉴+할인전총주문금액
        outputView.outputOrder(orders);
        //날짜에 해당하는 할인 진행
        int benefit=0;  //총할인금액
//        Discount dDayDiscount=new Discount(1000, "크리스마스 디데이 할인");
//        Discount xDiscount=new Discount(1000, "특별 할인");
//        Discount weekDayDiscount=new Discount(2023, "평일 할인");
//        Discount weekendDiscount=new Discount(2023, "주말 할인");
//        benefit+=dDayDiscount.ddayAmount(meetDay);
//        benefit+=xDiscount.XAmount(meetDay);
//        benefit+= weekDayDiscount.weekdayAmount(meetDay, orders);
//        benefit+=weekendDiscount.weekendAmount(meetDay, orders);
//        Discounts discounts=new Discounts(new ArrayList<>(List.of(dDayDiscount, xDiscount, weekDayDiscount, weekendDiscount)));
        //총혜택 생성
        TotalBenefit totalBenefit=new TotalBenefit(orders.totalAmount(), benefit);
        //증정메뉴 여부 출력
        outputView.outputGift(totalBenefit);
        //혜택 내역 출력
//        outputView.outputBenefitInfo(discounts, totalBenefit);
        //총혜택 금액+할인후예상결제금액 출력
        outputView.outputDiscountInfo(totalBenefit);
        //이벤트배지 생성
        Badge badge=new Badge();
        //배지 출력
        outputView.outputBadge(badge, totalBenefit);
    }
}
