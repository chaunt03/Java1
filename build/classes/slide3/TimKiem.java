package slide3;

import java.util.Scanner;

public class TimKiem {
    public static void main(String[] args) {
        int M[] = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = input.nextInt();
        //Nhap mang
        for(int i = 0; i<n;i++){
            System.out.printf("Nhap M[%d] = ",i);
            M[i] = input.nextInt();
        }
        //Xuat mang
        for(int i = 0; i< n; i++){
            System.out.printf("M[%d] = %d\n",i,M[i]);
        }
        //Tim theo gia tri
        System.out.print("Nhap gia tri can tim: ");
        int gt = input.nextInt();
        int kt = 0;
        int vt = 0;
        for(int i = 0; i<n;i++){
            if(M[i] == gt){
               vt = i;
               kt = 1;
               break;
            }
        }
        if(kt == 0){
            System.out.print("Khong co gia tri can tim");
        }
        if(kt == 1) System.out.printf("Gia tri can tim la: M[%d]",vt);
    }
}
