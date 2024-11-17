import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07045
{
    public static class LoaiPhong implements Comparable<LoaiPhong>
{
    private String data;
    private String name;

    public LoaiPhong(String s)
    {
        data = s;
        String arr[] = s.split("\\s+");
        this.name = arr[1];
    }

    @Override
    public String toString()
    {
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o)
    {
        return this.name.compareTo(o.name);
    }
}
    public static void main(String[] args) throws IOException
    {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0)
        {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds)
        {
            System.out.println(tmp);
        }
    }
}
