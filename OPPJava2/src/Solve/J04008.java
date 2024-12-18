package Solve;

public class J04008 {
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;

    public J04008(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.getDist(B);
        this.AC = A.getDist(C);
        this.BC = B.getDist(C);
    }

    @Override
    public String toString()
    {
        if (AB + AC <= BC || AB + BC <= AC || AC + BC <= AB)
            return String.format("INVALID");
        return String.format("%.3f", AB + AC + BC);
    }
}
