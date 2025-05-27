package Task;

public class Q47_MaximumDifferenceBetweenTwoArray {
   //Find Maximum Difference between Two Array Elements

    public static void main(String[] args) {
        int arr[] = {2, 5, 15, 1, 4};

        //Using BruitForce :
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] < arr[j]){
                    max = Math.max(max,arr[j]-arr[i]);
                }else {
                    max = Math.max(max, arr[i] - arr[j]);
                }
            }
        }
        System.out.println(max);
    }
}
