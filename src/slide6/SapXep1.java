package slide6;

import static ThuVien.NhapTuBanPhim.nhapInt;
import static ThuVien.NhapTuBanPhim.nhapString;
import java.util.ArrayList;
import java.util.Collections;

public class SapXep1 {
    public static void main(String[] args) {
        ArrayList<Integer> daySo = new ArrayList<Integer>();
        while(true){
            Integer so = new Integer(nhapInt("Nhap so nguyen: "));
            daySo.add(so);
            String c = nhapString("Muon ket thuc thi go N/n: ");
            if(c.equalsIgnoreCase("N")) break;
        }
        //xuat
        for(Integer x : daySo) System.out.println(x + ";");
        System.out.println();
        //sap xep tu nho den lon
        Collections.sort(daySo);
        for(Integer x : daySo) System.out.println(x + ";");
    }
}
