package slide1;
import java.util.Scanner;
public class HackNao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String ten = input.nextLine();
        //Nhập điểm
        double diem = 0;
        System.out.println("Nhập điểm: ");
        try{
            diem = Double.parseDouble(input.nextLine());
            System.out.println("Bạn thông minh thế");
        }catch(Exception ex){
            System.out.println("Bạn quá ngu!!!");
        }
        System.out.printf("Tên: %s\n",ten);
        System.out.printf("Điểm: %s\n",diem);
        
    }
}
