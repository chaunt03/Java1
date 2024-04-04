package Baove;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ArrayList<thiSinh> dsts = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("***************************************************************");
            System.out.println("* 1. Nhập thông tin về các thí sinh dự thi                    *");
            System.out.println("* 2. Hiển thị thông tin về 1 thí sinh                         *");
            System.out.println("* 3. Tìm kiếm theo số báo danh                                *");
            System.out.println("* 4. Kết thúc chương trình                                    *");                                  
            System.out.println("***************************************************************");
            System.out.println("Xin mời chọn menu: ");
            choose = Integer.parseInt(input.nextLine());
            switch(choose) {
                case 1: 
                    System.out.println("Nhập thông tin về các thí sinh dự thi");
                    nhap(dsts);
                    break;
                case 2: 
                    System.out.println("Hiển thị thông tin về 1 thí sinh");
                    hienThi(dsts);
                    break;
                case 3: 
                    System.out.println(" Tìm kiếm theo số báo danh");
                    timTheoSBD(dsts);
                    break;
                case 4: System.out.println("Hẹn gặp lại"); break;
                default: System.out.println("Vui lòng nhập lại");
            }
        }while(choose != 4);
    }//end menu
    
    public static void nhap(ArrayList<thiSinh> dsts) {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Nhập số báo danh: ");
            String soBaoDanh = input.nextLine();
            System.out.println("Nhập họ tên: ");
            String hoTen = input.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String diaChi = input.nextLine();
            System.out.println("Nhập điểm ưu tiên: ");
            double diemUuTien = Double.parseDouble(input.nextLine());
            System.out.println("Thí sinh thi khối:\n\t1. Khối A\n\t2. Khối B\n\t3. Khối C: ");
            int i = Integer.parseInt(input.nextLine());
            
            if(i == 1) {
                System.out.println("Nhập điểm toán: ");
                double toan = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm lý: ");
                double ly = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm hóa: ");
                double hoa = Double.parseDouble(input.nextLine());
                thiSinh ts = new khoiA(toan, ly, hoa, soBaoDanh, hoTen, diaChi, toan);
                dsts.add(ts);
            }
            
            if(i == 2) {
                System.out.println("Nhập điểm toán: ");
                double toan = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm hóa: ");
                double hoa = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm sinh: ");
                double sinh = Double.parseDouble(input.nextLine());
                thiSinh ts = new khoiB(toan, hoa, sinh, soBaoDanh, hoTen, diaChi, toan);
                dsts.add(ts);
            }
            
            if(i == 3) {
                System.out.println("Nhập điểm văn: ");
                double van = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm sử: ");
                double su = Double.parseDouble(input.nextLine());
                System.out.println("Nhập điểm địa: ");
                double dia = Double.parseDouble(input.nextLine());
                thiSinh ts = new khoiC(van, su, dia, soBaoDanh, hoTen, diaChi, diemUuTien);
                dsts.add(ts);
            }
            System.out.println("Bạn có muốn nhập tiếp không [Y/N]: ");
        }while(!input.nextLine().equalsIgnoreCase("N"));
    }//end nhap
    
    public static void hienThi(ArrayList<thiSinh> dsts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên thí sinh muốn hiển thị: ");
        String hoTen = input.nextLine();
        boolean kt = false;
        for (thiSinh ts : dsts) {
            if(ts.getHoTen().equalsIgnoreCase(hoTen)) {
                kt = true;
                ts.xuat();
            }
        }
        if(!kt) {
                System.out.println("Không có thí sinh này!");
            }
    }//end hien thi thi sinh
    
    public static void timTheoSBD(ArrayList<thiSinh> dsts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số báo danh cần tìm: ");
        String soBaoDanh = input.nextLine();
        boolean check = false;
        for (thiSinh ts : dsts) {
            if(ts.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
               check = true;
               ts.xuat();
            }
        }
        if(!check) {
                System.out.println("Số báo danh bạn nhập không đúng!");
            }
    }
}
