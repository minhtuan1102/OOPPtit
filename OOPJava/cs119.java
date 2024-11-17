import java.util.*;
public class cs119 {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb.toString());

        sb.insert(5, " Java");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        //StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer.toString());

        buffer.delete(0,6);
        System.out.println(buffer.toString());
        buffer.replace(0, 5, "Java");
        System.out.println(buffer.toString());
        
        String str = "Java, Python, C++";
        StringTokenizer token = new StringTokenizer(str,", ");
        while(token.hasMoreTokens()){
            String strtoken = token.nextToken();
            System.out.println(strtoken);
        }
    }
}
