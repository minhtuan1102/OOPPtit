package Solve;

public class J07058 implements Comparable<J07058> {
    String code;
    String name;
    String hinhthuc;

    public J07058(String code, String name, String hinhthuc){
        this.code = code;
        this.name = name;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s", code, name,hinhthuc);
    }
    @Override
    public int compareTo(J07058 x){
        return x.hinhthuc.compareTo(this.hinhthuc);
    }
}
