import java.util.*;
public class J03008 {
    static boolean check(char c){
        if(c != '2' && c != '3' && c != '5' && c != '7') return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int n = s.length();
            Boolean test = true;
            for(int i =0;i<n;i++){
                if(s.charAt(i) != s.charAt(n-i-1)) test = false;
                else{
                    if(check(s.charAt(i))==false) test = false;
                }
            }
            if(test == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
