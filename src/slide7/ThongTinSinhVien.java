package slide7;

import java.util.Scanner;

public class ThongTinSinhVien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        //Ma sinh vien
        System.out.println("Nhập mã sinh viên: ");
        String maSV = "PS\\d{5}";
        String maCanKT = input.nextLine();
        if(maCanKT.matches(maSV)) System.out.println("Bạn đã nhập đúng mã sinh viên");
        else System.out.println("Bạn đã nhập sai mã sinh viên");
        //Mật khẩu
        System.out.println("Nhập mật khẩu: ");
        String matKhau = ".{6,}";
        String mkCanKT = input.nextLine();
        if(mkCanKT.matches(matKhau)) System.out.println("Bạn đã nhập đúng mật khẩu");
        else System.out.println("Mật khẩu sai vui lòng nhập lại");
        //Họ và tên
        String maHoTen = "[A-Za-z]+";
        System.out.println("Nhập họ và tên:");
        String hoTen = input.nextLine();
        if(hoTen.matches(maHoTen)) System.out.println("Bạn đã nhập đúng tên của mình");
        else System.out.println("Bạn đã nhập sai tên vui lòng nhập lại");
        //Email
        System.out.println("Nhập email: ");
        String email = "\\w+@\\w+(\\.\\w+){1,2}";
        String emailCanKT = input.nextLine();
        if(emailCanKT.matches(email)) System.out.println("Bạn đã nhập đúng email");
        else System.out.println("Email sai vui lòng nhập lại");
        //Điện thoại
        System.out.println("Nhập số điện thoại của bạn: ");
        String soDT = "083\\d{7}";
        String soCanKT = input.nextLine();
        if(soCanKT.matches(soDT)) System.out.println("Bạn đã nhập đúng số điện thoại");
        else System.out.println("Số điện thoại của bạn sai vui lòng nhập lại");
        //Số xe máy
        System.out.println("Nhập biển số xe: ");
        String bienSoXe = "5\\d-[A-Z]\\d-(\\d{4})|(\\d{3}\\.\\d{2})";
        String bienSoCanKT = input.nextLine();
        if(bienSoCanKT.matches(bienSoXe)) System.out.println("Bạn đã nhập đúng biển số xe");
        else System.out.println("Biển số sai vui lòng nhập lại");
        //Số CMND
        System.out.println("Nhập số CMND: ");
        String soCMND = "//d{10}";
        String soCMNDCanKT = input.nextLine();
        if(soCMNDCanKT.matches(soCMND)) System.out.println("Bạn đã nhập đúng số CMDN");
        else System.out.println("Số CMND sai vui lòng nhập lại");
        //Website
        System.out.println("Nhập địa chỉ website: ");
        String website = "http://www\\.\\w+\\.\\w{2,4}";
        String websiteCanKT = input.nextLine();
        if(websiteCanKT.matches(website)) System.out.println("Bạn đã nhập đúng địa chỉ website");
        else System.out.println("Địa chỉ website sai vui lòng nhập lại");
        }
    }
}
