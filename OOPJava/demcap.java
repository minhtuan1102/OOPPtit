import java.util.*;
public class demcap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++) a[i] = sc.nextInt();
        System.out.println(cnt(a,n));
    }

    private static long cnt(int[] a, int n) {
        int[] maxL = new int[n];
        int[] maxR = new int[n];
        maxL[0] = a[0];
        for(int i =1;i<n;i++) maxL[i] = Math.max(maxL[i-1], a[i]);
        maxR[n-1] = a[n-1];
        for(int i=n-2;i>=0;i--) maxR[i] = Math.max(maxR[i+1], a[i]);
        long count = 0;
        for(int i =0;i<n-1;i++){
            for(int j= i+1;j<n;j++) 
                if(maxL[j-1] <= a[i] && maxR[i+1] <= a[j]) count++;
        }
        return count;
    }
}
