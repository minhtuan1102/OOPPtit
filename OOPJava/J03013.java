import java.math.BigInteger;
import java.util.*;
public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            BigInteger x = sc.nextBigInteger();
            BigInteger y = sc.nextBigInteger();
            String s = String.valueOf(x.subtract(y).abs());
            int max = Math.max(String.valueOf(x).length(), String.valueOf(y).length());
            if(s.length()<max){
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
}
