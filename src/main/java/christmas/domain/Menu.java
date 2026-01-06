package christmas.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<String> getAppetizer(){
        return new ArrayList<>(List.of(SOUP.name, TAPAS.name, SALAD.name));
    }

    public static List<String> getMain(){
        return new ArrayList<>(List.of(STAKE.name, BBQ.name, SEAPASTA.name, XPASTA.name));
    }

    public static List<String> getDessert(){
        return new ArrayList<>(List.of(CAKE.name, ICECREAM.name));
    }

    public static List<String> getDrink(){
        return new ArrayList<>(List.of(COKE.name, WINE.name, CHAM.name));
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
