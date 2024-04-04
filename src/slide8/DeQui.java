package slide8;

public class DeQui {
    public static void xuat(int n) {
        if(n > 0){
            System.out.println("N = "+ n);
            xuat(n - 1);
        }    
    }
    
    public static void main(String[] args) {
        xuat(8);
    }
}
