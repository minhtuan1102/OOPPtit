import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class J07046 {
    public static class LuuTru implements Comparable<LuuTru>{
        String ma, ten, phong;
        Date  checkin, checkout;
        long ngay;
        static int id = 1;
        public LuuTru(String ten, String phong , Date checkin, Date checkout){
            this.ma = String.format("KH%02d",id++);
            this.ten = ten;
            this.phong = phong;
            this.checkin = checkin;
            this.checkout = checkout;
            this.ngay =  (checkout.getTime() - checkin.getTime()) / (1000L * 60 * 60 * 24);
        }
        @Override
        public String toString(){
            return ma + " " + ten + " " + phong + " " + ngay;
        }
        @Override
        public int compareTo(LuuTru lt){
            return (int) (lt.ngay - this.ngay);
        }
    }
    public static void main(String[] args) throws IOException,ParseException  {
        Scanner in = new Scanner(new File("KHACH.in"));
        ArrayList<LuuTru> lt = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        while(n-- >0){
            lt.add(new LuuTru(in.nextLine(),in.nextLine(),dateFormat.parse(in.nextLine()), dateFormat.parse(in.nextLine())));
        }
        Collections.sort(lt);
        for(LuuTru x:lt) System.out.println(x);
    }
}
