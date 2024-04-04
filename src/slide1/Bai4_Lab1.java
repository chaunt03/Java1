package slide1;
import java.util.Scanner;
public class Bai4_Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double delta = 0;
        System.out.println("Nhập a = ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập b = ");
        b = Integer.parseInt(input.nextLine());
        System.out.println("Nhập c = ");
        c = Integer.parseInt(input.nextLine());
        try{
            delta = b*b - 4*a*c;
            System.out.println("a,b,c đã nhập đúng");
        }catch(Exception ex){
            System.out.println("a,b,c nhập không đúng");
        }
        System.out.printf("Delta = %.2f\n",delta);
        double x1,x2;
        x1 = ((-b + Math.sqrt(delta))/2*a);
        x2 = ((-b - Math.sqrt(delta))/2*a);
        System.out.printf("Nghiệm thứ nhất là x1 = %.2f\n",x1);
        System.out.printf("Nghiệm thứ hai là x2 = %.2f\n",x2);
        double candelta = Math.sqrt(delta);
        System.out.printf("Căn delta = %.2f\n",candelta);        
    }
}
