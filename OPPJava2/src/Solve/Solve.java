package Solve;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solve{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("OPPJava2/src/Solve/BANGDIEM.in"));
        ArrayList<J07054> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- !=0){
            list.add(new J07054(sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine(),Integer.parseInt(sc.nextLine()))));
        }
        Collections.sort(list);
        for(J07054 x : list){
            System.out.println(x);
        }
    }
}

