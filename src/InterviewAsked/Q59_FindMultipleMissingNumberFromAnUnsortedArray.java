package InterviewAsked;

import java.util.HashSet;

public class Q59_FindMultipleMissingNumberFromAnUnsortedArray {
    public static void main(String[] args) {
        int arr[] = {9, 4, 6, 3, 8, 2};
        int n = 9;
        System.out.println("Missing numbers are:");
        findMissingNumbers(arr, n);
    }
    public static void findMissingNumbers(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
