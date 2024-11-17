import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> mp = new HashMap<>();
        
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] s1 = s.split("\\s+");
            int n = s1.length;
            System.out.print(s1[n-1]);
            String rs = s1[n-1];
            
            for (int i = 0; i < n - 1; i++) {
                System.out.print(s1[i].charAt(0));
                rs += s1[i].charAt(0);
            }
            
            if (mp.containsKey(rs)) {
                int a = mp.get(rs) + 1;
                mp.put(rs, a);
                System.out.print(a);
            } else {
                mp.put(rs, 1);
            }
            
            System.out.println("@ptit.edu.vn");
        }
    }
}