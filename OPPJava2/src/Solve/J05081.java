package Solve;

public  class J05081 implements Comparable<J05081>{
    String name;
    String type;
    String ma;
    int in;
    int out;
    int ln ;
    static int id = 1;
    public J05081(String name, String type, int in, int out){
        this.ma = String.format("MH%03d",id++);
        this.name = name;
        this.type = type;
        this.in = in;
        this.out = out;
        this.ln = out - in;
    }
    @Override
    public int compareTo(J05081 mh){
        if(this.ln != mh.ln) return mh.ln - this.ln;
        else return  this.ma.compareTo(mh.ma);
    }
    @Override
    public String toString(){
        return ma + " " + name + " " + type + " " + in + " " + out + " " + ln;
    }
}
