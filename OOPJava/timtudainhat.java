import java.util.*;
public class timtudainhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String lW = "";
        while(sc.hasNext()){
            String word = sc.next();
            if(word.length()>max){
                max = word.length();
                lW = word;
            }
        
        }
        System.out.println(lW + " - " + max);
    }
}
