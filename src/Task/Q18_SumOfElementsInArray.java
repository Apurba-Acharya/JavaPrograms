package Task;

public class Q18_SumOfElementsInArray {
    public static void main(String[] args) {
        int a[] = {5, 2, 7, 9, 6};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
