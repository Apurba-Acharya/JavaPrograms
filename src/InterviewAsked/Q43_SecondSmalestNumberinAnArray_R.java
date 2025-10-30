package InterviewAsked;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Q43_SecondSmalestNumberinAnArray_R {

//    Find Second Smallest Number in an Array

    public static void main(String[] args) {
        int arr[] = {29, -1, 7, 18, 18, 29, 18};
        int n = arr.length;

        if (n<2){ // If the length is less than two digit value
            System.out.println("Second largest element doesn't exists");
            return;
        }

        /* HashSet:
        1. Order will not maintain. [* LinkedHashSet will maintain order.]
        2. Null value is acceptable.
        3. Duplicate value not acceptable. */

        Set <Integer> hs = new HashSet<>();
        for (int i=0; i<n; i++){
            hs.add(arr[i]);
        }
        Integer[] hslength = new Integer[hs.size()];
        Integer uniqueValues [] = hs.toArray(hslength); // this line will convert HashSet to Array

        Arrays.sort(uniqueValues, Collections.reverseOrder());
        System.out.println(Arrays.toString(uniqueValues));
        int secondSmalest = uniqueValues[uniqueValues.length-2];
        System.out.println("Second Smalest: " + secondSmalest);
    }
}
