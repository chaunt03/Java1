package Slide2;

import java.util.Scanner;

public class LenhSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhập vào một số nguyên: ");
        int n = input.nextInt();
        switch(n){
            case 1 : System.out.println("Một");break;
            case 2 : System.out.println("Hai");break;
            case 3 : System.out.println("Ba");break;
            case 4 : System.out.println("Bốn");break;
            case 5 : System.out.println("Năm");break;
            default: System.out.println("Số này nằm ngoài 1 ==> 5");
        }
    }
}
