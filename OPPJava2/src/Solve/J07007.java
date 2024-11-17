package Solve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
        for(String x : set){
            System.out.println(x);
        }
    }
}
