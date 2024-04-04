package Lab5;

import java.util.Scanner;
import java.util.ArrayList;

public class MangSoThuc {
    private ArrayList<Double> list = new ArrayList<>();
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập danh sách số thực: ");
        while (true){
            System.out.println("Nhập số: ");
            Double x = input.nextDouble();
            list.add(x);
            input.nextLine();
            System.out.println("Nhập tiếp dữ liệu không (Y/N): ");
            if (input.nextLine().equals("N")){
                break;
            }
        }
    }
    
    
    public void hienThi() {
        System.out.println("***********************");
        System.out.println("Danh sách số thực: ");
        for (Double item : list) {
            System.out.println("    " + item);
        }
    }
    
    
    public void tinhTong() {
        double tong = 0;
        for (Double item : list){
            tong += item;
        }
        System.out.println("Tổng: " + tong);
    }
}
