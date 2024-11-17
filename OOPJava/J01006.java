import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long f1 = 1;
            long f2 = 1;
            long fn = f1+f2;
            long n = sc.nextInt();
            if (n==1 | n==2) System.out.println(f1);
            else{
                for (int i =2;i<n;i++){
                    fn = f1+f2;
                    f1 = f2;
                    f2 = fn;
                }
                System.out.println(fn);
            }
            sc.close();
        }
    }
}
