package Solve;

public class J04013 {
    String code;
    String name;
    double toan;
    double ly;
    double hoa;
    double uutien;
    double tongdiem;

    public J04013(String code, String name, double toan, double ly,double hoa){
        this.code = code;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.tongdiem = toan*2 + ly + hoa;
        if(code.charAt(2) - '0' == 1) this.uutien = 0.5;
        else if(code.charAt(2) - '0' == 2) this.uutien = 1;
        else this.uutien = 2.5;
    }

    public String check(){
        double sum = tongdiem + uutien;
        if (sum >= 24 ) return "TRUNG TUYEN";
        else return "TRUOT";
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %s",
                code,
                name,
                (uutien % 1 == 0) ? String.format("%d", (int) uutien) : String.format("%.1f", uutien),
                (tongdiem % 1 == 0) ? String.format("%d", (int) tongdiem) : String.format("%.1f", tongdiem),
                check()
        );
    }



}
