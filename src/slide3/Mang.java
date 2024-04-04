package slide3;



public class Mang {
    public static void main(String[] args) {
        //Khai báo mảng
        int a[];
        int []b;
        int c[] = new int[4];
        int d[] = {1,2,3,4};
        int[] e= {5,6,7,8};
        int[] g = null;
        int[] f = new int[]{1,3,5,7};
        //Xuat mang d
        for(int i = 0; i<d.length; i++){
            System.out.printf("%d ",d[i]);
        }
        //Xuat mang f
        for(int x : f) System.out.printf("%d ",x);
        //Xuat mang e
        for(int y : e) System.out.printf("%d ",y);
    }
}
