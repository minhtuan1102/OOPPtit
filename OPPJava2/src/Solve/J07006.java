package Solve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        int[] n = new int[1005];
        for (int i : list) n[i]++;
        for (int i = 0; i <= 1000; i++) {
            if (n[i] > 0) System.out.println(i + " " + n[i]);

        }

    }
}
