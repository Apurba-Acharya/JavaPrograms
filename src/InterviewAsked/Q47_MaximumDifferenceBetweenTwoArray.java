package InterviewAsked;

public class Q47_MaximumDifferenceBetweenTwoArray {
   //Find Maximum Difference between Two Array Elements

    public static void main(String[] args) {
        int arr[] = {-100, 2, 5, 15, 1, 4};

        //Using BruitForce (T1):
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
        System.out.println("Maximum absolute difference (O(n²)): " + max);

        //T2:
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : arr) {
            max2 = Math.max(max2, num);
            min2 = Math.min(min2, num);
        }
        System.out.println("O(n) instead of O(n²): " + (max2 - min2));

    }
}
