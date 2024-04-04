package Lab6;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private String hang;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        donGia = input.nextDouble();
        System.out.println("Nhap hang san pham: ");
        hang = new Scanner(System.in).nextLine();
    }
    
    public void xuat() {
        System.out.println("*******Danh sach san pham*******");
        System.out.println("Ten san pham: "+ tenSP);
        System.out.println("Gia san pham: "+ donGia);
        System.out.println("Hang san pham: "+ hang);
    }
    
}
