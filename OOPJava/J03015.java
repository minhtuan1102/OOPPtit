import java.util.*;
import java.math.BigInteger;
public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        String s = String.valueOf(a.subtract(b));
        int max = Math.max(String.valueOf(a).length(), String.valueOf(b).length());
        while(s.length()<max){
                s =  s + "0";
        }
        System.out.println(s);
    }
}
