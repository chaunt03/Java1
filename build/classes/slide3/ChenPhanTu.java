package slide3;

import java.util.Arrays;
import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        int M[] = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = input.nextInt();
        //Nhap mang
        for(int i = 0; i < n ; i++){
            System.out.printf("Nhập M[%d] = ",i);
            M[i] = input.nextInt();
        }
        //Xuat mang
        
        for (int i = 0;i < n;i++) {
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Nhap gia tri va vi tri chen
        System.out.print("Gia tri chen: ");
        int gt = input.nextInt();
        System.out.println("Vi tri chen: ");
        int vt = input.nextInt();
        //Chen
        for(int i = n - 1; i >= vt; i--) M[i+1] = M[i];
        M[vt] = gt;
        n++;
        //Xuat mang
        for (int i = 0;i < n;i++) {
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Xoa
        int vtx = input.nextInt();
        for(int i = vtx; i<n ; i++) M[i - 1] = M[i];
        n--;
        //Xuat mang
        for (int i = 0;i < n;i++) {
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Doi vi tri hai phan tu
        System.out.println("Nhap vi tri phan tu thu nhat: ");
        int e = input.nextInt();
        System.out.println("Nhap vi tri phan tu thu hai: ");
        int g = input.nextInt();
        int tam = M[e];
            M[e] = M[g];
            M[g] = tam;
        //Xuat mang
        for (int i = 0;i < n;i++) {
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Xap xep tang dan
        
    }
}
