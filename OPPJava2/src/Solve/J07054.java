package Solve;

public class J07054 implements Comparable<J07054> {
    String code;
    String name;
    int oop;
    int cplusplus;
    int thcs2;
    double dtb;

    static int id = 0;
    static int rank = 1;
    public J07054(String name, int oop, int cplusplus) {
        this.code = "SV" + String.format("%02d", id++);
        this.name = chuanhoa(name);
        this.oop = Getg1(oop);
        this.cplusplus = Getg2(cplusplus);
        this.thcs2 = Getg3(thcs2);
        dtb = Double.parseDouble(String.format("%.2f", (this.oop*3 + this.cplusplus*3 + this.thcs2*2)/8));
    }
    public String chuanhoa(String s) {
        String[] s1 = s.trim().toLowerCase().split("\\s+");
        String z = "";
        for (String i : s1) {
            z += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return z.trim();
    }
    private int Getg3(int g3) {
        if (g3 < 0 || g3 > 10) {
            return 0;
        } else {
            return g3;
        }
    }

    private int Getg2(int g2) {
        if (g2 < 0 || g2 > 10) {
            return 0;
        } else {
            return g2;
        }
    }

    private int Getg1(int g1) {
        if (g1 < 0 || g1 > 10) {
            return 0;
        } else {
            return g1;
        }
    }

    @Override
    public String toString() {
        return name + " " + oop + " " + cplusplus + " " + thcs2 + " " + dtb + " " + code;
    }

    @Override
    public int compareTo(J07054 o) {
        return Double.compare(o.dtb, this.dtb);
    }
}