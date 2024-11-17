import java.util.*;

public class J01022
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] dp = new long[95];
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= 92; ++i)
            dp[i] = dp[i - 1] + dp[i - 2];
        long k;
        int n;
        String s = "001";
        int t = sc.nextInt();
        while (t-- > 0)
        {
            n = sc.nextInt();
            k = sc.nextLong();
            while (n > 2)
            {
                if (k <= dp[n - 2])
                    n -= 2;
                else
                {
                    k -= dp[n - 2];
                    --n;
                }
            }
            System.out.println(s.charAt(n));
        }
    }
}


/*import java.util.*;

public class J01022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int k = sc.nextInt();
            int n = sc.nextInt();
            String x1 = "0";
            String x2 = "1";
            String x = x1+x2;
            for(int i = 3;i<=n;i++){
                x = x1+x2;
                x1 = x2;
                x2 = x;  
            }
            System.out.println(x.charAt(k));
        }
    }
}*/
