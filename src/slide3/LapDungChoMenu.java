
package slide3;

import java.util.Scanner;

public class LapDungChoMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("***************************************************************");
            System.out.println("* 1. Nhập danh sách nhân viên từ bàn phím                     *");
            System.out.println("* 2. Xuất danh sách nhân viên ra màn hình                     *");
            System.out.println("* 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím       *");
            System.out.println("* 4. Xóa nhân viên theo mã nhập từ bàn phím                   *");
            System.out.println("* 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím    *");
            System.out.println("* 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím     *");
            System.out.println("* 7. Sắp xếp nhân viên theo họ và tên                         *");
            System.out.println("* 8. Sắp xếp nhân viên theo thu nhập                          *");
            System.out.println("* 9. Xuất 5 nhân viên có thu nhập cao nhất                    *");
            System.out.println("*10. Thoát chương trình                                       *");
            System.out.println("***************************************************************");
            System.out.println("Xin mời chọn menu: ");
            int mnu = input.nextInt();
            switch(mnu){
                case 1: System.out.println(" 1. Nhập danh sách nhân viên từ bàn phím "); break;
                case 2: System.out.println(" 2. Xuất danh sách nhân viên ra màn hình "); break;
                case 3: System.out.println(" 3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím "); break;
                case 4: System.out.println(" 4. Xóa nhân viên theo mã nhập từ bàn phím "); break;
                case 5: System.out.println(" 5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím "); break;
                case 6: System.out.println(" 6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím "); break;
                case 7: System.out.println(" 7. Sắp xếp nhân viên theo họ và tên "); break;
                case 8: System.out.println(" 8. Sắp xếp nhân viên theo thu nhập "); break;
                case 9: System.out.println(" 9. Xuất 5 nhân viên có thu nhập cao nhất "); break;
                case 10: System.exit(mnu);
            }
            //Scanner input = new Scanner(System.in);
            
        }
    }
    
}
