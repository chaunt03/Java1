package slide3;

import java.util.Scanner;

public class InTu1Den20 {
    public static void main(String[] args) {
            /*for(int i = 1; i <= 20; i++){
                if(i == 14 || i == 15){
                    continue;
                }
                System.out.printf("%d\n",i);
            }*/
            System.out.printf("Dùng while\n");
            int i = 1;
            while(i<=20){
                if(i == 14 || i == 15){
                    i++;
                    continue;
                }
                System.out.printf("%d\n",i);
                i++;
            }
    }
    
}
