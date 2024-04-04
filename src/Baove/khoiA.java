package Baove;

public class khoiA extends thiSinh{
    double toan;
    double ly;
    double hoa;

    public khoiA(double toan, double ly, double hoa, String soBaoDanh, String hoTen, String diaChi, double uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
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
        System.out.println("Điểm lý: "+ this.ly);
        System.out.println("Điểm hóa: "+ this.hoa);
    }
}
