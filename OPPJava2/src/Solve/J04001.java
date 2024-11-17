package Solve;
import java.awt.*;

 public class J04001 {
    double x;
    double y;
    double dist;
    public J04001(){
        this.x = 0;
        this.y = 0;
    }
    public J04001(double x, double y){
        this.x = x;
        this.y = y;
    }
    public J04001(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(J04001 A)
    {
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }

    public void setDist(double dist)
    {
        this.dist = dist;
    }

    public String toString()
    {
        return String.format("%.4f", this.dist);
    }

}