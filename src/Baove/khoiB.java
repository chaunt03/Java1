package Baove;


public class khoiB extends thiSinh{
    double toan;
    double hoa;
    double sinh;

    public khoiB(double toan, double hoa, double sinh, String soBaoDanh, String hoTen, String diaChi, double uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getSinh() {
        return sinh;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
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
        System.out.println("Điểm toán: "+ this.toan);
        System.out.println("Điểm hóa: "+ this.hoa);
        System.out.println("Điểm sinh: "+ this.sinh);
    }
}
