import java.util.Scanner;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            boolean x = false;
            int n = sc.nextInt();
            if (n<2) x = true;
            for (int i =2;i*i<=n;i++){
                if (n%i==0) x = true;
            }
            if(x==false) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
