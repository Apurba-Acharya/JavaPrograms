package Task;

public class Q16_PrimeNumberChecker_Imp {

    /* Prime Number checker */
    public static void main(String[] args) {
        int num = 5;

        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Is a prime number: " + num);
            } else {
                System.out.println("Is not a prime number");
            }
        } else {
            System.out.println("entered value is less than 1");
        }
    }
}