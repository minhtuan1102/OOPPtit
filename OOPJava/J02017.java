import java.util.*;
public class J02017 {
    public static void main(String[] args) {
        //C1 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int x;
        /*
        while(n-- >0){
            x = sc.nextInt();
            if(!st.empty() && (x+st.peek())%2==0) st.pop();
            else st.push(x);
        }
        System.out.println(st.size());
        */
        //C2
        Vector<Integer> vt = new Vector<>();
        for (int i=0;i<n;i++){
            vt.add(sc.nextInt());
        }
        int i =0;
        while(i<vt.size()-1){
            if((vt.get(i) + vt.get(i+1))%2==0){
                vt.remove(i);
                vt.remove(i);
                if(i>0) i--;
            }
            else i++;
        }
        System.out.println(vt.size());
    }
}
