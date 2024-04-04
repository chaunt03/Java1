package slide1;

import java.util.Scanner;

public class Bai3_Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cạnh của khối lập phương = ");
        double canh = input.nextDouble();
        double v = 0;
        v = Math.pow(canh,3);
        System.out.printf("Thể tích khối lập phương là: %.2f",v);
    }
}
