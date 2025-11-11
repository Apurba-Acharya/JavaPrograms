package InterviewAsked;

public class Q56_capitalizeTheFirstLetterOfAEveryWordInAString {
    public static void main(String[] args) {
        String input = "welcome to selenium interview preparation";
        String result = capitalizeWords(input);
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + result);
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");  // split by spaces
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize first letter and append rest of word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalized.toString().trim(); // remove last space
    }
}
