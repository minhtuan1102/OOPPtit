import java.util.*;
public class taphopsonguyen {
    public static void pL(ArrayList<Integer> list){
        if(list.isEmpty()){
            System.out.println();
        }else{
            for(int i =0;i<list.size();i++){
                if(i>0) System.out.print(" ");
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            TreeSet<Integer> A = new TreeSet<>();
            TreeSet<Integer> B = new TreeSet<>();
            int[] b = new int[m];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
                A.add(a[i]);
            }
            for(int j=0;j<m;j++){
                b[j] = sc.nextInt();
                B.add(b[j]);
            }
            ArrayList<Integer> rs1 = new ArrayList<>(A); 
            rs1.retainAll(B);
            Collections.sort(rs1); 
            ArrayList<Integer> rs2 = new ArrayList<>(A);
            rs2.removeAll(B);
            Collections.sort(rs2);
            ArrayList<Integer> rs3 = new ArrayList<>(B);
            rs3.removeAll(A);
            Collections.sort(rs3);
            pL(rs1);
            pL(rs2);
            pL(rs3);
    }
}
