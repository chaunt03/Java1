package slide4;

public class KieuSinhVien {
    String mssv;
    String hoTen;
    double diem;
    public void xuat() {
        System.out.printf("Ma sinh vien: %s\n",mssv);
        System.out.printf("Ho ten sinh vien: %s\n",hoTen);
        System.out.printf("Diem: %.2f\n",diem);
    }
    public KieuSinhVien(String mssv, String hoTen, double diem) {
        this.mssv = mssv;
        this.hoTen = hoTen;
    }
    public KieuSinhVien(double diem) {
        this(mssv,hoTen);
        this.diem = diem;
    }
    
}
