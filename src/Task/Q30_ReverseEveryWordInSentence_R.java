package Task;

public class Q30_ReverseEveryWordInSentence_R {

//    reverse each [every] word in sentence, position should be same

    public static void main(String[] args) {
        String str = "We are learning java";    // >>Answer: eW era gninrael avaj

        //Type 1: Using for loop:
        String words [] = str.split(" "); // split the setence besed on the word
        String reverseString = ""; //To store the reverse words in a single string
        for (String w : words){
            String reverseword = "";
            for (int i = w.length()-1; i>=0; i--){
                reverseword= reverseword+w.charAt(i);
            }
            reverseString = reverseString + reverseword + " ";
        }
        System.out.println(reverseString);


        //Type 2: Using StringBuilder:
        String str1 = "We are learning java";
        String words1 [] = str1.split(" ");
        String reverseword1 = "";
        for (String w1 : words1){
            StringBuilder sb = new StringBuilder(w1);
            reverseword1 = reverseword1 + sb.reverse() + " ";
        }
        System.out.println(reverseword1);
    }
}
