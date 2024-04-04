package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> ds = new ArrayList<>();
    
    public void nhap() {
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Nhap ho ten sinh vien: ");
            String hoTen = input.nextLine();
            if(hoTen == null || hoTen.equals("")){
                break;
            }
            System.out.println("Nhap ten nganh(IT/Biz): ");
            String nganh = input.nextLine();
            if(nganh.equalsIgnoreCase("IT")){
                System.out.println("Nhap diem Java: ");
                double diemJava = input.nextDouble();
                System.out.println("Nhap diem Css: ");
                double diemCss = input.nextDouble();
                System.out.println("Nhap diem Html: ");
                double diemHtml = input.nextDouble();
                SinhVienPoly newSV = new SinhVienIT(diemJava, diemCss, diemHtml, hoTen, nganh);
                ds.add(newSV);
            }else if(nganh.equalsIgnoreCase("Biz")){
                System.out.println("Nhap diem Marketting: ");
                double diemMarketting = input.nextDouble();
                System.out.println("Nhap diem Sales: ");
                double diemSales = input.nextDouble();
                SinhVienPoly newSV = new SinhVienBiz(diemMarketting, diemSales, hoTen, nganh);
                ds.add(newSV);
            }
            
        }while(true);
    }
    public void xuat() {
        for (SinhVienPoly sv : ds) {
            System.out.printf("Ho ten: %s | Nganh: %s | DiemTB: %.2f | Hoc luc: %s \n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
        }
    }
    
    public void xuatGioi() {
        for (SinhVienPoly sv : ds) {
            if(sv.getHocLuc().equalsIgnoreCase("Gioi!"))
                System.out.printf("Ho ten: %s | Nganh: %s | DiemTB: %.2f | Hoc luc: %s \n",sv.getHoTen(),sv.getNganh(),sv.getDiem(),sv.getHocLuc());
        }
    }
    
    Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly t, SinhVienPoly t1) {
            return Double.compare(t.getDiem(), t1.getDiem());
        }
    };
    
    public void sapXepTheoDiem() {
        Collections.sort(ds, comp);
        System.out.println("Sap xep tang dan theo diem: ");
        xuat();
    }
    
    public void menu() {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        do {
            System.out.println("***********MENU***********");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat thong tin danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("0. Exit");
            System.out.println("Xin moi ban chon 1 menu: ");
            choose = input.nextInt();
            if(choose != 0) {
                switch(choose) {
                    case 0:
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        sapXepTheoDiem();                               
                        break;
                    default:
                        System.out.println("Nhap sai, vui long nhap lai!");
                }
            }
        }while(choose != 0);
    }
    
    public static void main(String[] args) {
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        dssv.menu();
    }
}
