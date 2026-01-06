package christmas.domain;

import java.util.Arrays;

public enum Menu {
    SOUP("양송이수프",6000),TAPAS("타파스",5500),SALAD("시저샐러드",8000),
    STAKE("티본스테이크",55000),BBQ("바비큐립",54000),SEAPASTA("해산물파스타",35000),XPASTA("크리스마스파스타",25000),
    CAKE("초코케이크",15000),ICECREAM("아이스크림",5000),
    COKE("제로콜라",3000),WINE("레드와인",60000),CHAM("샴페인",25000);

    private final String name;
    private final int price;

    Menu(String name, int price){
        this.name=name;
        this.price=price;
    }

    public static Menu from(String name){
        return Arrays.stream(values())
                .filter(menu -> menu.name==name)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("[ERROR] 찾는 메뉴가 없습니다."));
    }

    public int getPrice(){
        return price;
    }
}
