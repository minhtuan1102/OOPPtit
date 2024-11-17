/*import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            for(String i:a) System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1)+ " ");
            System.out.println();
        }
    }
}*/

//C2

import java.util.*;
public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            String name = sc.nextLine();
            String afterN = normalize(name);
            System.out.println(afterN);
        }
    }

    private static String normalize(String name) {
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String w:words){
            if(w.length()>0){
            sb.append(Character.toUpperCase(w.charAt(0)));
            sb.append(w.substring(1).toLowerCase());
            sb.append(" ");
            }
        }
        return sb.toString();
    }
}

