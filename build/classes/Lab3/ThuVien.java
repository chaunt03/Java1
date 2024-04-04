package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class ThuVien {
    public static void nhapMang(int n, int M[]){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< M.length;i++){
            System.out.printf("Nhap phan tu mang M[%d]= ",i);
            M[i] = input.nextInt();
        }
    }
    public static void xuatMang(int M[]) {
        System.out.println("Danh sach phan tu la: ");
        int y = 0;
        for (int i : M) {
            System.out.printf("M[%d] = %d\t\n",y,i);
            y++;
        }
    }
    public static void phanTuNhoNhat(int M[]) {
        int min = M[0];
        for (int i=0; i<M.length;i++) {
            if(min > M[i]){
                min = M[i];
            }
        }
        System.out.printf("Phan tu nho nhat trong mang la: "+min);
    }
    public static void sapXep(int M[]) {
        Arrays.sort(M);
        System.out.println("Danh sach sau khi sap xep la:");
        xuatMang(M);
    }
    public static void chiaHet3(int M[]) {
        int tong = 0;
        int dem = 0;
        for(int i = 0; i < M.length; i++){
            if(M[i] % 3 == 0){
                tong += M[i];
                dem++;
            }
        }
        double trungbinh = tong/dem;
        System.out.printf("\nTrung binh cong cac so chia het cho 3 la: %.2f",trungbinh);
    }
}
