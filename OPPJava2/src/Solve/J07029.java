package Solve;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class J07029 {
    public static boolean check(int x){
        if(x<2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ArrayList<Integer> res = new ArrayList<>();
        int[] intSet = new int[10000005];
        for (int x: list){
            if(check(x)){
                if (intSet[x] == 0) res.add(x);
                intSet[x]++;
            }
        }
        Collections.sort(res,Collections.reverseOrder());
        for (int i = 0; i < 10; i++) {
            System.out.println(res.get(i) + " " + intSet[res.get(i)]);
        }
    }
}
