import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07037 {
    public static class Company implements Comparable<Company>{
        private String id;
        private String name;
        private String intern;
    
        public Company(String id, String name, String intern) {
            this.id = id;
            this.name = name;
            this.intern = intern;
        }
    
        @Override
        public String toString() {
            return id + " " + name + " " + intern;
        }
        @Override
        public int compareTo(Company o){
            return this.id.compareTo(o.id);
        }
    }
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- != 0){
            list.add(new Company(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(Company x : list){
            System.out.println(x);
        }
    }
}
