package ThuVien;

import java.util.Scanner;

public class NhapTuBanPhim {
    static Scanner input = new Scanner(System.in);
    public static int nhapInt(String loiNhac){
        System.out.println(loiNhac);
        return Integer.parseInt(input.nextLine());
    }
    public static double nhapdouble(String loiNhac){
        System.out.println(loiNhac);
        return Double.parseDouble(input.nextLine());
    }
    public static float nhapFloat(String loiNhac){
        System.out.println(loiNhac);
        return Float.parseFloat(input.nextLine());
    }
    public static String nhapString(String loiNhac){
        System.out.println(loiNhac);
        return input.nextLine();
    }
}
