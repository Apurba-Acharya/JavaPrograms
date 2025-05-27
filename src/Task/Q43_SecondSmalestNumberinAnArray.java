package Task;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Q43_SecondSmalestNumberinAnArray {

//    Find Second Smallest Number in an Array

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

        Arrays.sort(uniqueValues, Collections.reverseOrder());
        System.out.println(Arrays.toString(uniqueValues));
        int secondSmalest = uniqueValues[uniqueValues.length-2];
        System.out.println("Second Smalest: " + secondSmalest);
    }
}
