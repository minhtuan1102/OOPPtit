import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        int x = in1.nextInt();
        int y = in1.nextInt();
        if (x<=0 | y<=0) System.out.println(0);
        else{
            System.out.print((x+y)*2 + " ");
            System.out.print(x*y);
        } 
        in1.close();
    }
    
}
