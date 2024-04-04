package Lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    Scanner input = new Scanner(System.in);
    
    
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0);
    }
    
    public String getTenSp() {
        return tenSp;
    }
    public double getDonGia() {
        return donGia;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
    public void nhap(){
        System.out.println("Nhap ten san pham: ");
        this.tenSp = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        this.donGia = input.nextDouble();
        System.out.println("Giam gia: ");
        this.giamGia = input.nextDouble();
    }
    
    private double getThueNhapKhau() {
        return donGia * 0.1;
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueNhapKhau());
    }
}
