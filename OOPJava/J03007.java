import java.util.*;
public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int n = s.length();
            Boolean check = true;
            int sum = 0;
            for(int i =0;i<n;i++){
                sum += s.charAt(i) - '0';
            }
            if(sum%10!=0) check = false;
            else {
                if(s.charAt(0) != '8' || s.charAt(n-1) != '8') check = false;
                else {
                    for(int i =0;i<n;i++)
                        if(s.charAt(i) != s.charAt(n-i-1)) check = false;
                }
            }
            if(check == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
