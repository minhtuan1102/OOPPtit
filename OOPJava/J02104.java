import java.util.*;

public class J02104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++) a[i][j] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(a[i][j] == 1){
                    int x = i +1, y = j+1;
                    System.out.println("("+x+","+y+")");
                    a[i][j] = 0;
                    a[j][i] = 0;
                }
            }
        }
    }
}
