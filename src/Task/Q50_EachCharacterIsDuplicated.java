package Task;

public class Q50_EachCharacterIsDuplicated {
    public static void main(String[] args) {
        String input = "abcd";
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()){
            output.append(c).append(c);
        }
        System.out.println("Input = \"" + input + "\" and output = \"" + output + "\"");
    }
}
