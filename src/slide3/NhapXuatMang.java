package slide3;

import java.util.Scanner;

public class NhapXuatMang {
    public static void main(String[] args) {
        int M[] = new int[100]; //Khai báo cố định 100 phần tử
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử thực tế: ");
        int n = input.nextInt();
        //Nhập mảng
        for(int i = 0;i < n;i++){
            System.out.printf("Nhập [%d] = ",i);
            M[i] = input.nextInt();
        }
        //Xuất
        int i = 1;
        for(int x : M){ 
            System.out.printf("%d ",x);
            i++;
            if(i > n)break;
        }
        System.out.println();
    }
    
}
