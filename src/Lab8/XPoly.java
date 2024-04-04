package Lab8;

public class XPoly {
    public static double sum(double...x) {
        double tong = 0;
        for(double item : x){
            tong += item;
        }
        return tong;
    }
    
    public static double min(double...x) {
        double min = x[0];
        for(double item : x){
            min = Math.min(min, item);
        }
        return min;
    }
    
    public static double max(double...x) {
        double max = x[0];
        for(double item : x) {
            max = Math.max(max, item);
        }
        return max;
    }
    
    public static String toUpperFirstChar(String s) {
        String toiUu = s;
        toiUu = toiUu.trim();
        String []arr = toiUu.split(" ");
        toiUu = "";
        for (String word: arr) {
            String newWord = word.toLowerCase();
            if (newWord.length() > 0) {
                newWord = newWord.replaceFirst((newWord.charAt(0))+"", (newWord.charAt(0)+"").toUpperCase());
                toiUu += newWord+" ";
            }
        }
        return toiUu.trim();
    }
    
    public static void main(String[] args) {
        double sum = sum(5,6,7,7.8);
        double min = min(5,6,7,7.8);
        double max = max(5,6,7,7.8);
        String name = toUpperFirstChar("nguyen thanh chau");
        System.out.println("Kết quả: "+ sum);
        System.out.println("Số nhỏ nhất là: "+ min);
        System.out.println("Số lớn nhất là: "+ max);
        System.out.println("Ten: "+ name);
    }
}
