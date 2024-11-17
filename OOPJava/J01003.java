import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double x = t.nextDouble();
        double y = t.nextDouble();
        if (x==0 & y==0) System.out.println("VSN");
        else if (x==0) System.out.println("VN");
        else{
            String str = String.format("%.2f",(-y)/x);
            System.out.println(str);
        }  
        t.close(); 
    }
}
