package test;

import java.util.Scanner;

public class congNhan extends CanBo{
    String bac;

    public congNhan(String bac, String hoTen, double namSinh, String gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(double namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void xuat() {
        super.xuat();
        System.out.println("Bậc: "+ this.bac);
    }
}
