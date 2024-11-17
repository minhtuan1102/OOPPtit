package Solve;

import java.io.*;
import java.util.Scanner;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] intSet = new int[1005];
        for(int i = 0; i < 100000; i++)
            intSet[sc.readInt()]++;
        for(int i = 0; i <= 1000;i++){
            if(intSet[i] > 0){
                System.out.println(i + " " + intSet[i]);
            }
        }
    }
}
