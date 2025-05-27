package Task;

import java.util.Arrays;

public class Q42_Segregate0sAnd1sInAnArray {

//   Segregate 0s and 1s in an Array

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 0, 1, 1, 0, 2};

        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                zeroCount++;
            }
            if (arr [i] == 1){
                oneCount++;
            }
        }
        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }
        for (int i = zeroCount; i< (zeroCount+oneCount); i++){
            arr [i] = 1;
        }
        for (int i = zeroCount+oneCount; i < arr.length; i++) {
            arr[i] = 2;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
