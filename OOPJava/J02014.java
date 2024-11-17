import java.util.*;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=1;j<t;++j){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int l = 1;
            int ls = a[0];
            int rs = 0;
            for(int i =2;i<n;i++){
                rs += a[i];
            }
            Boolean check = false;
            while(l<n-1){
                if(ls == rs) {
                    check = true;
                    l = l+1;
                    break;
                }
                else{
                    ls += a[l];
                    rs -= a[l+1];
                    l++;
                }
            }
            if(check == true) System.out.println(l);
            else System.out.println(-1);   
        }
    }
}
