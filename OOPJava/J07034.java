

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034
{
    public static class Subject implements Comparable<Subject>{
        private String id;
        private String name;
        private String credit;

        public Subject(String id, String name, String credit) {
            this.id = id;
            this.name = name;
            this.credit = credit;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + credit;
        }
        @Override
        public int compareTo(Subject o){
            return this.name.compareTo(o.name);
        }
    }
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            list.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Subject x : list){
            System.out.println(x);
        }
    }
}
