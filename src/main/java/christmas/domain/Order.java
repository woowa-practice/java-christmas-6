package christmas.domain;

public class Order {
    private final String name;
    private final int count;

    public Order(String name, int count){
        this.name=name;
        this.count=count;
    }

    public int orderCount(String menu){
        if(menu.equals(name)){
            return count;
        }
        return 0;
    }

    public int getCount(){
        return count;
    }

    public String getName(){
        return name;
    }
}
