package Task;

import java.util.Arrays;

public class Q46_MergeTwoSortedArraysIntoaThirdSortedArray {
    //Merge Two Sorted Arrays into a Third Sorted Array

    public static void main(String[] args) {

       int arr1[] = {1, 5, 6, 7};
       int arr2[] = {2, 5, 8, 9, 11};

       int size1 = arr1.length, size2 = arr2.length;
       int merged [] = new int [size1 + size2];

       int i=0, j=0, k=0;

       while(i<size1 && j<size2){
           if (arr1[i] <= arr2[j]){
               merged [k++] = arr1[i++];
           }else {
               merged[k++] = arr2[j++];
           }
       }
       while (i<size1){
           merged[k++] = arr1[i++];
       }
       while (j<size2){
           merged [k++] = arr2[j++];
       }
        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
