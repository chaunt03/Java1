package Lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập N = ");
        int N = input.nextInt();
        boolean ok = true;
        for(int i = 2; i <= N - 1;i++){
            if(N % i == 0){
                ok = false;
                break;
            }
            i++;
        }
        if(ok == true) {
            System.out.printf("Số %d là số nguyên tố",N);
        }
        else {
            System.out.printf("Số %d không phải là số nguyên tố",N);
        }
    }
}
