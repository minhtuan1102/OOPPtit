package Solve;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J04005 {
    String name;
    String date;
    float d1;
    float d2;
    float d3;
    J04005(String name, String date, float d1,float d2, float d3){
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String getName(){
        return name;
    }
    public String getDate() {
        return date;
    }

    public float getD1() {
        return d1;
    }

    public float getD2() {
        return d2;
    }

    public float getD3() {
        return d3;
    }

    public float tong(float d1, float d2, float d3){
        return this.d1+this.d2+this.d3;
    }
}
