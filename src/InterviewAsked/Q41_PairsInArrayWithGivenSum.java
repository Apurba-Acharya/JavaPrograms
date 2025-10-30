package InterviewAsked;

public class Q41_PairsInArrayWithGivenSum {

/*   Find Pairs in Array with Given Sum
    Output:
    Pair: 1,7
    Pair: 2,6
    Pair: 3,5 */

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 8;

        int low = 0;
        int high = arr.length-1;
        while (low < high){
            if (arr[low] + arr[high] > sum){
                high--;
            } else if (arr[low] + arr[high] < sum) {
                low++;
            } else if (arr[low] + arr[high] == sum) {
                System.out.println("Pair: " + arr[low] +","+ arr[high]);
                low++;
                high--;
            }
        }
    }
}
