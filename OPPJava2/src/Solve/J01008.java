package Solve;

import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int x = 0;
        while(x++ <t){
            int n = sc.nextInt();
            System.out.print("Test" + " " + x + ": ");
            for (int i = 2; i*i < n; i++) {
                int cnt = 0;
                while(n%i == 0){
                    cnt++;
                    n/=i;
                }
                if(cnt>=1) System.out.print(i+"(" + cnt + ") " );
            }
            if (n>1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
