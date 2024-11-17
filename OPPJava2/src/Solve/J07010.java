package Solve;

public class J07010 {
    String code;
    String name;
    String Class;
    String date;
    double gpa;

    public static int i = 1;

    public J07010(String name, String Class, String date, double gpa) {
        this.code = String.format("B20DCCN%03d", i++); // Sửa để mã sinh viên có 3 chữ số, ví dụ B20DCCN001
        this.name = name;
        this.Class = Class;
        StringBuilder sb = new StringBuilder(date);
        if(sb.charAt(1) == '/')sb.insert(0, '0');
        if(sb.charAt(4) == '/')sb.insert(3, '0');
        this.date = sb.toString();
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", code, name, Class, date, gpa);
    }
}