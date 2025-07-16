package Task;

public class Q25_CountOf_A_CharacterInStringSentence {
//    Occurance of character In A String

    public static void main(String[] args) {
        String str = "I am learning learning java java programming";

        //Here only taken the count of "a" from the given string

        int result = str.length() - (str.replaceAll("a", "").length());
        //str.replaceAll("a", ""): I m lerning lerning jv jv progrmming
        System.out.println(result);
    }
}
