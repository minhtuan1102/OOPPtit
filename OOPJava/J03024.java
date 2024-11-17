import java.util.Scanner;
public class J03024 {
    public static Boolean check(String s){
        for (int i = 0; i < s.length() ; i++) {
            if (!Character.isDigit(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            if(!check(s)) System.out.println("INVALID");
            else {
                int cnt1 = 0;
                int cnt2 = 0;
                if(s.length()%2==0){
                    for (int i = 0; i <s.length(); i++) {
                        if((s.charAt(i)-'0')%2==0) cnt1+=1;
                        else cnt2+=1;
                    }
                    if (cnt1 > cnt2) System.out.println("YES");
                    else System.out.println("NO");
                }else{
                    for (int i = 0; i <s.length(); i++) {
                        if((s.charAt(i)-'0')%2==0) cnt1+=1;
                        else cnt2+=1;
                    }
                    if (cnt1 < cnt2) System.out.println("YES");
                    else System.out.println("NO");
                }
            }
        }
    }
}