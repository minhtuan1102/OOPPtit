import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int maxValue = a[n-1];
        boolean[] dd = new boolean[maxValue+1];
        for(int i =0;i<n;i++){
            dd[a[i]] = true;
        }
        Boolean check = false;
        for(int i =1,j=0;i<=maxValue;i++){
            if(j<=n && i ==a[j]) j++;
            else {
                System.out.println(i);
                check = true;
            }
        }
        if(!check) System.out.println("Excellent!");
    }
}
