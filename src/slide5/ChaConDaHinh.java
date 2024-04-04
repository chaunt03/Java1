package slide5;

public class ChaConDaHinh {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("PS001", "Nguyễn Văn A", 800);
        NhanVien tp = new TruongPhong("PS002", "Trần Văn B", 700, 20);
        NhanVien tt = new TiepThi("PS003", "Huynh Thi B", 100, 20, 12);
        nv.xuat();
        tp.xuat();
        tt.xuat();
    }
   
}
