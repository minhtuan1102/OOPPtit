import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> result = new HashSet<>();
        List<Integer> pt = new ArrayList<>();
        for (int i =0 ;i<n;i++){
            a[i] = sc.nextInt();
            result.add(a[i]);
        }
        for (int i =0 ;i<m;i++){
           b[i] = sc.nextInt();
           result.add(b[i]);
        }
        pt.addAll(result);
        Collections.sort(pt);
        for(int i : pt) System.out.print(i+" ");
        
        
    }
}
