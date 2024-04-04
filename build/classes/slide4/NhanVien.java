package slide4;

public class NhanVien {
    String tenNV;
    double luongNV;
    public void xuat() {
        System.out.printf("Ten nhan vien: %s\n",tenNV);
        System.out.printf("Luong nhan vien: %.3f\n",luongNV);
    }
    public NhanVien(String tenNV, double luongNV) {
            this.tenNV = tenNV;
            this.luongNV = luongNV;
    }
}

