package slide6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import slide5.NhanVien;
import static slide6.NhapXuatNhanVien.nhapNV;
import static slide6.NhapXuatNhanVien.xuatAll;

public class SapXep {
    public static void sxTen(ArrayList<NhanVien> dsnv){
        System.out.println("Sap xep theo ten:");
        Comparator<NhanVien> cmp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                return t.hoTen.compareTo(t1.hoTen);
            }
        };
        Collections.sort(dsnv, cmp);
        xuatAll(dsnv);
    }
    public static void sxLuong(ArrayList<NhanVien> dsnv){
        System.out.println("Sap xep theo luong:");
        Comparator<NhanVien> cmp2 = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                return t.luong > t1.luong  ? 1 : -1 ;
            }
        };
        Collections.sort(dsnv, cmp2);
        xuatAll(dsnv);
    }
}
