package slide4;

import ThuVien.NhapTuBanPhim.nhapString;
import ThuVien.NhapTuBanPhim.nhapDouble;
import java.util.Scanner;

public class LopPhoThong {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.setHoTen(nhapString("Nhap ho ten: "));
        hs.setDiem(nhapDouble("Nhap diem: "));
        hs.xuat();
    }
}
