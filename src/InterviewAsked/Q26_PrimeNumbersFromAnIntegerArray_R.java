package InterviewAsked;

public class Q26_PrimeNumbersFromAnIntegerArray_R {

    //Find out prime numbers from an array

    public static void main(String[] args) {
        int n[] = {2, 5, 7, 9, 13, 15};

        for (int i = 0; i < n.length; i++) {
            int count = 0;
            for (int j = 1; j <= n[i]; j++) {
                if (n[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime numbers are: " + n[i]);
            }
        }
    }
}