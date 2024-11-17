package THCODEPTIT;

import javax.security.sasl.SaslClient;
import java.io.*;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Solve  {
    public static class Student1{
        String id, name, Class, mail, nb, hd,dt;

        public Student1(String id, String name, String Class, String mail, String nb, String hd, String dt) {
            this.id = id;
            this.name = name;
            this.Class = Class;
            this.mail = mail;
            this.nb = nb;
            this.hd = "";
            this.dt = "";
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s 0%s", id,name,hd,dt,nb);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Student1> mp = new HashMap<>();
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        while (sc1.hasNextLine()) {
            String id = sc1.next();
            sc1.nextLine();
            String name = sc1.nextLine();
            String Class = sc1.next();
            String mail = sc1.next();
            String nb = sc1.next();
            Student1 student1 = new Student1(id, name, Class, mail, nb, "", "");
            mp.put(id, student1);
        }
        sc1.close();

        ArrayList<Student1> list = new ArrayList<>();
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        int t = sc2.nextInt();
        sc2.nextLine();
        while (t-- > 0) {
            String s = sc2.nextLine();
            String[] a = s.split("\\s+");
            int n = Integer.parseInt(a[a.length - 1]);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a.length - 1; i++) {
                sb.append(a[i]).append(" ");
            }
            String guidename = sb.toString().trim();
            while (n-- > 0) {
                String s1 = sc2.nextLine();
                String[] a1 = s1.trim().split("\\s+");
                String id = a1[0];

                StringBuilder sb1 = new StringBuilder();
                for (int i = 1; i < a1.length; i++) {
                    sb1.append(a1[i]).append(" ");
                }
                String taskname = sb1.toString().trim();
                Student1 stu1 = mp.get(id);
                if (stu1 != null) {
                    stu1.hd = guidename;
                    stu1.dt = taskname;
                    list.add(stu1);
                }
            }
        }
        sc2.close();
        Collections.sort(list, new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                return o1.id.compareTo(o2.id);
            }
        });

        for (Student1 x : list) System.out.println();

    }
}