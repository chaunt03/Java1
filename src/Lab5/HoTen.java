package Lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HoTen {
    private ArrayList<String> ds = new ArrayList<>();
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập danh sách họ tên");
        while(true){
            System.out.print("Nhập họ tên: ");
            String ten = input.nextLine();
            if(ten.isEmpty()) {
                System.out.println("Nhập dữ liệu thành công!");
                break;
            }
            ds.add(ten);
        }
    }
    
    public void xuat() {
        System.out.println("************************");
        for (String item : ds) {
            System.out.println(item);
        }
    }
    
    public void ngauNhien() {
        Collections.shuffle(ds);
        xuat();
    }
    
    public void sapXep() {
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    
    public void xoa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên muốn xóa: ");
        String hoTen = input.nextLine();
        
        for (String item : ds){
            if(item.equalsIgnoreCase(hoTen)) {
                ds.remove(item);
                System.out.println("Xóa tên thành công!");
                break;
            }
        }
    }
    
    public void menu(){
        Scanner input = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("********Menu chương trình*******");
            System.out.println("1. Nhập danh sách họ tên");
            System.out.println("2. Hiển thị danh sách họ tên");
            System.out.println("3. Sắp xếp ngẫu nhiên");
            System.out.println("4. Sắp xếp");
            System.out.println("5. Xóa");
            System.out.println("0. Thoát");
            System.out.println("Mời bạn chọn 1 menu: ");
            chon = input.nextInt();
            switch(chon) {
                case 0: break;
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    ngauNhien();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
            }
        }while(chon !=0);
    }
}
