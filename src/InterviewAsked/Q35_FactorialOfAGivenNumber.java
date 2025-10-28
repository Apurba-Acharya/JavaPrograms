package InterviewAsked;


public class Q35_FactorialOfAGivenNumber {

    //Factorial of a given number: 5!

    public static void main(String[] args) {
        int num=5;
        long factorial = 1; // To provide the initial value after completion of each loop
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of a number is (Forword): " + factorial);


        long factorial1 = 1; // To provide the initial value after completion of each loop
        for (int j = num; j>=1; j--) {
            factorial1 = factorial1*j;
        }
        System.out.println("Factorial of a number is (Reverse): " + factorial1);
    }
}