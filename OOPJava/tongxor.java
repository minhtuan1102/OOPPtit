import java.util.*;
public class tongxor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        int x = sc.nextInt();
        while(x-- >0){
            int[] dd = new int[1000000000];
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int i = l-1;i < r;i++){
                dd[a[i]]++;
            }
            int tong = 0;
            for(int i = 0;i < 1000000000;i++)
            {
                if(dd[i] % 2 == 0) tong += i;
            }
            System.out.println(tong);
        }
    }
}
