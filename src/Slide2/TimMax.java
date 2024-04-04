
package Slide2;

import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        //Nhap a,b,c, tim max
        int a,b,c,d;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        a = input.nextInt();
        System.out.println("Nhập b = ");
        b = input.nextInt();
        System.out.println("Nhập c = ");
        c = input.nextInt();
        System.out.println("Nhập d = ");
        d = input.nextInt();
        /*Cách 1:
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;*/
        /*Cách 2:
        int max ;
        if(a > b){if(a > c)max = a; else max = c;}
        else{if(b > c) max = b; else max = c;}*/
        /*Cách 3a:
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;*/
        //Cách 3b:
        int max;
        if(a > b){
            if(a > c){
                if(a > d){
                    max = a;
                }
                else{
                    max = d;
                }
            }
            else{
                if(c > d){
                    max = c;
                }
                else{
                    max = d;
                }
            }
        }
        else{
            if(b > c){
                if(b > d){
                    max = b;
                }
                else{
                    max = d;
                }
            }
            else{
                if(c > d){
                    max = c;
                }
                else{
                    max = d;
                }
            }
        }
        System.out.printf("Max của %d,%d,%d,%d là: %d\n",a,b,c,d,max);
    }     
}
