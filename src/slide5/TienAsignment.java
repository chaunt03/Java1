package slide5;

import java.util.Scanner;

public class TienAsignment {
    public static void main(String[] args) {
        NhanVien tv[] =  new NhanVien[20];
        System.out.println("Nhập số phần tử: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++){
            System.out.print("Nhập NV,TP,TT: thì gõ số tương ứng 1,2,3: ");
            int so = Integer.parseInt(input.nextLine());
            if (so == 1){
                System.out.println("Nhập mã: ");
                String manv = input.nextLine();
                System.out.println("Nhập họ tên: ");
                String hoTen = input.nextLine();
                System.out.println("Nhập lương: ");
                double luong = Double.parseDouble(input.nextLine());
                tv[i] = new NhanVien(manv,hoTen,luong);
            }else if(so == 2){
                System.out.println("Nhập mã: ");
                String manv = input.nextLine();
                System.out.println("Nhập họ tên: ");
                String hoTen = input.nextLine();
                System.out.println("Nhập lương: ");
                double luong = Double.parseDouble(input.nextLine());
                System.out.println("Nhập lương trách nhiệm: ");
                double luongTrachNhiem = Double.parseDouble(input.nextLine());
                //up casting
                tv[i] = new TruongPhong(manv, hoTen, luong, luongTrachNhiem);
            }else {
                System.out.println("Nhập mã: ");
                String manv = input.nextLine();
                System.out.println("Nhập họ tên: ");
                String hoTen = input.nextLine();
                System.out.println("Nhập lương: ");
                double luong = Double.parseDouble(input.nextLine());
                System.out.println("Nhập doanh số: ");
                double doanhSoBanHang = Double.parseDouble(input.nextLine());
                System.out.println("Nhập tỉ lệ hoa hồng");
                double tiLeHoaHong = Double.parseDouble(input.nextLine());
                tv[i] = new TiepThi(manv, hoTen, luong, doanhSoBanHang, tiLeHoaHong);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println("Nhan vien: ");
            tv[i].xuat();
        }
        for(int i = 0; i < n; i++){
            System.out.println("Truong phong: ");
            if(tv[i] instanceof TruongPhong){
                tv[i].xuat();
            }
        }
        for(int i = 0; i < n;i++){
            System.out.println("Tiep thi: ");
            if(tv[i] instanceof TiepThi){
                tv[i].xuat();
            }
        }
    }
}
