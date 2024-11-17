import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int t = tc.nextInt();
        while(t-->0){
            int n = tc.nextInt(); 
            System.out.println((n*(n+1))/2);
        }
        tc.close();
    }
}