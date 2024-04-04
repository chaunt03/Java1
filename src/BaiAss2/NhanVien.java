package BaiAss2;

import java.util.Scanner;

public class NhanVien {
    String maNV;
    String hoTen;
    double luong;

    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public NhanVien() {
    }
    

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap() {
        return this.luong;
    }
    
    public double getThueTN() {
        if(this.getThuNhap() < 9000000)
            return 0;
        else if(this.getThuNhap() < 15000000)
            return this.getThuNhap() *0.1;
        else 
            return this.getThuNhap() * 0.12;
    }
    

    
    public void xuat() {
        System.out.println("Mã nhân viên: "+ this.maNV);
        System.out.println("Tên nhân viên: "+ this.hoTen);
        System.out.println("Thu nhập: "+ this.getThuNhap());
        System.out.println("Thuế thu nhập: "+ this.getThueTN());
        System.out.println("Lương: "+ this.luong);
    }
}
