package christmas.domain;

public class Order {
    private final String name;
    private final int count;
    private final int price;

    public Order(Menu menu, int count){
        this.name=menu.getName();
        this.count=count;
        this.price= menu.getPrice();
    }

    public int orderCount(String menu){
        if(menu.equals(name)){
            return count;
        }
        return 0;
    }

    public int orderPrice(){
        return count*price;
    }

    public int getCount(){
        return count;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
