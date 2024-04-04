package slide4;

import ThuVien.NhapTuBanPhim.nhapString;
import ThuVien.NhapTuBanPhim.nhapDouble;
import java.util.Scanner;

public class DanhSachLop {
    public static void main(String[] args) {
        KieuSinhVien[] dssv = new KieuSinhVien[100];
        Scanner input = new Scanner(System.in);

        int n = nhapInt("Nhap so sinh vien: ")
        for (int i = 0; i < n; i++){
            
            String mssv = nhapString("Nhap ma: ");
            String hoTen = nhapString("Nhap ten: ");
            double diem = nhapDouble("Nhap diem: ");
            
            dssv[i] = new KieuSinhVien(mssv, hoTen, diem);
        }
        for (int i = 0; i < n; i++) dssv[i].xuat();        
        
    }
}
