import java.util.*;
public class tinhtongcacchuso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)) sum += c - '0';
                else if(Character.isLetter(c)) sb.append(c);
            }
            char[] char1 = sb.toString().toCharArray();
            Arrays.sort(char1);
            String rs  =  new  String(char1)+sum;
            System.out.println(rs);
           
        }
    }
}
