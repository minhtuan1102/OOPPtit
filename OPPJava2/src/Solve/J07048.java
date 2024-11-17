package Solve;
public class J07048 implements Comparable<J07048> {
    String code;
    String name;
    int price;
    int warranty;
    
    public J07048(String code, String name, int price, int warranty){
        this.code = code;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d", code, name,price,warranty);
    }
    @Override
    public int compareTo(J07048 o){
        if(o.price != this.price) return o.price - this.price;
        return this.code.compareTo(o.code);
    }
}