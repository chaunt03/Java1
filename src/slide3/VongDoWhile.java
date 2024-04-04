package slide3;

import static ThuVien.NhapTuBanPhim.nhapFloat;
import static ThuVien.NhapTuBanPhim.nhapString;
import java.util.Scanner;

public class VongDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
               //Thân do while
               float n = nhapFloat("Nhập số kiểm tra: ");
               float m = (float)Math.sqrt(n);
               if(m == (int)m) System.out.printf("%f là số chính phương\n",n);
               else System.out.printf("%f không phải là số chính phương\n",n);
               String s = nhapString("Bạn có muốn kết thúc không ?: ");
               if(s.equalsIgnoreCase("N")) break;
        }while(true);
        }
}
