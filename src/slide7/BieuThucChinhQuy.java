package slide7;

import java.util.Scanner;

public class BieuThucChinhQuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Kiem tra so dien thoai
        System.out.println("Nhập số điện thoại: ");
        String mauSDT = "0\\d{9}";
        String soCanKT = input.nextLine();
        //so khớp
        if(soCanKT.matches(mauSDT)) System.out.println("Thì ra là mày =))))");
        else System.out.println("À tao nhầm người :>");
        String bienSoXe = "5\\d-[A-Z]\\d-(\\d{3}\\.\\d{2})|(\\d{4})";
        System.out.println("Nhập biển số xe: ");
        String bienCanKT = input.nextLine();
        if(bienCanKT.matches(bienSoXe)) System.out.println("Chạy đi đâu hả con trai :))))");
        else System.out.println("Mới thay biển số hả mày");
    }
}
