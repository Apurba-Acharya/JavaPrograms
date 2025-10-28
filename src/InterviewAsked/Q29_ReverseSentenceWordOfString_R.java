package InterviewAsked;

public class Q29_ReverseSentenceWordOfString_R {

    //  Reverse sentence word of a string.

    public static void main(String[] args) {
        String str = "We are learning java"; // Output: java learning are We
        String result = ""; //this line is storing and updating the value after each appends
        String arr[] = str.split(" "); //based on the space each word is spliting and storing in the array

        for (int i = arr.length-1; i>=0; i--) {
            result = result + arr[i] + " "; //→ Appends that word to the result string and adds a space after the word to maintain spacing.
        }
        System.out.println(result);
    }
}
