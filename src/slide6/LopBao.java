package slide6;

public class LopBao {
    public static void main(String[] args) {
        //boxing
        Integer x = Integer.valueOf(3);
        Double y = new Double(3.14);
        Float z = 3.14f;
        System.out.println("x, y, x lan luot la: "+ x+" "+y+" "+z);
        //unboxing
        Integer a = 3;
        int b = a.intValue();    
        System.out.println("a = 3 => b = " + b);
    }
}
