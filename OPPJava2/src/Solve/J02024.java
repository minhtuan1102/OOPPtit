package Solve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J02024 {
    static int n;
    static int[] a = new int[200];
    static int[] x = new int[200];
    static ArrayList<String> list = new ArrayList<>();

    public static void Try(int i){
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if(i==n){
                StringBuilder sb = new StringBuilder();
                int sum = 0;
                for (int k = 0; k <= n; k++) {
                    if(x[k] == 1){
                        sb.append(a[k]).append(" ");
                        sum+=a[k];
                    }
                }
                if(sum%2 !=0) list.add(sb.toString().trim());

            }else Try(i+1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- >0){
            n = sc.nextInt();
            for (int i = 1; i <= n ; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a,1,n+1);
            for (int i = 1, j=n;i<j; i++,j--) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            list.clear();
            Try(1);
            for(String x:list) System.out.println(x);
        }
    }
}
