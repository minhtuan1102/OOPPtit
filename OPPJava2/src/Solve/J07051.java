package Solve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J07051 implements Comparable<J07051>{
    String code;
    String name;
    String soPhong;
    int songayO;
    long thanhTien;

    static int x = 0;
    public J07051(String name, String soPhong, String ngayNhan, String ngayTra, Long tienDichVu) throws ParseException {
        this.code = String.format("KH%02d", ++x);
        this.name = chuanhoa(name);
        this.soPhong = soPhong;
        this.songayO = tinhSongayO(ngayNhan, ngayTra);
        this.thanhTien = tinhTien(soPhong,songayO,tienDichVu);
    }

    private long tinhTien(String soPhong, int songayO, long tienDichVu) {
        if(soPhong.substring(0, 1).equals("1")) return songayO* 25L + tienDichVu;
        else if (soPhong.substring(0, 1).equals("2")) return songayO* 34L + tienDichVu;
        else if (soPhong.substring(0, 1).equals("3")) return songayO* 50L + tienDichVu;
        else return songayO* 80L + tienDichVu;
    }

    private int tinhSongayO(String ngayNhan, String ngayTra) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date in = sdf.parse(ngayNhan);
        Date out = sdf.parse(ngayTra);
        long dif = out.getTime() - in.getTime();
        return (int) (dif/(1000*60*60*24))+1;
    }

    private String chuanhoa(String name) {
        String[] s = name.trim().toLowerCase().split("\\s+");
        String z = "";
        for(String i : s){
            z += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return z.trim();
    }

    @Override
    public int compareTo(J07051 o) {
        return Long.compare(o.thanhTien, this.thanhTien);
    }
    @Override
    public String toString(){
        return code + " " + name + " " + soPhong + " " + songayO + " " + thanhTien;
    }
}
