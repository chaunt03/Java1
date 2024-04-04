package Lab7;

public class ChuNhat {
    private double rong;
    private double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
    
    public double getChuVi() {
        return(dai + rong)*2;
    }
    
    public double getDienTich() {
        return dai*rong;
    }
    
    public void xuat() {
        System.out.printf("Chu vi hinh chu nhat la: %.2f | Dien tich hinh chu nhat la: %.2f\n", getChuVi(), getDienTich());
    }
}
