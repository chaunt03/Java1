package Lab7;

public class SinhVienBiz extends SinhVienPoly{
    protected double diemMarketting;
    protected double diemSales;

    public SinhVienBiz(double diemMarketting, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }
    
    double getDiem() {
        return (2*diemMarketting + diemSales)/3;
    }
}
