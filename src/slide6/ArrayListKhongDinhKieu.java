package slide6;

import java.util.ArrayList;

public class ArrayListKhongDinhKieu {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Châu");
        a.add(true);
        a.add(4);
        a.add(3.14);
        System.out.println("a[0]= " + a.get(0));
        System.out.println("a[1]= " + (Boolean)a.get(1));
        System.out.println("a[2]= " + (Integer)a.get(2));
        System.out.println("a[3]= " + (Double)a.get(3));
    }
}
