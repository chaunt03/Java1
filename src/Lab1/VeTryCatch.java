package Lab1;
import java.util.Scanner;
public class VeTryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 0;
        try{
            System.out.println("Nhập x = ");
            x = Double.parseDouble(input.nextLine());
            System.out.println("Đã nhập đúng");
        }catch(Exception ex){
            System.out.println("Nhập sai kiểu dữ liệu?!");
        }
        System.out.printf("x = %.2f\n",x);
    }
}
