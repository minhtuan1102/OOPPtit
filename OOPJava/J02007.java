import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[1000005];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test " + (t + 1) + ":");
            for(int x:a){
                if(b[x]>0){
                    System.out.println(x + " xuat hien " + b[x] + " lan");
                    b[x] = 0;
                }
            }
        }
    }
}
