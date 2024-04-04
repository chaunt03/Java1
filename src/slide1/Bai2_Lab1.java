
package slide1;

import java.util.Scanner;

public class Bai2_Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double chieudai = input.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double chieurong = input.nextDouble();
        double chuvi = 0;
        double s = 0;
        double min = 0;
        chuvi = (chieudai + chieurong)*2;
        s = chieudai*chieurong;
        min = Math.min(chieudai, chieurong);
        System.out.printf("Chu vi hình chữ nhật là: %.2f\n",chuvi);
        System.out.printf("Dien tich hinh chu nhat la: %.2f\n",s);
        System.out.printf("Canh nho nhat la: %.2f\n",min);
    }
}
