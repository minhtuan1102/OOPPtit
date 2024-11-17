import java.util.*;
public class tachsovasapxep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String res = "";
            for(int j=0;j<s.length();j++){
                char c = s.charAt(j);
                if(Character.isDigit(c)) res+=c;
                else{
                    if(!res.isEmpty()){
                        s1.add(Integer.parseInt(res));
                        res="";
                    }
                }
            }
            if(!res.isEmpty()) s1.add(Integer.parseInt(res));
        }
        Collections.sort(s1);
        for(Integer x:s1) System.out.println(x);
    }
}
