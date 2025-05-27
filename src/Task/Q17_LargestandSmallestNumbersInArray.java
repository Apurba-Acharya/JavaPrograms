package Task;

import java.util.Arrays;

public class Q17_LargestandSmallestNumbersInArray {

    /* Largest & Smallest Numbers In Array  */
    public static void main(String[] args) {
        int numbers[] = {-10, 24, 50, -88, 6985, 0};

        int largest = numbers[0];
        int smalest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {  //Using enhanced for loop we can solve this question.
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smalest) {
                smalest = numbers[i];
            }
        }
        System.out.println("given array is: " + Arrays.toString(numbers));
        System.out.println("Largest number is: " + largest);
        System.out.println("Largest number is: " + smalest);
    }
}
