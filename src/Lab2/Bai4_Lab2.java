package Lab2;

import static Lab2.BaiThem_Lab2.timMax;
import static Lab2.Bai1_Lab2.giaiPTB1;
import static Lab2.Bai2_Lab2.giaiPTB2;
import static Lab2.Bai3_Lab2.tinhTienDien;
import java.util.Scanner;

public class Bai4_Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("+-----------------------------+\n");
        System.out.print("1. Giải phương trình bậc nhất  \n");
        System.out.print("2. Giải phương trình bậc 2     \n");
        System.out.print("3. Tính tiền điện              \n");
        System.out.print("4. Tìm max                     \n");
        System.out.print("5. Kết thúc                    \n");
        System.out.print("+-----------------------------+\n");
        System.out.println("Xin mời chọn menu muốn xem: ");
        int menu = input.nextInt();
        switch(menu){
            case 1:
                System.out.print("Giải phương trình bậc nhất\n");
                giaiPTB1();
                break;
            case 2:
                System.out.print("Giải phương trình bậc 2\n");
                giaiPTB2();
                break;
            case 3:
                System.out.print("Tính tiền điện\n");
                tinhTienDien();
                break;
            case 4:
                System.out.print("Tìm max\n");
                timMax();
                break;
            case 5:
                System.out.print("Bạn đã lựa chọn kết thúc chương trình\n");
        }
    }
}
