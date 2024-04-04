package slide8;

import java.util.ArrayList;


public class SinhVien {
    public String name;
    public static String classname = "IT18204";

    public SinhVien(String name) {
        this.name = name;
    }
    public void xuat() {
        System.out.println("Ho ten: "+name);
        System.out.println("Lop: "+ classname);
    }
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();
        SinhVien sv1 = new SinhVien("aaaaaaa");
        ds.add(sv1);
        SinhVien sv2 = new SinhVien("Bbbbbbb");
        ds.add(sv2);
        sv1.xuat();
        sv2.xuat();
    }
}
