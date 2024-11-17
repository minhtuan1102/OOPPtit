package Solve;
public class J07050 implements Comparable<J07050> {
    String code;
    String name;
    String group;
    double in;
    double out;
    double ln;
    static int i = 1;
    public J07050(String name, String group, double in, double out){
        this.code = String.format("MH%02d",i++);
        this.name = name;
        this.group = group;
        this.in = in;
        this.out = out;
        double ln = out - in;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %.2f", code , name, group, out - in);
    }
    @Override
    public int compareTo(J07050 s){
        return (int) ((s.out - s.in) - (this.out - this.in));
    }
}