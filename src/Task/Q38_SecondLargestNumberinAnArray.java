package Task;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q38_SecondLargestNumberinAnArray {

//    Find Second Largest Number in an Array

    public static void main(String[] args) {
        int arr[] = {29, -1, 7, 18, 18, 29, 18};
        int n = arr.length;

        if (n<2){ // If the length is less than two digit value
            System.out.println("Second largest element doesn't exists");
            return;
        }

        Set <Integer> hs = new HashSet<>();
        for (int i=0; i<n; i++){
            hs.add(arr[i]);
        }
        Integer uniqueValues [] = hs.toArray(new Integer [hs.size()]);

        Arrays.sort(uniqueValues);
        System.out.println(Arrays.toString(uniqueValues));
        int secondLargest = uniqueValues[uniqueValues.length-2]; // uniqueValues [4-2] >> uniqueValues [2]
        System.out.println("Second Largest: " + secondLargest);
    }
}
