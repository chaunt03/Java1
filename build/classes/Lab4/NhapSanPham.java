package Lab4;

import Lab4.SanPham;

public class NhapSanPham {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("Ban phim gaming", 500000);
        SanPham sp2 = new SanPham("Man hinh cong 150inch", 8000000, 500000);
        sp1.xuat();
        sp2.xuat();
    }
}
