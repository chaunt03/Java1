package Lab7;

public class SinhVienIT extends SinhVienPoly{
    protected double diemJava;
    protected double diemCss;
    protected double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4;
    }
    
}
