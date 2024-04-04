package slide5;

public class NhanVien {
    public String manv;
    public String hoTen;
    public double luong;

    public NhanVien(String manv, String hoTen, double luong) {
        this.manv = manv;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public void xuat() {
        System.out.println("Mã nhân viên: " + manv);
        System.out.println("Tên nhân viên: " + hoTen);
        System.out.println("Lương nhân viên: " + luong);
    }
    
}