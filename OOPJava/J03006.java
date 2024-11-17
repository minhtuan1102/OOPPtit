import java.util.*;
public class J03006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int n = s.length();
            Boolean check = true;
            for(int i=0;i<n;i++){
                if((s.charAt(i)- '0')%2!=0 || s.charAt(i) != s.charAt(n-i-1)) check = false;
            }
            if(check == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
