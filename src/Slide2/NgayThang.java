package Slide2;

import java.util.Scanner;

public class NgayThang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tháng: ");
        int thang;
        thang = input.nextInt();
        if (thang >= 1 && thang <= 12){
            System.out.println("Năm: ");
            int nam;
            nam = input.nextInt();
            switch (thang) {
                case 4:
                    System.out.println("có 30 ngày");
                    break;
                case 6:
                    System.out.println("có 30 ngày");
                    break;
                case 9:
                    System.out.println("có 30 ngày");
                    break;
                case 11:
                    System.out.println("có 30 ngày");
                    break;
                default:
                    System.out.println("có 31 ngày");
                    break;
                case 2:
                    if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
                        System.out.println("Năm nhuận có 29 ngày");
                }
                    else{
                            System.out.println("có 28 ngày");
                            }
            }
        }
    }
}
