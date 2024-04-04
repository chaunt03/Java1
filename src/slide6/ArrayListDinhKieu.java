package slide6;


import static ThuVien.NhapTuBanPhim.nhapInt;
import static ThuVien.NhapTuBanPhim.nhapString;
import static ThuVien.NhapTuBanPhim.nhapdouble;
import java.util.ArrayList;
import slide5.NhanVien;
import slide5.TiepThi;
import slide5.TruongPhong;

public class ArrayListDinhKieu {
    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
        //Nhập dữ liệu
        while(true){
            int i = nhapInt("Chọn số tương ứng với 1-[Nhân Viên] 2-[Trưởng Phòng] 3-[Tiếp Thị]: ");
            if(i == 1){
                String mssv = nhapString("Mã nhân viên: ");
                String hoTen = nhapString("Họ tên: ");
                double luong = nhapdouble("Lương: ");
                NhanVien nv = new NhanVien(mssv, hoTen, luong);
                dsnv.add(nv);
            }
            
            else if(i == 2){
                String msnv = nhapString("Mã nhân viên: ");
                String hoTen = nhapString("Họ tên: ");
                double luong = nhapdouble("Lương: ");
                double luongTN = nhapdouble("Lương trách nhiệm: ");
                NhanVien tp = new TruongPhong(msnv, hoTen, luong, luongTN);
                dsnv.add(tp);
            }
            
            else {
                String msnv = nhapString("Mã nhân viên: ");
                String hoTen = nhapString("Họ tên: ");
                double luong = nhapdouble("Lương: ");
                double dsbh = nhapdouble("Doanh số bán hàng: ");
                double tlhh = nhapdouble("Tỉ lệ hoa hồng: ");
                NhanVien tt = new TiepThi(msnv, hoTen, luong, dsbh, tlhh);
                dsnv.add(tt);
            }
            String tiep = nhapString("Bạn có muốn nhập tiếp không: ");
            if(tiep.equalsIgnoreCase("N")) break;
        }
        for(NhanVien x : dsnv) x.xuat();
    }
}
