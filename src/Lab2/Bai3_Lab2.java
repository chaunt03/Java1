package Lab2;

import java.util.Scanner;

public class Bai3_Lab2 {
    public static void tinhTienDien() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
        int n = input.nextInt();
        if(n <= 50){
            System.out.printf("Tiền điện phải đóng là: %d",n*1000);
        }
        else{
            System.out.printf("Tiền điện phải đóng là: %d",50*1000 + (n-50)*1200);
        }
    }
}
