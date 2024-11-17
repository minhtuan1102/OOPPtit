import java.util.*;
import java.lang.ArithmeticException;
public class J02025 {
    static boolean OK = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            OK = true;
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            Arrays.sort(a, Collections.reverseOrder());
            int[] x = new int[n];
            Init(x,n);
            while(OK){
                Result(a,x,n);
                Next_Bits_String(x,n);
            }
        }
    }

    private static void Next_Bits_String(int[] x, int n) {
        int i = n-1;
        while(i>=0 && x[i] == 1){
            x[i] = 0;
             i--;
            }
        if(i>=0) x[i] = 1;
        else OK = false;
    }

    private static void Result(Long a[], int[] x, int n) {
        Long sum = 0L;
        for(int i = 0; i < n; i++) {
            if(x[i] == 1) sum += a[i];
        }
        if(checkNT(sum) == 1) {
            for(int i = 0; i < n; i++) {
                if(x[i] == 1) System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    private static int checkNT(Long n) {
        if(n<=1) return 0;
        for(int i =2;i<=Math.sqrt(n)+1;i++){
            if(n%i == 0) return 0;
        }
        return 1;
    }

    private static void Init(int[] x, int n) {
        for(int i =0;i<n;i++) x[i] = 0;
    }
}
