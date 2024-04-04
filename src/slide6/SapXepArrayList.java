package slide6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import slide5.NhanVien;
import static slide6.NhapXuatNhanVien.nhapNV;
import static slide6.NhapXuatNhanVien.xuatAll;
import static slide6.SapXep.sxLuong;
import static slide6.SapXep.sxTen;

public class SapXepArrayList {
    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        nhapNV(dsnv);
        xuatAll(dsnv);
        //sap xep theo ten
        sxTen(dsnv);
        sxLuong(dsnv);
    }
}
