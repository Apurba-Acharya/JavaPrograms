package InterviewAsked;

import java.util.Arrays;

public class Q42_SegregateAnArrayUsingBubbleSort {

//   Segregate an array using bubble sort

    public static void main(String[] args) {
        int nums[] = {6, 4, 1, 2, 2, 5};
        int size = nums.length;
        int temp = 0;
        for (int  i=0; i<size; i++){
            for (int j = 0; j < size-i-1; j++) {
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums [j] = nums [j+1];
                    nums [j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums) );
        for (int num : nums){
            System.out.print(num+ " ");
        }
    }
}
