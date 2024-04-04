package Lab2;

import java.util.Scanner;

public class BaiThem_Lab2 {
    public static void timMax(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        int a = input.nextInt();
        System.out.println("Nhập b = ");
        int b = input.nextInt();
        System.out.println("Nhập c = ");
        int c = input.nextInt();
        int max = 0;
        max = a > b? a > c? a : c : b > c? b : c; 
        System.out.printf("Giá trị lớn nhất là: %d\n",max);
    }
    
}
