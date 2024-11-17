package Solve;

public class J04009 {
    private double x;
    private double y;

    public J04009(){

    }
    public J04009(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public J04009(J04009 p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public double distance(J04009 sp){
        double dx = this.x - sp.x;
        double dy = this.y - sp.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public double distance(J04009 p1, J04009 p2){
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
