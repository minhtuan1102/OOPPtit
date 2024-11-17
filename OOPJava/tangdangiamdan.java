import java.util.*;
public class tangdangiamdan {
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
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++) a[i] = sc.nextInt();
            TreeSet<Integer> s1 = new TreeSet<>();
            TreeSet<Integer> s2 = new TreeSet<>();
            for(int i =0;i<n;i++){
                if(a[i] % 2==0) s1.add(a[i]);
                else s2.add(a[i]);
            }
            ArrayList<Integer> a1 = new ArrayList<>(s1);
            Collections.sort(a1);
            ArrayList<Integer> a2 = new ArrayList<>(s2);
            Collections.sort(a2, Collections.reverseOrder());
            pL(a1);
            pL(a2);
        }
    }
}
