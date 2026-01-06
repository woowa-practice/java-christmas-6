package christmas.domain;

public class Order {
    private final String name;
    private final int count;
    private final int price;

    public Order(String name, int count, int price){
        this.name=name;
        this.count=count;
        this.price=Menu.from(name).getPrice();
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
