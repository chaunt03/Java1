package slide6;

import java.util.Scanner;

public class TachTenDemHo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String hoTen = input.nextLine();
        int first = hoTen.indexOf(" ");
        int last = hoTen.lastIndexOf(" ");
        System.out.println("Ho: "+ hoTen.substring(0, first));
        System.out.println("Ten: "+ hoTen.substring(last));
        System.out.println("Ten dem: "+ hoTen.substring(first, last));
    }
}
