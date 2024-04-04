package Lab6;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String email;
    private String sdt;
    private String cmnd;
    
    public SinhVien() {
        
    }

    public SinhVien(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public void nhap() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhap ho ten: ");
            hoTen = input.nextLine();
            if(hoTen == null | hoTen.equals(" ")){
                System.out.println("Ho ten khong hop le!");
            }
            else {
                break;
            }
        } while(true);
        
        KiemTra ds = new KiemTra();
        do {
            System.out.println("Nhap email: ");
            email = input.nextLine();
            if(ds.isEmail(email)){
                break;
            }
            System.out.println("Email khong hop le!");
        }while(true);
        
        do{
            System.out.println("Nhap so dien thoai: ");
            sdt = input.nextLine();
            if(ds.isPhone(sdt)){
                break;
            }
            System.out.println("SDT khong hop le!");
        }while(true);
        
        do{
            System.out.println("Nhap so CMDN: ");
            cmnd = input.nextLine();
            if(ds.isCmnd(cmnd)){
                break;
            }
            System.out.println("So cmnd khong hop le!");
        }while(true);
    }
    
    public void xuat() {
        System.out.printf("Ho ten: %s - Email: %s - SDT: %s - CMDN: %s \n",hoTen,email,sdt,cmnd);
    }
}
