package Lab4;

import java.util.Scanner;

public class MangSP {
    public String tenSP;
    
    public double giaSP;
    
    public double giamGia;

    Scanner input = new Scanner(System.in);
    
    public MangSP(String tenSP, double giaSP, double giamGia) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.giamGia = giamGia;
    }
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getGiaSP() {
        return giaSP;
    }
    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    public double getGiamGia() {
        return giamGia;
    }
    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public void nhap() {
        System.out.println("Nhap ten san pham: ");
        this.tenSP = input.nextLine();
        System.out.println("Nhap gia san pham: ");
        this.giaSP = input.nextDouble();
        System.out.println("Ban muon giam gia bao nhieu: ");
        this.giamGia = input.nextDouble();
    }
    public double getThueSanPham(){
        return giaSP * 0.1;
    }

    public void xuat(){
        System.out.printf("Ten san pham: " + tenSP);
        System.out.printf("Gia san pham: " + giaSP);
        System.out.printf("Giam gia: " + giamGia);
        System.out.printf("Thue nhap khau la: " + getThueSanPham());
    }
    
}
