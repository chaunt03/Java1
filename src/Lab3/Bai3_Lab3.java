package Lab3;

import java.util.Scanner;

public class Bai3_Lab3 {
    public static void main(String[] args) {
        int M[] = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử thực tế: ");
        int n = input.nextInt();
        for(int i = 0; i < n;i++){
            System.out.printf("Nhập [%d] = ",i);
            M[i] = input.nextInt();
        }
        int i = 1;
        for(int x : M){
            System.out.printf("%d", x);
        }
    }
}
