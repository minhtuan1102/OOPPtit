import java.util.*;
import java.math.BigInteger;
public class tongcacchuso {
    public static long tong(long n){
        long sum = 0;
        while (n!=0) {
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long rs = 0;
            rs +=tong(a);
            while (a!=b) {
                a+=1;
                rs +=tong(a);
            }
            System.out.println(rs);
        }
    }
}
