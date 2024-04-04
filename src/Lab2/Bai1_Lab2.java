package Lab2;

import java.util.Scanner;

public class Bai1_Lab2 {
    public static void giaiPTB1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a = ");
        double a = input.nextDouble();
        System.out.println("Nhap b = ");
        double b = input.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.printf("Phuong trinh co vo so nghiem");
            }
            else{
                System.out.printf("Phuong trinh vo nghiem");
            }
        }
        else{
            System.out.printf("Phuong trinh co nghiem x = %.2f\n",-b/a);
        }
    }
    
}
