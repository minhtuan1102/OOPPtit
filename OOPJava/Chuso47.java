import java.util.Scanner;

public class Chuso47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i =0;i<n.length();i++){
            if (n.charAt(i) == '4') cnt1++;
            if (n.charAt(i) == '7') cnt2++;

        }
        if (cnt1 + cnt2 == 4 | cnt1 + cnt2 == 7) System.out.println("YES");
        else 
        System.out.println("NO");
    }
}
