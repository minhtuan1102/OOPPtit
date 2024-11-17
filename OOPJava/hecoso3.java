import java.util.*;

public class hecoso3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            Boolean check = true;
            for(int i =0;i<s.length();i++){
               if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') check = false;
            }
            if (check == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
