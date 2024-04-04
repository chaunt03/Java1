package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<CanBo> dsnv = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("***************************************************************");
            System.out.println("* 1. Nhập thông tin mới cho cán bộ                            *");
            System.out.println("* 2. Tìm kiếm theo họ tên                                     *");
            System.out.println("* 3. Hiển thị thông tin về danh sách các cán bộ               *");
            System.out.println("* 4. Thoát khỏi chương trình                                  *");                                  
            System.out.println("***************************************************************");
            System.out.println("Xin mời chọn menu: ");
            choose = Integer.parseInt(input.nextLine());
            switch(choose) {
                case 1: 
                    System.out.println("Nhập thông tin mới cho cán bộ");
                    nhap(dsnv);
                    break;
                case 2: 
                    System.out.println("Tìm kiếm theo họ tên");
                    timTheoTen(dsnv);
                    break;
                case 3: 
                    System.out.println("Hiển thị thông tin về danh sách các cán bộ");
                    xuat(dsnv);
                    break;
                case 4: System.out.println("Hẹn gặp lại"); break;
                default: System.out.println("Vui lòng nhập lại");
            }
        }while(choose != 4);
    }//end menu
    
    public static void nhap(ArrayList<CanBo> dsnv) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhập họ tên: ");
            String hoTen = input.nextLine();
            System.out.println("Nhập năm sinh: ");
            double namSinh = Double.parseDouble(input.nextLine());
            System.out.println("Nhập giới tính[nam/nữ]: ");
            String gioiTinh = input.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String diaChi = input.nextLine();
            System.out.println("Chức vụ:\n\t1. Công nhân\n\t2. Kỹ sư\n\t3.Nhân viên: ");
            int i = Integer.parseInt(input.nextLine());
            
            if(i == 1) {
                System.out.println("Nhập cấp bậc[.../7]: ");
                String bac = input.nextLine();
                CanBo cb = new congNhan(bac, hoTen, namSinh, gioiTinh, diaChi);
                dsnv.add(cb);
            }
            
            if(i == 2) {
                System.out.println("Ngành đào tạo: ");
                String nganhDaoTao = input.nextLine();
                CanBo cb = new kySu(hoTen, namSinh, gioiTinh, diaChi, nganhDaoTao);
                dsnv.add(cb);
            }
            
            if(i == 3) {
                System.out.println("Công việc: ");
                String congViec = input.nextLine();
                CanBo cb = new nhanVien(hoTen, namSinh, gioiTinh, diaChi, congViec);
                dsnv.add(cb);
            }
            System.out.println("Bạn có muốn nhập tiếp không [Y/N]: ");
        }while(!input.nextLine().equalsIgnoreCase("N"));
    }
    
    public static void xuat(ArrayList<CanBo> dsnv) {
        for (CanBo cb : dsnv) {
            cb.xuat();
        }
    }
    
    public static void timTheoTen(ArrayList<CanBo> dsnv) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên cần tìm: ");
        String hoTen = input.nextLine();
        boolean kt = false;
        for (CanBo cb : dsnv) {
            if(cb.getHoTen().equalsIgnoreCase(hoTen)) {
                kt = true;
                cb.xuat();
            }
            if(!kt) {
                System.out.println("Không có nhân viên này!");
            }
        }
    }
}
