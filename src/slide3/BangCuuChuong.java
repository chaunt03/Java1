package slide3;

public class BangCuuChuong {
    public static void main(String[] args) {
        /*for(int i = 1;i <= 10; i++){
            System.out.printf("Bang cuu chuong %d\n",i);
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
*/
        int i = 1;
        while(i <= 10){
            System.out.printf("Bang cuu chuong %d\n",i);
            int j = 1;
            while(j <= 9){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
                j++;
            }
            i++;
        }
    }
}
