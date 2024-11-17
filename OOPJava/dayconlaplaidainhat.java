import java.util.*;
public class dayconlaplaidainhat {
    public static int check(String s){
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1) == s.charAt(j-1) && i!=j){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }return dp[n][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
