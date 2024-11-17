import java.util.*;
public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] s11 = s1.split("\\s+");
            String[] s12 = s2.split("\\s+");
            TreeSet<String> se1 = new TreeSet<>();
            for(int i =0;i<s11.length;i++) se1.add(s11[i]);
            TreeSet<String> se2 = new TreeSet<>();
            for(int i =0;i<s12.length;i++) se2.add(s12[i]);
            se1.removeAll(se2);
            for(String x:se1) System.out.print(x + " ");
            System.out.println();
        }
    }
}
