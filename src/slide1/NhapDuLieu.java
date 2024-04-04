
package slide1;

import java.util.Scanner;

public class NhapDuLieu {
    public static void main(String[] args) {
        //tạo đối tượng để nhập từ bàn phím
        Scanner input = new Scanner(System.in);
        //Nhập chuỗi
        System.out.println("Hãy nhập một chuỗi");
        String chuoi = input.nextLine();
        System.out.printf("Chuoi vua nhap la %s\n", chuoi);
        //Nhap chuoi
        System.out.println("Nhập số nguyên");
        int x = input.nextInt();
        System.out.printf("Số vừa nhập là: %d\n",x);
        System.out.println("Nhập một số thực");
        double y = input.nextDouble();
        System.out.printf("Số thực vừa nhập là: %.2f",y);
                
    }
 
}
