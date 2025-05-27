package Task;

public class Q41_PairsInArrayWithGivenSum {

//   Find Pairs in Array with Given Sum

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
