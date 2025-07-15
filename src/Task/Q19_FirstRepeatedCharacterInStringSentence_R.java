package Task;
import java.util.HashSet;
import java.util.Set;

// First repeated character in a string sentence

public class Q19_FirstRepeatedCharacterInStringSentence_R {
        public static void main(String[] args) {
            String input = "t progxamming nicoter";
            String n = input.replaceAll(" ", "");
            char c[] = n.toCharArray(); //Using string: String c1[] = n.split("");
            Set<Character> hs = new HashSet<>();
            Character firstRepeated = null;

            for (char ch : c) {
                if (hs.add(ch)==false) {
                    firstRepeated = ch;
                    break;
                }
            }
            System.out.println("First repeated character: " + firstRepeated);
        }
    }