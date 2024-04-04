package Lab3;

import java.util.Scanner;
import Lab3.ThuVien;

public class Bai3 {
public static void main(String[] args) {
    System.out.print("Nhap so phan tu trong mang: ");
    int n = new Scanner(System.in).nextInt();
    int M[] = new int [n];
    ThuVien.nhapMang(n, M);
    ThuVien.xuatMang(M);
    ThuVien.phanTuNhoNhat(M);
    ThuVien.chiaHet3(M);
    }
}

