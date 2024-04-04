package Baove;

public class thiSinh {
    String soBaoDanh;
    String hoTen;
    String diaChi;
    double uuTien;

    public thiSinh(String soBaoDanh, String hoTen, String diaChi, double uuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
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
        System.out.println("Số báo danh: "+ this.soBaoDanh);
        System.out.println("Họ và tên: "+ this.hoTen);
        System.out.println("Địa chỉ: "+ this.diaChi);
        System.out.println("Điểm ưu tiên: "+ this.uuTien);
    }
}
