import java.util.*;
public class cacsogandep {
    public static final double mod = Math.pow(10,9)+7;
    public static long n, k;
    public static long mul(long  a, long  b){
        if(b==0) return 0l;
        long tmp = mul(a,b/2);
        if(b%2==1) return (tmp*2+a)%(long)mod;
        return tmp*2%(long)mod;
    }
    
    public static long Pow(long n, long k){
        if(k==0) return 1;
        if(k==1) return n%(long)mod;
        long tmp = Pow(n,k/2);
        long a = mul(tmp,tmp);
        if(k%2==1) return a*n%(long)mod; 
        return a%(long)mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long s = Pow(2,n) + Pow(3, m);
        ArrayList<Long> arr = new ArrayList<>();
        System.out.println(s);
        while(s >= 10){
            s/=10;
        }
        System.out.println(s);
     }
}