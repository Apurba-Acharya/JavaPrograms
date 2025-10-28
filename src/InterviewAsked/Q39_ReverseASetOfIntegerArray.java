package InterviewAsked;

public class Q39_ReverseASetOfIntegerArray {

//   Reverse an integer array

    public static void main(String[] args) {
        int arr[] = {29, -1, 7, 18, 18, 29, 18};
        int n = arr.length;
        int Reverse;
        for (int i = n-1; i>=0; i--) {
            Reverse = arr[i];
           System.out.print(Reverse + " ");
        }
    }
}
