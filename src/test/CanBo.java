package test;

public class CanBo {
    String hoTen;
    double namSinh;
    String gioiTinh;
    String diaChi;

    public CanBo(String hoTen, double namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
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

    public void setNamSinh(int namSinh) {
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
        System.out.println("Họ và tên: "+ hoTen);
        System.out.println("Năm sinh: "+ namSinh);
        System.out.println("Giới tính: "+ gioiTinh);
        System.out.println("Địa chỉ: "+ diaChi);
    }
}
