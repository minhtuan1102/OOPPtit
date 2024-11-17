package Solve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07015 {
    public static boolean check(int n) {
        if (n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] n = new int[10005];
        for (int i : list){
            if (check(i) == true) n[i]++;
        }
        for (int i = 0; i <= 10000; i++) {
            if (n[i] > 0) System.out.println(i + " " + n[i]);
        }
    }
}
