package slide3;

import static ThuVien.NhapTuBanPhim.nhapString;
import static ThuVien.NhapTuBanPhim.nhapdouble;
import java.util.Scanner;

public class LopPhoThong {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.setHoTen(nhapString("Nhap ho ten: "));
        hs.setDiemToan(nhapdouble("Nhap diem Toan: "));
        hs.setDiemVan(nhapdouble("Nhap diem Van: "));
        hs.setDiemAnh(nhapdouble("Nhap diem Anh: "));
        hs.setDtb();
        hs.xuat();
    }
}
