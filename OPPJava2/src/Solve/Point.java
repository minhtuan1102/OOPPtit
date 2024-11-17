package Solve;

public class Point {
    double x;
    double y;

    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getDist(Point A)
    {
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
}
