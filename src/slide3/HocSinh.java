package slide3;

public class HocSinh {
    private String hoTen;
    private double diemToan;
    private double diemVan;
    private double diemAnh;
    private double dtb;


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        if (diemToan >= 0 && diemToan <= 10)
        this.diemToan = diemToan;
        else System.out.println("Diem khong hop le!");
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        if (diemVan >= 0 && diemVan <= 10)
        this.diemVan = diemVan;
        else System.out.println("Diem khong hop le!");
    }

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setDiemAnh(double diemAnh) {
        if (diemAnh >= 0 && diemAnh <= 10)
        this.diemAnh = diemAnh;
        else System.out.println("Diem khong hop le!");
    }

    public double getDtb() {
        return dtb;
    }

    public double setDtb() {
        return (diemToan + diemVan + diemAnh)/3;
    }
    
    
    public void xuat() {
        System.out.println("Diem toan: "+ this.diemToan);
        System.out.println("Diem van: "+ this.diemVan);
        System.out.println("Diem Anh: "+ this.diemAnh);
        System.out.println("Diem tb: "+ setDtb());
    }
}
