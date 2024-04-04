package slide3;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n = ");
        int n = input.nextInt();
        int tong =0;
        for(int i = 1 ;i <= n; i++ ){
            tong +=i;
        }
        System.out.printf("Tong tu 1 den %d la: %d\n",n,tong);
    }
}
