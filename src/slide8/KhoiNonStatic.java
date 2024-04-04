package slide8;

public class KhoiNonStatic {
    {
        System.out.println("Day la khoi non-static");
        
    }
    static {
        System.out.println("Day la khoi static 1");
    }
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            KhoiNonStatic nst = new KhoiNonStatic();
    }
    }
    {
        System.out.println("Day la khoi non-static2");
        
    }
    static {
        System.out.println("Day la khoi static 2");
    }
}
