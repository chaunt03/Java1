package slide4;

public class NapChongHam {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        System.out.printf("%d + %d = %d\n",a,b,tinhtong(a,b));
        System.out.printf("%d + %d + %d = %d\n",a,b,c,tinhtong(a, b, c));

    }
    static int tinhtong(int x, int y) {
        return x + y;
    }
    static int tinhtong(int x, int y, int z) {
        return x + y + z;
    }
}
