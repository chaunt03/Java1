package slide5;

public class TruongPhong extends NhanVien{
    public double luongTrachNhiem;
    public TruongPhong(String manv, String hoTen, double luong,double luongTrachNhiem) {
        super(manv, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    public void xuatcon() {
        super.xuat();
        System.out.println("Lương trách nhiệm: " + luongTrachNhiem);
    }
}
