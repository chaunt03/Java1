package slide1;

import java.util.Scanner;
public class Bai1_Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String hoten = scanner.nextLine();
        System.out.println("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f Điểm\n",hoten,diemTB);
    }
}
