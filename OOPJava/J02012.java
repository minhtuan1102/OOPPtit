import java.util.*;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i =0;i<n;i++) s[i] = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i =0;i<n;i++){
            System.out.print("Buoc " + i + ": ");
            a.add(s[i]);
            Collections.sort(a);
            for(int x:a) System.out.print(x + " ");
            System.out.println();
        } 
        
    }
}
