package slide5;

public class ChaCon {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("PS27269", "Nguyễn Thành Châu", 1000000);
        TruongPhong tp = new TruongPhong("PS27365", "Tran Van B", 200000, 10000);
        TiepThi tt = new TiepThi("PS26378", "Tran Thi A", 100000, 12, 1);
        nv.xuat();
        tp.xuatcon();
        tt.xuattt();
    }
}
