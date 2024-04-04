package Lab6;

import java.util.ArrayList;

public class DanhSachSV {
    private ArrayList<SinhVien> list = new ArrayList<>();
    
    public void nhap() {
        for(int i = 0; i < 5 ; i++){
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }
    
    public void xuat() {
        System.out.println("******Thong tin sinh vien******");
        for(SinhVien item : list) {
            item.xuat();
        }
    }
}
