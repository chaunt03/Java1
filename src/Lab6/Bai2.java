package Lab6;

import java.util.ArrayList;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<SanPham> ds = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            SanPham sp = new SanPham();
            sp.nhap();
            ds.add(sp);
        }
        
        for(SanPham sp : ds) {
            if(sp.getHang().equalsIgnoreCase("nokia")) {
                sp.xuat();
                System.out.println(" ");
            }
        }
    }
}
