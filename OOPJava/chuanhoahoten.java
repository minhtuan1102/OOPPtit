import java.util.*;
public class chuanhoahoten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            if(n==1){
                System.out.print(String.valueOf(a[a.length-1].charAt(0)).toUpperCase() + a[a.length-1].substring(1)+ " ");
                for(int i=0;i<a.length-1;i++){
                    System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
                }System.out.println();
            }
            else{
                for(int i =1;i<a.length;i++){
                    System.out.print(String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1) + " ");
                }
                System.out.println(String.valueOf(a[0].charAt(0)).toUpperCase() + a[0].substring(1));
            }

        }

    }
}
