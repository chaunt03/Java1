package Baove;

public class khoiC extends thiSinh{
    double van;
    double su;
    double dia;

    public khoiC(double van, double su, double dia, String soBaoDanh, String hoTen, String diaChi, double uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getUuTien() {
        return uuTien;
    }

    public void setUuTien(double uuTien) {
        this.uuTien = uuTien;
    }
    
    public void xuat() {
        super.xuat();
        System.out.println("Điểm văn: "+ this.van);
        System.out.println("Điểm sử: "+ this.su);
        System.out.println("Điểm địa: "+ this.dia);
    }
}
