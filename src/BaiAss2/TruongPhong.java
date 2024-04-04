package BaiAss2;

import java.util.Scanner;

public class TruongPhong extends NhanVien{
    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    public TruongPhong(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    
    public double getThuNhap() {
        return super.getLuong() + this.trachNhiem;
    }
    
    
    
    public void xuat() {
        super.xuat();
        System.out.println("Trách nhiệm: "+ this.trachNhiem);
    }
}
