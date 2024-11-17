import java.math.BigInteger;
import java.util.*;
public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String[] a = new String[2];
            for(int i =0;i<2;i++) a[i] = sc.nextLine();
            BigInteger x = new BigInteger(a[0]);
            BigInteger y = new BigInteger(a[1]);
            if(x.mod(y).equals(BigInteger.ZERO) || y.mod(x).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
            
            
        }
        
    }
}
