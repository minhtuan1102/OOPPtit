package Solve;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class KhaibaoSinhVien {
    public static class J04006 {
        String name;
        String grade;
        String date;
        float gpa;
        J04006(){
            this.name = "";
            this.grade = "";
            this.date = "";
            this.gpa = 0;
        }
        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public String getGrade()
        {
            return grade;
        }

        public void setGrade(String grade)
        {
            this.grade = grade;
        }

        public String getDate()
        {
            return date;
        }

        public void setDate(String date)
        {
            this.date = date;
        }

        public float getGPA()
        {
            return gpa;
        }

        public void setGPA(float gpa)
        {
            this.gpa= gpa;
        }

        public void chuanhoaDate()
        {
            String[] a = this.date.split("/");
            this.date = "";
            while(a[0].length() < 2)
                a[0] = "0" + a[0];
            this.date += a[0] + "/";
            while(a[1].length() < 2)
                a[1] = "0" + a[1];
            this.date += a[1] + "/";
            while(a[2].length() < 4)
                a[2] = "0" + a[2];
            this.date += a[2];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhaibaoSinhVien A = new KhaibaoSinhVien();
        int t = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        
    }
}