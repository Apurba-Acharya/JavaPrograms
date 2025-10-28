package InterviewAsked;


import java.util.*;

public class Q33_UniqueWordsfromStringSentence_31 {

    //Remove duplicate words from given sentence in string

    public static void main(String[] args) {
        String input = "I am am rahul rahul";

        String inputArr[] = input.split(" ");
        Set<String> myset = new LinkedHashSet<>(); //LinkedHashSet: It can maintain order and not accept duplicate value

        // Using enhanced for loop:
        for (String in : inputArr) {
            if (myset.add(in) == true) {
                System.out.print(in + " ");
            }
        }

        // Normal for loop:
//        for (int i = 0; i < inputArr.length; i++) {
//            if (myset.add(inputArr[i]) == true){
//                //myset.add(inputArr[i]): return : boolean
//                //myset.add(inputArr[i]) = true: perticular element is not already present in myset
//                //myset.add(inputArr[i]) = false: perticular element is already present in myset
//                //SOUT will be initial when: myset.add(inputArr[i]) = true == true;
//                System.out.print(inputArr[i] + " ");
//            }
//        }

        System.out.println();

            // Using iterator:
            for (String word : inputArr) {
                myset.add(word);
            }
            Iterator itr = myset.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
        }
    }