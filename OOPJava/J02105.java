import java.util.*;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++) a[i][j] = sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int x = i+1;
            System.out.print("List("+x+") = ");
            for(int j =0;j<n;j++){
                if(a[i][j] == 1) System.out.print(j+1 
                + " ");
            }System.out.println();
        }   
    }
}
