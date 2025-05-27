package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

public class lab196_Generics2 {
    public static void main(String[] args) {
        System.out.println(max(8, 10, 7));
        System.out.println(max("k", "y", "u"));
    }

    public static <T extends Comparable<T>> T max (T a , T b, T c){
        T max1 = a;
        if (b.compareTo(max1)>0){
            max1 = b;
        }
        if (c.compareTo(max1) > 0){
            max1 = c;
        }
        return max1;
    }
}
