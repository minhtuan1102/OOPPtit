import java.util.*;
public class tichchusotongchuso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine();
            int sum = 0;
            long res = 1;
            for(int i =0;i<s.length();i++){
                if(i%2==0){
                    if(s.charAt(i) - '0' == 0) continue;
                    else res*=s.charAt(i) - '0';
                }else sum+= s.charAt(i) - '0';
            }
            System.out.println(res + " " +  sum);
        }
    }
}
