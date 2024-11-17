import java.util.*;
public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String[] a = sc.nextLine().trim().split("\\s+");
            for(int i=0;i<a.length;i++) a[i] = new StringBuilder(a[i]).reverse().toString();
            for(String i : a) System.out.print(i + " ");
            System.out.println();
        }
    }
}
