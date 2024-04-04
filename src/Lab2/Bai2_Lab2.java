package Lab2;

import java.util.Scanner;

public class Bai2_Lab2 {
    public static void giaiPTB2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        double a = input.nextDouble();
        System.out.println("Nhập b = ");
        double b = input.nextDouble();
        System.out.println("Nhập c = ");
        double c = input.nextDouble();
        if(a == 0){
            System.out.print("Giải phương trình bậc 1\n");
            System.out.printf("Có nghiệm x = -c/b = %.2f\n",-c/b);
        }
        else{
            double delta = 0;
            delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.print("Phương trình vô nghiệm\n");
            }
            if(delta == 0){
                System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f\n",-b/(2*a));
            }
            if(delta > 0){
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f và x2 = %.2f\n",(-b + Math.sqrt(delta))/(2*a),(-b - Math.sqrt(delta))/(2*a));
            }
        }
    }
    
}
