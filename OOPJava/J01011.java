import java.util.*;
public class J01011 {
    static long ucln(long a, long b){
        if(b==0) return a;
        return ucln(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = ucln(a, b);
            System.out.println(a*b/gcd + " " + gcd);
        }
    }
}
