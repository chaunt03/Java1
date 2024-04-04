
package slide3;

import static ThuVien.NhapTuBanPhim.nhapInt;
import static ThuVien.NhapTuBanPhim.nhapdouble;
import static ThuVien.NhapTuBanPhim.nhapFloat;

public class GoiHam {
    public static void main(String[] args) {
        int n = nhapInt("Nhập số nguyên: ");
        System.out.printf("Số nguyên vừa nhập %d\n",n);
        
        double m = nhapdouble("Nhập số thực: ");
        System.out.printf("Số thực vừa nhập là: %.2f",m);
        
        double t = nhapFloat("Nhập số thực: ");
        System.out.printf("Số thực vừa nhập là: %.2f",t);
    } 
}
