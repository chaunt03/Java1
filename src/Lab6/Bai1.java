package Lab6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoTen = input.nextLine();
        hoTen.trim();
        
        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" "));
        
        System.out.printf("%s, %s, %s\n", ho.toUpperCase(), tenDem, ten.toUpperCase());
    }
}
