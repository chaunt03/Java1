package slide4;

public class HocSinh {
    String hoTen;
    double diem;
    
    public HocSinh(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        if (diem <= 10 && diem <= 10)
        this.diem = diem;
        else System.out.println("Diem khong hop le");
    }

    public void xuat() {
        System.out.println("Ho ten" + hoTen);
        System.out.println("Diem " + diem);
    }
    



}
