package slide8;

public class DoiSoBienDoi {
    public static int tong(int x,int y,int ...z){
        int tong = 0;
        tong = tong + x + y;
        for (int m : z) tong = tong + m;
        return tong;
    }
    public static void main(String[] args) {
        System.out.println("Tong = "+ tong(1,2,3,4,5,6,7,8));
        int y[] = {1,2,3,4,5};
        System.out.println("Tong = "+ tong(1,2,y));
    }
}
