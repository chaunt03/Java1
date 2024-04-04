package slide5;

public class TiepThi extends NhanVien {
    public double doanhSoBanHang;
    public double tiLeHoaHong;

    public TiepThi(String manv, String hoTen, double luong, double doanhSoBanHang, double tiLeHoaHong) {
        super(manv, hoTen, luong);
        this.doanhSoBanHang = doanhSoBanHang;
        this.tiLeHoaHong = tiLeHoaHong;
    }
    public void xuattt() {
        super.xuat();
        System.out.println("Doanh số bán hàng: " + doanhSoBanHang);
        System.out.println("Tỉ lệ hoa hồng: " + tiLeHoaHong);
    }
}
