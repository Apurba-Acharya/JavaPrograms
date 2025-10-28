package InterviewAsked;

public class Q48_MinimumAndMaximumElementInAArray {
    //Find Minimum and maximum Element in a Array

    public static void main(String[] args) {
        int arr [] = {5, 6, 1, 2, 3, 4};

        int min = arr [0];
        for (int i=1; i<arr.length; i++ ){
                if (arr[i] < min){
                    min = arr[i];
                }
        }
        System.out.println("Minimum value of array is: " + min);

        int max = arr [0];
        for (int j=1; j<arr.length; j++ ){
            if (arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("Maximum value of array is: " + max);
    }
}
