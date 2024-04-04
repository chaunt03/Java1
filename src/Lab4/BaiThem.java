package Lab4;

import java.util.Scanner;

public class BaiThem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SanPham M[] = new SanPham[100];
        System.out.println("Nhap so luong san pham: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            M[i] = new SanPham(null, n, i);
            M[i].nhap();
        }
        for (int i = 0; i <= n; i++){
            M[i].xuat();
        }
    }
}
