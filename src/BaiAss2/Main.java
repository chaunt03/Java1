package BaiAss2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int chon;
        do{
            System.out.println("***************************************************************");
            System.out.println("* 1. Nhập danh sách nhân viên từ bàn phím                     *");
            System.out.println("* 2. Xuất danh sách nhân viên ra màn hình                     *");
            System.out.println("* 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím       *");
            System.out.println("* 4. Xóa nhân viên theo mã nhập từ bàn phím                   *");
            System.out.println("* 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím    *");
            System.out.println("* 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím     *");
            System.out.println("* 7. Sắp xếp nhân viên theo họ và tên                         *");
            System.out.println("* 8. Sắp xếp nhân viên theo thu nhập                          *");
            System.out.println("* 9. Xuất 5 nhân viên có thu nhập cao nhất                    *");
            System.out.println("*10. Thoát chương trình                                       *");
            System.out.println("***************************************************************");
            System.out.println("Xin mời chọn menu: ");
            chon = Integer.parseInt(input.nextLine());
            switch(chon){
                case 1: 
                    System.out.println(" 1. Nhập danh sách nhân viên từ bàn phím "); 
                    nhapDSNV(dsnv);
                    break;
                case 2: 
                    System.out.println(" 2. Xuất danh sách nhân viên ra màn hình "); 
                    xuatDSNV(dsnv);
                    break;
                case 3: 
                    System.out.println(" 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím "); 
                    timTheoMa(dsnv);
                    break;
                case 4: 
                    System.out.println(" 4. Xóa nhân viên theo mã nhập từ bàn phím "); 
                    xoaTheoMa(dsnv);
                    break;
                case 5: 
                    System.out.println(" 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím "); 
                    
                    break;
                case 6: 
                    System.out.println(" 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím "); 
                    timTheoLuong(dsnv);
                    break;
                case 7: 
                    System.out.println(" 7. Sắp xếp nhân viên theo họ và tên "); 
                    sxTheoTen(dsnv);
                    break;
                case 8: 
                    System.out.println(" 8. Sắp xếp nhân viên theo thu nhập "); 
                    sxThuNhap(dsnv);
                    break;
                case 9: 
                    System.out.println(" 9. Xuất 5 nhân viên có thu nhập cao nhất "); 
                    xuat5NVThuNhapCaoNhat(dsnv);
                    break;
                case 10: System.out.println("Hẹn gặp lại"); break;
                default: System.out.println("Vui lòng nhập lại");
            }
        }while(chon != 10);
    }//end main
    
    public static void nhapDSNV(ArrayList<NhanVien> dsnv){
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhập mã nhân viên: ");
            String maNV = input.nextLine();
            System.out.println("Nhập tên nhân viên: ");
            String hoTen = input.nextLine();
            System.out.println("Nhập lương nhân viên: ");
            double luong = Double.parseDouble(input.nextLine());
            System.out.println("Chức vụ:\n\t1.Trưởng phòng\n\t2. Tiếp thị: \n");
            int i = Integer.parseInt(input.nextLine());
            
            if(i == 1) {
                System.out.println("Nhập lương trách nhiệm: ");
                double trachNhiem = Double.parseDouble(input.nextLine());
                NhanVien nv = new TruongPhong(trachNhiem, maNV, hoTen, luong);
                dsnv.add(nv);
            }
            
            if(i == 2) {
                System.out.println("Nhập doanh số bán hàng: ");
                double doanhSo = Double.parseDouble(input.nextLine());
                System.out.println("Nhập tỉ lệ huê hồng: ");
                double hueHong = Double.parseDouble(input.nextLine());
                NhanVien nv = new TiepThi(maNV, hoTen, luong, doanhSo, hueHong);
                dsnv.add(nv);
            }
            System.out.println("Bạn có muốn nhập tiếp không [Y/N]: ");
        }while(!input.nextLine().equalsIgnoreCase("N"));
    }
    
    public static void xuatDSNV(ArrayList<NhanVien> dsnv) {
        for (NhanVien nv : dsnv) {
            nv.xuat();
        }
    }
    
    public static void timTheoMa(ArrayList<NhanVien> dsnv){
        Scanner input = new Scanner(System.in);
        System.out.println("Mã nhân viên cần tìm: ");
        String maNV = input.nextLine();
        boolean kt = false;
        for (NhanVien nv : dsnv) {
            if(nv.getMaNV().equalsIgnoreCase(maNV)) {
                kt = true;
                nv.xuat();
            }
        }if(!kt){
            System.out.println("Không có nhân viên này!");
        } 
    }
    
    public static void xoaTheoMa(ArrayList<NhanVien> dsnv) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mã nhân viên cần xóa: ");
        String maNV = input.nextLine();
        boolean kt = false;
        for (NhanVien nv : dsnv) {
            if(nv.getMaNV().equalsIgnoreCase(maNV)) {
                dsnv.remove(nv);
                kt = true;
                break;  
            }
        } if(!kt) {
            System.out.println("Không tìm thấy mã nhân viên: "+ maNV);
        }
    }
    
    public static void timTheoLuong(ArrayList<NhanVien> dsnv) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nhập lương nhân viên(min): ");
        double luongMin = Double.parseDouble(input.nextLine());
        System.out.println("Nhập lương nhân viên(max): ");
        double luongMax = Double.parseDouble(input.nextLine());
        for(NhanVien nv : dsnv) {
            if(nv.getLuong() >= luongMin && nv.getLuong() <= luongMax) {
                nv.xuat();
            }
        }
    }
    
    public static void sxTheoTen(ArrayList<NhanVien> dsnv) {
        System.out.println("Sắp xếp theo tên");
        Comparator<NhanVien> cpm = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                return t.hoTen.compareTo(t1.hoTen);
            }
        };
        Collections.sort(dsnv, cpm);
        xuatDSNV(dsnv);
    } 
    
    public static void sxThuNhap(ArrayList<NhanVien> dsnv) {
        System.out.println("Sắp xếp theo tên");
        Comparator<NhanVien> cpm2 = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t, NhanVien t1) {
                return t.luong > t1.luong? 1 : -1;
            }
        };
        Collections.sort(dsnv, cpm2);
        xuatDSNV(dsnv);
    }
    
    public static void xuat5NVThuNhapCaoNhat(ArrayList<NhanVien> dsnv) {
        sxThuNhap(dsnv);
        for(int i = 0; i < 5; i++) dsnv.get(i).xuat();
    }
}
