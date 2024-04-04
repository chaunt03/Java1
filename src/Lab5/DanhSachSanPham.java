package Lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSanPham {
    private ArrayList<SanPham> list = new ArrayList<>();
    
    public void nhap() {
        int i = 1;
        System.out.println("Nhập danh sách sản phẩm: ");
        do{
            Scanner input = new Scanner(System.in);
            System.out.printf("Nhập tên sản phẩm thứ %d: ", i);
            String ten = input.nextLine();
            if(ten == null || ten.equals("")) {
                System.out.println("Nhập thông tin thành công!");
                break;
            }
            i++;
            System.out.println("Giá sản phẩm: ");
            double gia = input.nextDouble();
            list.add(new SanPham(ten, gia));
            
        }while(true);
    }
    
    public void xuat() {
        System.out.println("********Danh sách sản phẩm*******");
        System.out.println("Tên\t\t|Giá\t\t");
        for (SanPham sp : list){
            System.out.printf("%s | %.2f \n", sp.getTenSP(), sp.getGia());
        }
    }
    
    public void sapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham t, SanPham t1) {
                return Double.compare(t.getGia(), t1.getGia());
            }
        }; 
        Collections.sort(list, comp);
        xuat();

    }
    
    public void timKiemVaXoa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên sản phầm cần tìm: ");
        String ten = input.nextLine();
        
        SanPham sp = null;
        
        for(SanPham sp1 : list){
            if(sp1.getTenSP().equals(ten)){
                sp = sp1;
                break;
            }
        }
        
        if(sp != null) {
            list.remove(sp);
            System.out.println("Đã xóa sản phầm");
        }
        else System.out.println("Không tìm thấy sản phầm");
    }
    
    public void tinhTrungBinh() {
        double arr = 0, tong = 0;
        for (SanPham sp : list){
            tong += sp.getGia();
        }
        arr = tong/list.size();
        System.out.println("Giá trung bình các sản phẩm là: "+ arr);
    }
    
    public void menu() {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        do{
            System.out.println("*********Menu**********");
            System.out.println("1. Nhập danh sách sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Sắp xếp sản phẩm theo giá");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Tính giá trung bình");
            System.out.println("0. Thoát menu");
            System.out.println("Mời bạn chọn 1 menu: ");
            choose = input.nextInt();
            
            if(choose != 0) {
                switch(choose){
                    case 0:
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        sapXep();
                        break;
                    case 4:
                        timKiemVaXoa();
                        break;
                    case 5:
                        tinhTrungBinh();
                        break;
                    default: System.out.println("Nhập sai vui lòng nhập lại");
                }
            }
        }while(choose != 0);
    }
}
