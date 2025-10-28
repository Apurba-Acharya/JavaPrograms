package InterviewAsked;

public class Q44_EvenAndOddNumbersFromAnArray {

//    Print Even & Odd Numbers from an Array

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};;
        //Extracting even number:
        for (int value : arr){
            if(value%2 == 0){
                System.out.print(value + " ");
            }
        }
        System.out.println();

        for (int value : arr){
            if(value%2 != 0){
                System.out.print(value + " ");
            }
        }

    }
}
